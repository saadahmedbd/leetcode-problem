package new_string_easy;

import java.util.Collections;
import java.util.HashMap;

public class Sum_of_beauty_of_all_subString {
    public static void main(String[] args) {
        String s ="aabcb";
        System.out.println(sum_of_beauty(s));
        System.out.println(beaty_sum(s));
    }
    public static int sum_of_beauty(String s){

        int sum=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character, Integer> map =new HashMap<>();
            // when j index recived last index of string then again start
            // outher loop and store values

            for(int j=i;j<s.length();j++){
                char ch =s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0)+1); //store values in map

                int maxValues = Collections.max(map.values());//maxvalues store max frequency
                int minValues =Integer.MAX_VALUE;

                for(int num : map.values()){
                    if(num > 0){
                        minValues =Math.min(minValues, num); //minvalues get min of frequency
                    }
                }
                sum += (maxValues -minValues);
            }
        }

        return sum;
    }

    public static int beaty_sum(String s){
        int sum =0;
        for(int i=0;i<s.length();i++){
            int tables [] =new int[26];
            int maxFreq =0;

            for(int j =i;j<s.length();j++){
                tables[s.charAt(j)-'a']++;

                maxFreq =Math.max(maxFreq, tables[s.charAt(j) -'a']);

                int minFreq =Integer.MAX_VALUE;
                for(int freq : tables){
                    if(freq > 0){
                        minFreq =Math.min(minFreq, freq);
                    }
                }
                sum += (maxFreq -minFreq);
            }
        }
        return sum;
    }

}
