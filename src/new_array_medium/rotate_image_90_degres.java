package new_array_medium;

public class rotate_image_90_degres {

    public static void rotate(int[][] metrix){
        for(int i=0;i<metrix.length;i++){
            for(int j=i;j<metrix.length;j++){
                int temp=0;
                temp=metrix[i][j];
                metrix[i][j]=metrix[j][i];
                metrix[j][i]=temp;

            }
        }
        for(int i=0;i<metrix.length;i++){
            for(int j=0;j<metrix.length/2;j++){
                int temp=0;
                temp=metrix[i][j];
                metrix[i][j]=metrix[i][metrix.length-1-j];
                metrix[i][metrix.length-1-j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
