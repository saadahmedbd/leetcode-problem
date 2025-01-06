package basic_recursion_ques;

public class print_N_to_1 {
    public static void main(String[] args) {
        int n=10;
        printNo1(n);
    }
    public static void printNo1(int n){
        if(n <=0){
            return;
        }
        System.out.println(n);
        printNo1(n-1);
    }
}
