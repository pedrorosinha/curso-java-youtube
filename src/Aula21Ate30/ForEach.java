package Aula21Ate30;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

        // For-Each = traversing technique to iterate through the elements in a array/collection
        // less steps, more readable
        // less flexible

        // String[] animais = {"gato", "cachorro", "rato", "pássaro"}
        ArrayList<String> animais = new ArrayList<String>();

        animais.add("gato");
        animais.add("cachorro");
        animais.add("rato");
        animais.add("pássaro");

        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}
