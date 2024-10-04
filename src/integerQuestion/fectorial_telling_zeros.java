package integerQuestion;

public class fectorial_telling_zeros {
    public static void main(String[] args) {
        int n=125;
        System.out.println(zeros(n));

    }
    public static  int zeros(int n){
        int count =0;
        int currPowerOfFive =5;
        while(n>=currPowerOfFive) {
            count += n / currPowerOfFive;
            currPowerOfFive *= 5;
        }
        return count;
    }

}
