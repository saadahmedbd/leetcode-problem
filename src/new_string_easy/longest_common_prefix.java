package new_string_easy;

public class longest_common_prefix {
    public static void main(String[] args) {
        String str []={"flower","flow","flight"};
        System.out.println(longestSubstring(str));
    }
    public static String longestSubstring(String [] str ){
        if(str.length ==0 ) return " ";
        String prefix =str[0]; // we assume our first index word is our ans;
        for(int i=1;i<str.length;i++){ // now we run loop 1 to n.
            while (str[i].indexOf(prefix) != 0){ // check prefix != str[i] means prefix not equal to second index then
                prefix =prefix.substring(0, prefix.length() -1); // remove the last character of prefix
                if(prefix.isEmpty()){
                    return " ";
                }
            }
        }
        return prefix;
    }
}
