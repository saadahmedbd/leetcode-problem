package new_binary_search_on_ans;

public class painter_partition_problem {
    public static void main(String[] args) {
        int nums [] ={5,5,5,5};
        int k=2;
        System.out.println(painterPartition(nums, k));
        System.out.println(binarySearchApproach(nums, k));

    }
    public static int painterPartition(int nums[], int k){
        int low =findMax(nums);
        int high =sumOfArray(nums);
        for(int num=low;num<=high;num++){
            if(calculateSplitNumber(nums, num) == k){
                return num;
            }
        }
        return low;
    }
    public static int calculateSplitNumber(int nums [], int num){
        int placed=1;
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            if(totalSum + nums[i] <= num){
                totalSum+=nums[i];
            }else{
                placed++;
                totalSum=nums[i];

            }
        }
        return placed;

    }
    public static int findMax(int nums[]){
        int max=0;
        for(int i=0;i<nums.length;i++){
            max =Math.max(max, nums[i]);
        }
        return max;
    }
    public static  int sumOfArray(int nums []){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        return sum;
    }
    public static int binarySearchApproach(int nums[], int k){
        int low=findMax(nums);
        int high =sumOfArray(nums);
        while (low <=high){
            int mid =(low+high)/2;
            int num =calculateSplitNumber(nums, mid);
            if(num > k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
