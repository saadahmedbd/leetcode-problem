package StackANDQueue;

import java.util.Stack;

public class asteriod {
    public static void main(String[] args) {
        int [] asteriod={-2, 4, 3, -4};
        System.out.println(Asteriod(asteriod));

    }
    public static int[] Asteriod(int[] asteriod){
        Stack<Integer> stack=new Stack<>();
        for(int asteriods :asteriod){
            if(asteriods >0){
                stack.push(asteriods);
            }else{
                while(!stack.isEmpty() && stack.peek() >0 && Math.abs(asteriods) >stack.peek()){
                    stack.pop();
                }if(stack.isEmpty() || asteriods <0){
                    stack.push(asteriods);
                }else if(stack.peek() +asteriods==0){
                    stack.pop();
                }
            }
        }
        int ans[] =new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] =stack.pop();
        }
        return ans;
    }
}
