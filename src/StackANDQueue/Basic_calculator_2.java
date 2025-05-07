package StackANDQueue;

import java.util.Stack;

public class Basic_calculator_2 {
    public static void main(String[] args) {
        String s="3+2*2";
        System.out.println(calculator(s));
    }
    public static int calculator(String s){
       Stack<Integer> stack=new Stack<>();
       int num=0;
       char sign='+';
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(Character.isDigit(s.charAt(i))){
               num=num *10 +(c-'0');
           }


           if((!Character.isDigit(c) && s.charAt(i)!= ' ' ) || i==s.length()-1) {
               if(sign == '+'){
                   stack.push(num);
               }else if(sign=='-'){
                   stack.push(- num);

               } else if (sign == '*') {

                   stack.push(stack.pop()* num);

               }else if (sign == '/'){
                   stack.push(stack.pop()/ num);

               }
               num=0;
               sign=s.charAt(i);
           }
       }
        System.out.println(stack);
      int sum =0;
       while (!stack.isEmpty()){
           sum += stack.pop();
       }
       return sum;
    }
    public static boolean isIntger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){

                return false;
        }
    }
}
