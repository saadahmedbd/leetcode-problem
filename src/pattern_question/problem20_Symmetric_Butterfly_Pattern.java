package pattern_question;
//*         *
//**       **
//***     ***
//****   ****
//***** *****
//****   ****
//***     ***
//**       **
//*         *

public class problem20_Symmetric_Butterfly_Pattern {
    public static void main(String[] args) {
        int n=5;
        int space=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
        int m=4;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m-i;j++){
                System.out.print("*");
            }
            for (int j=0;j<=2*i+2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<m-i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

}
