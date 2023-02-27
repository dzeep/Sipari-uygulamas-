import java.time.LocalDate;

public class Invoice {
    private Customer customer;
    private LocalDate date;
    private double amount;

    public Invoice(Customer customer, LocalDate date, double amount) {
        this.customer = customer;
        this.date = date;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return customer + " on " + date.toString() + ": " + amount + " TL";
    }
}

    