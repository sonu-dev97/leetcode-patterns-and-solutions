package two_sum_pattern.leetcode_1.leetcode_125;

public class ValidPalindrome {

    public static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
//            if (Character.toLowerCase(s.charAt(left))
//                    != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }
            // optimized version:
            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));
            if (l != r) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Given input is valid palindrome: " + isValidPalindrome(s));
    }
}
