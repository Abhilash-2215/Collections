  

import java.util.LinkedHashSet;

public class WebsiteVisitorTracking {
    public static void main(String[] args) {

        LinkedHashSet<String> visitors = new LinkedHashSet<>();

        visitors.add("V101");
        visitors.add("V102");
        visitors.add("V103");
        visitors.add("V104");
        visitors.add("V105");

    
        visitors.add("V102");

        System.out.println("Visitors Arrival Order:");
        System.out.println(visitors);

        
        visitors.add("V106");
        System.out.println("\nAfter adding V106:");
        System.out.println(visitors);

        
        visitors.remove("V103");
        System.out.println("\nAfter removing V103:");
        System.out.println(visitors);

        
        String checkVisitor = "V104";
        if (visitors.contains(checkVisitor)) {
            System.out.println("\n" + checkVisitor + " has already visited.");
        } else {
            System.out.println("\n" + checkVisitor + " has not visited.");
        }

    
        System.out.println("\nTotal Unique Visitors: " + visitors.size());

    
        System.out.println("\nVisitor Arrival Order:");
        for (String visitor : visitors) {
            System.out.println(visitor);
        }
    }
}