import java.util.HashSet;
public class StuReg{
    public static void main(String[] args) {

        HashSet<Integer> students = new HashSet<>();

        students.add(101);
        students.add(102);
        students.add(103);
        students.add(104);
        students.add(105);
        students.add(101);

        System.out.println("registered students: " + students);

        students.add(106);
        System.out.println("after adding new id: " + students);

        students.remove(103);
        System.out.println("after removing id: " + students);

        int searchId = 104;

        if (students.contains(searchId)) {
            System.out.println(searchId + " exists");
        } else {
            System.out.println(searchId + " does not exist");
        }

        System.out.println("all registered ids: " + students);

        System.out.println("total unique registrations: " + students.size());
    }
}
    

