/*
Lower Bound Approach: Find the first index where: arr[index] >= target
Since the array is sorted, use binary search.
If arr[mid] >= target, then mid can be the answer, but there might be another valid index on the left.
Store nothing; just move left:high = mid;
Otherwise (arr[mid] < target), the answer cannot be at mid or to its left.
Move right:low = mid + 1;
Continue until low == high.

Upper Bound Approach: Find the first index where: arr[index] > target
Again use binary search.
If arr[mid] > target, mid can be the answer.
Move left:high = mid;
Otherwise (arr[mid] <= target) Move right:low = mid + 1;
Return low.

*/


public class UpperLowerBound {

    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 7;

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        System.out.println("Lower Bound Index: " + lb);
        System.out.println("Upper Bound Index: " + ub);

        if (lb < arr.length) {
            System.out.println("Lower Bound Value: " + arr[lb]);
        } else {
            System.out.println("Lower Bound Value: Not Found");
        }

        if (ub < arr.length) {
            System.out.println("Upper Bound Value: " + arr[ub]);
        } else {
            System.out.println("Upper Bound Value: Not Found");
        }
    }
}