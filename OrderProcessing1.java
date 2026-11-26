import java.util.LinkedHashMap;

public class OrderProcessing1{
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        orders.put(101, "Abhi");
        orders.put(102, "Rahul");
        orders.put(103, "Saran");
        orders.put(104, "Kiran");

        System.out.println("All Orders");
        System.out.println(orders);

        orders.put(102, "Rohit");

        System.out.println("Updated Customer for Order 102");
        System.out.println(orders.get(102));

        orders.remove(104);

        System.out.println("Order 104 Cancelled");
        System.out.println(orders);

        System.out.println("Searching Order 103");

        if (orders.containsKey(103)) {
            System.out.println("Customer Name : " + orders.get(103));
        } else {
            System.out.println("Order Not Found");
        }

        System.out.println("Orders In Received Order");
        System.out.println(orders);
    }
}