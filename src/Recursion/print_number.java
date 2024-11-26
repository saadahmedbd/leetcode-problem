package Recursion;

public class print_number {
    public static void main(String[] args) {
        int n=1;
        printNumber(n);

        int m=5;
        PrintNumber(m);
    }
    public static  void printNumber(int n){
        //base case
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    //print number 5 to 1
    public static void PrintNumber(int m){
        //base case
        if(m==0){
            return;
        }
        System.out.println("print 5 to 1:"+m);
        PrintNumber(m-1);
    }
}
