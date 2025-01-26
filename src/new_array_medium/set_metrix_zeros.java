package new_array_medium;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class set_metrix_zeros {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMetix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
    public static ArrayList<ArrayList<Integer>> zeroMetix (ArrayList<ArrayList<Integer>> metrix, int  n, int m){
        int [] row=new int[n];
        int [] column=new int[m];

//        traverse the metrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(metrix.get(i).get(j) == 0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
//        finally mark arr[i][j] as 0
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] == 1 || column[j] == 1){
                    metrix.get(i).set(j, 0);
                }
            }
        }
        return metrix;
    }
}
