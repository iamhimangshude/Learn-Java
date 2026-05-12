package oop;

public class StringManipulationMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("birth year = " + birthDate.substring(startingIndex));

        System.out.println("month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1983");
        System.out.printf("date = %s%n", newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1983");
        System.out.printf("date (using concat method) = %s%n", newDate);
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
