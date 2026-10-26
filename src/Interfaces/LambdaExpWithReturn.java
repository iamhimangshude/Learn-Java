package Interfaces;

@FunctionalInterface
interface InterA {
    int add(int i, int j);
}

public class LambdaExpWithReturn {
    public static void main(String[] args) {
        InterA obj = (int i, int j) -> i + j;

        var result = obj.add(5, 4);
        System.out.println(result);

    }
}
