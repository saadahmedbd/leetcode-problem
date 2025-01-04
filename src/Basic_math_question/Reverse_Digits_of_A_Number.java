package Basic_math_question;

public class Reverse_Digits_of_A_Number {
    public static void main(String[] args) {
        int n=-34500;
        int m=-34500;
        System.out.println(reverseNumber(n));
        System.out.println(reverse_number(m));
    }
//    tc 0(logN) sc 0(1)
    public static int reverseNumber(int n){
        int reverse =0;
        while(n!=0){
            int lastDigit =n%10;
            reverse=reverse *10+lastDigit;
            n=n/10;
        }
        return reverse;
    }

//    leetcode reverse integer 7 easy
    public static int reverse_number(int m){
        int max= Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        if(m==min || m==max) return 0;
        int reverse=0;
        while (m !=0){
            int last_digit=m%10;
            if(reverse > max/10) return 0;
            if(reverse <min/10) return 0;
            reverse=reverse *10 +last_digit;
            m=m/10;
        }
        return reverse;
    }
}
