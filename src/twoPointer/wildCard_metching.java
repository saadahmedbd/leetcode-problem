package twoPointer;

public class wildCard_metching {
    public static void main(String[] args) {
        String s="aa", p="aa";
        System.out.println(wildCard(s, p));

    }
    public static boolean wildCard(String s, String p){
        int left =0;
        int right=0;
        while(left< s.length() && right <p.length()){
            char ch1 =s.charAt(left);
            char ch2 =p.charAt(right);
            if(ch1 == ch2 || ch1 =='?' || ch2 =='?'){
                left++;
                right++;
            }else if(ch1 == '*' || ch2 =='*'){
                return true;
            }else if(ch1 != ch2){
                return false;
            }

        }
        return false;
    }
}
