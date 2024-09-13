package twoPointer;
//leetcode 392 asked by google

public class is_subsequence {
    public static void main(String[] args) {
        String s="abc";
        String t ="aghbjkc";
        System.out.println(subsequence(s, t));

    }
    public static boolean subsequence(String s, String t){
        int left =0, rigth=0;
        if(s.isEmpty()) return true;
        while(left < s.length() && rigth <t.length()){
            char c1=s.charAt(left);
            char c2 = t.charAt(rigth);
            if(c1 ==c2){
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
