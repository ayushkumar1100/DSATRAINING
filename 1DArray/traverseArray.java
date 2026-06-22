/*
Approach (Short & Easy):

Create an array arr containing the elements.
Use a for loop starting from index 0.
Continue the loop until the last index (arr.length - 1).
In each iteration, print the element at the current index (arr[i]).
This traverses and prints every element of the array.

Time Complexity: O(n)
Space Complexity: O(1) 

*/

public class traverseArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        
    }
}

// output:1 2 3 4 5