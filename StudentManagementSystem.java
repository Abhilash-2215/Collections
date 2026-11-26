import java.util.Scanner;

public class StudentManagementSystem {

    int studentId;
    String name;
    String department;
    int sub1, sub2, sub3;

    StudentManagementSystem(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    void enterMarks(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    int total() {
        return sub1 + sub2 + sub3;
    }

    double average() {
        return total() / 3.0;
    }

    String grade() {
        double avg = average();

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "Fail";
    }

    String result() {
        if (average() >= 50)
            return "PASS";
        else
            return "FAIL";
    }

    void display() {
        System.out.println("\nStudent Report");
        System.out.println("Id : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Dept : " + department);
        System.out.println("Total : " + total());
        System.out.println("Avg : " + average());
        System.out.println("Grade : " + grade());
        System.out.println("Result : " + result());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student Management System");

        System.out.print("Enter id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name : ");
        String name = sc.nextLine();

        System.out.print("Enter department : ");
        String department = sc.nextLine();

        StudentManagementSystem s =
                new StudentManagementSystem(id, name, department);

        System.out.print("Enter mark1 : ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark2 : ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark3 : ");
        int m3 = sc.nextInt();

        s.enterMarks(m1, m2, m3);

        s.display();
    }
}