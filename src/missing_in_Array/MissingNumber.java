package missing_in_Array;

public class MissingNumber {

    public static int missingNumberFromArray(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int arr : nums) {
            actualSum += arr;
        }
        return expectedSum - actualSum;
    }


    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int res = missingNumberFromArray(nums);
        System.out.println("Missing Number: " + res);

    }
}
