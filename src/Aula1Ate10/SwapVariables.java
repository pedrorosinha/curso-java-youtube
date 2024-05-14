package Aula1Ate10;

public class SwapVariables {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Coca-Cola";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
