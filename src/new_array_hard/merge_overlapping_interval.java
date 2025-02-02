package new_array_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class merge_overlapping_interval {
    public static void main(String[] args) {
        int[][] nums = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = merger_overlapping(nums);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();

    }
    public static List<List<Integer>> merger_overlapping(int intervals[][]){
        int n=intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b ){
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            // if the current interval does not
            // lie in the last interval:
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size() -1).get(1)){
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else{
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), intervals[i][1]));

            }
        }
        return ans;
    }

}
