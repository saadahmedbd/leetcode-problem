package twoPointer;

public class valid_palindrome {
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s){
        int l =0, r=s.length()-1;
        while(l<=r){
            char c1 = s.charAt(l);
            char c2=s.charAt(r);
            if(Character.isLetterOrDigit(c1) == false) l++;
            else if(Character.isLetterOrDigit(c2) == false) r--;
            else{
                if(Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
