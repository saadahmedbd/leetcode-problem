package StackANDQueue;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s="azxxzy";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s){
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb =new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
