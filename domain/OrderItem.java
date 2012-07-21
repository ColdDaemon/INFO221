/*
 * Domain classes package
 */
package domain;

/**
 * A domain class to represent an item in an order
 * @author maknz
 */
public class OrderItem {
    
    private Product product;
    private double quantityPurchased;
    private Order order;

    public OrderItem(Product product, double quantityPurchased, Order order) {
        this.product = product;
        this.quantityPurchased = quantityPurchased;
        this.order = order;
    }

    public Product getProducts() {
        return product;
    }
    
    public double getQuantityPurchased() {
        return quantityPurchased;
    }
    
    public Order getOrder() {
        return order;
    }

    public void setProducts(Product product) {
        this.product = product;
    }

    public void setQuantityPurchased(double quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
}