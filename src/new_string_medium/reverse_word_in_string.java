package new_string_medium;

public class reverse_word_in_string {
    public static void main(String[] args) {
        String s=" the sky  is blue ";
        System.out.println(reverse_word(s));
    }
    public static String reverse_word(String s){
        //convert String to character
        char [] str = s.toCharArray();
//        part 1 : reverse entire string
        reverse(str, 0, str.length-1 );
//        reverse each word
        reverseEachWord(str);
//        clean spaces
        return cleanSpace(str);

    }
    public static void reverse(char [] str, int l, int r){

        while (r>l){
            char temp=str[l];
            str[l]=str[r];
            str[r]=temp;
            l++;
            r--;
        }
    }
    public static void reverseEachWord(char[] str){
        int l=0;
        int r=0;
        while(r<str.length){
            while (r<str.length && str[r] != ' ' ) r++;
            reverse(str, l, r-1);
            l=r;
            while (l<str.length && str[l] == ' ') l++;
            r=l;
        }
    }
    public static String cleanSpace(char [] str){
        int l=0;
        int r=0;
        while (r<str.length){
            while (r<str.length && str[r] == ' ') r++;
            while (r <str.length && str[r] != ' '){
                str[l]=str[r];
                r++;
                l++;
            }
            while (r<str.length && str[r] == ' ') r++;
            if(r<str.length){
                str[l]=' ';
                l++;
            }
        }
        return new String(str).substring(0, l);
    }
}
