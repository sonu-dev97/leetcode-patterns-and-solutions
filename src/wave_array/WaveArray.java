package wave_array;

public class WaveArray {
    // question -
    // Input: arr[] = [1, 2, 3, 4, 5]
    // Output: [2, 1, 4, 3, 5]
    // Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
    /*  i = 0 → swap(1,2) → [2,1,3,4,5]
        i = 2 → swap(3,4) → [2,1,4,3,5]
        i = 4 → stop  */

    public static void convertToWave(int[] arr) {
        int n = arr.length;

        //traverse array in steps of 2
        for (int i = 0; i < n - 1; i += 2) {
            // swap arr[i] to arr[i+1]
            int temp = arr[i];      // i = 0 → swap(1,2) → [2,1,3,4,5]
            arr[i] = arr[i + 1];    // i = 2 → swap(3,4) → [2,1,4,3,5]
            arr[i + 1] = temp;      // i = 4 → stop
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
