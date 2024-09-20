package twoPointer;
//asked facebook and google
public class container_with_most_water {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(container_with_most_water(height));

    }
    public static int container_with_most_water(int [] height){
        int left=0, right=height.length-1;
        int maxArea=0;
        while(left<=right){
            int area= Math.min(height[left], height[right]) * (right-left);//area= height*width
            maxArea=Math.max(area, maxArea);
            if(height[left] <=height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
