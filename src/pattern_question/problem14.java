package pattern_question;
//A
//AB
//ABC
//ABCD
//ABCDE

public class problem14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch ='A';ch<='A'+i;ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
