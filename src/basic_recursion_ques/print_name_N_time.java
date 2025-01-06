package basic_recursion_ques;

public class print_name_N_time {
    public static void main(String[] args) {
        int n=10;
        printName(n);
    }
    public static void printName(int n){
        if(n==0){
            return;
        }
        printName(n-1);
        System.out.println("saad");
    }
}
