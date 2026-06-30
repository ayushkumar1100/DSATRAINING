public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n = 17;
        if (isPowerOfTwo(n)) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }
    }
}