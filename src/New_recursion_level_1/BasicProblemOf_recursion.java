package New_recursion_level_1;

public class BasicProblemOf_recursion {
    public static void main(String[] args) {
        int n=5;

//        printName(5);
//        printNum(n);
//        printNumber(6);
        sumOfN(5,0);
        System.out.println(sum(5));
        factorial(5, 1);
        System.out.println(fact(5));

    }
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("saad");
        printName(n-1);
    }
    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void sumOfN(int n, int sum){
        if(n<0){
            System.out.println(sum);
            return ;
        }
//        System.out.println(sum);
        sumOfN(n-1, sum+n);


    }
    //functional
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void  factorial(int n, int fact){
        if(n<1){
            System.out.println(fact);
            return;
        }
        factorial(n-1, fact * n);
    }
    //functional
    public static int fact(int n){
        if(n ==0 || n== 1){
            return 1;
        }
        return  n * fact(n-1);
    }

}
