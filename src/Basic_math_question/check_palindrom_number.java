package Basic_math_question;
//leetcode 9

public class check_palindrom_number {
    public static void main(String[] args) {
        int n=0;
        System.out.println(palindrm_number(n));
        int x=2233;
        System.out.println(palindromeNumber(x));
    }
    public static boolean palindrm_number(int n){
        //base condition
        if(n % 10 == 0 && n !=0) return false;

        int reverse =0;
        while (n >reverse){
            int lastDigit =n % 10;
            reverse=reverse *10 +lastDigit;
            n=n/10;

        }
        return (n == reverse) || (n == reverse/10);

    }
//    sc 0(logn) tc 0(1)
    public static boolean palindromeNumber(int x){
        int reverse =0;
        int duplicate =x;
        while(x>0){
            int lastDigit = x % 10;
            reverse=reverse * 10 +lastDigit;
            x=x/10;
        }
        if(duplicate == reverse){
            return true;
        }else {
            return false;
        }
    }
}
