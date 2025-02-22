package new_binary_search_1D_array;

public class find_first_and_last_position {
    public static void main(String[] args) {
        int nums []={5,7,7,8,8,10};
        int target =8;
        System.out.println(findElement(nums, target));
    }
    public static int[] findElement (int [] nums, int target){
        int ans []= {-1, -1};
        int start = findFirstAndLastElement(nums, target, true);
        int end =findFirstAndLastElement(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    public static int findFirstAndLastElement(int [] nums, int target, boolean findTarget){
        int ans =-1;
        int index =0;
        int start =0;
        int end =nums.length-1;
        while (start <=end){
            int mid =(end+start)/2;
            if(nums[mid] < target){
                start =mid+1;
            }else if(nums[mid] > target){
                end =mid-1;
            }else{
                ans=mid;
                if(findTarget){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;

    }

}
