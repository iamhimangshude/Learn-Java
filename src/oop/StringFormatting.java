package oop;

public class StringFormatting {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted List (using multiple double quotes):
                        \u2022 First point
                            \u2022 Sub point
                """;

        System.out.println(textBlock);

        // format specifiers
        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2026 - age;
        System.out.printf("Age= %d, Birth Year= %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing i=%6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}