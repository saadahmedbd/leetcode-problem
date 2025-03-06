package new_binary_search_2D_array;

import java.util.ArrayList;
import java.util.Arrays;

public class find_a_2D_array_2 {
    public static void main(String[] args) {
        int [][] matrix ={
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26, 30}
        };
        int target=16;
        System.out.println(findMetrix2(matrix, target));


    }
//    same solution find target in 2d array
    public static boolean findMetrix2(int [][] matrix, int target) {
        int n= matrix.length; //size of matrix
        int m= matrix[0].length; //size first row

        int row=0;
        int col =m-1; //

        while (row <n && col > -1){
            if(matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }
        return false;


    }
}
