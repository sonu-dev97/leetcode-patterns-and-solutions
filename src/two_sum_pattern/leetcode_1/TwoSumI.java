package two_sum_pattern.leetcode_1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumI {
    public static int[] twoSumSolution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // i = 0, 1
            int complement = target - nums[i]; // complement = 7, 2
            if (map.containsKey(complement)) { // false, true
                return new int[]{map.get(complement), i}; // [0, 1]
            }
            map.put(nums[i], i); // [2,0]
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumSolution(input, target);
        System.out.println(Arrays.toString(result));
    }
}

/*// brute force approach ->
    // Time: O(n2)
    // Space: O(1)
    public static int[] twoSumSolution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }*/

/*int left = 0;
        int right = nums.length -1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};*/
