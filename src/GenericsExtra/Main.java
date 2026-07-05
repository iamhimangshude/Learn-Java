package GenericsExtra;

import java.util.ArrayList;
import java.util.List;

import GenericsExtra.model.LPAStudent;
import GenericsExtra.model.Student;
import GenericsExtra.util.QueryItem;
import GenericsExtra.util.QueryList;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchField(String fieldName, String value) {
        return false;
    }

}

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        // printList(students);
        // printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        // printList(lpaStudents);
        // printMoreLists(lpaStudents);

        List<String> strList = new ArrayList<>(List.of("Ann", "Cathy", "James", "Tim", "John"));
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7));
        testList(intList);
        testList(strList);

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreLists(matches);

        var students2021 = QueryList.getMatches(students, "yearStarted", "2021");
        printMoreLists(students2021);

        // QueryList<Employee> employeeList = new QueryList<>();
    }

    public static void printMoreLists(List<? extends Student> students) {
        for (var student : students) {
            // System.out.println(student.getYearStarted() + ": " + student);
            System.out.println(student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            }
            if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

    // NOTE: Below two overloaded functions will result in a type erasure clash
    // because
    // at the compile time, when using generic methods, the type argument (<T>) is
    // replaced
    // by either with Object type or its true type.
    // :ENDOFNOTE

    // public static void testList(List<String> list) {
    // for (var element : list) {
    // System.out.println("String: " + element.toUpperCase());
    // }
    // }

    // public static void testList(List<Integer> list) {
    // for (var element : list) {
    // System.out.println("Integer: " + element.floatValue());
    // }
    // }

    // public static <T extends Student> void printList(List<T> students) {
    // for (var student : students) {
    // System.out.println(student.getYearStarted() + ": " + student);
    // }
    // System.out.println();
    // }
}
