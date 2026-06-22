/*
leetcode 523
Approach :
Start from each index i.
Initialize sum with nums[i].
Extend the subarray by adding the next elements one by one.
After each addition, check if sum % k == 0.
If yes, a valid subarray of length at least 2 is found, so print true.
If all subarrays are checked and none satisfy the condition, print false.
Time Complexity
O(n^2)
Space Complexity
O(1)

imp note :
Why TLE (Time Limit Exceeded)? 
    You have two nested loops:
        If n = nums.length, then:

        Outer loop runs about n times.
        Inner loop runs about n times for each outer iteration.

        So the time complexity is:

        O(n^2)

        For LeetCode 523:

        n can be up to 100,000
        O(n^2) ≈ 10¹⁰ operations in the worst case

        That's far too many operations, so LeetCode stops your program and gives Time Limit Exceeded.
        solution: LeetCode 523 is solved using:Prefix Sum and HashMap.
*/

public class ContinuousSubArraySum {

    public static void main(String[] args) {

        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        boolean found = false;

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];

                if (sum % k == 0) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        System.out.println(found);
    }
}

    


