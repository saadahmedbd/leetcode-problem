package new_string_easy;

import java.util.HashMap;
import java.util.Map;

public class valid_anagram {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        System.out.println(validAnagram(s1,s2));
        System.out.println(anagram(s1, s2));
    }
    public static boolean validAnagram(String s, String t){
        if(s.length() == 0) return false;
        HashMap<Character, Integer> map1 =new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }else {
                map1.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            }
            else{
                map2.put(t.charAt(i), 1);
            }
        }
        for(Character ch : map1.keySet()){
            if(!map1.get(ch).equals(map2.get(ch))){
                return false;
            }
        }
        return true;
    }
//    table format
    public static boolean anagram (String s, String t){
        if(s.length() != t.length()) return false;
        int[] table =new int[26];

        for (int i=0;i<s.length();i++){
            table[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            table[t.charAt(i) -'a']--;
            if(table[t.charAt(i) -'a']<0){
                return false;
            }
        }
        return true;
    }
}
