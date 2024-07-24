package Vistas;

import javax.swing.*;
import java.awt.*;

public class loginView //extends JPanel
    {
    private JPanel rootPanel;
    private JLabel tituloLabel;
    private JTextField usuarioTextfield;
    private JButton entrarButton;
    private JLabel usuarioLabel;
    private JLabel passwordLabel;
    private JTextField passwordTextfield;
    private JLabel mensajeLabel;

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//        int w = getWidth(), h = getHeight();
//        Color color1 = Color.RED;
//        Color color2 = Color.GREEN;
//        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
//        g2d.setPaint(gp);
//        g2d.fillRect(0, 0, w, h);
//    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        JFrame frame = new JFrame("loginView");
        frame.setContentPane(new loginView().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setUndecorated(true);
        frame.setOpacity(0);
        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                JFrame frame = new JFrame();
//                loginView panel = new loginView();
//                frame.add(panel);
//                frame.setSize(200, 200);
//                frame.setLocationRelativeTo(null);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
//            }
//        });
//    }

}
