package ArrayList;

public class subarray_product_less_then_k {
    public static void main(String[] args) {
        int nums[]={1,2 ,3, 4, 5};
        int k=12;
        System.out.println(subarray_product(nums, k));

    }
    public static int subarray_product(int [] nums, int k){
        int count =0, product =1, left=0;
        for(int rigth =0;rigth<nums.length;rigth ++){
            product *= nums[rigth];
            while(product >= k && left <=rigth){ // product bigger than k
                product /= nums[left]; // descreasing product value
                left++;
            }
            count += rigth-left+1; // counting subarray (right-left+1)
        }
        return count;
    }
}
