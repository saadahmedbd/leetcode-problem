package new_string_medium;

public class maximum_nesting_of_depth_of_the_parenthesis {
    public static void main(String[] args) {
        String s="(1)+((2))+(((3)))";
        System.out.println(maximum_depth(s));
    }
    public static int maximum_depth(String s){
        int ans=0;
        int count=0;
        int si=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '('){
                count++;
            }else if(s.charAt(i) == ')'){
                si++;
            }
            ans=Math.max(count, si);
            ans =Math.max(ans, 0);
            count=0;
            si=0;
        }
        return ans;
    }
}
