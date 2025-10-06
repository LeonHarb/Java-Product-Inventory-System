public class InventoryDemo {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        System.out.println("Adding products to inventory...");

        // Create product objects
        Product p1 = new Product("P001", "Laptop", 999.99, 10);
        Product p2 = new Product("P002", "Headphones", 59.99, 20);
        Product p3 = new Product("P003", "Mouse", 24.99, 50);

        // Add to inventory
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Print all
        inventory.printAllProducts();

        // Find a product
        System.out.println("Finding product with ID P002...");
        Product found = inventory.findProduct("P002");
        if (found != null) {
            System.out.println("Found: " + found.getProductName() + " (Qty: " + found.getQuantity() + ")");
        } else {
            System.out.println("Product not found.");
        }

        // Remove a product
        System.out.println("\nRemoving product with ID P001...");
        inventory.removeProduct("P001");

        // Print updated inventory
        System.out.println("\nUpdated Inventory:");
        inventory.printAllProducts();
    }
}
