package integerQuestion;

public class Divide_into_integer {
    public static void main(String[] args) {
        int dividend =-2147483648, divisor =-1;
        System.out.println(divideIntoInt(dividend, divisor));
    }
    public static int divideIntoInt(int dividend, int divisor){
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Prevent overflow
        }
        int ans =dividend/divisor;
        return ans;
    }
}
