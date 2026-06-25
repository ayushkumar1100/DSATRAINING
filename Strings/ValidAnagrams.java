/*
leetcode 242
Approach:
If the lengths of both strings are different, they can never be anagrams.
Create a frequency array of size 26 (for letters a to z).
Traverse both strings together.
    Increase the count for each character in s.
    Decrease the count for each character in t.
Check the frequency array.
    If every value is 0, both strings have the same character frequencies.
    Otherwise, they are not anagrams.
*/

public class ValidAnagrams {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nvgaram";
        System.out.println(isAnagram(s, t));
    }
}