package new_string_medium;

public class Maximum_nesting_depth_of_the_parenthesis {
    public static void main(String[] args) {
        String s="(1)+((2))+(((3))";
        System.out.println(maximumDepth_of_parenthesis(s));

    }
    public static int maximumDepth_of_parenthesis(String s){
        int count=0, ans=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
            }else if (s.charAt(i)== '('){
                    count++;
                    ans=Math.max(ans, count);

            }else if(s.charAt(i) == ')'){
                count-=1;
            }
        }
        return ans;
    }
}
