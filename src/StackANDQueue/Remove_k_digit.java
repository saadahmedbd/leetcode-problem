package StackANDQueue;

import java.util.Stack;

public class Remove_k_digit {
    public static void main(String[] args) {
        String num="10";
        System.out.println(RemoveKDigit(num,2));
    }
    public static String RemoveKDigit(String num,int k){
        Stack<Character> stack =new Stack<>();

        for(int i=0;i<num.length();i++){
            char ch =num.charAt(i);
           while(!stack.isEmpty() && k>0 && stack.peek()>ch){
               stack.pop();
               k--;
           }
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder ans =new StringBuilder();

        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        StringBuilder res=ans.reverse();
        //remove leading zeros
        while(ans.length()>0 && ans.charAt(0)=='0'){
            stack.pop();
        }
        return res.length()>0 ? res.toString() : "0";
    }
}
