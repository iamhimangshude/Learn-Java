package PrimitiveArrayQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class OtherSolutionIntArr {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 7, 10 };
        Solution sol = new Solution();
        int[] result = sol.twoSum(arr, 10);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (map.containsKey(y) && map.get(y) != i)
                return new int[] { i, map.get(y) };
        }

        return new int[] { -1, -1 };
    }
}