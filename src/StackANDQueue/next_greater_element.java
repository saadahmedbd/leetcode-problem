package StackANDQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class next_greater_element {
    public static void main(String[] args) {
        int [] nums1 ={1,3,5,2,4};
        int [] nums2 ={6,5,4,3,2,1,7};
        nextGreater(nums1,nums2);

    }
    public static int[] nextGreaterElement(int[] nums){

        Stack<Integer> stack=new Stack<>();
        int [] ans =new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while (!stack.isEmpty() && nums[i]>stack.peek()){
                stack.pop();

            }

            if(stack.isEmpty()){
                ans[i]=-1;
            }else {
                ans[i]=stack.peek();

            }
            stack.push(nums[i]);


        }
        for(int j=0;j<ans.length;j++){
            System.out.println(ans[j]);
        }
        return ans;
    }
    //leetcode version solve
    public static int[] nextGreater(int [] nums1,int[] nums2){
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer>  map =new HashMap<>();

        for(int num :nums2){
            while(!stack.isEmpty()&& num>stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int [] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        return ans;
    }
}
