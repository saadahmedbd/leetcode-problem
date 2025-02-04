package String;

import java.util.HashMap;

//Longest Substring Without Repeating Characters leetcode 03 asked by google
//Given a string s, find the length of the longest
//substring
// without repeating characters.
//Input: s = "abcabcbb"
//Output: 3
public class longest_substring_without_repeating_char {
    public static void main(String[] args) {
        String s="abcbba";
        System.out.println(longest_substring(s));
    }
    public static int longest_substring(String s){
        int ans =0 ;// check length of longest substring
        HashMap<Character, Integer> map =new HashMap<>();
        int left =0;
        for(int right =0;right<s.length();right++){
            char ch =s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch, right);
            }else{
                left =Math.max(left, map.get(ch)+1);
                map.put(ch, right);
            }
            ans =Math.max(ans, right-left+1);//left to right
        }
        return ans;
    }
}
