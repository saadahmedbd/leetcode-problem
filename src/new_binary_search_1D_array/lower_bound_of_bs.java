package new_binary_search_1D_array;

public class lower_bound_of_bs {
    public static void main(String[] args) {
        int [] arr ={1,2,2,3};
        int k=2;
        System.out.println(floor_of_target(arr, k));
    }
    public static int floor_of_target(int arr[], int k){
        int start =0;
        int end =arr.length-1;
        int ans =-1;
        while(start <= end){
            int mid =start + (end-start)/2;
            if(arr[mid] >= k){
                ans=mid;
                end =mid-1;
            }else{
                start =mid +1;
            }

        }
        return ans;
    }
}
