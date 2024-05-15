package Aula11Ate20;

public class Arrays {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

//        String[] carros = {"Camaro", "Corvette", "Tesla", "BMW"};
//
//        carros[0] = "Mustang";
//
//        System.out.println(carros[0]);
//        System.out.println(carros[1]);
//        System.out.println(carros[2]);
//        System.out.println(carros[3]);

        String[] carros = new String[3];

        carros[0] = "Camaro";
        carros[1] = "Corvette";
        carros[2] = "Tesla";

//        System.out.println(carros[0]);
//        System.out.println(carros[1]);
//        System.out.println(carros[2]);

        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }
    }
}
