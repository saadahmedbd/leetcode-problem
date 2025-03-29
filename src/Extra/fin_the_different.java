package Extra;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class fin_the_different {
    public static void main(String[] args) {
        String s="abcde";
        String t= "abcgde";
       System.out.println(findTheDifferent(s, t));
        System.out.println(findThedifferent(s,t));

    }
    public static char findTheDifferent(String s, String t){

        HashMap<Character, Integer> map1 =new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            }else{
                map1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
            }else{
                map1.put(t.charAt(i),1);
            }
        }
        for(Map.Entry<Character, Integer> ans : map1.entrySet()){
            if(ans.getValue()== -1 || ans.getValue()==1){
                return ans.getKey();
            }
        }
        return'c';
    }
    public static char findThedifferent(String s, String t){
        char c=0;
        for(char ch1 : s.toCharArray()){
            c ^=ch1;
        }for(char ch2 :t.toCharArray()){
            c ^=ch2;
        }
        return c;
    }
}
