package sub_array_sum;

// Geek for Geeks -> Indexes of Subarray Sum

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<Integer> subarraySum(int[] nums, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == target) {
                ans.add(left + 1);
                ans.add(right + 1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> ans = subarraySum(arr, target);
        System.out.println(Arrays.toString(ans.toArray()));
    }
}
