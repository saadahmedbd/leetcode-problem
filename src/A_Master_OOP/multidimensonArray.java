package A_Master_OOP;

public class multidimensonArray {
    public static void main(String[] args) {

        int num [][] =new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
//        jagged array
        int[][] nums =new int [3][];
        nums[0]=new int[3]; //define size of each column
        nums[1]=new int[4];
        nums[2]=new int[2];
//        for each loop or enhanced for loop

        for (int n[] :nums){
            for (int m:n){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
