package fixed_size_subarray_question;

import java.util.HashMap;

public class Permutation_in_String {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidboaoo";
        System.out.println(checkPermutation(s1,s2));

    }
    public static boolean checkPermutation(String s1, String s2) {
        HashMap<Character,Integer> map =new HashMap<>();
        int k=s1.length();
        for(int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }
        int count=map.size();
        int l=0, r=0;
        while(r<s2.length()){
            char ch =s2.charAt(r);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0){
                    count--;
                }
            }
            if(r-l+1 <k){
                r++;
            }
            else if(r-l+1 ==k){
                if(count == 0){
                    return true;
                }
                l++;
                r++;
            }

        }
        return false;
    }
}
