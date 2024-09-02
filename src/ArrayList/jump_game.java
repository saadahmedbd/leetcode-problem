package ArrayList;

public class jump_game {
    public static void main(String[] args) {
        int nums[] ={3, 2, 1,0,4};
        System.out.println(jumpGame(nums));
    }
    public static boolean jumpGame(int nums[]){
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(i>l){
                return false;
            }
            l=Math.max(l,i+ nums[i]);
        }
        return true;
    }
}
