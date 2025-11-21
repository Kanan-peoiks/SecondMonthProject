import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> items = new ArrayList<>();
    String appliedCoupon = "";        // hansı kupon işlədilib (boşdursa heç biri)
    double couponDiscount = 0.0;      // kupon faizi (məsələn 0.30 = 30%)


    public void addProduct(Product p){
    items.add(p);
        System.out.println(p.getName() + " səbətə əlavə edildi.");
    }

    public void removeProduct(int id){
    for (Product p: items){
        if (p.getId() == id ){
            items.remove(p);
            System.out.println(p.getName() + " səbətdən silindi.");
            return;
        }
    }
        System.out.println("Məhsul səbətdə tapılmadı.");
    }

    public void displayCart(){
            if (items.isEmpty()){
                System.out.println("Səbət boşdur.");
            }
            else {
                System.out.println("Səbətdəki məhsullar: ");
                for (Product p : items) {
                    System.out.println(p);
                }
            }
    }

    public double getTotalPrice(){
    double total = 0;
    for (Product p : items){
        total += total +p.getPrice();
    }
    return total;
    }


    public void applyCoupon (String code){
        if (code.equals("NOYABR30")){
            couponDiscount = 0.30;
            appliedCoupon = code;
            System.out.println("Kupon qəbul olundu! 30% endirim əlavə edildi.");
        }
        else{
            System.out.println("Kupon yanlışdır.");
        }
    }

    public double calculateDiscount (){
        double total = getTotalPrice();
        double discount= 0.0;
        discount += couponDiscount;
    if (total >= 100){
        discount +=0.05;
    } else if (total >=50) {
        discount += 0.03;
    } else if (total >= 20) {
        discount +=0.02;
    }
        return discount;
    }

    public double getFinalPrice(){
        double total = getTotalPrice();
        double discountRate = calculateDiscount();
                return total * ( 1 - discountRate);
    }




















}
