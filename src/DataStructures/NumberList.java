package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberList {
    static void main() {
        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(4, 8, 4, 12, 8, 20, 3, 0, 9, 8, 6, 30, 20, 12));
        ArrayList<Integer> intArr2 = new ArrayList<>();
        int sum = 0, max = intArr.getFirst(), min = intArr.getFirst();
        double avg;

        System.out.println("Original array: " + intArr);
        for (int i = 0; i < intArr.size(); i++) {
            if (!intArr2.contains(intArr.get(i))) {
                intArr2.add(intArr.get(i));
                sum += intArr.get(i);
            }
            if (intArr.get(i) > max) max = intArr.get(i);
            if (intArr.get(i) < min) min = intArr.get(i);
        }
        avg = (double) sum / intArr2.size();
        System.out.println("Array after removing duplicates: " + intArr2);
        System.out.println("The max element in the list: " + max);
        System.out.println("The min element in the list: " + min);
        System.out.printf("The avg of the elements in the list: %.2f%n", avg);
    }
}
