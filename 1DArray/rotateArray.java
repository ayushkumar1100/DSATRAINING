/*
Approach:
Reverse entire array.
Reverse first k elements.
Reverse remaining n-k elements.

This achieves rotation in O(n) time and O(1) extra space.
*/


import java.util.*;
public class rotateArrays{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[]args){
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));


    }
}