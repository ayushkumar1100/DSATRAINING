// leetcode 1480
/*
Approach :
        
        Start traversing the array from index 1.
        For each element, add the previous element's running sum to it.
        Store the result back in the same array.
        After the loop, the array itself contains the running sums.
        Note:no need to to change the value of first index bcoz it it itself same as sum

        Time Complexity:
            O(n) → One traversal of the array.
        Space Complexity:
            O(1) → No extra array is used. The result is stored in the same array.
*/

public class RunningSum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        System.out.print("Running Sum: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}