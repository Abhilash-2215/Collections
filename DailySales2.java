import java.util.LinkedHashMap;

public class DailySales2 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> sales = new LinkedHashMap<>();

        sales.put("Laptop", 10);
        sales.put("Mobile", 20);
        sales.put("Mouse", 5);
        sales.put("Keyboard", 8);

        System.out.println("All Sales");
        System.out.println(sales);

        sales.put("Mouse", 12);

        System.out.println("Updated Mouse Sales");
        System.out.println(sales.get("Mouse"));

        int total = 0;

        for (int qty : sales.values()) {
            total += qty;
        }

        System.out.println("Total Sales");
        System.out.println(total);

        String product = "";
        int max = 0;

        for (String p : sales.keySet()) {
            if (sales.get(p) > max) {
                max = sales.get(p);
                product = p;
            }
        }

        System.out.println("Highest Sales Product");
        System.out.println(product + " = " + max);

        System.out.println("Sales Report");
        System.out.println(sales);
    }
}