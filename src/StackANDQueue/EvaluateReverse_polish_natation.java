package StackANDQueue;

import java.util.Stack;

public class EvaluateReverse_polish_natation {
    public static void main(String[] args) {
        String [] token ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(polish_natation(token));
    }
    public  static int polish_natation(String [] tokens){
        int ans = Integer.parseInt(tokens[0]);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(isInteger(tokens[i])){
                stack.push(Integer.valueOf(tokens[i]));
            }else if(tokens[i].equals("+")){
                int top=stack.peek();
                stack.pop();
                int secondTop=stack.peek();
                stack.pop();
                int res=stack.push(secondTop + top);
                ans = res;

            }else if( tokens[i].equals("-")){
                int top=stack.peek();
                stack.pop();
                int secondTop=stack.peek();
                stack.pop();
                int res=stack.push(secondTop - top);
                ans = res;
            } else if(tokens[i].equals("*")){
                int top=stack.peek();
                stack.pop();
                int secondTop=stack.peek();
                stack.pop();
                int res=stack.push(secondTop * top);
                ans = res;

            } else if ( tokens[i].equals("/")) {
                int top=stack.peek();
                stack.pop();
                int secondTop=stack.peek();
                stack.pop();
                int res=stack.push(secondTop / top);
                ans = res;


            }
        }
        return ans;
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
