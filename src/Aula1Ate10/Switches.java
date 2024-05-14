package Aula1Ate10;

public class Switches {
    public static void main(String[] args) {

        //switch = statement that allows a variable to be tested for equality against a list of values

        String dia = "Sexta";

        switch (dia) {
            case "Domingo":
                System.out.println("Hoje é domingo");
                break;
            case "Segunda":
                System.out.println("Hoje é segunda");
                break;
            case "Terça":
                System.out.println("Hoje é terça");
                break;
            case "Quarta":
                System.out.println("Hoje é quarta");
                break;
            case "Quinta":
                System.out.println("Hoje é quinta");
            case "Sexta":
                System.out.println("Hoje é sexta");
                break;
            case "Sabado":
                System.out.println("Hoje é sabado");
                break;
            default:
                System.out.println("Não é um dia");
        }
    }
}
