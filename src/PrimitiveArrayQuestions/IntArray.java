package PrimitiveArrayQuestions;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        intArr[0] = 0;
        intArr[1] = 20;
        intArr[2] = 20;
        intArr[3] = 40;
        intArr[4] = 80;

        System.out.println(Arrays.toString(intArr));
        int uniqueElements = removeDuplicates(intArr);
        System.out.println("Unique Elements in the array: " + uniqueElements);
        System.out.println(Arrays.toString(intArr));

        int[] sumArr = { 2, 4, 11, 3 };
        int target = 6;

        System.out.println(Arrays.toString(twoSum(sumArr, target)));
    }

    public static int removeDuplicates(int[] nums) {
        // this function takes a sorted array and removes
        // duplicates with
        // in-place replacement!
        if (nums.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        if (nums.length == 2) {
            indexes[0] = 0;
            indexes[1] = 1;
            return indexes;
        }
        ;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;
    }
}