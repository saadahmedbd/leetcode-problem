package integerQuestion;

import javax.xml.stream.XMLInputFactory;

public class reverse_integer {
    public static void main(String[] args) {
        int x=2134511111;
        System.out.println(reverseInteger(x));

    }
    public static int reverseInteger(int x){
        int max =Integer.MAX_VALUE; //214783647
        int min =Integer.MIN_VALUE;//-2147483648

        int reverse =0;
        if(x==max || x==min) return 0;
        while(x!=0){
            int lastDigit =x%10;
            if(reverse>max/10) return 0;
            if(reverse<min/10) return 0;

            reverse=reverse *10 +lastDigit;

            x=x/10;
        }
        return reverse;
    }
}
