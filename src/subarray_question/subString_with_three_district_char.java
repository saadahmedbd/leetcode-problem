package subarray_question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class subString_with_three_district_char {
    public static void main(String[] args) {
        String s="aababcaab";
        System.out.println(districtCharacter(s));

    }
    public static int districtCharacter(String s){
        int result=0;

       for(int i=0;i<s.length()-3+1;i++){
           if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1)!= s.charAt(i+2) && s.charAt(i) != s.charAt(i+2)){
               result++;
           }

        }
        return result;


    }
}
