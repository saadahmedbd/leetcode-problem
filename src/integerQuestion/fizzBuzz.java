package integerQuestion;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz
//question by LinkedIn
//Given an integer n, return a string array answer (1-indexed) where:
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.
// n = 3
//["1","2","Fizz"]

public class fizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz(3));
    }
    public static List<String> FizzBuzz(int n){
        List<String> list =new ArrayList<>();
        for(int i=1;i<=n ;i++){
            if(i %3 ==0 && i %5 ==0){
                list.add("fizzBuzz");
            }
            else if(i % 3 ==0){
                list.add("fizz");
            }else if(i%5 ==0){
                list.add("buzz");
            }else{
                list.add(i+"");
            }
        }
        return list;
    }
}
