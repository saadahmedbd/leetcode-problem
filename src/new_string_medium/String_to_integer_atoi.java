package new_string_medium;

public class String_to_integer_atoi {
    public static void main(String[] args) {
        String s=" -042ghh12";
        System.out.println(implementationAtoi(s));
        System.out.println(Atoi(s));
    }
    public static int implementationAtoi(String s){
        int i=0;
        int res=0;
        int sign =1;
        int n =s.length();
        int max_value=2147483647, min_value=-2147483648;
        //remove white space
        while (i< n && s.charAt(i) ==' ') i++;

        //check the sign
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign=s.charAt(i)=='-' ? -1 :1;
            i++;
        }
        //convert string to digit
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit =s.charAt(i)-'0';
            //check for overflow
            if (res > max_value / 10 || (res == max_value / 10 && digit > max_value % 10)) {
                return sign == 1 ? max_value : min_value;
            }
            res=res * 10 +digit;
            i++;

        }
        return sign * res;
    }
    public static int Atoi(String s){
        int i=0;
        int res=0;
        int sign =1;
        int n=s.length();
        int max_value=Integer.MAX_VALUE, min_value=Integer.MIN_VALUE;
        //remove space
        while (i<n && s.charAt(i)== ' '){
            i++;
        }
        //add sign
        if(i < n && s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign =s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
                int digit=s.charAt(i) -'0';
                if(res > max_value/10 ||(res == max_value /10 && digit > max_value % 10)){
                    return  sign == 1 ?max_value :min_value;
                }
                res= res *10+digit;
                i++;
        }

        return res *sign;
    }
}
