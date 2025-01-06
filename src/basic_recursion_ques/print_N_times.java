package basic_recursion_ques;

public class print_N_times {
    public static void main(String[] args) {
        int n=12;
        printNumber(n);
    }
    public static void printNumber(int n){
//        base case is important
        if(n==0){
            return ;
        }
//        System.out.println(n); //print up to down
//          printNumber(n-1);

//        printNumber(n-1);
//        System.out.println(n); //print down to up

        System.out.println(n);
        printNumber(n-1); //print up to down
    }
}
