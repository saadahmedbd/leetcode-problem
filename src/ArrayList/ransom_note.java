package ArrayList;

import java.util.HashMap;
//leetcode 383 asked by amazon

public class ransom_note {
    public static void main(String[] args) {
        String ransomNote="bg";
        String magazine ="efjfg";
        System.out.println(ransom(ransomNote,magazine));
    }
    public static boolean ransom(String ransomNote, String magazine){
        // create table of english letter
        int[] frequency = new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            frequency[ch-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch =ransomNote.charAt(i);
            if(frequency[ch-'a']==0) return false;
            frequency[ch-'a']--;
        }
        return true;
    }
}
