import java.util.LinkedList;
public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> songs= new LinkedList<>();
        songs.add("babydoll");
        songs.add("massamassa");
        songs.add("galivaluga");
        songs .add("maya");
        System.out.println("after adding songs:"+songs);

        songs.addFirst("Dhandalaya");
        songs.addLast("haie haie");
        System.out.println("after adding at firts:"+songs);

        songs.removeFirst();
        songs.removeLast();

        System.out.println("current playlist:"+songs);

        System.out.println("first song:"+songs.getFirst());
        System.out.println("last song:"+songs.getLast());

        String search="Maya";

        if(songs.contains(search))
        {
            System.out.println("song exists");
        }
        else
        {
            System.out.println("song doesnt exists");
        }

        String curr = songs.removeFirst();
        System.out.println("current songs:"+curr);

        songs.removeFirst();
        songs.removeLast();

        System.out.println("curr playlist:"+songs);
        



    }  
}
