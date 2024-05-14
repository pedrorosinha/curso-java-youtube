package Aula11Ate20;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loops = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int linhas, colunas;
        String simbolo = "";

        System.out.println("Digite a # de linhas: ");
        linhas = scanner.nextInt();

        System.out.println("Digite a # de colunas: ");
        colunas = scanner.nextInt();

        System.out.println("Digite o simbolo que vai usar: ");
        simbolo = scanner.next();

        for (int i = 1; i <= linhas; i++) {
            System.out.println();
            for (int j = 1; j <= colunas; j++) {
                System.out.print(simbolo);
            }
        }

    }
}
