package A_Master_OOP;

import java.util.Calendar;

class calculator{

    public int sum(int n1, int n2){
        int ans =n1 +n2;
        return ans;
    }
    public int subtract(int n1, int n2){
        int sub =n1-n2;
        return sub;
    }
}
class advCalculator extends calculator{
    public int multiply(int n1, int n2){
        int ans =n1 * n2;
        return ans;
    }
    public int division(int n2, int n3 ){
        int ans =n2 / n3;
        return ans;
    }
}

class multilevelInheritance extends advCalculator{
    public int modules (int n1, int n2){
        int ans=n1 % n2;
        return ans;
    }

}

public class Inheritance {
    public static void main(String[] args) {
//        calculator cal =new calculator();
//        int ans=cal.sum(12, 23);
//        System.out.println(ans);
//        ans=cal.subtract(23,45);
//        System.out.println(ans);

//        now we use advance calculator

//        advCalculator calcu =new advCalculator();
//       int ans= calcu.multiply(23, 45);
//        System.out.println(ans);
//        ans =calcu.sum(23,34);
//        System.out.println(ans);
//        ans =calcu.division(24, 12);
//        System.out.println(ans);

        multilevelInheritance calcul=new multilevelInheritance();
        int ans =calcul.division(100, 23);
        System.out.println(ans);
       ans= calcul.modules(12, 12);
        System.out.println(ans);




    }
}
