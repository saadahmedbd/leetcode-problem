package pattern_question;
//ABCDE
//ABCD
//ABC
//AB
//A

//This pattern problem is very similar to the last pattern problem
// we did where we had to print an increasing letter pyramid pattern
// but this time we have to print it in the reverse fashion. So,
// the outer loop will run for N rows and the inner loop will
// loop for N-i-1 alphabets in each row (where i is the row number)
// because the 1st row will have alphabets from A to A+(N-1).
// Alphabets in each row will start from A each time we enter a
// new row and will loop till (A+N-i-1)th alphabet in that row.
// In this way, the last row will only contain the alphabet A at last.

public class problem15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch ='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
