public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
        this.productId = "";
        this.productName = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Parameterized constructor
    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Total value
    public double calculateTotalValue() {
        return price * quantity;
    }

    // Print product details
    public void printProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: $%.2f\n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Value: $%.2f\n", calculateTotalValue());
    }
}
