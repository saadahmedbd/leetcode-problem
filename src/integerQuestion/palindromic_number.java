package integerQuestion;

public class palindromic_number {
    public static void main(String[] args) {
        int num=12121;
        System.out.println(palindrom_number(num));
    }
    public static boolean palindrom_number(int num){
        int reverse =0;
        while(num>reverse){
            int lastDigit =num%10;
            reverse=reverse*10+lastDigit;
            num=num/10;
        }
        return (reverse==num)|| (num==reverse/10);
    }
}
