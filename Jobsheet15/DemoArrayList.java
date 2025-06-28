import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2);

        Customer customer1 = new Customer(1, "Budi");
        Customer customer2 = new Customer(5, "Abyan");

        customers.add(customer1);
        customers.add(customer2);

        Customer customer3 = new Customer(3, "kepin");
        customers.add(customer3);

        customers.add(2, new Customer(10, "abyan"));

        System.out.println(customers.indexOf(customer3));

        Customer customer = customers.get(3);
        System.out.println(customer.name);

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(100, "Siti"));
        newCustomers.add(new Customer(101, "Joko"));

        customers.addAll(newCustomers);


        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);

    }
}