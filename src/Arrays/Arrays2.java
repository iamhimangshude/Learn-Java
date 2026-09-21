package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];

        
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length; col++){
                nums[row][col] = (int) (Math.random() * 10);
            }
        }
        // for (int row = 0; row < nums.length; row++){
        //     for (int col = 0; col < nums[row].length; col++){
        //         System.out.print(nums[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // enhanced for loop version
        for (int[] arr : nums){
            for (int els : arr){
                System.out.print(els + " ");
            }
            System.out.println();
        }
    }
}
