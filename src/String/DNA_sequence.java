package String;
// leetcode 187. Repeated DNA Sequences
// asked by =google
import java.util.*;

public class DNA_sequence {
    public static void main(String[] args) {
        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(Dna_sequence(s));
        System.out.println(dna_sequence(s));
    }
    //hashset
    public static ArrayList Dna_sequence (String s){
        Set<String> set =new HashSet<>();
        Set<String> list =new HashSet<>();

        for(int i=0;i<s.length()-10;i++){
            String subString =s.substring(i,i+10);
            if(set.contains(subString)){
                list.add(subString);
            }else{
                set.add(subString);
            }
        }
        return new ArrayList(list);
    }
//hashmap
    public static List<String> dna_sequence(String s){
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0;i<s.length()-10;i++){
            String subString = s.substring(i,i+10);
            map.put(subString, map.getOrDefault(subString,0) +1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> item :map.entrySet()){
            if(item.getValue()>1){
                list.add(item.getKey());
            }
        }
        return list;
    }
}
