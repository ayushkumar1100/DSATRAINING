/*
Approach:
Traversing the string using charAt()
imp note: here we are get the length of string using str.length()-> here length() is a method.
*/

public class TraverseString{
    public static void main(String[] args){
        String data = "TraverseMe";
        for(int i=0;i<data.length();i++){
            System.out.print(data.charAt(i)+ " ");
        }
    }
}