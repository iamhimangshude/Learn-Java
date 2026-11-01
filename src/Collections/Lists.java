package Collections;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(10);
        nums.add(6);        
        nums.add(20);
        nums.add(15);

        // System.out.println(nums);

        // Below code will not work, if using collection api!
        for (int i= 0; i< nums.size(); i++){
            System.out.println(nums.get(i));
        }

        // Do this:
        // for (var el: nums){
        //     System.out.println(el);
        // }
    }
}

// NOTE:
// Lists are a collection of elements with an index value and are of dynamic length!
//