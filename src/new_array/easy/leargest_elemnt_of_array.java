package new_array.easy;

public class leargest_elemnt_of_array {
    public static void main(String[] args) {
        int [] nums={3, 6, 2, 3};
        System.out.println(leargest_element(nums));
        System.out.println(leargest(nums));
    }
    public static int leargest_element(int [] nums){
        int n=nums.length;

       int left =0, right =1;
        int ans=nums[left];
       while(right <n){
           int maximum=left;
           if(nums[left] > nums[right]){
               maximum=nums[left];
           }else {
               maximum=nums[right];

           }
           ans=Math.max(maximum, ans);
           left++;
           right++;
       }
       return ans;
    }
    public static int leargest(int [] nums){
        int n=nums.length;
        int max =nums[0];
        for(int i=0;i<n;i++){
            if(max < nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}
