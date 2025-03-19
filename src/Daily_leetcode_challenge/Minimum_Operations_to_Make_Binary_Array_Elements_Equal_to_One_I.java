package Daily_leetcode_challenge;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    public static void main(String[] args) {
        int nums [] ={0,1,1,1};
        System.out.println(Minimum_operation(nums));
    }
    public static int Minimum_operation(int nums []){
        //tc 0(n) sc(1)
        int count=0;
        int n=3;
        for(int i=0;i<=nums.length-n;i++){
            if(nums[i] == 0){ //ex=[0,1,1,1,0,0]
            for(int j=i;j < i + n;j++){
                    if(nums[j]==0){
                        nums[j]=1;
                    }else{
                        nums[j]=0;
                    }
                }
                count++;
            }
        }
        // Check if all elements are now 1
        for (int num : nums) {
            if (num == 0) return -1;
        }
        return count;
    }
}
