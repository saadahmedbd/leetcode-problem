package new_array.easy;

public class remove_duplicate_from_sorted_array {
    public static void main(String[] args) {
        int nums[]={1,2,2,3,5,5,7,8,9};
        System.out.println(remove_duplicate(nums));
        System.out.println(remove_duplicated_from_leetcode(nums));
        System.out.println(removeDuplicate(nums));
    }
//    this answer not acceptable in leetcode
    public static int remove_duplicate(int nums[]){
        int values=nums[0];
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == values){
                values=nums[i];

            }else if(nums[i] != values){
                count++;
                values=nums[i];

            }
        }
        return count+1;
    }
//    ans for leetcode question 26
    public static int remove_duplicated_from_leetcode(int [] nums){
        int left =0, right=0;
        while(right <nums.length){
            if(nums[left] != nums[right]){
                left++;
                nums[left]=nums[right];
                right++;
            }else {
                right++;
            }
        }
        return left+1;
    }
//    it's correct for leetcode ans
    public static int removeDuplicate(int nums[]){
        int l=0;
        for(int r=1;r<nums.length;r++ ){
            if(nums[l] != nums[r]){
                l++;
                nums[l] =nums[r];

            }
        }
        return l+1;
    }
}
