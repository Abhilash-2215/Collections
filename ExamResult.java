import java.util.TreeMap;

public class ExamResult {
    public static void main(String[] args) {

        TreeMap<Integer, Integer> student = new TreeMap<>();

        student.put(105, 78);
        student.put(101, 92);
        student.put(103, 85);
        student.put(107, 67);
        student.put(102, 88);

        System.out.println("All Student Results");
        System.out.println(student);

        student.put(107, 75);

        System.out.println("Updated Mark of Roll No 107");
        System.out.println(student.get(107));

        System.out.println("First Entry");
        System.out.println(student.firstEntry());

        System.out.println("Last Entry");
        System.out.println(student.lastEntry());

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int highRoll = 0;
        int lowRoll = 0;

        for (int roll : student.keySet()) {

            int marks = student.get(roll);

            if (marks > highest) {
                highest = marks;
                highRoll = roll;
            }

            if (marks < lowest) {
                lowest = marks;
                lowRoll = roll;
            }
        }

        System.out.println("Highest Marks");
        System.out.println("Roll No : " + highRoll + " Marks : " + highest);

        System.out.println("Lowest Marks");
        System.out.println("Roll No : " + lowRoll + " Marks : " + lowest);

        System.out.println("Students Between Roll No 102 and 105");
        System.out.println(student.subMap(102, true, 105, true));

        System.out.println("Reverse Order");
        System.out.println(student.descendingMap());
    }
}