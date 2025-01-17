package Recursion;

public class fibonacci {

    public static void main(String[] args) {
        int m=5;
//        System.out.println(fibonacci(m));
        int a=0, b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);
    }
    public static int fibonacci(int m){
        if(m <=1){
            return m;
        }
        return fibonacci(m-1)+fibonacci(m-2);
    }
    public static  void fibo (int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }

}

