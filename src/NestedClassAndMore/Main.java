package NestedClassAndMore;

import java.util.ArrayList;
import java.util.List;

import NestedClassAndMore.domain.Employee;
import NestedClassAndMore.domain.StoreEmployee;

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

        System.out.println("Store employees");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target")));

        // var comparator = new StoreEmployee.EmployeeComparator<>();
        // storeEmployees.sort(comparator);

        var storeComparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(storeComparator);

        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }

        System.out.println("with pig latin names");
        addPigLatinName(storeEmployees);

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

    private static void addPigLatinName(List<? extends StoreEmployee> list){
        String lastName = "Piggy";
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{
            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(Employee originalInstance, String pigLatinName) {
                this.originalInstance = originalInstance;
                this.pigLatinName = pigLatinName + " " + lastName;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee decoratedEmployee) {
                return pigLatinName.compareTo(decoratedEmployee.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee : list){
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(employee, pigLatin));
        }

        newList.sort(null);
        for (var dEmployee: newList){
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLatinName);
        }
    }
}
