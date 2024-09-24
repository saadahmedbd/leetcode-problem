package StackANDQueue;

public class largest_rectangular_histrogram {
    public static void main(String[] args) {
        int [] height ={1};
        System.out.println(largestRectangularHistrogram(height));
    }
    public static int largestRectangularHistrogram(int[] height){
        int left =0;
        int ans=0;
        if(height.length==1) return height[left];
        for(int right=1;right<height.length;right++){
            int length =Math.min(height[left], height[right]);
            ans =Math.max(ans, length *2);
            left++;
        }
        return ans;
    }
}
