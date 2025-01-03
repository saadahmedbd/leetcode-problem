package pattern_question;

public class problem8_another_solution {
    public static void main(String[] args) {
        int n=5;
        int space=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            for (int j=2*i+1;j>0;j--) {
                System.out.print("*");
            }
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }

            System.out.println();
            space=space-1;
        }
    }
}
