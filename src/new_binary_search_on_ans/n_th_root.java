package new_binary_search_on_ans;

public class n_th_root {
    public static void main(String[] args) {
        int n=3, m=9;
        System.out.println(nThRoot(n, m));
    }
    public static int nThRoot(int n, int m){
        for(int i=1;i<=m;i++){
            if(Math.pow(i,n)==m){
                return i;
            }else if(Math.pow(i, n)>m){
                return -1;

            }
        }
        return -1;
    }

}
