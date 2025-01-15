package new_array.easy;

public class second_smallest_leargest_element {
    public static void main(String[] args) {
        int num[]={4, 7, 8, 3, 2, 0,6};
        int nums[]={1,2,4,7,7,5};
        System.out.println(second_leargest_element(num));
        System.out.println(second_smallect(num));
//        better approach
        System.out.println(smallest_value(nums));
        System.out.println(second_leargest(nums));
//        optimal approach
        System.out.println(Second_leargest_element(nums));
        System.out.println(Second_smallest_element(nums));
    }
    public static int second_leargest_element(int num[]){
//        this solution work when number have not any duplicate and second large or small value position have not last index
        int n=num.length;
        int ans=-1;

        int l=0;
        int r=1;
        while(r<n){
            int ansValue=ans;

            if(num[l] >num[r]){
                ansValue=num[r];

            }else{
                ansValue=num[l];

            }
            ans=Math.max(ans, ansValue);
            l++;
            r++;
        }
        return ans;
    }
    public static int second_smallect (int [] num){
        int n=num.length;
        int l=0, r=1;
        int ans =num[0];
        while(r<n){
            int ansValue=0;
            if(num[l]<num[r]){
                ansValue=num[r];
            }else{
                ansValue=num[l];
            }
            ans=Math.min(ansValue, ans);
            l++;
            r++;
        }
        return ans;
    }

//    better approach
    public static  int smallest_value(int [] nums){
        int n=nums.length;
        if(n<2){
            return -1;
        }
//        find most smallest and largest element
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallest > nums[i]){
                smallest=nums[i];
            }

        }
        int second_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] < second_smallest && nums[i] != smallest){
                second_smallest=nums[i];
            }
        }
        return second_smallest;


    }
    public static int second_leargest(int nums[]){
        int n=nums.length;
        if(n<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                largest=nums[i];
            }
        }
        int second_leargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > second_leargest && nums[i] != largest){
                second_leargest=nums[i];
            }
        }
        return second_leargest;
    }
//    optimal approach
    public static int Second_leargest_element(int nums[]){
        int n=nums.length;
        if(n<2){
            return -1;
        }
        int leargest =Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] > leargest){
                second_largest=leargest;
                leargest=nums[i];
            }else if(nums[i] > second_largest && nums[i] != leargest){
                second_largest=nums[i];
            }
        }
        return second_largest;
    }
    public static int Second_smallest_element(int [] nums){
        int n=nums.length;
        if(n<2){
            return -1;
        }
        int smallest =Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] < smallest){
                second_smallest=smallest;
                smallest=nums[i];
            } else if (nums[i] <second_smallest && nums[i] != smallest) {
                second_smallest=nums[i];

            }
        }
        return second_smallest;
    }
}
