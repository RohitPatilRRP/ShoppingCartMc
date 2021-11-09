public class ProductDao {

    private String productName;
    private int productPrice;

    public void setName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getProductPrice() {
        return this.productPrice;
    }
}
