package new_binary_search_on_ans;

public class Minimum_days_to_make_M_bouquets {
    public static void main(String[] args) {
        int bloomday [] ={1,10,3,10,2};
        int m=3, k=2;
        System.out.println(minimum_bouquets(bloomday, m, k));
    }
    public static int minimum_bouquets(int [] bloomday, int m, int k){
        int start =1;
        int end =findMax(bloomday);
        int ans =Integer.MAX_VALUE;
        while (start <= end){
            int mid =start +(end-start)/2;
            int len =0;
            int bou =0;
            for(int i=0;i<bloomday.length;i++){
                if(mid >= bloomday[i]){
                    len++;
                    if(len == k){
                        bou++;
                        len=0;
                    }
                }else{
                    len=0;
                }
            }
            if(bou < m){
                start=mid+1;
            }else if(bou >= m){
                end=mid-1;
                ans =Math.min(mid, ans);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static int findMax(int [] bloomday){
        int max=0;
        for(int i=0;i<bloomday.length;i++){
            max = Math.max(max, bloomday[i]);
        }
        return max;
    }
}
