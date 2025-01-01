package pattern_question;
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class problem6 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(5-j+1+" ");
            }
            System.out.println();
        }
    }
}
