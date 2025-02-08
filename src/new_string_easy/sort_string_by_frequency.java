package new_string_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sort_string_by_frequency {
    public static void main(String[] args) {
        String s="cccaaa";
        System.out.println(sort_string(s));
    }
    public static String sort_string(String s){
        // create string builder for storing ans
        StringBuilder ans =new StringBuilder();
        // create hashmap for store frequnecy
        HashMap<Character, Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
//            for(char chh : s.toCharArray()){
////            map.put(chh, map.getOrDefault(chh, 0)+1);
////        }
            char chh =s.charAt(i);
            if(map.containsKey(chh)){
                map.put(chh, map.getOrDefault(chh, 0)+1);
            }
            else{
                map.put(chh, 1);
            }

        }
        // create list for store the map key and frequency
        List<Character> list =new ArrayList<>(map.keySet());
        // sort on descrending order
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        // run loop on char
        for(char ch :list){
            for(int i=0;i<map.get(ch) ;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
