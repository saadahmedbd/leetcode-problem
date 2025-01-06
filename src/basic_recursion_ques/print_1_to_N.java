package basic_recursion_ques;

public class print_1_to_N {
    public static void main(String[] args) {
        int n=10;
        Print1ToN(n);
    }
    public static void Print1ToN(int n){
        if(n==0){
            return;
        }
        Print1ToN(n-1);
        System.out.println(n);
    }
}
