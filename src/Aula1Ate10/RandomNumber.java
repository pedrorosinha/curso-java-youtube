package Aula1Ate10;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

//        int x = random.nextInt(6)+1;  1 a 6
//        double y = random.nextDouble();  0 a 1
        boolean z = random.nextBoolean(); // true ou false
        System.out.println(z);
    }
}
