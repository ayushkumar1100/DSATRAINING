/*
leetcode 14
Approach:
    Take the first string as the reference because the longest common prefix cannot be longer than it.
    Traverse the first string character by character.
    For each character, compare it with the character at the same index in every other string.
    As soon as a mismatch is found, return the prefix up to that point.

Time Complexity: O(n × m)
Space Complexity: O(1)    

*/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "low", "flight"};
        if (arr == null || arr.length == 0) {
            System.out.println("");
            return;
        }
        String ans = "";
        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (i == arr[j].length() || arr[j].charAt(i) != ch) {
                    System.out.println(arr[0].substring(0, i));
                    return;
                }
            }
        }
        System.out.println(arr[0]);
    }
}