package new_binary_search_1D_array;

public class lower_bound_of_bs {
    public static void main(String[] args) {
        int [] arr ={3,5,8,15,19};
        int k=9;
        System.out.println(floor_of_target(arr, k));
    }
    public static int floor_of_target(int arr[], int k){
        int start =0;
        int end =arr.length-1;
        while(start <= end){
            int mid =start + (end-start)/2;
            if(arr[mid] > k){
                end =mid-1;
            }else{
                start =mid +1;
            }

        }
        return end;
    }
}
