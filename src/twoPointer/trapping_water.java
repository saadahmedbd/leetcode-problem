package twoPointer;
//asked google and amazon

public class trapping_water {
    public static void main(String[] args) {
        int [] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapping_water(height));

    }
    public static int trapping_water(int [] height){
        //asked in google amazon
        // using two pointer
        // we have two pointer that is index in 0 and n-1;
        int left =0, right =height.length-1;
        //store water in result
        int res=0;
        // we have two variable that's count our left max and right max
        int leftMax =0, rightMax=0;
        // loop will continue right  less than or equal to left
        while(left <= right){
            // if our left value less than or equal to right value than leftMax will update
            if(height[left] <= height[right]){
                if(leftMax <= height[left]) leftMax=height[left]; // if leftmax less than left height than updated leftmax
                else {
                    res += leftMax -height[left] ; // res will be leftmax -left
                }
                left++;
            }else{
                if(rightMax <= height[right]) rightMax=height[right];
                else{
                    res += rightMax -height[right];
                }
                right--;
            }
        }
        return res;
    }
}
