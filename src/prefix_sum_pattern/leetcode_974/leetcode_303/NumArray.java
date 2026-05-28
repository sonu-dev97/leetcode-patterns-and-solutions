package prefix_sum_pattern.leetcode_974.leetcode_303;
/* 303. Range Sum Query - Immutable

Given an integer array nums, handle multiple queries of the following type:

1. Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.

int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive
(i.e. nums[left] + nums[left + 1] + ... + nums[right]).

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]*/
public class NumArray {

    private static int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public static int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        // Input array
        int[] nums = {-2, 0, 3, -5, 2, -1};

        // Create object
        NumArray obj = new NumArray(nums);

        // Test cases
        System.out.println(sumRange(0, 2)); // 1
        System.out.println(sumRange(2, 5)); // -1
        System.out.println(sumRange(0, 5)); // -3
    }
}
