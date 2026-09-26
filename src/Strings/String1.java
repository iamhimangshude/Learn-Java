package Strings;

public class String1 {
    public static void main(String[] args) {
        // String name = new String("himangshu");
        String name = "himangshu";

        name = "hello " + name; // a new string object is created and assigned to name var.

        // some methods in strings
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" de")); // more methodful way of "hello " + name

    }
}
