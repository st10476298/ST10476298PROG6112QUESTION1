package productsalesreport;

// Class to calculate total, average, and most popular mattress sales
public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    // Constructor accepting single and two-dimensional arrays
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    // Calculates the total number of products sold over 3 months
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    // Calculates the average number of products sold across all entries
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }

        return (double) total / count;
    }

    // Determines the most popular product based on highest sales
    @Override
    public String GetMostPopularProduct() {
        int maxSale = sales[0][0];
        String popularProduct = products[0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > maxSale) {
                    maxSale = sales[i][j];
                    popularProduct = products[i];
                }
            }
        }
        return popularProduct + "(" + maxSale + ")";
    }
}