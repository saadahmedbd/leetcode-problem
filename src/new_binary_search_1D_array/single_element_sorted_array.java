package new_binary_search_1D_array;

public class single_element_sorted_array {
    public static void main(String[] args) {
        int nums [] ={3,3,7,7,10,11,11};
        System.out.println(singleElement(nums));
    }
    public static  int singleElement (int nums []){
        int n =nums.length;
//        base case
//        if array length is 1

        if(n == 1) return nums[0];
//        if array of index and index 2 is not equal
        if(nums[0] != nums[1]) return nums[0];
//        if array of n-1 and n-2 is not equal
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int start =1;
        int end =n-2;
        while (start <= end){
            int mid =(start + end )/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if(mid % 2 ==0){
                if(nums[mid] == nums[mid+1]){
                    start=mid+1;
                }else {
                    end =mid-1;
                }
            }else{
                if(nums[mid] == nums[mid+1]){
                    end =mid-1;
                }else{
                    start=mid+1;
                }
            }
//            we are in left side
            // if index id odd number then check mid == mid +1
//            or index is even then check mid == mid -1
//            if((mid % 2 == 1 && nums[mid] == nums[mid+1]) ||
//                    (mid % 2 == 0 && nums[mid] == nums[mid-1])){
//                start =mid+1; //element the left half
//            }else{
//                end =mid-1; //element the right half
//            }
        }
        return -1;
    }
}
