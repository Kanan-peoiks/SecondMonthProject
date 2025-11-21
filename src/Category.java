
public enum Category {
    TELEFON("Telefonlar"),
    SOYUDUCU("Soyuducular"),
    PALTARYUYAN("Paltaryuyanlar"),
    KITAB("Kitablar"),
    DIGER("Digər");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
