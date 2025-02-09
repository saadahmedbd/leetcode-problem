package new_string_easy;

import java.util.HashMap;
import java.util.HashSet;

public class subString_with_k_distinct {
    public static void main(String[] args) {
        String s="aba";
        int k=2;
        System.out.println(subString(s, k));
        System.out.println(DisnictSubstring(s, k));
        System.out.println(count_distinct_substring(s, k));
    }
//    o (n2)
    public static int subString(String s, int k) {
        int l = 0;
        int count = 0;
        for (int r=0;r<s.length();r++){
            HashSet<Character> uniqueChar=new HashSet<>(); //hashset count unique character
            for (int i=r;i<s.length();i++){
                uniqueChar.add(s.charAt(i));
                if(uniqueChar.size() == k){
                    count++;
                }else if(uniqueChar.size() > k){
                    break;
                }
            }
        }

        return count;

    }
//    optimal approach
    public static int count_distinct_substring(String s, int k){
        return helperFunction(s, k) -helperFunction(s, k-1);
    }
    public static int helperFunction(String s, int k){
        int n=s.length();
        if(n <k) return 0;
        int left =0, right=0, count =0;
        HashMap<Character, Integer> map=new HashMap<>();
        while (right <n){
            char ch =s.charAt(right);
                map.put(ch, map.getOrDefault(ch, 0)+1);

            // Shrink window if distinct chars exceed k
            while (map.size() > k){
//                char leftChar =s.charAt(left);
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            count+=right-left+1;
            right++;

        }
        return count;

    }

// this ans for, not duplicate value
    public static int DisnictSubstring(String s, int k){
        HashMap<Character, Integer> map =new HashMap<>();
        int left =0;
        int count =0;
        for(int right =0;right<s.length();right++){
            char ch =s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            if(right -left+1 == k){
                if(map.size() == k){
                    count ++;
                }
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
        }
        return count;
    }

}
