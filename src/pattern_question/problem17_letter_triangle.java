package pattern_question;
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class problem17_letter_triangle {
    public static void main(String[] args) {
        int n=5;
        int space =n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            char ch='A';
            int backpoint =(2*i+1)/2;
            for(char j =1;j<=2*i+1;j++){
                System.out.print(ch);
                if( j<= backpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            System.out.println();
            space=space-1;
        }
    }
}
