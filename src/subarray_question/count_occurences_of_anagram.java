package subarray_question;

import java.util.HashMap;

public class count_occurences_of_anagram {
    public static void main(String[] args) {
    String str="aababacbaa";
    String ptn="aab";
    int k=3;
    System.out.println(count_anagram(str,ptn, k));

    }
    public static int count_anagram(String str, String ptn,int k){
        HashMap<Character, Integer> map =new HashMap<>();
        int sum=0;
       for(int i=0;i<ptn.length();i++){
           char ch =ptn.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch, map.get(ch)+1);
           }else{
               map.put(ch,1);
           }
       }
       int l=0,r=0;
       int count=map.size();
       while(r<str.length()){
           char ch = str.charAt(r);
           if(map.containsKey(ch)){
               map.put(ch, map.get(ch)-1);
               if(map.get(ch) == 0){
                   count--;
               }

           }
           else if(r-l+1 <k){
               r++;
           }
           if(r-l+1 == k){
               if(count == 0){
                   sum++;
               }
               char ch2= str.charAt(r);
               if(map.containsKey(ch2)){
                   map.put(ch2, map.get(ch2)+1);
                   if(map.get(ch2) ==1){
                       count++;
                   }

               }
               r++;
               l++;
           }

       }
       return sum;

    }
}
