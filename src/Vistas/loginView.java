package Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginView {
    private JPanel rootPanel;
    private JButton helloButton;
    private JLabel helloLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("loginView");
        frame.setContentPane(new loginView().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public loginView() {
        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helloLabel.setText("Hello World!");
            }
        });
    }
}
