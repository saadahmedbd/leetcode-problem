package ArrayList;

public class product_of_array_except_self {
    public static void main(String[] args) {
        int nums[] ={1,2 ,3 ,4};
        System.out.println(product_of_array(nums));
        product0fArray(nums);
    }
    public static int[] product_of_array(int [] nums){
        int suffix=1;
        int prefix=1;
        int n=nums.length;
        int [] result = new int[n];
        for(int i=0;i<n;i++){
            result[i]=prefix;
            prefix *= nums[i];
        }
        for(int i=n-1;i>=0;i--){
            result[i] *=suffix;
            suffix *= nums[i];
        }
        return result;
    }
    public static int[] product0fArray(int[] nums){
        int [] prefixProduct =new int[nums.length];
        prefixProduct[0]=1;
        for(int i=1;i<nums.length;i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
        }
        int suffixProduct =1;
        for(int i=nums.length-1;i>=0;i--){
            prefixProduct[i]=prefixProduct[i]*nums[i];
            suffixProduct=suffixProduct*nums[i];
        }
        return prefixProduct;
    }
}
