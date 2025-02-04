package new_string_easy;

import java.util.HashMap;

public class longest_substring_without_repeating_character {
    public static void main(String[] args) {
        String str ="abcdbba";
        System.out.println(longest_substring(str));
    }
    public static int longest_substring(String str){
        int ans =0;
        int left =0;
        HashMap<Character, Integer> map =new HashMap<>();
        for(int right =0;right<str.length();right++){
            char ch =str.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch, right);
            }else{
                left =Math.max(left, map.get(ch)+1);
                map.put(ch, right);
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
