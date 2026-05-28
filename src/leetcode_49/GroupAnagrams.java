package leetcode_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*49. Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

    There is no string in strs that can be rearranged to form "bat".
    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]
Output: [["a"]]
*/
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        // map to store grouped anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        // traverse each string
        for (String str : strs) {
            // convert string to char array
            char[] ch = str.toCharArray();
            // sort the characters
            Arrays.sort(ch);
            // convert back to string
            String sortedStr = new String(ch);
            // if key not present, create new list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // add original string to corresponding groups
            map.get(sortedStr).add(str);
        }
        // return all grouped values
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}

/* If interviewer asks not to use sorting then we can go for frequency count approach
* You can explain like this:
*
* Instead of sorting each string,
* I use a frequency array of size 26
* to count occurrences of characters.
* Then I build a unique key from that frequency array.
* All anagrams generate the same frequency key,
* so they get grouped together in the hashmap.*/

//    HashMap<String List<String>> map = new HashMap<>();
//    for (String str : strs) {
//        int[] count = new int[26];
//        // count characters
//        for (char ch : str.toCharArray()) {
//            count[ch - 'a']++;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int freq : count) {
//            sb.append(freq).append("#");
//        }
//        String key = sb.toString();
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(str);
//        }
//    return new ArrayList<>(map.values());
