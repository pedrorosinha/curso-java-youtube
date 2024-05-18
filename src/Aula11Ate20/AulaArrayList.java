package Aula11Ate20;

import java.util.ArrayList;

public class AulaArrayList {
    public static void main(String[] args) {

        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> comidas = new ArrayList<String>();

        comidas.add("Pizza");
        comidas.add("Hamburger");
        comidas.add("Cachorro Quente");

        comidas.set(0, "Sushi");
        comidas.remove(2);
//        comidas.clear();

        for (int i = 0; i < comidas.size(); i++) {
            System.out.println(comidas.get(i));
        }

    }
}
