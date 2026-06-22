/*
Leetcode 643

Approach :
    Calculate the sum of the first k elements.
    Store it as both maxSum and windowSum.
    Slide the window one step at a time.
    Add the new element entering the window.
    Subtract the old element leaving the window.
    Update maxSum if the current window sum is larger.
    After checking all windows, return maxSum / k.
    Time Complexity
    O(n)
    Space Complexity
    O(1)
*/
public class  MaximumAverageSubarrayI {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double windowSum = maxSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        double maxAverage = maxSum / k;

        System.out.println("Maximum Average = " + maxAverage);
    }
}