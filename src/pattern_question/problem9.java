package pattern_question;

//     *
//    ***
//   *****
//  *******
// *********
//***********
//***********
// *********
//  *******
//   *****
//    ***
//     *

public class problem9 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
//            we see our primid have n-i-1 =5-i-1=4 space then * again 4 space
            for(int j=0;j<6-i-1;j++){
                System.out.print(" ");
            }
//            this line printing * that is 2*i+1 =2*0+1 =1 *
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
//            this line print  space again
            for(int j=0;j<6-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=5;i>=0;i--){
            for(int j=0;j< 6-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<6-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
