package StackANDQueue;

import java.util.HashMap;
import java.util.Stack;

public class valid_parentheses {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(validParentheses(s));
        System.out.println(valid(s));
    }
    public static boolean validParentheses(String s){
        HashMap<Character, Character> map =new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                char pop =stack.size() != 0 ? stack.pop() : '#';
                if(pop != map.get(curr)){
                    return false;
                }
            }else{
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }
    public static boolean valid(String s){
        Stack<Character> stack =new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch == '(' || ch == '{' || ch =='['){
                stack.push(ch);
            }else if(stack.isEmpty()){
                return false;
            }else{
                char top =stack.peek();
                if(top == '(' && ch ==')'){
                    stack.pop();
                }else if(ch == '}' && top =='{'){
                    stack.pop();
                }else if(ch == ']' && top =='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
