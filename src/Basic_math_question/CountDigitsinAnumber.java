package Basic_math_question;

public class CountDigitsinAnumber {
    public static void main(String[] args) {
    int n=16785;
        System.out.println(count_n_number(n));
        System.out.println(countNumber(n));
    }
//    time complexity 0(logN) space complexity 0(1)
    public static int count_n_number(int n){
        int count =0;
        while(n>0){
            int num=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
//    optimal solution
//    sc 0(1) tc 0(1)
    public static int countNumber(int n){
        int count =(int) Math.log10(n)+1;
        return count;
    }
}
