package StackANDQueue;

import java.util.Stack;

public class Basic_calculator {
    public static void main(String[] args) {
        String s="1-(     -2)";
        System.out.println(basic(s));
    }
    public static  int basic(String s){
        Stack<Integer> stack =new Stack<>();
        int num=0;
        int sign=1;
        int result=0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);

            if(Character.isDigit(c)){
                num =num * 10 +(c -'0');
            }
            else if(c=='+'){
                result += sign * num;
                num=0;
                sign=1;
            }else if(c == '-'){
                result += sign * num;
                num=0;
                sign=-1;
            }else if(c == '('){
                stack.push(result);
                stack.push(sign);
                sign=1;
                result=0;
            }else if( c==')'){
                result += sign * num;
                num=0;
                result *= stack.pop();////stack.pop() is the sign before the parenthesis
                result += stack.pop();
            }

        }
        if(num != 0) result += sign * num;
        return result;

    }
}
