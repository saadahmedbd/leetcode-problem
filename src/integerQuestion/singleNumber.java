package integerQuestion;

public class singleNumber {
    public static void main(String[] args) {
        int [] nums ={8, 2, 1, 2, 8, 1, 9};
        System.out.println(SingleNumber(nums));
    }
    public static int SingleNumber(int[] nums){
        int singlenumber =0;
        for(int i=0;i<nums.length;i++){
            singlenumber =nums[i] ^ singlenumber;//Bitwise XOR operation
        }
        return singlenumber;
    }
}
