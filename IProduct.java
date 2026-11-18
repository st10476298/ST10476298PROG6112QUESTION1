package productsalesreport;

// Interface defining the required methods for product sales calculations
public interface IProduct {
    int GetTotalProductsSold();
    double GetAverageProductSold();
    String GetMostPopularProduct();
}