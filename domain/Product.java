/*
 * Domain classes package
 */
package domain;

/**
 * A domain class to represent a product
 * @author maknz
 */
public class Product {
    
    private String productID;
    private String name;
    private String description;
    private String category;
    private double price;
    private double quantityInStock;

    public Product(String productID, String name, String description, String category, double price, double quantityInStock) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductID() {
        return productID;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
}
