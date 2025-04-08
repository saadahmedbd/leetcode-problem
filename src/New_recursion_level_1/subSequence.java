package New_recursion_level_1;

import java.util.ArrayList;
import java.util.List;

public class subSequence {
    public static void main(String[] args) {
        int arr[]={3,1,2};
        subsequence(arr,new ArrayList<>(),3,0);

    }
    public static void subsequence(int arr[], ArrayList<Integer> list, int n, int index){
        if(index == n){
            System.out.println(list.toString());
            return;
        }
        list.add(arr[index]);
        subsequence(arr,list,n,index+1);
        list.remove(list.size()-1);
        subsequence(arr,list,n,index+1);
//        for (int i=0;i<list.size();i++){
//            System.out.println(i);
//        }
    }
    //leetcode solution
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        subsequnce(nums,new ArrayList<>(),0, result);
        return result;
    }
    public void subsequnce(int[] nums, ArrayList<Integer> list, int index, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subsequnce(nums, list,index+1,result);
        list.remove(list.size()-1);
        subsequnce(nums, list,index+1,result);
    }
}
