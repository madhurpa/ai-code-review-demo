import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListIteration {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Adding some employees to the list
        employees.add(new Employee(101, "John", "Engineering"));
        employees.add(new Employee(102, "Alice", "Marketing"));
        employees.add(new Employee(103, "Bob", "HR"));
        employees.add(new Employee(104, "Darryl", "Engineering"));
        employees.add(new Employee(105, "Kane", "Marketing"));
        employees.add(new Employee(106, "Glen", "HR"));

        // Iterating over the employee list using an Iterator
        System.out.println("Employee List:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}