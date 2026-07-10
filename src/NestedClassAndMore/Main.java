package NestedClassAndMore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import NestedClassAndMore.domain.Employee;
import NestedClassAndMore.domain.EmployeeComparator;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carol", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018)));

        // var comparator = new EmployeeComparator<>();
        // employees.sort(comparator);

        // employees.sort(new Employee.EmployeeComparator<>());
        // employees.sort(new Employee.EmployeeComparator<>("yearStarted"));
        // employees.sort(new Employee.EmployeeComparator<>().reversed());

        // for (Employee e : employees) {
        // System.out.println(e);
        // }

        System.out.println("Sort by yearStarted");
        printListElements("yearStarted", false, employees);
        System.out.println();
        System.out.println("Sort by yearStarted in reveresed");
        printListElements("yearStarted", true, employees);
        System.out.println();
        System.out.println("Sort by name");
        printListElements("name", false, employees);
        System.out.println();
        System.out.println("Sort by name in reversed");
        printListElements("name", true, employees);

    }

    private static void printListElements(String sortTypeParam, boolean reversed, List<? extends Employee> list) {
        if (reversed) {
            list.sort(new Employee.EmployeeComparator<>(sortTypeParam).reversed());
        } else
            list.sort(new Employee.EmployeeComparator<>(sortTypeParam));

        for (var item : list) {
            System.out.println(item);
        }
    }
}
