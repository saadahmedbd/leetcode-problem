package new_array.easy;

public class move_zeros {
    public static void main(String[] args) {
        int [] nums={1,2,0,1,0,4,0};
        int [] num={0 ,2 ,3 ,0 ,4 ,0 ,1};
//        moveZeros(nums);
        MoveZeros(num);
        move_zero(nums);
    }
    public static void moveZeros(int[] nums){
        int l=nums.length-1;
        int r=nums.length-1;
        while (r>0){
            if(nums[r] == 0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l--;
                r--;
            }else if(nums[r] != 0){
                r--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i] + "");
        }
    }
//
    public static void MoveZeros(int num[]){

        int l=0;
        int r=1;
        while(r<num.length){
            if(num[l] != 0){
                l++;
                r++;
            }else if(num[r]== 0){
                r++;
            }else if(num[l] == 0){
                int temp=num[l];
                num[l]=num[r];
                num[r]=temp;
                l++;
                r++;
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + "");
        }

    }
    public static void move_zero(int nums[]){
        int l=0;
        int r=0;
        while (r<nums.length){
            if(nums[r]!= 0 ){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + "");
        }

    }
}
