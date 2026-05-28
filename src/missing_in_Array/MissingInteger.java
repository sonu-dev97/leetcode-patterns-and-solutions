package missing_in_Array;

public class MissingInteger {
    public static int missingNumber(int[] arr) {

        int n = arr.length + 1;
        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
