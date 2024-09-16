package twoPointer;
//asked google leetcode 80

import java.util.HashMap;

public class remove_duplicate_from_sorted_array_2 {
    public static void main(String[] args) {
        int nums[] ={1, 1, 1,2, 2, 3};
        System.out.println(remove_duplicate_2(nums));
        System.out.println(removeDuplicate2(nums));
    }
    public static int remove_duplicate_2(int [] nums){
        // pointer place in index two bcz our first two index have duplicate there is no pblm
        int l=2;
        for(int r=2;r<nums.length;r++){
            if(nums[r] != nums[l-2]) // if nums of r-2 index is not similar than our index change
                nums[l] =nums[r];
            l++;
        }
        return l; //[1, 1, 2, ,2, 3,-]
    }
    public static int removeDuplicate2(int [] nums){
        //hashmap
        HashMap<Integer, Integer> map =new HashMap<>();
        int count =0;
        for(int num :nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) <=2){
                nums[count]=num;
                count++;
            }
        }
        return count;


    }
}
