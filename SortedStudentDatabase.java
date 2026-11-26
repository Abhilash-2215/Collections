import java.util.TreeMap;

public class SortedStudentDatabase {
    public static void main(String[] args) {

        TreeMap<Integer,String> student = new TreeMap<>();

        student.put(104, "Rahul");
        student.put(101, "Abhi");
        student.put(103, "Kiran");
        student.put(105, "Saran");
        student.put(102, "Ravi");

        System.out.println("student records");
        System.out.println(student);

        student.put(103, "Kumar");

        System.out.println("updated record");
        System.out.println(student);

        student.remove(105);

        System.out.println("after removing student");
        System.out.println(student);

        System.out.println("ascending order");
        System.out.println(student);

        System.out.println("descending order");
        System.out.println(student.descendingMap());

        System.out.println("first roll number");
        System.out.println(student.firstKey());

        System.out.println("last roll number");
        System.out.println(student.lastKey());

        System.out.println("students between 101 and 103");
        System.out.println(student.subMap(101, true, 103, true));
    }
}