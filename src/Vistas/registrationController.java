package Vistas;

import DB.Usuarios_table;
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

        Usuarios_table conexion = new Usuarios_table();

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.cards.show(Main.cPane, "login");
            }
        });

        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Main.cards.;
            }
        });
    }

}
