package Aula1Ate10;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.max(x, y);
//        System.out.println(z);
//
//        double w = Math.sqrt(x);
//        System.out.println(w);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado x: ");
        x = scanner.nextDouble();
        System.out.println("Digite o lado y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("A hipotenusa é " + z);

        scanner.close();
    }
}
