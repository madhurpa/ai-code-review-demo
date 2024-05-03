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

        // Iterating over the employee list
        for(int i=0; i<10; i++) {
            Employee employee = employees.get(i);
            //Write business logic here
        }
    }
}