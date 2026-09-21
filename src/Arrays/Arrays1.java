package Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // indexes starts from 0 (i.e. indexes are whole numbers!)
        // indexes:    0  1  2  3
        // int nums[] = { 3, 7, 2, 4 };
        int nums[] = new int[4]; // initializes the array with 0 as default!

        // to fetch an element
        // System.out.println(nums[1]);

        nums[0] = 3;
        nums[1] = 6; // set a number at index 1
        nums[2] = 4;
        nums[3] = 9;

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);    
    }
}
