package Extra;

public class product_of_the_array {
    public static void main(String[] args) {
        int nums []={1,2,3,4};
        System.out.println(product_Of_array(nums));

    }
    public static int [] product_Of_array(int nums []){
        int prefixProduct [] =new int[nums.length];

         prefixProduct[0]=1;
         for(int i=1;i<nums.length;i++){
             prefixProduct[i] =prefixProduct[i-1] * nums[i-1]; //// first calculate all prefix
             // ex: array {1,2,3,4}
             //prefixProduct =[1,1,2,6];
         }
         int suffixProduct =1;
         for(int i=nums.length-1;i>= 0;i--){
             prefixProduct[i] =prefixProduct[i] *suffixProduct;
             suffixProduct = suffixProduct * nums[i];
             //update suffix product
             //suffixProduct =[1* 4=4,4*3=12, 12*2=24]
             // step1:prefixProduct=[1,1,2,6];
             //step2:prefixProduxt=[1,1,8,6];
             //step3 :prefixProduct=[1,12,16,6];
             //step4: prefixProduct =[24,12,16,6]
         }
         for(int i=0;i<prefixProduct.length;i++){
             System.out.print(prefixProduct);
         }
         return prefixProduct;

    }
}
