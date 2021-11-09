import java.util.*;

public class ProductService {

    private ArrayList<ProductDao> productArray = new ArrayList<ProductDao>();
    private HashMap<String, Integer> productMap = new HashMap<String, Integer>();

    public void addProduct(Scanner sc) {
        System.out.print("Enter Product Name:");
        String productName = sc.next();
        System.out.print("Enter Product Price:");
        Double productPrice = sc.nextDouble();
        if (productName.equals(null)) {
            System.out.println("Invalid product name");
            return;
        }
        if (productPrice < 0) {
            System.out.println("Invalid product price");
            return;
        }
        if (productMap.get(productName) != null) {
            System.out.println("Product already exits");
            return;
        }
        ProductDao product = new ProductDao();
        product.setName(productName);
        product.setPrice(productPrice);
        int size = productArray.size();
        productArray.add(product);
        productMap.put(productName, size);
        System.out.println("Thanks for adding product. Now enter the new choice.");
        return;
    }

    public void removeProduct(Scanner sc) {
        System.out.print("Enter Product Name:");
        String productName = sc.next();
        if (productName.equals(null)) {
            System.out.println("Invalid product name");
            return;
        }
        Integer index = productMap.get(productName);
        if (index == null) {
            System.out.println("Product does not exist!");
            return;
        }
        productMap.remove(productName);
        int size = productArray.size();
        ProductDao productLast = productArray.get(size - 1);
        Collections.swap(productArray, index, size - 1);
        productArray.remove(size - 1);
        productMap.put(productLast.getProductName(), index);
        System.out.println("You successfully removed a product. Now enter the new choice.");
        return;
    }

    public void updateProduct(Scanner sc) {
        System.out.print("Enter Product Name:");
        String productName = sc.next();
        if (productName.equals(null)) {
            System.out.println("Invalid product name");
            return;
        }
        Integer index = productMap.get(productName);
        if (index == null) {
            System.out.println("Product does not exist!");
            return;
        }
        System.out.print("Enter Product Price:");
        Double productPrice = sc.nextDouble();
        productArray.get(index).setPrice(productPrice);
        System.out.println("You successfully updated a product. Now enter the new choice.");
        return;
    }

    public void viewProduct() {
        System.out.println("Your Products in Stock\n__________________________\n");
        System.out.println("Product Name \t Product Price\n");
        System.out.println("--------------------------");
        for (ProductDao product : productArray) {
            System.out.println(product.getProductName() + "\t\t  Rs." + product.getProductPrice());
        }
        return;
    }
}
