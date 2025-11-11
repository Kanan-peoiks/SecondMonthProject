package model;

// əgər ShoppingCart service paketində olacaqsa, import ola bilər
// import service.ShoppingCart;

public class User {
    private String username;
    private String password;      // ilkin mərhələdə plaintext; gələcəkdə hash tövsiyə olunur
    private String createdAt;     // ISO string: "2025-11-11T12:00" (və ya sadəcə "2025-11-11")
    // private ShoppingCart cart; // opsional: hər istifadəçinin səbəti (təklif olunur)

    // Default konstruktor
    public User() {}

    // Convenience konstruktor
    public User(String username, String password, String createdAt) {
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
    }

    // getters / setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    // Əgər ShoppingCart əlavə edəcəksən:
    // public ShoppingCart getCart() { return cart; }
    // public void setCart(ShoppingCart cart) { this.cart = cart; }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
