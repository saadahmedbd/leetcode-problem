package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class find_word_contraing_char {
    public static void main(String[] args) {
        String words[]={"leet", "code"};
        char x='e';
        System.out.println(findChar(words,x));

    }
    public static List<Integer> findChar(String[] words, char x){
        List<Integer> list =new ArrayList<>();
        String charToString =Character.toString(x); //convert char to string
        for(int i=0;i<words.length;i++){
            if(words[i].contains(charToString)){
                list.add(i);
            }
        }
        return list;
    }
}
