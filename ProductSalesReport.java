package productsalesreport;

import java.util.Scanner;

public class ProductSalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single-dimensional array storing the product names
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array storing sales for 3 products over 3 months
        int[][] sales = new int[3][3];

        // Loop to capture user input for each product and month
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Instantiate Product and PrintProduct classes to output the report
        Product product = new Product(products, sales);
        PrintProduct report = new PrintProduct(product);
        report.printReport();

        input.close();
    }
}