package basic_recursion_ques;

public class sum_of_N_number {
    public static void main(String[] args) {
        int n=5;
//        sumOfN_number(n);
        System.out.println(sumOfN_number(n));
        System.out.println(sum(n));
        System.out.println(sumRecursive(n));
        sumParameterize(n, 0);
    }
// tc 0(n) sc 0(1)
    public static int sumOfN_number(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

//    tc 0(1) sc 0(1)
//    using formula n*(n+1)/2
    public static int sum(int n){
        int sum=0;
        sum= n*(n+1)/2;
        return sum;
    }
//    recursive way
//    tc 0(n) sc 0(n)
    public static int sumRecursive(int n){
        if(n==0){
            return n;
        }
        return n+ sumRecursive(n-1);
    }
//    parameterize way
//    tc 0(n) sc 0(n)
    public static void sumParameterize(int n, int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
        sumParameterize(n-1, sum+n);
    }
}
