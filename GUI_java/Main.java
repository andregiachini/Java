package GUI_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela de exemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton botao1 = new JButton("Botão 1");
        botao1.addActionListener(evt -> System.out.println("clicouuuuuuuuuuu!!!"));
        frame.getContentPane().add(botao1);

        frame.setVisible(true);

        

    }
}