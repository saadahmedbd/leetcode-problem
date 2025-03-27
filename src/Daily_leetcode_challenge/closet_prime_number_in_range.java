package Daily_leetcode_challenge;

import java.util.ArrayList;
import java.util.List;

public class closet_prime_number_in_range {
    public static void main(String[] args) {
        int num1=20, num2=40;
        System.out.println(closedPrimeNumber(num1, num2));
    }
    public static List<Integer> closedPrimeNumber(int num1, int num2){
        List<Integer> list =new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            if(i %2 != 1 && i %3 !=1 && i %4 !=1 && i %5 !=1 && i %6 !=1){
                list.add(i);
            }
        }
        return list;
    }
}
