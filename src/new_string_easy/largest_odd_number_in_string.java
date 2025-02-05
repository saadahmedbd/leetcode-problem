package new_string_easy;

public class largest_odd_number_in_string {
    public static void main(String[] args) {
        String num ="52";

//        System.out.println(largest_odd_number(num));
        System.out.println(largest_odd_numbers(num));
        System.out.println(largestOddNumber(num));

    }
//    this ans not suitable for big string
    public static String largest_odd_number(String num){
        long num1 =Long.parseLong(num);
        long ans =0;
        while (num1 > 0){
            long modules =num1 % 10;
            if(modules % 2 == 1){
                long sum=num1;
                ans =Math.max(ans, sum);
            }
            num1 =num1 /10;
        }

        if(ans == 0){
            return "";
        }else{
            String result=String.valueOf(ans);
            return result;
        }

    }
    public static String largest_odd_numbers(String num){
        String ans ="";
        for (int i=num.length()-1;i>=0;i--){
            if(num.charAt(i) % 2 == 1 ){
                return num;
            }
            num =num.substring(0, num.length()-1);
        }
        return "";
    }
    public static String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            int x=num.charAt(i) - '0';
            if(x%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
