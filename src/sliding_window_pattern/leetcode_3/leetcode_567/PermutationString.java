package sliding_window_pattern.leetcode_3.leetcode_567;

public class PermutationString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        int windowSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;

            if (i >= windowSize)  {
                windowCount[s2.charAt(i - windowSize) - 'a']--;
            }

            if (matches(s1Count, windowCount)) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
