/*
Approach :
    Create two variables:
        max → stores the largest element.
        secondMax → stores the second largest element.
    Traverse the array one by one.
    For each element: Add it to sum.
    If the current element is greater than max: Move the old max to secondMax.
    Update max with the current element.
    Otherwise, if the current element is greater than secondMax and not equal to max:
    Update secondMax.
    After the loop:
    Calculate average using sum / number of elements.
    Print sum, average, max, and secondMax.

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class SecondMax{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        double average = (double) sum / arr.length;

        System.out.println("SUM = " + sum);
        System.out.println("Average = " + average);
        System.out.println("MAX = " + max);
        System.out.println("2nd MAX = " + secondMax);
    }
}