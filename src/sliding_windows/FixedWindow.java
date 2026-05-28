package sliding_windows;

public class FixedWindow {

    public static int maxSumSubarray(int[] arr, int k) {

        int windowsSum = 0;
        // Step 1: calculate first window
        for (int i = 0; i < k; i++) {
            windowsSum += arr[i];
        }
        int maxSum = windowsSum;
        // step 2: slide the window
        for (int i = k; i < arr.length; i++) {
            windowsSum += arr[i];   // add next element
            windowsSum -= arr[i - k];   // remove previous element

            maxSum = Math.max(maxSum, windowsSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarray(arr, k));
    }
}
