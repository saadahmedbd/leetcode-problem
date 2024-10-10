package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class build_array {
    public static void main(String[] args) {
        int[] nums={5,0,1,2,3,4};
        System.out.println(buildArray(nums));

    }
    public static List<Integer> buildArray(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ans =nums[nums[i]];
            list.add(ans);
        }
        return list;
    }
    //solution 2
    public static int[] buildArry2(int [] nums){
        int[] list =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ans =nums[nums[i]];
            list[i]=nums[ans];
        }
        return list;
    }
}
