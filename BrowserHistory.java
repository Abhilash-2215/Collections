import java.util.LinkedList;
public class BrowserHistory {
    public static void main(String[] args) {
        LinkedList<String> websites = new LinkedList<>();

        websites.add("google.com");
        websites.add("youtube.com");
        websites.add("github.com");
        System.out.println("after visiting:"+websites);
        System.out.println("first website:"+websites.getFirst());
        System.out.println("Last website:"+websites.getLast());

        String search = "github.com";

        if(websites.contains(search))
        {
            System.out.println(search+"fount");
        }
        else
        {
            System.out.println(search+"not found");
        }
        websites.removeLast();
        System.out.println("after last removes:"+websites);

        websites.clear();
        System.out.println("history cleared:"+websites);
    }
}
