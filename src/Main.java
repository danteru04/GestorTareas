import DB.Usuarios_table;
import Vistas.loginView;

import javax.swing.*;


class Main{
    public static void main(String[] args) {
        /*UIManager.LookAndFeelInfo info[] = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo look: info)
            System.out.println(look.getClassName());*/

        Usuarios_table conexion = new Usuarios_table();

        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        JFrame frame = new JFrame("Gestor de Tareas");
        frame.setContentPane(new loginView().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}