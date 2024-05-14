package Aula11Ate20;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions

        // && = (AND) both conditionals must be true
        // || = (OR) either conditional must be true
        // ! = (NOT) reverses boolean value of condition

//        int temp = 20;
//
//        if (temp > 30) {
//            System.out.println("Está muito quente lá fora");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("Está agradavel lá fora");
//        } else {
//            System.out.println("Está frio lá fora");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está jogndo um jogo! Aperta q ou Q para sair");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("Voce está no jogo");
        } else {
            System.out.println("Você saiu do jogo");
        }
    }
}
