package basic_recursion_ques;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorialNumber(n));
        factorialParameterize(n, 1);
        System.out.println( recusiveFactorial(n));
    }
    public static int factorialNumber(int n){
        int factorial =1;
        for (int i=1;i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }
//    parameterize way
    public static void factorialParameterize(int n, int factorial){
        if(n == 0){
            System.out.println(factorial);
            return;
        }
        factorialParameterize(n-1, factorial *n);
    }
//    recursive way
    public static int recusiveFactorial(int n){
        int factorail=1;
        if(n ==0) {
            return 1;
        }
        return n* recusiveFactorial(n-1);
    }
}
