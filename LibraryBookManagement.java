import java.util.ArrayList;
import java.util.Collections;

public class LibraryBookManagement {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Java Basics");
        books.add("Python Programming");
        books.add("Data Structures");
        books.add("Operating System");
        books.add("Computer Networks");

        System.out.println("Books in Library");
        System.out.println(books);

        books.add("Machine Learning");
        System.out.println("After Adding New Book");
        System.out.println(books);

        books.remove("Operating System");
        System.out.println("After Removing Book");
        System.out.println(books);

        books.set(1, "Advanced Python");
        System.out.println("After Updating Book");
        System.out.println(books);

        String searchBook = "Data Structures";

        if (books.contains(searchBook)) {
            System.out.println(searchBook + " Found");
        } else {
            System.out.println(searchBook + " Not Found");
        }

        System.out.println("Available Books");
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("Total Books: " + books.size());

        Collections.reverse(books);

        System.out.println("Books in Reverse Order");
        System.out.println(books);
    }
}