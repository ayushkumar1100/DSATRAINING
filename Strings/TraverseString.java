/*
Approach:
Traversing the string using charAt()
*/

public class TraverseString{
    public static void main(String[] args){
        String data = "TraverseMe";
        for(int i=0;i<data.length();i++){
            System.out.print(data.charAt(i)+ " ");
        }
    }
}