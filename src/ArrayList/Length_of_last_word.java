package ArrayList;

import javax.lang.model.util.Elements;

public class Length_of_last_word {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(length_of_word(s));

    }
    public static int length_of_word(String s){
       // char[] ch =s.
        int right =s.length()-1;
        while(right>=0 && s.charAt(right)==' '){
            right--;

        }
        int left =right;
        while(left>=0 && s.charAt(left) !=' '){
            left--;
        }
        return right-left;
    }

}
