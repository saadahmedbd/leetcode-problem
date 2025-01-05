package Basic_math_question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GCD_of_w_two_number {
    public static void main(String[] args) {
        int n1=20;
        int n2=15;
        System.out.println(GCD(n1, n2));
        System.out.println(GCD2(n1,n2));
    }
    public static int GCD(int n1, int n2){

        int GCD =1;
        for(int i=1;i<Math.min(n1, n2);i++){
            if(n1% i == 0 && n2%i ==0){
                GCD=i;
            }
        }
        return GCD;
    }
//    optimal approch
    public static int GCD2(int n1, int n2){
        int GCD=1;
        for(int i=Math.min(n1, n2);i>1;i--){
            if(n1%i==0 && n2%i == 0){
                GCD=i;
            }
        }
        return GCD;
    }
}
