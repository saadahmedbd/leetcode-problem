package New_recursion_level_1;

public class palidrome {
    public static void main(String[] args) {
        int nums[]={1,2,1,};
        System.out.println(palindromeNum(nums,0, nums.length-1));
        char s []={'m','a','d','a','m'};
        int n=s.length;
        System.out.println(palindromeString(s,0,n));

    }
    public static boolean palindromeNum(int nums[], int l,int r){
        if(l>=r){
            return true;
        }
        if(nums[l]!=nums[r]){
            return false;
        }
        return palindromeNum(nums, l+1,r-1);
    }
    public static boolean palindromeString(char s[], int i, int n){
        if(i>=n/2){
            return true;
        }
        if(s[i] != s[n-i-1]){
            return false;
        }
        return palindromeString(s, i+1, n);
    }
}
