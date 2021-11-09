import java.util.Scanner;

class Cart {

    static boolean isRunning = true;

    public static void printOptions() {
        System.out.println(
                "\nEnter your choice\n1. Add Product \n2. Remove Product\n3 Update Product\n4 View Product\n5 Exit\nYour choice: ");
    }

    public static void Run(Scanner sc, ProductService ps) {
        printOptions();
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Your choice: Add Product");
            ps.addProduct(sc);
            break;
        case 2:
            System.out.println("Your choice: Remove Product");
            ps.removeProduct(sc);
            break;
        case 3:
            System.out.println("Your choice: Update Product");
            ps.updateProduct(sc);
            break;
        case 4:
            System.out.println("Your choice: View Product");
            ps.viewProduct();
            break;
        case 5:
            System.out.println("Do you want to exit application?(yes/no)");
            String flag = sc.next();
            flag = flag.toLowerCase();
            if (flag.equals("yes"))
                System.exit(0);
            break;
        default:
            System.out.println("Please select a valid option");
            printOptions();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService ps = new ProductService();
        while (isRunning) {
            Run(sc, ps);
        }
        sc.close();
    }
}