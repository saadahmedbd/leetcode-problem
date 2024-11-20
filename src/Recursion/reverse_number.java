package Recursion;

public class reverse_number {
    public static void main(String[] args) {
        int n=1234;
        reversenumber(n);
        System.out.println(sum);
        System.out.println(reverseNumber(n));
    }
    //recursion ans
    static int sum=0;
    public static void reversenumber(int n){
        // base condition
        if(n ==0){
            return;
        }
        int remind=n%10;
        sum =sum *10+remind;
        reversenumber(n/10);
    }
    public static int reverseNumber(int n){
        int reverse=0;
        while (n!=0){
            int division =n%10;
            reverse=reverse *10 +division;
            n=n/10;
        }

        return reverse;
    }
}
