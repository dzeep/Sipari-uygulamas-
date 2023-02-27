import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Application {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new IndividualCustomer("Alice", "alice@gmail.com", "555-1234"));
        customers.add(new IndividualCustomer("Bob", "bob@gmail.com", "555-5678"));
        customers.add(new CorporateCustomer("Acme Inc.", "info@acme.com", "555-1000", "Manufacturing"));
        customers.add(new CorporateCustomer("BigCo Ltd.", "info@bigco.com", "555-2000", "Finance"));

        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(customers.get(0), LocalDate.of(2022, 1, 1), 1000));
        invoices.add(new Invoice(customers.get(1), LocalDate.of(2022, 2, 1), 2000));
        invoices.add(new Invoice(customers.get(2), LocalDate.of(2022, 6, 1), 3000));
    }
}