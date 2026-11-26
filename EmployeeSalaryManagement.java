import java.util.HashMap;

public class EmployeeSalaryManagement {
    public static void main(String[] args) {

        HashMap<Integer, Double> employee = new HashMap<>();

        employee.put(101, 25000.0);
        employee.put(102, 30000.0);
        employee.put(103, 45000.0);
        employee.put(104, 28000.0);
        employee.put(105, 50000.0);

        System.out.println(employee);

        employee.replace(102, 35000.0);

        int id = 103;

        if(employee.containsKey(id)) {
            System.out.println("salary of employee " + id + " is " + employee.get(id));
        }
        else {
            System.out.println("employee not found");
        }

        System.out.println("employee details");

        for(var e : employee.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        int highestId = 0;
        double highestSalary = 0;

        for(var e : employee.entrySet()) {
            if(e.getValue() > highestSalary) {
                highestSalary = e.getValue();
                highestId = e.getKey();
            }
        }

        System.out.println("highest paid employee id = " + highestId);
        System.out.println("highest salary = " + highestSalary);

        double total = 0;

        for(double salary : employee.values()) {
            total = total + salary;
        }

        System.out.println("total salary expenditure = " + total);
    }
}