package Vistas;

import javax.swing.*;
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
            registrationLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);

                }
            });
        }

}
