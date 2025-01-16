package new_array.easy;

public class left_rotate_by_one_or_k_place {
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 4, 5, 7, 8};
        left_rotate(nums);
        int num[]={1,2,3,4,5,6,7};
        rotate_array_by_k_times(num, 3);
    }
    public static void left_rotate (int nums[]){
        int n=nums.length;
        int ans[]=new int[n];
        int l=0;
        for(int r=1;r<n;r++){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
//    that is leetcode 189 question solve
    public static void rotate_array_by_k_times(int num[], int k){
        k=k%num.length; //// if k is bigger than nums of length
        reverse(num, 0, num.length-1); // step 1: reverse entire nums
        reverse(num, 0, k-1); //// step 2: reverse first k element (0 to k-1 index);
        reverse(num, k, num.length-1); // step 3: reverse second half(reverse from k+1 to n-1)


        System.out.println("");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }

    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int tem=nums[start];
            nums[start]=nums[end];
            nums[end]=tem;
            start++;
            end--;
        }
    }
}
