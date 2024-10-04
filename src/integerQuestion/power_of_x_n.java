package integerQuestion;

public class power_of_x_n {
    public static void main(String[] args) {
        int x=2,n=10;
        System.out.println(power(x,n));

    }
    public static double power(int x, int n){
        //convert int to long
        long num =Math.abs((long)n);
        double result =1.00;
        while (n !=0){
            if(n%2 ==1){ //if power equal to odd digit then
                n =n-1; //power will be n-1
                result=result*x; //x multiply to result
            }
            n=n/2; //or power divide by 2
            x=x*x; //and x multiply to x
        }
        return n<0 ? 1/result :result; //if n is -2 then we use 1/result
    }
}
