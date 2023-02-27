public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name, String email, String phone) {
        super(name, email, phone);
    }

    public String getType() {
        return "Individual";
    }
}

    