package Basic_math_question;

public class armstrong_number {
    public static void main(String[] args) {
        int n=371;
        System.out.println(ArmstrongNumber(n));
    }
    public static boolean ArmstrongNumber(int n){
        int sum=0;
        int dup=n;
        while(n>0){
            int lastDigit= n% 10;
            int pow= (int) Math.pow(lastDigit, 3);
            sum +=pow;
            n=n/10;
        }
        if(sum == dup){
            return true;
        }
        return false;
    }
}
