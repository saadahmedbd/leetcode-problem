package pattern_question;
//    0
//   10
//  210
// 3210
//43210

public class problem23 {
    public static void main(String[] args) {
        int n=5;
        int space=n-1;
        for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
                System.out.print(" ");

            }
            for (int j=i;j>=0;j--){
                System.out.print(j);
            }
            System.out.println();
            space=space-1;
        }
    }
}
