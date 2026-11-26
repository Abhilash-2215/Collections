import java.util.LinkedHashSet;

public class ContactManagement {
    public static void main(String[] args) {

        LinkedHashSet<String> contacts = new LinkedHashSet<>();

        contacts.add("Abhi");
        contacts.add("Saran");
        contacts.add("Kiran");
        contacts.add("Rahul");
        contacts.add("Abhi");

        System.out.println("All Contacts");
        System.out.println(contacts);

        contacts.add("Priya");

        System.out.println("After Adding New Contact");
        System.out.println(contacts);

        contacts.remove("Rahul");

        System.out.println("After Removing Rahul");
        System.out.println(contacts);

        if (contacts.contains("Saran")) {
            System.out.println("Saran Contact Found");
        } else {
            System.out.println("Contact Not Found");
        }

        System.out.println("Contacts In Added Order");
        System.out.println(contacts);
    }
}