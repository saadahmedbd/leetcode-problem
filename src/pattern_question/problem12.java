package pattern_question;
//0         0
//01       10
//012     210
//0123   3210
//01234 43210

public class problem12 {
    public static void main(String[] args) {
        int n=5;
        int space=n*2-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
}
