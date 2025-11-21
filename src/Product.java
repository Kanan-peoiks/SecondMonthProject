public class Product {

    private int id;                    // private etdim (encapsulation)
    private String name;
    private double price;
    private Category category;         // YENİ: kateqoriya əlavə edildi

    // YENİ: kateqoriyalı constructor
    public Product(int id, String name, double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }


    // Getter-lər
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {     // YENİ: kateqoriyanı qaytarır
        return category;
    }


    @Override
    public String toString() {
        return "ID:" + id + ", " + name + ", " + price + " AZN → [" + category.getName() + "]";
    }
}