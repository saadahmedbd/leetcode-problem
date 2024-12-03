package Recursion;

public class fctorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Factorial(n));
        System.out.println(Factorial_recursion(n));
        factorial(5,1);
        System.out.println("factorail:"+calFactorial(5));
        System.out.println(fibo(6));
    }
    public static int Factorial(int n){
        if(n==0) return 1;
        int total=1;
        int num=1;
        while (num<=n){
            total *=num;
            num++;
        }
        return total;
    }
    public static int Factorial_recursion(int n){
        if(n==0) return 1;
        return  (n*Factorial_recursion(n-1));

    }
    public static void factorial(int n, int sum){
        if(n<=0){
            return;
        }
        sum =sum * n;
        System.out.println(sum);
        factorial(n-1,sum);
    }
    public static int calFactorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        int fact_n =calFactorial(n-1);
        int fact =fact_n * n;
        return fact;
    }
    public static int  fibo(int n){
        if (n ==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }




}
