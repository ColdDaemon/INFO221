/*
 * Domain classes package
 */
package domain;

/**
 * A domain class to represent a customer
 * @author maknz
 */
public class Customer {
    
    private String username;
    private String name;
    private String address;
    private String cc;
    private String password;
    private Order order;
    
    public Customer(String username, String name, String address,
            String cc, String password, Order order) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.cc = cc;
        this.password = password;
        this.order = order;
    }

    public String getAddress() {
        return address;
    }

    public String getCc() {
        return cc;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Order getOrder() {
        return order;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
}
