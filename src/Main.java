import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        Product[] product = {
                new Product(1, "Kitab", 12.0),
                new Product(2, "Telefon", 150.0),
                new Product(3, "Soyuducu", 400.0),
                new Product(4, "Paltaryuyan", 550.0),
                new Product(5, "Qulaqlıq", 10.0),
                new Product(6, "Masa", 120.0)
        };
        boolean davam = true;

        while (davam) {
            System.out.println("\n=== ONLAYN MAĞAZA ===");
            System.out.println("1 - Məhsulları göstər");
            System.out.println("2 - Səbətə əlavə et");
            System.out.println("3 - Səbətdən sil");
            System.out.println("4 - Səbəti göstər");
            System.out.println("5 - Ümumi məbləğ");
            System.out.println("6 - Kupon daxil et");
            System.out.println("0 - Çıxış");
            System.out.print("Seçiminiz: ");

            int secim = scan.nextInt();
            scan.nextLine();
            switch (secim) {
                case 1: //Məhsulları göstər
                    System.out.println("\n=== MÖVCUD MƏHSULLAR ===");
                    System.out.println("100+,50+,20+ AZN alış-verişə görə əlavə 5,3,2% endirim!");
                    System.out.println("NOYABR30 kuponu ilə isə +30% endirim!");
                    System.out.println("─────────────────────────────────────────────");
                    for (Product p : product) {
                        System.out.println(p);
                    }
                    break;

                case 2: //Səbətə əlavə et
                    // Əvvəlcə mövcud məhsulları göstəririk ki, istifadəçi ID-ni bilsin
                    System.out.println("\n--- Mövcud məhsullar ---");
                    for (Product p : product) {
                        System.out.println(p);
                    }
                    System.out.print("Səbətə əlavə etmək istədiyiniz məhsulun ID-sini daxil edin: ");
                    int elaveId = scan.nextInt();

                    // ID-yə uyğun məhsulu axtarıb əlavə edirik
                    boolean tapildi = false;
                    for (Product p : product) {
                        if (p.getId() == elaveId) {
                            cart.addProduct(p);
                            tapildi = true;
                            break;
                        }
                    }
                    if (!tapildi) {
                        System.out.println("Belə ID-li məhsul tapılmadı!");
                    }
                    break;

                case 3: //Səbətdən sil
                    if (cart.items.isEmpty()) {          // səbət boşdursa silməyə ehtiyac yoxdur
                        System.out.println("Səbət boşdur, siləcək bir şey yoxdur.");
                    } else {
                        cart.displayCart();              // nələri silə biləcəyini göstəririk
                        System.out.print("Silmək istədiyiniz məhsulun ID-sini daxil edin: ");
                        int silId = scan.nextInt();
                        cart.removeProduct(silId);
                    }
                    break;

                case 4: //Səbəti göstər
                    cart.displayCart();
                    break;

                case 5: //Ümumi məbləğ
                    double original = cart.getTotalPrice();
                    double finalPrice = cart.getFinalPrice();

                    System.out.println("=== HESABLAMA ===");
                    System.out.println("Səbət cəmi: " + original + " AZN");
                    if (cart.couponDiscount > 0) {
                        System.out.println("Kupon endirimi (30%): -" + (original * 0.30) + " AZN");
                    }
                    System.out.println("Ümumi endirim: " + String.format("%.0f%%", cart.calculateDiscount() * 100));
                    System.out.println("Yekun ödəniləcək: " + String.format("%.2f", finalPrice) + " AZN");
                    break;

                case 6: //Kupon
                    System.out.println("Kupon kodunu daxil edin: ");
                    String kuponKodu = scan.next();
                    cart.applyCoupon(kuponKodu);
                    break;

                case 0: //Çıxış
                    davam = false;
                    System.out.println("Sağ olun, yenə gəlin!");
                    break;

                default:
                    System.out.println("Belə bir seçim yoxdur! Yenidən cəhd edin.");
            }
        }




        scan.close();
    }
}

