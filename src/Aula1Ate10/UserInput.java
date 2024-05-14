package Aula1Ate10;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual é a sua comida preferida? ");
        String comida = scanner.nextLine();

        System.out.println("Olá, " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("A sua comida preferida é " + comida);
    }
}
