package Lambdas.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------------");
        list.forEach((var S) -> System.out.println(S)); // a lean lambda expression

        System.out.println("-----------------------");
        String prefix = "nato"; // declaring a string var
        // String S = "enclosing method's S string"; // NOTE: if this var is declared
        // here
        // then this var cannot be used as lambda
        // expressions' parameter

        list.forEach((var S) -> {
            char first = S.charAt(0);
            System.out.println(prefix + " " + S + " means " + first);
        });

        // NOTE: When a lambda expression accesses a variable in its enclosing class it
        // must need to be
        // final or effectively final, which means once a enclosing class' variable used
        // in the lambda
        // expression can't be changed later within its enclosing class' scope!

        // prefix = "NATO"; // will lead to compile error! Namely: "Local variable
        // `prefix` is required to
        // be final or effectively final based on its usage"

    }
}
