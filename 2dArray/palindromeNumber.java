/* 
Approach:
Store the original number.
Create a variable to store the reversed number.
Repeat until the number becomes 0:
Get the last digit.
Add it to the reversed number.
Remove the last digit from the original number.
Compare:
If original == reverse, the number is a palindrome.
Otherwise, it is not.
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("a Palindrome Number.");
        } else {
            System.out.println("not a Palindrome Number.");
        }
    }
}