package Vistas;

import DB.Usuarios_table;
import Running.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginView extends JPanel
    {
    public JPanel rootPanel;
    private JLabel tituloLabel;
    private JTextField usuarioTextfield;
    private JButton entrarButton;
    private JLabel usuarioLabel;
    private JLabel passwordLabel;
    private JTextField passwordTextfield;
    private JLabel mensajeLabel;
    private JLabel registrationLabel;

        public loginView() {
            Usuarios_table conexion = new Usuarios_table();

            registrationLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    Main.cards.show(Main.cPane, "registro");
                }
            });
        }

}
