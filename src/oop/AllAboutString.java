package oop;

public class AllAboutString {
    public static void main(String[] args) {
        printInformation("Hello world");
        printInformation("");
        printInformation("\t \n");

        // String inspection methods{
        String text = "Hello World";
        System.out.printf("index of r = %d %n", text.indexOf("r"));
        System.out.printf("index of World = %d %n", text.indexOf("World"));

        System.out.printf("index of l = %d %n", text.indexOf("l"));
        System.out.printf("last index of l = %d %n", text.lastIndexOf("l"));

        System.out.printf("index of l = %d %n", text.indexOf("l", 3));
        System.out.printf("last index of l = %d %n", text.lastIndexOf("l", 8));
        // }

        // String Comparison methods{
        String textLower = text.toLowerCase();
        if (text.equals(textLower)) {
            System.out.println("Values match exactly");
        }
        if (text.equalsIgnoreCase(textLower)) {
            System.out.println("Values match exactly (case insensitive)");
        }

        if (text.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (text.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (text.contains("World")) {
            System.out.println("String contains World");
        }

        if (text.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d%n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}