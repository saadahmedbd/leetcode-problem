package Extra;

import java.util.Random;

public class Random_number_generate {
    public static void main(String[] args) {
        Random random =new Random();
        int randomInt =random.nextInt(14);
        System.out.println(randomInt);
    }
}
