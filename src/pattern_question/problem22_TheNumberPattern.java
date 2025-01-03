package pattern_question;
//5 5 5 5 5 5 5 5 5 6
//5 4 4 4 4 4 4 4 5 6
//5 4 3 3 3 3 3 4 5 6
//5 4 3 2 2 2 3 4 5 6
//5 4 3 2 1 2 3 4 5 6
//5 4 3 2 2 2 3 4 5 6
//5 4 3 3 3 3 3 4 5 6
//5 4 4 4 4 4 4 4 5 6
//5 5 5 5 5 5 5 5 5 6
//6 6 6 6 6 6 6 6 6 6

public class problem22_TheNumberPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=2*n-1;i++){
            for(int j=0;j<=2*n-1;j++){
                int top=i;
                int bottom=j;
                int left=(2*n-2)-i;
                int right=(2*n-2)-j;

                System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right))+" " );
            }
            System.out.println();
        }
    }
}
