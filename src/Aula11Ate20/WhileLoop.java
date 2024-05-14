package Aula11Ate20;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//        while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String nome = "";

//        while (nome.isBlank()) {
//            System.out.println("Digite seu nome: ");
//            nome = scanner.nextLine();
//        }
//        System.out.println("Olá, " + nome);

        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
        } while (nome.isBlank());
        System.out.println("Olá, " + nome);
    }
}
