package productsalesreport;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    // Test data matching the sample report
    private String[] products = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    private int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(products, sales);
        int expectedTotal = 153;
        int actualTotal = product.GetTotalProductsSold();
        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(products, sales);
        double expectedAverage = 17.0;
        double actualAverage = product.GetAverageProductSold();
        assertEquals(expectedAverage, actualAverage, 0.01);
    }
}