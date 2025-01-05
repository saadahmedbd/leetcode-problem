package Basic_math_question;

import java.util.ArrayList;
import java.util.List;

public class print_all_divisor {
    public static void main(String[] args) {
        int n=12;
        System.out.println(Divisor(n));
    }
//    Algorithm
//
//Step 1: Initialise an array to store the divisors.
//
//Step 2: Iterate from 1 to square root of n using a loop variable ‘i’. For each value of ‘i’:
//
//Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).
//If i is a divisor, add it to the vectors of divisors.
//If i is different from n/i add the counterpart divisor n/i to the vector of divisors.
//Step 3: After the loop, return the array of divisors.

//    tc 0(sqrt) sc (2*sqrt)
    public static List<Integer> Divisor(int n){
        ArrayList<Integer> list = new ArrayList<>();
       int sqrt = (int) Math.sqrt(n);
       for(int i=1;i<=sqrt;++i){
           if(n % i ==0 ){
               list.add(i);
               if(i != n/i){
                   list.add(n/i);
               }
           }
       }
        return list;
    }
}
