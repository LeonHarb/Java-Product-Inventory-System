import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productId) {
        Product found = findProduct(productId);
        if (found != null) {
            products.remove(found);
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }

    public Product findProduct(String productId) {
        for (Product p : products) {
            if (p.getProductId().equalsIgnoreCase(productId)) {
                return p;
            }
        }
        return null;
    }

    public void printAllProducts() {
        System.out.println("All Products in Inventory:");
        for (Product p : products) {
            System.out.println("-------------");
            p.printProductInfo();
        }
        System.out.println("-------------");
    }
}
