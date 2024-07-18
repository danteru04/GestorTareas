package Vistas;

import javax.swing.*;

public class loginView {
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("loginView");
        frame.setContentPane(new loginView().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
