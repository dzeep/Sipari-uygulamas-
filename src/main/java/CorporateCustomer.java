public class CorporateCustomer extends Customer {
    private String industry;

    public CorporateCustomer(String name, String email, String phone, String industry) {
        super(name, email, phone);
        this.industry = industry;
    }

    public String getType() {
        return "Corporate";
    }

    public String getIndustry() {
        return industry;
    }

    public String toString() {
        return super.toString() + " in " + industry;
    }
}

    