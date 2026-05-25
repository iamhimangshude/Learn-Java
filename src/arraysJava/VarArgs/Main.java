package arraysJava.VarArgs;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world again");

        String[] splitStrings =  "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "world", "again!");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArray));
    }

    // replacing String[] with String...
    public static void printText(String... textList){
        for (String t: textList){
            System.out.println(t);
        }
    }

}
