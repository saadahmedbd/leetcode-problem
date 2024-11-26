package Recursion;

import java.util.HashMap;

public class permutation_in_string {
    public static void main(String[] args) {
        String s1="ab";
        String s2="fg";
        System.out.println(permutationOf_String(s1,s2));
    }
    public static boolean permutationOf_String(String s1, String s2){
        HashMap<Integer, Character> map1 =new HashMap<>();
        for(char i=0;i<s1.length();i++){
            char s=s1.charAt(i);
            map1.put(0,s);
        }
        HashMap<Integer, Character> map2 =new HashMap<>();
        for(char i=0;i<s2.length();i++){
            char ss=s2.charAt(i);
            map2.put(0, ss);
        }
        for(int key :map1.keySet()){
            if(map2.containsKey(key)){
                return true;
            }
        }
        return false;
    }
}
