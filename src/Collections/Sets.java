package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<>(); // unsorted
        Set<Integer> nums = new TreeSet<>(); // sorted (natural ordering)
        nums.add(69);
        nums.add(52);
        nums.add(6);
        nums.add(41);
        nums.add(92);
        nums.add(6);

        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();
        // Iterator() class provides us with two methods next() and hasNext().

        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}

// NOTE:
// Sets are unique collection of elements and have no index value!

// HashSet are of unsorted collection of unique elements
// TreeSet are of sorted collection of unique elements