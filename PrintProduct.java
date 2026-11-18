package productsalesreport;

// Class responsible for displaying the formatted sales report
public class PrintProduct {

    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    // Prints the total product sales
    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    // Prints the average product sales
    public void printAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }

    // Prints the most popular product sale
    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    // Prints the complete report
    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026\n");
        System.out.println("*******************************************");
        printTotalSales();
        printAverageSales();
        printMostPopularProduct();
    }
}