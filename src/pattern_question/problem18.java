package pattern_question;
//E
//DE
//CDE
//BCDE
//ABCDE


//In this problem, we have to print an alpha triangle
// as shown in the examples above. We observe from the
// examples that each row ends with the letter E in the
// case when N = 5 ( ‘A’ + 4 ). Also the triangle has to
// be right-angled so like the previous patterns, the outer
// loop will run for N times and the inner loop for i times.
// In the inner loop, we’ll start from the letter that comes
// i before the (‘A’ + N -1)th letter and then run the loop till
// we reach (‘A’ + N-1) in every row. For example, for N = 5 in each
// row, the letters will be printed from ‘E’ - i to ‘E’ where i is the row index.

public class problem18 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch =(char) (int)('A'+n-1-i);ch <= (char)(int)('A'+n-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
