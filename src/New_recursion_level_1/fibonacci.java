package New_recursion_level_1;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));
    }
    //multiple recursion call
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        int first=fibo(n-1);
        int second=fibo(n-2);
        return first+second;
    }
}
