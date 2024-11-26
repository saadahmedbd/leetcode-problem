package Recursion;

public class print_sum_of_first_N_natural_number {
    public static void main(String[] args) {
        int n=1;

        System.out.println("total vlaue:"+sumOfN(n));
        sumofN(n,0);
        sumofn(5, 0);
        SumOfN(6,1,0);

    }
    public  static int sumOfN(int n){
        int sum=0;
        while(n <=5){
            sum =sum +n;
            n++;
        }
        return sum;
    }
    public static void sumofN(int n,int sum){
      //  int sum=0;
        if(n ==6){
            return ;
        }
        sum =sum +n;
        System.out.println("decending order total value:"+sum);
        sumofN(n+1,sum);
    }
    public static void sumofn(int m, int sum){
        if(m==0){
            return;
        }
        sum =sum+m;
        System.out.println("ascending order total value:"+sum);
        sumofn(m-1, sum);
    }
    public static void SumOfN(int n, int i, int sum){
        if(n==i){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        SumOfN(n, i+1, sum);
    }

}
