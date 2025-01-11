package basic_recursion_ques;

public class fibonacci_number {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
//        tc 0(2^n) sc 0(n)
        if(n<=1){
            return n;
        }
        return fibo(n-2) + fibo(n-1);
//        int first =fibo(n-2);
//        int last =fibo(n-1);
//        return last+first;
    }
}
