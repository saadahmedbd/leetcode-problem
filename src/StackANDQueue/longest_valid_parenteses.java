package StackANDQueue;
//asked google leetcode 32

import java.util.Stack;

public class longest_valid_parenteses {
    public static void main(String[] args) {
        String s="(())()";
        System.out.println(longestValidParenteses(s));

    }
    public static int longestValidParenteses(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans =0;
        for(int i=0;i<s.length();i++){
            char curr =s.charAt(i);
            if(curr == '('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    ans =Math.max(ans, i-stack.peek());
                }
            }
        }
        return ans;
    }
}
