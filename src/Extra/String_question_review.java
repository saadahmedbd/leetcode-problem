package Extra;

import java.util.Collections;
import java.util.HashMap;

public class String_question_review {
    public static void main(String[] args) {
        char [] str ={'h','e','l','l','0'};
        reverseString(str);
        String s=" the sky  is blue";
        System.out.println(reverseInstring(s));
        String st ="XIV";
        System.out.println(romanToInteger(st));

        String sf ="abcde";
        String goal ="cdeab";
        System.out.println(rotateString(sf, goal));

        String ss="aabcb";
        System.out.println(sumOfBeauty(ss));
        System.out.println(sumOfbeauty(ss));

        String sss ="aba";
        int k=2;
        System.out.println(distinctChar(sss, k));

    }
//    question 01 reverse string
    public static void reverseString(char[] str){
        int left =0;
        int right=str.length-1;
        while(right > left){
            char temp =str[left];
            str[left] =str[right];
            str[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i] + " ");
        }
    }
//    question 02 reverse in string
    public static String reverseInstring(String s){
        char str []= s.toCharArray();
        reverse(str, 0, str.length-1);
        reverseWord(str);
        return cleanSpaces(str);
    }
    public static void reverse(char[] str, int left, int right){
        while (left <right){
            char temp =str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
    }
    public static void reverseWord(char [] str){
        int left =0;
        int right=0;
        while (left < str.length){
            while (left <str.length && str[left] == ' ') left++;
            right=left;
            while (right <str.length && str[right] != ' ') right++;
            reverse(str, left , right-1);
            left=right;
        }
    }
    public static String cleanSpaces(char [] str){
        int left =0;
        int right =0;
        while (right < str.length){
            while (right <str.length && str[right] == ' ')right ++;
            while (right <str.length && str[right] != ' ') {
                str[left] =str[right];
                right++;
                left++;
            }
            while (right <str.length && str[right] == ' ') right++;
            if (right <str.length){
                str[left]=' ';
                left++;
            }
        }
        return  new String(str).substring(0, left);
    }
//    question 03 roman to integer
    public static int romanToInteger(String st){
        HashMap<Character, Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans =0;

        for(int i=0;i<st.length();i++){
            if( i < st.length()-1 && st.charAt(i) < st.charAt(i+1)){
                ans -= map.get(st.charAt(i));
            }else {
                ans += map.get(st.charAt(i));
            }
        }
        return ans;
    }
//    question 04 rotate string
    public static boolean rotateString(String sf, String goal ){
        sf=sf + sf;
        int l=0;
        int r=goal.length();
        while (r<sf.length()){
            String sb =sf.substring(l, r);
            if(sb.equals(goal)){
                return true;

            }
            l++;
            r++;
        }
        return false;

    }
//    question 05 sum of beauty of all subString
    public static int sumOfBeauty(String ss){
        int ans =0;
        for (int i=0;i<ss.length();i++){
            HashMap<Character, Integer> map =new HashMap<>();
            for(int j=i;j<ss.length();j++){
                char ch =ss.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0)+1);

                int maxValues = Collections.max(map.values());
                int minValues =Integer.MAX_VALUE;

                for(int freq : map.values()){
                    if(freq > 0 ){
                        minValues =Math.min(freq, minValues);
                    }
                }
                ans += (maxValues-minValues);
            }
        }
        return ans;
    }
//    another solution of sum of beauty
    public static int sumOfbeauty(String ss){
        int ans =0;

        for(int i=0;i<ss.length();i++){
            int [] tables=new int[26];
            int max=0;

            for(int j=i;j<ss.length();j++){
                char ch =ss.charAt(j);
                tables[ch-'a']++;

                max=Math.max(max, tables[ch-'a']);
                int min =Integer.MAX_VALUE;

                for(int freq : tables){
                    if(freq > 0){
                        min =Math.min(freq, min);
                    }
                }
                ans += (max -min);
            }

        }
        return ans;
    }
//    subString with k disting character question 06
    public static int distinctChar(String sss, int k){
        HashMap<Character, Integer> map=new HashMap<>();
        int count =0;
        int left=0;
        for(int r=0;r<sss.length();r++){
            char ch =sss.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            if(map.size() == k){
                count++;
            }
            int leftchar = sss.charAt(left);

                while (map.size()> k){
                    map.remove(map.get(leftchar));
                    if(map.size() == k){
                        count++;
                    }
                    left++;
                }


        }
        return count;
    }


}
