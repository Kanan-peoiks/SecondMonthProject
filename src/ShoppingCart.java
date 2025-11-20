import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> items = new ArrayList<>();


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
}
