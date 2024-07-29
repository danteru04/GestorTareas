package Running;

import DB.Usuarios_table;
import Vistas.loginView;

import javax.swing.*;
import java.awt.*;


public class Main{
    public static JFrame frame;
    static JPanel cards;


    public static void main(String[] args) {
        Usuarios_table conexion = new Usuarios_table();

        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        frame = new JFrame("Gestor de Tareas");
        cards = new JPanel(new CardLayout());
        //frame.setContentPane(new loginView().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}