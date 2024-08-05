package Vistas;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JPanel implements ActionListener{
    public JPanel rootPanel;

    public login(){
        rootPanel = new JPanel(new MigLayout("fillx",
                "50[center]rel[grow, fill]50",
                "50[]rel[]20[]10[]"));

        JLabel tituloLabel = new JLabel("GESTOR DE TAREAS");
        JLabel loginLabel = new JLabel("LOGIN");

        JLabel usuarioLabel = new JLabel("Usuario: ");
        JTextField usuarioTF = new JTextField("");
        JLabel contrasenaLabel = new JLabel("Contraseña: ");
        JTextField contrasenaTF = new JTextField("");

        this.add(rootPanel);

        rootPanel.add(tituloLabel, "wrap, span 2");
        rootPanel.add(loginLabel, "wrap, span 2");
        rootPanel.add(usuarioLabel);
        rootPanel.add(usuarioTF, "wrap");
        rootPanel.add(contrasenaLabel);
        rootPanel.add(contrasenaTF, "wrap");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
