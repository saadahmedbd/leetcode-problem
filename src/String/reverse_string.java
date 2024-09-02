package String;
//question on leetcode 344
//asked by uber microsoft
//reverse string

public class reverse_string {
    public static void main(String[] args) {
        System.out.println("hi");
        int n1=124;
        int ans =124%1000;
        System.out.println(ans);

        char [] str ={'h','e','l','l','o'};
        //System.out.println(reverse(str));

    }
    public static void reverse(char[] str){
        int left =0;
        int right =str.length-1;
        while(left <right){
            char temp=str[left];
            str[left] =str[right];
            str[right] =temp;
            left ++;
            right --;
        }

    }
}
