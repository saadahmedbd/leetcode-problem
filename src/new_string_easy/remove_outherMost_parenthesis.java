package new_string_easy;

public class remove_outherMost_parenthesis {
    public static void main(String[] args) {
        String s="()()";
        System.out.println(removeParenthesis(s));
    }
    public static String removeParenthesis(String s){
        StringBuilder sb =new StringBuilder(s);
        int l=0;
        int r=0;
        while (r<sb.length()){
            if(sb.charAt(l) == sb.charAt(r) && l == r){
                r++;
            }
            else if(sb.charAt(r) == ')' && sb.charAt(r-1) == '('){
                r++;
            }else if(sb.charAt(l) == '(' && sb.charAt(r) == ')') {
                sb.deleteCharAt(l);
                sb.deleteCharAt(r-1);
                l=r;
            }else if(sb.charAt(l) == '(' && sb.charAt(r) == '('){
                r++;
            }
        }
        String newString =sb.toString();
        return newString;
    }
}
