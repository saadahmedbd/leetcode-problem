package fixed_size_subarray_question;

import java.util.HashSet;

public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {
    public static void main(String[] args) {
        String s="00110110";
        int k=2;
        System.out.println(binaryCodeOfSizeK(s,k));
    }
//    00110110 substring is => 00, 01, 11, 10, 01,11,10
//    loop find this substring and set remove duplicate value
//    2^k == set.size return true or false
    public static boolean binaryCodeOfSizeK(String s, int k){
        HashSet<String> set =new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        return (set.size() == Math.pow(2,k));
    }
}
