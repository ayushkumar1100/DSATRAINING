/*
Approach
Initialize two pointers:
start = 0
end = length - 1
Move start until it points to a vowel.
Move end until it points to a vowel.
Swap the vowels.
Move both pointers inward.
Repeat until start >= end.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class ReverseVowel {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        StringBuilder data = new StringBuilder("Hello");
        int start = 0;
        int end = data.length() - 1;
        while (start < end) {
            while (start < end && !isVowel(data.charAt(start))) {
                start++;
            }
            while (start < end && !isVowel(data.charAt(end))) {
                end--;
            }
            char temp = data.charAt(start);
            data.setCharAt(start, data.charAt(end));
            data.setCharAt(end, temp);
            start++;
            end--;
        }
        System.out.println(data);
    }
}