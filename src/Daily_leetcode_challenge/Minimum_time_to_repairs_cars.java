package Daily_leetcode_challenge;

import java.util.Arrays;

public class Minimum_time_to_repairs_cars {
    public static void main(String[] args) {
        int ranks [] ={2,4,3,1};
        int cars =10;
        System.out.println(minimum_time(ranks, cars));
    }
    public static long minimum_time(int [] ranks, int cars){
        Arrays.sort(ranks);
        long left=1;
        long right =(long) 1e14;
        long result =right;
        while (left<right){
            //find mid
            long mid =left + (right - left) / 2;
            if(canPossibleRepairCars(ranks, cars, mid)){
                result=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;


    }
    public static boolean canPossibleRepairCars(int[] ranks, int cars, long maxValue) {
        int repairedCars = 0;
        for (int rank : ranks) {
            long count = (long) Math.sqrt(maxValue / rank); // Maximum cars this mechanic can repair
            repairedCars += count;
            if (repairedCars >= cars) return true; // If we can repair enough cars, return true
        }
        return false;
    }


}
