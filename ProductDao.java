public class ProductDao {

    private String productName;
    private Double productPrice;

    public void setName(String productName) {
        this.productName = productName;
    }

    public void setPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public Double getProductPrice() {
        return this.productPrice;
    }
}
