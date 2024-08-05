import Vistas.Home;

import javax.swing.*;
import java.awt.*;


class Main{
    public static void main(String[] args) {
        //Usuarios_table conexion = new Usuarios_table();

        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        }
        catch(Exception e){
            System.out.println(e);
        }

        JFrame frame = new JFrame("Gestor de Tareas");
        frame.setContentPane(new Home().rootPanel);
        Home.rootPanel.setMinimumSize(new Dimension(700, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(0,0,0,0));
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Create the GUI on the event-dispatching thread
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (frame.getHeight() < 600 || frame.getWidth() < 700){
                        frame.
                    }
                }
            }
        });*/
    }
}