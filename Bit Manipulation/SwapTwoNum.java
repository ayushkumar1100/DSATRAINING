public class SwapTwoNum{
    public static void main(String[] args){
        int a = 100;
        int b = 101;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);

    }
}