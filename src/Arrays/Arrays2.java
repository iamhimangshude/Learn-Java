package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        int[][] nums2 = new int[3][]; // this is called jagged array
        // jagged array => when the size of nested array is unknown!

        nums2[0] = new int[3];
        nums2[1] = new int[4];
        nums2[2] = new int[2];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = (int) (Math.random() * 10);
            }
        }
        // for (int row = 0; row < nums.length; row++){
        // for (int col = 0; col < nums[row].length; col++){
        // System.out.print(nums[row][col] + " ");
        // }
        // System.out.println();
        // }

        // enhanced for loop version
        for (int[] arr : nums) {
            for (int els : arr) {
                System.out.print(els + " ");
            }
            System.out.println();
        }

        // -------- code for jagged array ----------
        System.out.println("-------- code for jagged array ----------");
        for (int row = 0; row < nums2.length; row++) {
            for (int col = 0; col < nums2[row].length; col++) {
                nums2[row][col] = (int) (Math.random() * 10);
            }
        }

        for (int[] arr : nums2) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // ----------- 3D Array ----------
        System.out.println("----------- 3D Array ----------");
        int[][][] threeDArr = new int[3][4][5]; // 3D array
    }
}

// NOTES:
// DRAWBACKS of ARRAY:
// - Array is allocates memory addresses contiguously, if the size needs to be
// increased we can't, we need to create a new array and copy all the elements
// of the old array to the new array!
