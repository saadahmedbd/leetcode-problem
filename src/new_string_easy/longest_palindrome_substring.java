package new_string_easy;

public class longest_palindrome_substring {

    public static void main(String[] args) {
        String str ="babad";
        System.out.println(palindromeSubstring(str));
    }
//    solving tech expand around center method
//    tc (n2) sc (1)

    static int start =0; //global variable for count length of ans
    static int end =0;

    public static String palindromeSubstring(String str){
        for(int i=0;i<str.length();i++){
            exprandSubstring(str,  i, i); // first call this method
            exprandSubstring(str, i, i+1); //then this method
        }
        return str.substring(start , end+1);

    }
    public static void exprandSubstring(String str, int left , int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){ //if this condition is right then expand left and right
            left--;
            right++;
        }
        left =left +1;
        right =right-1;

        if (end -start +1 < right-left+1){
            start =left;
            end=right;
        }
    }
}
