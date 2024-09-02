package String;
//question on leetcode 14
//asked by facebook
//question name longest common prefix

public class longest_substring {
    public static void main(String[] args) {
        String [] str ={"flower","flow","flight"};
        System.out.println(substring(str));
    }
    public static String substring(String[] str){
        if(str.length==0) return "";
        String prefix =str[0];
        for(int i=1;i<str.length;i++){
            //index of method find element of array
            // str.indexOf("flower")
            while(str[i].indexOf(prefix)!=0){

                // substring method return a substring from the string
                // str.substring(start, end)
                prefix =prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
