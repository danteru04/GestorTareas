package Vistas;

import Vistas.Windows.NavBar;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel implements ActionListener{
    public static JPanel rootPanel;
    public static JPanel windows;
    private JMenuBar mb;
    public static CardLayout cards;

    public Home(){
        cards = new CardLayout();
        rootPanel = new JPanel(new MigLayout("fill, wrap",
                "10[fill][fill, grow]10",
                "15[][]")) {
            @Override
            public void paintComponent(Graphics g) {
                Paint p =
                        new GradientPaint(0.0f, 0.0f, new Color(240, 240, 240, 150),
                                0.0f, getHeight(), new Color(240, 240, 240, 255), true);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(p);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        windows = new JPanel(cards);

        //rootPanel.setMinimumSize(new Dimension(610, 610));
        this.add(rootPanel);

        mb = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem nuevo = new JMenu("Nuevo");
        JMenuItem opciones = new JMenu("Opciones");
        archivo.add(nuevo);
        archivo.add(opciones);
        mb.add(archivo);

        rootPanel.add(mb, "north");
        rootPanel.add(new NavBar().rootPanel,"grow, width 200:300:300, h 100%") ;
        rootPanel.add(windows, "span, grow, width 450:500:1100");

        JPanel tarea1 = new JPanel();
        tarea1.add(new JLabel("Esta es la tarea 1"));
        JPanel tarea2 = new JPanel();
        tarea2.add(new JLabel("Esta es la tarea 2"));

        windows.add(tarea1, "tarea 1");
        windows.add(tarea2, "tarea 2");
        JLabel contacto = new JLabel("Contacto: dante.isaac.ru@hotmail.com");
        rootPanel.add(contacto, "gaptop push, gapleft push, align right, span 2");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
