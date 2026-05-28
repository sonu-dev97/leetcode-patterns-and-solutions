package leetcode_41;

/* 41. First Missing Positive

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // step 1: place numbers at correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 &&
                    nums[i] <= i &&
                    nums[nums[i] - 1] != nums[i]
            ) {
                int correctIndex = nums[i] - 1;

                // swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        // step 2: finding missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // step 3: all numbers are present
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));
    }
}
