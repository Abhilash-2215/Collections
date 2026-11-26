import java.util.LinkedList;

public class CustomerServiceQueue {
    public static void main(String[] args) {

        LinkedList<String> customers = new LinkedList<>();

        customers.addLast("Ravi");
        customers.addLast("Priya");
        customers.addLast("Kiran");
        customers.addLast("Sneha");

        customers.addFirst("Emergency Customer");

        System.out.println("Waiting Customers");
        System.out.println(customers);

        System.out.println("Served Customer: " + customers.poll());

        System.out.println("Next Customer: " + customers.peek());

        customers.remove("Kiran");

        System.out.println("After Removing Customer");
        System.out.println(customers);

        System.out.println("Total Waiting Customers: " + customers.size());

        System.out.println("Serving All Customers");

        while (!customers.isEmpty()) {
            System.out.println("Served: " + customers.poll());
        }

        System.out.println("Queue Empty: " + customers.isEmpty());
    }
}