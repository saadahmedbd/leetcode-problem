package new_array_hard;

public class maximum_product_subarray {
    public static void main(String[] args) {
        int [] nums={2,3,-2,4};
        System.out.println(maximum_product(nums));
    }
    public static int maximum_product(int [] nums){
       int prefix =1;
       int suffix =1;
       int ans=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           if(prefix == 0) prefix=1;
           if(suffix==0) suffix=1;
           prefix *= nums[i];
           suffix *=nums[nums.length -i-1];

           int product=Math.max(prefix, suffix);
           ans =Math.max(product, ans);
       }
       return ans;

    }
}
