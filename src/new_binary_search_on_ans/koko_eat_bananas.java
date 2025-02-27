package new_binary_search_on_ans;

public class koko_eat_bananas {
    public static void main(String[] args) {
        int nums [] ={805306368,805306368,805306368};
        int h=1000000000;
        System.out.println(eat_bananas(nums, h));
        double ss= (double) Math.ceil((3+6-1)/6);
        System.out.println(ss);

    }
    public static int eat_bananas(int nums [], int h){
        int start =1;
        int end =findMax(nums);
        int result=Integer.MAX_VALUE;
        while (start <= end){
            int mid = start + (end - start) / 2;

            int sum =0;
            for(int i=0;i<=nums.length-1;i++){

                sum += (int) Math.ceil((double) nums[i] / mid);
                if (sum > h) break;
            }
            if(sum > h){
                start =mid+1;
            }else if (sum <= h){
                end =mid-1;
                result=Math.min(result, mid);
//                result=mid;

            }

        }

        return result;
    }
    public static int findMax(int nums []){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(ans < nums[i]){
                ans =nums[i];
            }
        }
        return ans;
    }
}
