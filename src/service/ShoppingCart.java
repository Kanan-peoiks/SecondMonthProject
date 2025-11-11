package service;

import model.CartItem;
import model.Coupon;
import model.Product;

import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;
    private Coupon appliedCoupon;
    private double cachedDiscount;

    public ShoppingCart(List<CartItem> items, Coupon appliedCoupon, double cachedDiscount) {
        this.items = items;
        this.appliedCoupon = null;
        this.cachedDiscount = cachedDiscount;
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Miqdar sıfırdan böyük olmalıdır.");
        }

        // InventoryService obyektini yarat
        InventoryService inventoryService = new InventoryService();
        if (!inventoryService.isInStock(product.getId(), quantity)) {
            System.out.println("Məhsul üçün kifayət qədər stok yoxdur: " + product.getName());
            return;
        }

        boolean found = false;

        for (CartItem item : items) {
            if (item.getProductId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                found = true;
                break;
            }
        }

        if (!found) {
            CartItem newItem = new CartItem(
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    quantity
            );
            items.add(newItem);
        }
    }

    public boolean removeProduct(String productId) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getProductId().equals(productId)) {
                iterator.remove();
                System.out.println("Məhsul səbətdən çıxarıldı: " + item.getProductName());
                return true;
            }
        }
        System.out.println("Səbətdə belə bir məhsul yoxdur: " + productId);
        return false;
    }



    public boolean updateQuantity(String productId, int newQuantity){
        return ;
    }

    public double calculateTotal (){ //KUPONSUZ
        return ;
    }

    public double calculateFinalTotal() {
        return ;
    }

    public boolean applyCoupon(Coupon coupon){

    }

    public void clear () {

    }

    private CartItem findItem (String productId){
        return ;
    }
    public List<CartItem> getItems(){
        return
    }

        public Coupon getAppliedCoupon(){
        return
        }

    public void removeCoupon(){
        return ;
    }




}
