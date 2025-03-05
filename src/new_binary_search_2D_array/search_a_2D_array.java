package new_binary_search_2D_array;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;

public class search_a_2D_array {
    public static void main(String[] args) {
        int matrix [][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=9;
        System.out.println(searchA2DArray(matrix, target));
        System.out.println(searchmatrix(matrix, target));

//        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
//        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
//        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
//        int target=9;
//        System.out.println(searchMetrix(matrix,target));
    }
    public static boolean searchA2DArray(int [][] matrix, int target ){
//        int rowLen=matrix.length;
//        int colLen=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
//    optimal approach
    public  static  boolean searchMetrix (ArrayList<ArrayList<Integer>> matrix, int target){
            int row=matrix.size();
            int col=matrix.get(0).size();

            for(int i=0;i<row;row++){
                if(matrix.get(i).get(0) <=target && target <=matrix.get(i).get(col-1)){
                    return binarySearch(matrix.get(i), target);
                }
            }
            return false;
    }
    public static boolean binarySearch (ArrayList<Integer> matrix,int target){
        int low=0;
        int n=matrix.size();
        int high=n-1;
        while (low <= high){
            int mid =(low+high)/2;
            if(matrix.get(mid) == target){
                return true;
            }else if (matrix.get(mid) > target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;

    }
//    optimal and good solution
    public static boolean searchmatrix(int [] [] matrix , int target){
        int n=matrix.length;
        int m=matrix[0].length;

        int row=0;
        int col =m-1;
        while (row <n && col >-1){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
