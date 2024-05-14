package Aula1Ate10;

public class IfStatements {
    public static void main(String[] args) {
        // if statement = perform a block of code if it's condition evaluates to be true

        int idade = 18;

        if (idade == 18) {
            System.out.println("Você pode votar");
        } else if (idade >= 75) {
            System.out.println("Você é idoso");
        } else if (idade >= 13) {
            System.out.println("Você é adolescente");
        } else {
            System.out.println("Voce não pode votar");
        }
    }
}
