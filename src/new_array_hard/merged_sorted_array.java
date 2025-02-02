package new_array_hard;

public class merged_sorted_array {
    public static void main(String[] args) {
        int nums1 []={1,2,3,0,0,0};
        int nums2 []={2,5,6};
        int m=3;
        int n=3;
        System.out.println(merge_sorted(nums1, nums2, m,n));
    }
    public static int[] merge_sorted(int nums1 [], int nums2 [], int m, int n ){
        int [] ans =new int[m+n];
        int l=0;
        int r=0;
        int index=0;
        while(l<m && r<n){
            if(nums1[l] <=nums2[r]){
                ans[index]=nums1[l];
                l++;
                index++;
            }else{
                ans[index]=nums2[r];
                r++;
                index++;
            }

        }
        // If right pointer reaches the end:
        while(l < m){
            ans[index++]=nums1[l];
            l++;
        }
        //if left pointer reaches the end
        while(r<n){
            ans[index++] =nums2[r];
            r++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i] + " ");
        }
        return ans;
    }
    public static void merge(int nums1 [], int nums2 [], int m, int n){
        int p1=m-1;
        int p2=n-1;
        int ans=m+n-1;
        while(p2 >=0){
            if(p1 >=0  && nums1[p1] <nums2[p2]){
                nums1[ans]=nums1[p1];
                p1--;
            }else{
                nums1[ans]=nums2[p2];
                p2--;
            }
            ans--;
        }


    }

}
