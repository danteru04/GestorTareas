import Vistas.Home;

import javax.swing.*;


class Main{
    public static void main(String[] args) {
        /*UIManager.LookAndFeelInfo info[] = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo look: info)
            System.out.println(look.getClassName());*/

        //Usuarios_table conexion = new Usuarios_table();

        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        }
        catch(Exception e){
            System.out.println(e);
        }

        JFrame frame = new JFrame("Gestor de Tareas");
        //frame.setContentPane(new login().rootPanel);
        frame.setContentPane(new Home().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setUndecorated(true);
        frame.setSize(1366, 768);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}