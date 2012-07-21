/*
 * Domain classes package
 */
package domain;

import java.util.Collection;
import java.util.Date;

/**
 * A domain class to represent an order
 * @author maknz
 */
public class Order {
    
    private Collection<OrderItem> items;
    private Date date;
    private int orderID;

    public Order(Collection<OrderItem> items, Date date, int orderID) {
        this.items = items;
        this.date = date;
        this.orderID = orderID;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }

    public Date getDate() {
        return date;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setItems(Collection<OrderItem> items) {
        this.items = items;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }
    
    public void addItem(OrderItem item) {
        items.add(item);
    }
    
}
