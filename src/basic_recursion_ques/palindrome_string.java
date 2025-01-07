package basic_recursion_ques;

public class palindrome_string {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        String s="race a car";

        int n=str.length()-1;
        System.out.println(palindrome(str));
        System.out.println(recursivePalindrome(str, 0, n));
//
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(rec(0,s));
    }
    public static boolean palindrome(String str){
        int l=0;
     int r=str.length()-1;
        while (l<r){
            char ch =str.charAt(r);
            char ch2=str.charAt(l);
            if(!Character.isLetterOrDigit(ch)){
                l++;

            }else if(!Character.isLetterOrDigit(ch2)){
                r--;
            }else if(Character.toLowerCase(ch) != Character.toLowerCase(ch2) ){
                return false;
            }
            else {
                l++;
                r--;
            }
        }
        return true;
    }
//    recursive solution
    public static boolean recursivePalindrome(String str, int start, int end) {
        if(start >= end){
            return true;
        }
        char ch = str.charAt(start);
        char ch2 = str.charAt(end);
        if (!Character.isLetterOrDigit(ch)) {
           return recursivePalindrome(str, start+1, end);
        }else if(! Character.isLetterOrDigit(ch2)) {
           return recursivePalindrome(str, start, end - 1);
        }
        else if(Character.toLowerCase(ch) != Character.toLowerCase(ch2) ){
            return false;
        }

        return     recursivePalindrome(str, start + 1, end - 1);

    }
    static private boolean rec(int i, String s){

        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are compared, we return true.
        if(i>=s.length()/2) return true;

        // If start is not equal to end, not palindrome.
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        // If both characters are same, increment i and check start+1 and end-1.
        return rec(i+1,s);
    }
}
