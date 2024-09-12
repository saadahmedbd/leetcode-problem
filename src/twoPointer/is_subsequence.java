package twoPointer;

public class is_subsequence {
    public static void main(String[] args) {
        String s="";
        String t ="aghbjkc";
        System.out.println(subsequence(s, t));

    }
    public static boolean subsequence(String s, String t){
        int left =0, rigth=0;
        if(s.isEmpty()) return true;
        while(left < s.length() && rigth <t.length()){
            if(s.charAt(left) ==t.charAt(rigth)){
                left++;
                rigth++;
            }else{
                rigth++;
            }
            if(left ==s.length()){
                return true;
            }
        }
        return false;
    }
}
