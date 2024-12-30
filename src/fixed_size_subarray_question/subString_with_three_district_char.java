package fixed_size_subarray_question;

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
