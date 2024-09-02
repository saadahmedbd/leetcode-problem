package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class build_array_from_permutation {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        System.out.println(arrayPermutation(nums));

    }
    public static List<Integer> arrayPermutation(int[] nums){
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int value=nums[nums[i]];
            list.add(value);
        }
        return list;
    }
}
