package model;

public class Coupon {

    private String code;
    private String type;
    private double value;
    private String applicableCategory; //yalniz xususi kateqoriya ucun
    private String expiryDate; //son istifade tarixi
    private int usageLimit; //istifadeni limitleyir

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
}
