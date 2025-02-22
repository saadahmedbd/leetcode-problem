package new_binary_search_1D_array;

public class number_of_occurence {
    public static void main(String[] args) {
        int nums [] ={1,1,2,2,2,2,3};
        int target =2;
        System.out.println(numberOfOcuurence(nums, target));
        System.out.println(findOcuurence(nums, target));
    }
    public static int numberOfOcuurence(int nums[], int target){
        int [] count =firstAndLastOccurence(nums, target);
        if(count[0] == -1) return 0;
        return (count[1] -count[0]+1);

    }
    public static int [] firstAndLastOccurence (int nums [], int target){
        int first =firstOccurence(nums, target);
        if(first ==-1) return new int[] {-1,-1};
        int last =LastOccurence(nums, target);
        return  new int[] {first, last};
    }
    public static int firstOccurence (int nums [], int target){
        int start =0;
        int end =nums.length-1;
        int ans =-1;
        while (start <= end){
            int mid =(end+start)/2;
            if(nums[mid] == target){
                ans =mid;
                end =mid-1;
            }else if(nums[mid] <target){
                start =mid+1;
            }else {
                end =mid -1;
            }
        }
        return ans;
    }
    public static int LastOccurence(int nums[], int target){
        int start =0;
        int end =nums.length-1;
        int ans =-1;
        while (start<=end){
            int mid =(start+end)/2;
            if(nums[mid] == target){
                ans =mid;
                start=mid+1;
            }else if(nums[mid] < target){
                start =mid+1;
            }else {
                end =mid-1;
            }
        }
        return ans;
    }
//    solution 2
    public static  int findOcuurence (int nums[], int target){
        int ans []=findElement(nums, target);
        if(ans[0] == -1) return 0;
        return  (ans[1] -ans[0] +1);
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
