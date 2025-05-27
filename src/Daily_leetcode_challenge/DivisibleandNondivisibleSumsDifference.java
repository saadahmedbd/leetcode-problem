package Daily_leetcode_challenge;

public class DivisibleandNondivisibleSumsDifference {
    public static void main(String[] args) {
        int n=5,m=1;
        System.out.println(differenceOfSums(n,m));
    }
    public static int differenceOfSums(int n, int m) {
        int ans1=0;
        int ans2=0;
        for(int i=1;i<=n;i++){
            if(i %m !=0){
                ans1 += i;
            }else{
                ans2+=i;
            }

        }
        return ans1-ans2;
    }
}
