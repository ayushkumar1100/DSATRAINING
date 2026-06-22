// leetcode 724
/*
    Approach:
        A pivot index is an index where:

        Sum of all elements on the left = Sum of all elements on the right

        Step 1: Find Total Sum

        First, calculate the sum of all elements in the array.

        Example:

        [1, 7, 3, 6, 5, 6]
        Total Sum = 28
        Step 2: Traverse the Array

        Keep a variable leftSum that stores the sum of elements before the current index.

        For every index i:

        Right Sum = Total Sum - Left Sum - nums[i]

        If:

        Left Sum == Right Sum

        then i is the pivot index.

        Step 3: Update Left Sum

        After checking the current index, add nums[i] to leftSum.

        Time Complexity
            First loop: O(n)
            Second loop: O(n)

            Overall: O(n)

            Space Complexity : O(1)

*/        

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        int leftSum = 0;
        int totalSum = 0;
        int pivotIndex = -1;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                pivotIndex = i;
                break;
            }

            leftSum += nums[i];
        }

        if (pivotIndex != -1) {
            System.out.println("Pivot Index = " + pivotIndex);
        } else {
            System.out.println("Pivot Index not found");
        }
    }
}