import java.util.ArrayList;
public class ShoppingCartManagement {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mobile");
        cart.add("earphones");
        cart.add("charger");

        System.out.println("cart products:"+cart);

        cart.remove("earphones");
        System.out.println("after removing :"+cart);

        cart.add("watch");
        System.out.println("after adding :"+cart);

        System.out.println("is laptop exist:"+cart.contains("Laptop"));

        System.out.println("all products:"+cart.size());

        cart.clear();
        System.out.println("cart after checkout:"+cart);


    }
    
}
