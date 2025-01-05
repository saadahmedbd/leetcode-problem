package Basic_math_question;

public class check_prime {
    public static void main(String[] args) {
        int n=1483;
        System.out.println(primeNumber(n));
        System.out.println(prime(n));
    }
//    tc 0(n) sc(1)
    public static boolean primeNumber(int n){
        if(n==2) return true;
        int m=2;
        while(m <n){
            if(n%m == 0){
                return false;

            }else{
                m++;
            }

        }
        return true;
    }
//    optimal approch
//    tc 0(rootN)
    public static boolean prime(int n){
        //edge case
        if(n==2) return true;
        if(n==1) return false;

        int m= (int) Math.sqrt(n);
        for(int i=3;i<=m;i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
