package Aula1Ate10;

import javax.swing.JOptionPane;

public class GuiIntro {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Olá, " + nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + " cm ");
    }
}
