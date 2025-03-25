package Extra;

import java.util.Collections;

public class binary {
    public static void main(String[] args) {
        String a="101111", b="11";
        System.out.println(Binary(a, b));
        System.out.println(binarySum(a,b));
        System.out.println(BinarySum(a,b));

    }
    public static String Binary(String a, String b){
        int num1=0;
        int num2=0;
        for(int i=0;i<a.length();i++){
            int p=a.charAt(i)-'0';
            num1=num1 *10 + p;
        }
        for(int j=0;j<b.length();j++){
            int q=b.charAt(j)-'0';
            num2=num2 *10 +q;
        }
        int sum =num1 + num2;
        StringBuilder res =new StringBuilder();
        while(sum != 0){
            int n= sum % 2;
            res.append(n);
            sum =sum/2;
        }
        res.reverse();
        return String.valueOf(res);
    }
    //give us stack overfollow
    public static String binarySum (String a, String b){
        long num1=Integer.parseInt(a,2);
        long num2=Integer.parseInt(b,2);
        long sum =num1+num2;
        String res=Integer.toBinaryString((int) sum);
        return res;
    }
    public static String BinarySum(String a, String b){
        StringBuilder sb=new StringBuilder();
        int l= a.length()-1;
        int r=b.length()-1;
        int caught=0;
        while (l>=0 && r>=0){
            if(caught ==0){
                if((a.charAt(l)=='0' && b.charAt(r)=='1') || (a.charAt(l) =='1' && b.charAt(r)=='0')){
                    sb.append(1);
                }else if(a.charAt(l)=='1' && b.charAt(r)=='1'){
                    sb.append(0);
                    caught=1;
                }else if(a.charAt(l)=='0' && b.charAt(r)=='0'){
                    sb.append(0);
                }
            }else if(caught==1){
                if((a.charAt(l)=='0' && b.charAt(r)=='1') || (a.charAt(l) =='1' && b.charAt(r)=='0')){
                    sb.append(0);
                    caught=1;
                }else if(a.charAt(l)=='1' && b.charAt(r)=='1'){
                    sb.append(1);
                    caught=1;
                }else if(a.charAt(l)=='0' && b.charAt(r)=='0'){
                    sb.append(1);
                    caught=0;
                }
            }
            l--;
            r--;
        }while (l>=0){
            if(caught==0){
                sb.append(a.charAt(l));
            }else if(caught==1){
                if(a.charAt(l)=='1'){
                    sb.append(0);
                    caught=1;
                }else if(a.charAt(l)=='0'){
                    sb.append(1);
                    caught=0;
                }
            }
            l--;
        }
        while (r >=0){
            if(caught==0){
                sb.append(b.charAt(r));
            }else if(caught==1){
                if(b.charAt(r)=='1'){
                    sb.append(0);
                    caught=1;
                }else if(b.charAt(r)=='0'){
                    sb.append(1);
                    caught=0;
                }
            }
            r--;
        }
        if(caught==1){
            sb.append(1);
        }
        sb.reverse();
        return String.valueOf(sb);
    }
}
