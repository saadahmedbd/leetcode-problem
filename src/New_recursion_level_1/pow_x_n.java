package New_recursion_level_1;

public class pow_x_n {
    public static void main(String[] args) {
        double x=2.00000;
        int n=-2;
        System.out.println(pow(x,n));
        System.out.println(poww(x, n));
        System.out.println(myPow(x,n));
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
        long number=Math.abs((long) n);
        double res=1;
        if(n == 0  ){
            return 1;
        }

        if (n < 0) {
            return 1.0 / poww(x, -n);
        }
        if(n % 2== 1){
            return x * poww(res *x, n-1);
        }else{
            return poww( x*x, n/2);
        }

    }
    public static long myPow(double x, int n){
        long number =Math.abs(n);
        double res=1;
        while (number != 0){
            if(number %2 ==1){
                res =res * x;
                number =number -1;
            }
            x =x*x;
            number=number/2;
        }
        return (long) (n< 0 ?1/res :res);
    }
}
