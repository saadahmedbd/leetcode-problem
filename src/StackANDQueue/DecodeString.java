package StackANDQueue;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s){
        Stack<Integer> numStack =new Stack<>();
        Stack<String> strStrack =new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n =s.length();
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(Character.isDigit(ch)){
                int num =ch -'0'; // make string to character
                while(i+1 <n && Character.isDigit(s.charAt(i+1))){ // if num is bigger then 9 than convert to bigger num
                    num =num * 10 + s.charAt(i+1)-'0';
                    i++;
                }
                numStack.push(num);
            }else if (ch =='['){
                strStrack.push(sb.toString()); // sb value push in strStack
                sb = new StringBuilder(); //sb convert to empty
            }else if (ch == ']'){
                int k = numStack.pop();
                StringBuilder temp =new StringBuilder(strStrack.pop());//
                for(int j=0;j<k;j++){
                    temp.append(sb);
                }
                sb=temp;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
