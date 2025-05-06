package StackANDQueue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Remove_duplicate_letter {
    public static void main(String[] args) {
        String s="cbacdcbc";
        System.out.println(duplicate_value(s));
    }
    public static String duplicate_value(String s) {
        //track the frequncy of this string
        int [] freq =new int[26];
        boolean visited[] = new boolean[26];
        for(char ch :s.toCharArray()){
            freq[ch -'a']++; //track the frequency of this string
        }
        Stack<Character> stack =new Stack<>();
        for(char ch1 :s.toCharArray()){
            int idx =ch1 -'a';
            freq[idx]--;

            if(visited[idx]) continue;
            while (!stack.isEmpty() && ch1 <stack.peek() && freq[stack.peek()-'a']>0){
                visited[stack.pop()-'a']=false;
            }
            stack.push(ch1);
            visited[idx] = true;
        }
        // Build result from stack
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }


}
