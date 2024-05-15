package Aula11Ate20;

public class Arrays2D {
    public static void main(String[] args) {

        //2D Arrays = an array of arrays

        String[][] carros = {{"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lamborghini", "Tesla"}};

//        carros[0][0] = "Camaro";
//        carros[0][1] = "Corvette";
//        carros[0][2] = "Silverado";
//        carros[1][0] = "Mustang";
//        carros[1][1] = "Ranger";
//        carros[1][2] = "F-150";
//        carros[2][0] = "Ferrari";
//        carros[2][1] = "Lamborghini";
//        carros[2][2] = "Tesla";

        for (int i = 0; i < carros.length; i++) {
            System.out.println();
            for (int j = 0; j < carros[i].length; j++) {
                System.out.print(carros[i][j] + " ");
            }
        }
    }
}
