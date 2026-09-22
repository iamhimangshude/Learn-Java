package Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // ----- Array of data types ------
        // int[] nums = new int[6];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        // ------- Array of Objects ---------
        Student s1 = new Student();
        s1.name = "Himangshu";
        s1.rollno = 1;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "John";
        s2.rollno = 2;
        s2.marks = 76;

        Student s3 = new Student();
        s3.name = "Garry";
        s3.rollno = 3;
        s3.marks = 56;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Traditional for loop version ----------------
        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " (" + students[i].rollno + "): " +
        // students[i].marks);
        // }

        // Enhanced for loop version -----------------
        for (var val : students) { // or use `Student` instead of `var`
            System.out.println(val.name + " (" + val.rollno + "): " + val.marks);
        }
    }
}

class Student {
    int rollno;
    String name;
    int marks;
}

// NOTE: `var` keyword is used for inferring the data type of a data during
// runtime