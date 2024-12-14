package subarray_question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_all_anagram {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAllAnagram(s,p));
    }
    public static List<Integer> findAllAnagram(String s, String p){
        HashMap<Character, Integer> map =new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        int count =0;
        int k=p.length();
        for(int i=0;i<p.length();i++){
            char ch =p.charAt(i);
            if(map.containsKey(ch)){
                //int a= map.get(ch)
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        count =map.size();
        int i=0, j=0;
        while(j<s.length()){
            // for(int i=0;i<s.length();i++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    count --;
                }
            }
            if(j-i+1 <k){
                j++;
            }
            else if (j-i+1 == k){
                if(count == 0){
                    ans.add(i);
                }
                char ch1 =s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1, map.get(ch1) +1);
                    if(map.get(ch1) ==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;

    }



}


