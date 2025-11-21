import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        Product[] products = {
                new Product(1, "iPhone 15", 2200.0, Category.TELEFON),
                new Product(2, "Xiaomi 14", 1200.0, Category.TELEFON),
                new Product(3, "Samsung Galaxy S24", 1800.0, Category.TELEFON),
                new Product(4, "iPhone 15 Pro Max", 2890.0, Category.TELEFON),
                new Product(5, "Samsung Galaxy S24 Ultra", 2590.0, Category.TELEFON),
                new Product(6, "Xiaomi 14 Pro", 1490.0, Category.TELEFON),
                new Product(7, "Google Pixel 9 Pro", 2190.0, Category.TELEFON),
                new Product(8, "OnePlus 12", 1690.0, Category.TELEFON),
                new Product(9, "Poco F6 Pro", 990.0, Category.TELEFON),

                new Product(11, "Bosch Soyuducu", 1400.0, Category.SOYUDUCU),
                new Product(12, "Samsung Soyuducu", 1600.0, Category.SOYUDUCU),
                new Product(13, "Beko Soyuducu", 900.0, Category.SOYUDUCU),
                new Product(14, "Bosch NoFrost 600L (İki qapılı)", 2890.0, Category.SOYUDUCU),
                new Product(15, "Samsung SpaceMax 650L", 3190.0, Category.SOYUDUCU),
                new Product(16, "LG InstaView Door-in-Door 700L", 4190.0, Category.SOYUDUCU),
                new Product(17, "Beko NoFrost 550L", 1690.0, Category.SOYUDUCU),
                new Product(18, "Hoffmann Kompressor 450L", 1290.0, Category.SOYUDUCU),
                new Product(19, "Vestel Retro Stil 400L (Qırmızı)", 1490.0, Category.SOYUDUCU),

                new Product(21, "Bosch Paltaryuyan", 1999.0, Category.PALTARYUYAN),
                new Product(22, "Ardesto Paltaryuyan", 499, Category.PALTARYUYAN),
                new Product(23, "Samsung Paltaryuyan", 1449, Category.PALTARYUYAN),
                new Product(24, "LG Paltaryuyan", 889, Category.PALTARYUYAN),
                new Product(25, "Yoshiro Paltaryuyan", 899, Category.PALTARYUYAN),
                new Product(26, "Beko Paltaryuyan", 799, Category.PALTARYUYAN),
                new Product(27, "Haier Paltaryuyan", 649, Category.PALTARYUYAN),

                new Product(31, "1984 - George Orwell", 15.0, Category.KITAB),
                new Product(32, "Səfillər - Viktor Hüqo (İki cild)", 25.0, Category.KITAB),
                new Product(33, "Şərqin Şahzadəsi – Nizami Gəncəvi", 22.0, Category.KITAB),
                new Product(34, "Kiçik Şahzadə – Antuan de Sent-Ekzüperi", 15.0, Category.KITAB),
                new Product(35, "Dədə Qorqud", 20.0, Category.KITAB),
                new Product(36, "Ustadnamə – Hüseyn Cavid", 8.0, Category.KITAB),
                new Product(37, "Alov – Çingiz Aytmatov", 19.0, Category.KITAB),

                new Product(41, "Qulaqlıq (simsiz) AirPods", 35.0, Category.DIGER),
                new Product(42, "Qulaqlıq (simli) Logitech", 25.0, Category.DIGER),
                new Product(43, "Səsucaldan", 180.0, Category.DIGER),
                new Product(44, "Siçan", 30.0, Category.DIGER),
                new Product(45, "Mouse Pad", 20.0, Category.DIGER),
                new Product(46, "Klaviatura", 80.0, Category.DIGER)
        };
        boolean davam = true;

        while (davam) {
            System.out.println("\n=== ONLAYN MAĞAZA ===");
            System.out.println("100+ AZN → 5% | 50+ AZN → 3% | 20+ AZN → 2% əlavə endirim!");
            System.out.println("NOYABR30 kuponu ilə +30% endirim!");
            System.out.println("─────────────────────────────────────────────");
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
                case 1:
                    while (true) {   // bu dövrə ilə geri qayıtmaq mümkün olur
                        System.out.println("\n=== KATEQORİYALAR ===");
                        System.out.println("1 - Telefonlar");
                        System.out.println("2 - Soyuducular");
                        System.out.println("3 - Paltaryuyanlar");
                        System.out.println("4 - Kitablar");
                        System.out.println("5 - Digər");
                        System.out.println("0 - Əsas menyuya qayıt");
                        System.out.print("Seçiminiz: ");
                        int katSecim = scan.nextInt();

                        if (katSecim == 0) {
                            System.out.println("Əsas menyuya qayıtdınız.\n");
                            break;        // bu dövrədən çıxıb əsas menyuya qayıdır
                        }

                        Category secilen = switch (katSecim) {
                            case 1 -> Category.TELEFON;
                            case 2 -> Category.SOYUDUCU;
                            case 3 -> Category.PALTARYUYAN;
                            case 4 -> Category.KITAB;
                            case 5 -> Category.DIGER;
                            default -> null;
                        };

                        if (secilen == null) {
                            System.out.println("Yanlış seçim! Yenidən cəhd edin.");
                            continue;    // dövrə başdan başlayır
                        }

                        while (true) {

                            for (Product p : products) {
                                if (p.getCategory() == secilen) {
                                    System.out.println(p);
                                }
                            }

                            System.out.println("\n0 - Geri (kateqoriyalara qayıt)");
                            System.out.println("Məhsulu səbətə əlavə etmək üçün 2 seçin");
                            System.out.print("Seçiminiz: ");
                            int icerideSecim = scan.nextInt();

                            if (icerideSecim == 0) {
                                break;   // kateqoriya siyahısına qayıdır
                            } else {
                                System.out.println("Məhsulu səbətə əlavə etmək üçün əsas menyudan 2 seçin.");
                                // Burada istəsən birbaşa əlavə etmək funksiyası da qoya bilərsən
                            }
                        }
                    }
                    break;
                case 2: //Səbətə əlavə et
                    // Əvvəlcə mövcud məhsulları göstəririk ki, istifadəçi ID-ni bilsin
                    System.out.println("\n--- Mövcud məhsullar ---");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    System.out.print("Səbətə əlavə etmək istədiyiniz məhsulun ID-sini daxil edin: ");
                    int elaveId = scan.nextInt();

                    // ID-yə uyğun məhsulu axtarıb əlavə edirik
                    boolean tapildi = false;
                    for (Product p : products) {
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