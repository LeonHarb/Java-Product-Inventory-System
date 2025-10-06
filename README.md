# Java Product & Inventory System

A compact **OOP** lab in Java that models products and a simple inventory.  
Implements encapsulated classes, overloaded constructors, getters/setters, and list-based operations with a small driver program.

---

## 📘 Overview
You will define:
- **Product** – a data class with price/quantity behavior
- **Inventory** – stores multiple `Product` objects and exposes add/remove/find/print APIs
- **InventoryDemo** – a console driver that creates products, adds them to the inventory, and demonstrates all operations

---

## 🧱 Class Specs

### `Product`
**Private fields**
- `String productId`
- `String productName`
- `double price`
- `int quantity`

**Constructors**
- No-arg (sets sensible defaults)
- Full-arg `(productId, productName, price, quantity)`

**Methods**
- Getters and setters for all fields
- `double calculateTotalValue()` → `price * quantity`
- `void printProductInfo()` → prints ID, Name, Price, Quantity, Total Value

---

### `Inventory`
**Field**
- `ArrayList<Product> products` *(or `Product[]` if preferred)*

**Methods**
- `void addProduct(Product product)`
- `boolean removeProduct(String productId)` – returns `true` if removed
- `void printAllProducts()` – delegates to each product’s `printProductInfo()`
- `Product findProduct(String productId)` – returns matching product or `null`

---

### `InventoryDemo` (driver)
- Create an `Inventory`
- Create several `Product` objects (both constructors)
- Add to inventory, print all products
- Demonstrate `findProduct()` and `removeProduct()` then print again

---

## 🛠️ Tech & Concepts
- **Language:** Java (8+)
- **Collections:** `java.util.ArrayList`
- **OOP:** encapsulation, constructors, accessors/mutators, method design
- **Separation of concerns:** model (`Product`), store (`Inventory`), driver (`InventoryDemo`)

---

## ▶️ How to Run

```bash
# Compile (from repo root)
javac -d bin src/*.java

# Run
java -cp bin InventoryDemo
