package subarray_question;

public class maximum_point_you_can_obtains_from_the_card {
    public static void main(String[] args) {
    int[] nums={1,2,3,4,5,6,1};
    int k=3;
        System.out.println(maximum_point(nums,k));
        //leetcode 1423
    }
    public static int maximum_point(int [] nums, int k){
//        approch
//        What we do is we initialize a window of size k...
//Now, since we can select either from the start or from the end,
// we only have access to either the first k items or last k items, and hence we are trying to limit our access using this window...
//So, we include all the elements from start in our window, till its full...
//The sum of elements at each instance in our window will be kept track of using another variable that will store our result.
//Now, we remove the last element from our window, and add the last unvisited element of our cardPoints array...
// Similarly we keep on removing 1 element from our window and start adding the last unvisited element of our cardPoints array...
//We keep doing this until we reach the start of our array, in this way we have covered all our possible picks...


        int ans=0;
        for(int i=0;i<k;i++){
            ans += nums[i];
        }
        int sum =ans;
        for(int i=k-1;i>=0;i--){
            sum -= nums[i];
            sum += nums[nums.length-k+i];
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}
