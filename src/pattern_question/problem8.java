package pattern_question;
//    *
//   ***
//  *****
// *******
//*********

public class problem8 {
    public static void main(String[] args) {
//        maintain our row
        for(int i=0;i<5;i++){
//            we see our primid have n-i-1 =5-i-1=4 space then * again 4 space
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
//            this line printing * that is 2*i+1 =2*0+1 =1 *
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
//            this line print  space again
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
