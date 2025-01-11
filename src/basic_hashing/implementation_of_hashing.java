package basic_hashing;

import java.util.Scanner;

public class implementation_of_hashing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n;
        n=sc.nextInt();
        int[] array =new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
//        pre compute
        int [] hash =new int[13];
        for (int i=0;i<n;i++){
            hash[array[i]] += 1;
        }
        int q;
        q=sc.nextInt();
        while (q-- != 0){
            int number;
            number=sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
