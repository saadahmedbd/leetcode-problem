package new_binary_search_2D_array;

import java.util.ArrayList;
import java.util.Arrays;

public class find_a_2D_array_2 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,4,7,11,15)));
        matrix.add(new ArrayList<>(Arrays.asList(2,5,8,12,19)));
        matrix.add(new ArrayList<>(Arrays.asList(3,6,9,16,22)));
        matrix.add(new ArrayList<>(Arrays.asList(10,13,14,17,24)));
        matrix.add(new ArrayList<>(Arrays.asList(18,21,23,26,30)));
        int target=9;

        boolean result = findMatrix(matrix, 8);
        System.out.println(result ? "true" : "false");


    }
    public static boolean binarySearch(ArrayList<Integer> nums, int target){
        int low=0;
        int high=nums.size()-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(nums.get(mid) == target){
                return true;
            }else if(nums.get(mid) > target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public static boolean findMatrix (ArrayList<ArrayList<Integer>> matrix , int target){
//        int n=matrix.size();
//        int m=matrix.get(0).size();
//        for(int i=0;i<n;i++){
//            if(matrix.get(i).get(0) <=target && target <=matrix.get(i).get(m-1)){
//                return binarySearch(matrix.get(i), target);
//            }
//        }
//        return false;
        int n = matrix.size();
        int m = matrix.get(0).size();

        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) <= target && target <= matrix.get(i).get(m - 1)) {
                return binarySearch(matrix.get(i), target);
            }
        }
        return false;

    }
}
