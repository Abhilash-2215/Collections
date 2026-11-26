import java.util.HashSet;

public class CollegeEventRegistration {
    public static void main(String[] args) {

        HashSet<String> event1 = new HashSet<>();
        HashSet<String> event2 = new HashSet<>();

        event1.add("ST101");
        event1.add("ST102");
        event1.add("ST103");
        event1.add("ST104");
        event1.add("ST105");

        event1.add("ST103");

        System.out.println("Event 1 Registrations:");
        System.out.println(event1);

        event1.remove("ST105");

        System.out.println("\nAfter Cancellation:");
        System.out.println(event1);

        String searchId = "ST102";

        if (event1.contains(searchId)) {
            System.out.println("\n" + searchId + " is registered.");
        } else {
            System.out.println("\n" + searchId + " is not registered.");
        }

        System.out.println("\nTotal Unique Registrations: " + event1.size());

        event2.add("ST102");
        event2.add("ST103");
        event2.add("ST106");
        event2.add("ST107");
        event2.add("ST108");

        System.out.println("\nEvent 2 Registrations:");
        System.out.println(event2);

        HashSet<String> bothEvents = new HashSet<>(event1);
        bothEvents.retainAll(event2);

        System.out.println("\nStudents Registered for Both Events:");
        System.out.println(bothEvents);

        HashSet<String> allStudents = new HashSet<>(event1);
        allStudents.addAll(event2);

        System.out.println("\nAll Registered Students:");
        System.out.println(allStudents);
    }
}