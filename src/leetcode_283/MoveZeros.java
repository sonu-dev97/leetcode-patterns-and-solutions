package leetcode_283;

import java.util.Arrays;

/* 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {7, 0, 1, 0, 3, 12};
        moveZerosToRight(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZerosToRight(int[] nums) {
        int insertPosition = 0;
//        // Move non-zero elements forward
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[insertPosition] = nums[i];
//                insertPosition++;
//            }
//        }
//        // Fill remaining positions with 0
//        while (insertPosition < nums.length) {
//            nums[insertPosition] = 0;
//            insertPosition++;
//        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertPosition];
                nums[insertPosition] = temp;
                insertPosition++;
            }
        }
    }
}
