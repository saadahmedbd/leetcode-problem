package Recursion;

//The Question
//Given the function step(n), what is the minimum number of steps required to reduce
//𝑛
//n to 0 by performing the following operations:
//
//If
//𝑛
//n is even, divide
//𝑛
//n by 2.
//If
//𝑛
//n is odd, subtract 1 from
//𝑛
//n.

public class count_steps {
    public static void main(String[] args) {
        int n=12;
        System.out.println(step(n));
    }
    static int step(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int steps){
        if(n==0){
            return steps;
        }
        if (n % 2 == 0) {

            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}
