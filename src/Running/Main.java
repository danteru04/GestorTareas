package Running;

import DB.Usuarios_table;
import Vistas.loginView;
import Vistas.registrationController;
import javax.swing.*;
import java.awt.*;


public class Main{
    public static JFrame frame;
    public static Container cPane;
    public static CardLayout cards;


    public static void main(String[] args) {
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");

        frame = new JFrame("Gestor de Tareas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cPane = frame.getContentPane();
        cards = new CardLayout();
        cPane.setLayout(cards);

        loginView login = new loginView();
        registrationController registro = new registrationController();

        cPane.add("login", login.rootPanel);
        cPane.add("registro", registro.rootPanel);
        cards = (CardLayout) cPane.getLayout();

        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}