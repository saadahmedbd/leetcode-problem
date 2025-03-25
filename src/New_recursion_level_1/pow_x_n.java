package New_recursion_level_1;

public class pow_x_n {
    public static void main(String[] args) {
        double x=2.00000;
        int n=10;
        System.out.println(pow(x,n));
        System.out.println(poww(x, n));
    }
    public static double pow(double x, int n){

        long number=Math.abs((long) n);
        double res=1;
        while (number != 0){
            if (number % 2==1) {
                res=res *x;
                number=number-1;
            }
            x=x*x;
            number=number/2;
        }
        return n<0 ?1/res :res; //for negative number


    }
    public static double poww(double x, int n){
//        long number=Math.abs((long) n);
        double res=1;
        if(n == 0){
            return n< 0 ? 1/res : res;
        }
        if(n % 2== 1){
            poww(res *x, n-1);
        }
        poww(x*x,n/2);
        return 0;
    }
}
