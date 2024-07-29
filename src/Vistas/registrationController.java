package Vistas;

import Running.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registrationController extends JPanel{
    public JPanel rootPanel;
    private JTextField nombreTF;
    private JTextField ap_paterno;
    private JTextField ap_materno;
    private JTextField email;
    private JTextField password;
    private JButton registrarseButton;
    private JButton regresarButton;

    public registrationController(){

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.remove(Main.frame.getContentPane());
                Main.frame.invalidate();
                Main.frame.validate();
            }
        });


    }

}
