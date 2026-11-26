import java.util.HashMap;

public class ProductInventoryManagement1 {
    public static void main(String[] args) {

        HashMap<Integer,Integer> product = new HashMap<>();

        product.put(101,10);
        product.put(102,3);
        product.put(103,15);
        product.put(104,2);
        product.put(105,0);

        System.out.println(product);

        product.put(106,8);

        product.put(102,5);

        product.put(101, product.get(101) - 4);

        int id = 103;

        if(product.containsKey(id)) {
            System.out.println("product found");
            System.out.println(product.get(id));
        }
        else {
            System.out.println("product not found");
        }

        System.out.println("low stock products");

        for(HashMap.Entry<Integer,Integer> p : product.entrySet()) {
            if(p.getValue() < 5) {
                System.out.println(p.getKey() + " " + p.getValue());
            }
        }

        product.remove(105);

        System.out.println("all products");

        for(HashMap.Entry<Integer,Integer> p : product.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }
    }
}