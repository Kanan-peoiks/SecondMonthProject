package model;

public class Coupon {

    private String code;
    private String type;
    private double value;
    private String applicableCategory; //yalniz xususi kateqoriya ucun
    private String expiryDate; //son istifade tarixi
    private int usageLimit; //istifadeni limitleyir

    public Coupon(String code, String type, double value, String applicableCategory, String expiryDate, int usageLimit) {
        this.code = code;
        this.type = type;
        this.value = value;
        this.applicableCategory = applicableCategory;
        this.expiryDate = expiryDate;
        this.usageLimit = usageLimit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getApplicableCategory() {
        return applicableCategory;
    }

    public void setApplicableCategory(String applicableCategory) {
        this.applicableCategory = applicableCategory;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getUsageLimit() {
        return usageLimit;
    }

    public void setUsageLimit(int usageLimit) {
        this.usageLimit = usageLimit;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                ", applicableCategory='" + applicableCategory + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", usageLimit=" + usageLimit +
                '}';
    }
}
