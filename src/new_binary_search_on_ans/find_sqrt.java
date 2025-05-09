package new_binary_search_on_ans;

public class find_sqrt {
    public static void main(String[] args) {
        int num =2147395599;
        System.out.println(sqrt(num));
        System.out.println(binarySearchSqrt(num));
    }
    public static int sqrt(int num){
        int ans = (int) Math.sqrt(num);
        return ans;
    }
//    binary search
    public static int binarySearchSqrt(int num){
        int start =1;
        int end =num;
        int ans =1;
        while (start <= end){
            int mid =(start+end)/2;
            if( (long) mid * mid <= (long)num){
                ans =mid;
                start=mid+1;
            }else{
                end =mid-1;
            }

        }
        return ans;
    }

}
