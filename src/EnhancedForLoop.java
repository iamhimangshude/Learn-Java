public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] nums = new int[4]; // array of size 4
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // traditional for loop -------
        // for (int i = 0; i<nums.length; i++){
        // System.out.println(nums[i]);
        // }

        // Enhanced for loop ----------
        for (int n : nums) {
            System.out.println(n);
        }
    }
}

// NOTE: Arrays are covered in the `Arrays` folder. Head there for references!
