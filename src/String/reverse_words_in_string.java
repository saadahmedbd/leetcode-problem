package String;
//151. Reverse Words in a String asked by facebook , amazon
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space
//s = "  hello world  "
//Output: "world hello"
public class reverse_words_in_string {
    public static void main(String[] args) {
        String s= "the sky  is blue";
        System.out.println(reverseWord(s));

    }
    public static  String reverseWord(String s){
        // part 1 : reverse entire string
        // make string to a character array
        char[] str =s.toCharArray();
        reverse(str, 0, str.length-1);
        //part2 reverse ease word
        reverseEaseWord(str);
        // part 3 clean spaces
        return cleanspaces(str);

    }
    public static  void  reverse(char[] str , int left, int right){
        while(left<right){
            char temp =str[left];
            str[left] = str[right];
            str[right] =  temp;
            left ++;
            right --;
        }
    }
    public static  void reverseEaseWord(char[] str){
        int left =0;
        int right =0;
        while(left<str.length){
            while(left<str.length && str[left] == ' ')left ++;
                right=left;
            while(right <str.length && str[right] != ' ')right++;
                reverse(str, left, right-1);
                left =right;
        }
    }
    public static String cleanspaces(char[] str){
        int left =0;
        int right =0;
        while(right<str.length){
            while(right<str.length && str[right] == ' ') right++;
            while(right <str.length && str[right] != ' '){
                str[left] =str[right];
                left++;
                right++;
            }
            while (right<str.length && str[right] == ' ') right++;
            if(right<str.length){
                str[left] =' ';
                left++;
            }
        }
        return new String(str).substring(0,left);
    }
}
