package new_array_medium;

import java.util.Arrays;

public class rearrange_element_by_sign {
    public static void main(String[] args) {
    int nums[]={1,2,-3,-1,-2,3};
        System.out.println(rearrange(nums));
    }
//    tc 0(n) sc 0(n) leetcode problem
    //rearrange the array question say: first add positive number then add negative number again same sign of number add in an array
    public static int[] rearrange(int nums[]){
        int n=nums.length;
       int [] newNum=new int[n];
       int pos=0, neg=1;
       for(int i=0;i<n;i++){
           if(nums[i] <0){ // if value is negative
               newNum[neg]=nums[i]; // then newnumber of array negative index add num[i]
               neg+=2;
           }else{
               newNum[pos]=nums[i];//same concept
               pos+=2;
           }
       }for(int i=0;i<newNum.length;i++){
            System.out.print(newNum[i]+" ");
        }
       return newNum;


    }
}
