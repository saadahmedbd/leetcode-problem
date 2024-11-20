package Recursion;

//The Question
//Given the function countZeros(n), how many zeros are present in the given integer n


public class countZeros {
    public static void main(String[] args) {
        int n=10000;
        System.out.println(count_zeros(n));
    }
    public static int count_zeros(int n){
        return helper(n, 0);
    }
    public static int helper(int n, int count){
        if(n==0){
            return count;
        }
        int remind =n%10;
        if(remind == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);

    }
}
