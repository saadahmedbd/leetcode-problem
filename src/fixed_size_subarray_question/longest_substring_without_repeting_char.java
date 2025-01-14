package fixed_size_subarray_question;

import java.util.HashMap;

public class longest_substring_without_repeting_char {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(LongestSubstring(s));

    }
    public static int LongestSubstring(String s){
        HashMap<Character, Integer> map =new HashMap<>();
        int l=0;
        int count =0;
        for(int r=0;r<s.length();r++){
            char ch =s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l, map.get(ch)+1);
                map.put(ch, r);
            }else {
                map.put(ch, r);
            }
            count=Math.max(count, r-l+1);
        }
        return count;
    }
}
