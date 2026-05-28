package sliding_window_pattern.leetcode_3.leetcode_438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramsInString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) return list;

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Step 1: Count characters of p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        int k = p.length();

        // Step 2: Sliding window
        for (int i = 0; i < s.length(); i++) {
            // Add current character to window
            windowCount[s.charAt(i) - 'a']++;
            // Remove character if window size exceeds k
            if (i >= k) {
                windowCount[s.charAt(i - k) - 'a']--;
            }
            // Compare arrays
            if (Arrays.equals(pCount, windowCount)) {
                list.add(i - k + 1);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> anagrams = findAnagrams(s, p);
        System.out.println(anagrams);
    }
}
