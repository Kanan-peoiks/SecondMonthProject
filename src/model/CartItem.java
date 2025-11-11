package model;

public class CartItem {
    private String productId;
    private String productName;
    private double unitPrice; //bir denesinin qiymeti
    private int quantity; //sebetdeki miqdar

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void getTotal (){
        double result = unitPrice *quantity;
        System.out.println(result);
    }

}
