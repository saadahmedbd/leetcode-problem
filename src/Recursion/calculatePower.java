package Recursion;

public class calculatePower {
    public static void main(String[] args) {
        int x=3, n=3;
        System.out.println(calPower(x,n));
    }
    public static int calPower(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
        int calpowex=calPower(x, n-1);
        int powX=x *calpowex;
        return powX;
    }

}
