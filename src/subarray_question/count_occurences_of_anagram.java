package subarray_question;

import java.util.HashMap;

public class count_occurences_of_anagram {
    public static void main(String[] args) {
    String str="aababacbaa";
    String ptn="aab";
    int k=3;
    System.out.println(count_anagram(str,ptn));

    }
    public static int count_anagram(String str, String ptn){
        HashMap<Character, Integer> map =new HashMap<>();
        int count=0;
        int sum=0;
        int k=str.length();
        for(int i=0;i<ptn.length();i++){
            char ch =ptn.charAt(i);
            if(map.containsKey(ch)){
                int a=map.get(ch);
                map.put(ch,++a);
            }
        }
        count=map.size();
        int i=0, j=0;
        while(j<str.length()){
            char ch =str.charAt(j);
            if(map.containsKey(ch)){
                int a=map.get(ch);
                map.put(ch, --a);
                if(a == 0){
                    count --;
                }
            }
            if(j-i+1 <k){
                j++;
                continue;
            }
            if(j-i+i == k){
                if(count == 0){
                    sum ++;
                }
                if(map.containsKey(str.charAt(i))){
                    int a=map.get(str.charAt(i));
                    if(a == 0){
                        count ++;
                    }
                    map.put(str.charAt(i), ++a);
                }
            }
            i++;
            j++;

        }
        return sum;

    }
}
