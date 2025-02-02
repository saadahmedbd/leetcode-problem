package new_array_hard;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);

        //variation 3
        int n = 5;
        List<List<Integer>> ans = printPascalnumber(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static int nCr (int n, int r){
        long res=1;
        for(int i=0;i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return (int) res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }
    //variaion 3 print all number
    public static List<List<Integer>> printPascalnumber(int n){
        List<List<Integer>> ans =new ArrayList<>();
        for(int row=1;row<=n;row++){
           ans.add( generateRow(row));
        }
        return ans;
    }
    public static List<Integer> generateRow(int row){
        List<Integer> ansRow =new ArrayList<>();
        long res=1;
        ansRow.add(1);
        for(int col=1;col<row;col++){
            res =res * (row -col);
            res =res / col;
            ansRow.add((int) res);
        }
        return ansRow;
    }

}
