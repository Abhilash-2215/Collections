import java.util.HashMap;

public class ProductInventoryManagement {
    public static void main(String[] args) {

        HashMap<Integer, Integer> product = new HashMap<>();

        product.put(101, 10);
        product.put(102, 3);
        product.put(103, 15);
        product.put(104, 2);
        product.put(105, 0);

        System.out.println(product);

        product.put(106, 8);

        product.put(102, 5);

        int sold = 4;
        int currentQty = product.getOrDefault(101, 0);
        product.put(101, currentQty - sold);

        int id = 103;

        if(product.containsKey(id)) {
            System.out.println("product found");
            System.out.println("quantity = " + product.get(id));
        }
        else {
            System.out.println("product not found");
        }

        System.out.println("products below 5 quantity");

        for(var p : product.entrySet()) {
            if(p.getValue() < 5) {
                System.out.println(p.getKey() + " " + p.getValue());
            }
        }

        product.remove(105);

        System.out.println("all products");

        for(var p : product.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }
    }
}