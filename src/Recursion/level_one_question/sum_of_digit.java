package Recursion.level_one_question;

public class sum_of_digit {
    public static void main(String[] args) {
        int n=123;
        sumofDigit(n);
        System.out.println(sum);
        System.out.println(sumOfDigit(n));
    }
    //recursion ans
    static int sum =0;
    public static void sumofDigit(int n){
        //base case
        if(n == 0) return;
        int remind =n%10;
        sum =sum +remind;
        sumofDigit(n/10);
    }
    public static int sumOfDigit(int n){
        int sum=0;
        while (n!=0){
            int remind=n%10;
            sum =sum +remind;
            n=n/10;
        }
        return sum;
    }
}
