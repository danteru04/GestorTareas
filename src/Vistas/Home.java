package Vistas;

import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel implements ActionListener{
    public JPanel rootPanel;
    public JPanel navBar;
    public static JPanel windows;
    private JMenuBar mb;
    public JButton addButton;
    public JComboBox cb;
    public static CardLayout cards;

    public Home(){
        cards = new CardLayout();
        rootPanel = new JPanel(new MigLayout("fill, wrap",
                "10[fill][grow, fill]10",
                "15[][fill, grow]")) {
            @Override
            public void paintComponent(Graphics g) {
                Paint p =
                        new GradientPaint(0.0f, 0.0f, new Color(240, 240, 240, 0),
                                0.0f, getHeight(), new Color(240, 240, 240, 255), true);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(p);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        navBar = new JPanel(new MigLayout("fill, insets 10, wrap",
                "[]",
                "15[][]"));
        windows = new JPanel(cards);

        rootPanel.setMinimumSize(new Dimension(610, 610));
        this.add(rootPanel);

        mb = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem nuevo = new JMenu("Nuevo");
        JMenuItem opciones = new JMenu("Opciones");
        archivo.add(nuevo);
        archivo.add(opciones);
        mb.add(archivo);

        rootPanel.add(mb, "north");
        rootPanel.add(navBar,"width 200:300:300") ;
        rootPanel.add(windows, "span, width 450:500:1100");


        addButton = new JButton("Add");
        addButton.addActionListener(this);

        navBar.add(addButton, "wrap, align right");

        String [] ventanas = {"tarea 1", "tarea 2"};
        cb = new JComboBox(ventanas);
        cb.setSelectedIndex(0);
        cb.addActionListener(this);

        navBar.add(cb, "span, growx, width 150:192:400");

        JPanel tarea1 = new JPanel();
        tarea1.add(new JLabel("Esta es la tarea 1"));
        JPanel tarea2 = new JPanel();
        tarea2.add(new JLabel("Esta es la tarea 2"));

        windows.add(tarea1, "tarea 1");
        windows.add(tarea2, "tarea 2");
        JLabel contacto = new JLabel("Contacto: dante.isaac.ru@hotmail.com");
        rootPanel.add(contacto, "south, align right, gapright push");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.addButton){
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
        if (e.getSource() == this.cb){
            cards.show(this.windows, (String)this.cb.getSelectedItem());
            System.out.println(this.cb.getSelectedItem());
        }
    }
}
