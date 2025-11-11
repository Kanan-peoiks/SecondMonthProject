package model;

public class User {

    private String username;
    private String password;
    private String createdAt;
    private String cart; //ne ucun oldugunu anlamadim

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }
}
