/* Approach :
First loop chooses the starting index.
Second loop chooses the ending index.
Third loop prints all elements between start and end
Number of subarrays = n(n+1)/2
Printing each subarray takes up to O(n)
Total = O(n^3)
*/

public class PrintSubArrays{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
                
            }
        
    }
}