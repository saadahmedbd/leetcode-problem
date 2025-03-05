package new_binary_search_2D_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_the_row_with_maximum_number {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> metrix=new ArrayList<>();
        metrix.add(new ArrayList<>(Arrays.asList(0,0,1)));
        metrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        metrix.add(new ArrayList<>(Arrays.asList(0,0,0)));
//        metrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n=3, m=3;
        System.out.println(findMaximum(metrix,n,m));
        System.out.println(findMaximumOnes(metrix, n, m));
    }
    public static int findMaximum(ArrayList<ArrayList<Integer>> metrix, int n, int m){
        int cnt_max=-1 ; //these variables ensure the ans will be minimum index
        int index=-1;
        //run loop on the row
        for(int i=0;i<n;i++){
            int cnt_ones=0;
            for(int j=0;j<m;j++){
                cnt_ones += metrix.get(i).get(j); //it's count the one value and add on the cnt_one variable
            }
            if(cnt_ones > cnt_max){ //if count one digger than cnt_max then cntMax will update and index will be update
                cnt_max=cnt_ones;
                index=i;
            }
        }
        return index;
    }
//    optimal approach
    public static int binaryApproach(ArrayList<Integer> metrix, int n, int x){
//        apply lower bound approach
        int low=0, high =n-1;
        int ans=0;
        while (low<=high){
            int mid =(low+high)/2;
            if(metrix.get(mid) >= x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int findMaximumOnes(ArrayList<ArrayList<Integer>> metrix , int n, int m){
        int cnt_max=0, index=-1;
        for(int i=0;i<n;i++) {
            int cnt_ones = m - binaryApproach(metrix.get(i), n, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

}
