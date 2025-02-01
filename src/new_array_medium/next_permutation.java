package new_array_medium;

public class next_permutation {
    public static void main(String[] args) {
        int nums[]={3,2,1};
        nextPermutation(nums);
    }
//    sotion approche
//    1. find breaking point
//    2. find the smallest amount of breaking point value from the right side
//    if you find thrn swap breaking number to the smallest number
//    3. then reverse the entire right side of an array
    public static void nextPermutation(int[] nums){
        int index=-1, index2=-1;
        int n=nums.length;
        for(int i=n-2;i>= 0;i--){
            if(nums[i] <nums[i+1]){
                index=i;
                break;
            }
        }
        if(index == -1){
            reverse(nums, 0);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[i] >nums[index]){
                    index2=i;
                    break;
                }
            }
            swap(nums, index, index2);
            reverse(nums, index+1);

        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k] + " ");;
        }
    }
    public static void swap(int nums[],int i, int j ){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
    }
    public static void reverse(int[] nums, int start){
        int i=start;
        int j=nums.length;
        while (j<i){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
