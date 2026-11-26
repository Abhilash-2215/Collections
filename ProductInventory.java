import java.util.HashSet;


public class ProductInventory {
    public static void main(String[] args) {
        HashSet<String> products=new HashSet<>();

        products.add("LAptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");

        System.out.println("Products:"+products);

        products.add("Sepajer");
        System.out.println("after adiing :"+products);

        products.add("LAptop");
        products.add("Mouse");
        System.out.println("after duplication:"+products);
        
        products.add("Printer");
        System.out.println("after remobing:"+products);

        String searchProduct="Monitor";

        if(products.contains(searchProduct))
        {
            System.out.println(searchProduct+"founf");
        }
        else{
            System.out.println(searchProduct+"not founf");
        }
        System.out.println("all unique products: " + products);

        System.out.println("total unique products: " + products.size());
    }


}
