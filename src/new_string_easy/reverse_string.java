package new_string_easy;

public class reverse_string {
    public static void main(String[] args) {
        char [] str ={'h','e','l','l','o'};
        reverseString(str);
    }
    public static void reverseString(char[] str){
        int l=0;
        int r=str.length-1;
       while (r>l){
           char temp =str[l];
           str[l]=str[r];
           str[r]=temp;
           l++;
           r--;
       }
       for(int i=0;i<str.length;i++){
           System.out.println(str[i] +" ");
       }
    }
}
