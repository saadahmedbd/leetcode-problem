package new_string_easy;

public class rotate_string {
    public static void main(String[] args) {
        String s= "abcde";
        String goal ="cdeab";
        System.out.println(rotateString(s,goal));
        System.out.println(rotate(s, goal));

//        System.out.println(sb);
    }
    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()) return false;
        String newString =s +s;
//        char [] charArray =newString.toCharArray();
        int l=0;
        int r=s.length();
        while (r<newString.length()){
            String ss=newString.substring(l, r);
            String ss2 =goal.substring(0, goal.length());
            if(ss.equals(ss2)){
                return true;
            }
            l++;
            r++;
        }
        return false;

    }
    public static boolean rotate(String s, String goal){
        if(s.length() != goal.length()) return false;
        String newString =s+s;
        return  newString.contains(goal);
    }
}
