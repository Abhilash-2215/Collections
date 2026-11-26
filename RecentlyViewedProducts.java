public import java.util.LinkedHashSet;

public class RecentlyViewedProducts {
    public static void main(String[] args) {

        LinkedHashSet<String> products = new LinkedHashSet<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("SmartWatch");
        products.add("Keyboard");

        products.add("Mobile");

        System.out.println("Recently Viewed Products:");
        System.out.println(products);

        products.add("Mouse");
        products.add("Tablet");

        System.out.println("\nAfter Viewing New Products:");
        System.out.println(products);

        String searchProduct = "Laptop";

        if (products.contains(searchProduct)) {
            System.out.println("\n" + searchProduct + " was viewed.");
        } else {
            System.out.println("\n" + searchProduct + " was not viewed.");
        }

        products.remove("Keyboard");

        System.out.println("\nAfter Removing Keyboard:");
        System.out.println(products);

        System.out.println("\nTotal Unique Viewed Products: " + products.size());
    }
} {
    
}
