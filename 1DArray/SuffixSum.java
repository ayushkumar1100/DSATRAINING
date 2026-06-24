public class SuffixSum{
    public static void main(String[] args){
        int[] arr = {};
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
            }
            System.out.print(sum + " ");
        }
         
        
    }
}