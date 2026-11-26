import java.util.TreeSet;

public class EmployeeIDManagement {
    public static void main(String[] args) {

        TreeSet<Integer> empid = new TreeSet<>();

        empid.add(101);
        empid.add(102);
        empid.add(103);
        empid.add(104);
        empid.add(105);

        System.out.println("Employee IDs : " + empid);

        empid.add(106);
        System.out.println("After adding : " + empid);

        empid.remove(103);
        System.out.println("After removing : " + empid);

        System.out.println("Smallest ID : " + empid.first());
        System.out.println("Largest ID : " + empid.last());

        int id = 105;

        System.out.println("Higher than " + id + " : " + empid.higher(id));
        System.out.println("Lower than " + id + " : " + empid.lower(id));

        System.out.println("HeadSet : " + empid.headSet(105));
        System.out.println("TailSet : " + empid.tailSet(105));
        System.out.println("SubSet : " + empid.subSet(102, 106));
    }
}