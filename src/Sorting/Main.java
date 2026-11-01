package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age){
            return 1;
        } else {
            return -1;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer arg0, Integer arg1) {

                if (arg0 % 10 > arg1 % 10)
                    return 1; // swap
                else
                    return -1; // no swap
            }

        };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(32);
        // nums.add(71);
        // nums.add(29);

        // Collections.sort(nums, com);

        // System.out.println(nums);


        // ------------------------------------

        // Comparator<Student> studentComparator = new Comparator<Student>() {

        //     @Override
        //     public int compare(Student arg0, Student arg1) {
        //         if (arg0.age > arg1.age){
        //             return 1; // swap
        //         } else {
        //             return -1; // no swap
        //         }
        //     }
            
        // };

        // Equivalent lambda exp...

        // This is possible because Comparator is a functional interface!
        Comparator<Student> studentComparator = (Student s1, Student s2) -> s1.age > s2.age ? 1 : -1;

        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Himangshu", 22));
        students.add(new Student("Snehasish", 20));
        students.add(new Student("Shubhradeep", 21));
        students.add(new Student("Niladri", 24));

        Collections.sort(students, studentComparator); // we have to pass custom comparator.compare method to sort in custom way
        // this happens when a custom class does not have any compareTo() method.

        // Collections.sort(students);
        
        System.out.println(students);
    }
}
