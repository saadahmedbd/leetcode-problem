package new_array_hard;

public class count_reverse_pair {
    public static void main(String[] args) {
        int [] a={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(team(a));
        System.out.println(reverse_pair(a));
    }
    public static int count_reverse(int[] a){
        int n=a.length;

        // Count the number of pairs:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > 2 * a[j])
                    cnt++;
            }
        }
        return cnt;
    }
    public static int team(int[] skill) {
        return count_reverse(skill);
    }
    public static int reverse_pair(int[] nums){
        int l=0, r=l+1;
        int count=0;
        while(l<nums.length-1){
            if(r == nums.length-1){
                r=l+1;
                l++;
            }
            if(nums[l] > 2* nums[r]){
                count++;
                r++;

            }

        }
        return count;
    }
}
