import java.util.ArrayList;
import java.util.List;

public class NestedClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(101, "John", 2019),
                new Employee(106, "Cailey", 2018),
                new Employee(111, "Scully", 2022),
                new Employee(198, "Donna", 2024),
                new Employee(201, "Abraham", 2015)));

        // employees.sort(new Employee().new
        // EmployeeComparator<Employee>("yearStarted"));
        employees.sort(new Employee().new EmployeeComparator<Employee>("id"));

        employees.forEach((Employee I) -> System.out.println(I));
    }
}