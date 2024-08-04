package Vistas;

import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel implements ActionListener{
    public JPanel rootPanel;
    public JPanel navBar;
    public JPanel windows;
    public JMenuBar mb;
    public JButton addButton;
    public JComboBox cb;
    public CardLayout cards;

    public Home(){
        cards = new CardLayout();
        rootPanel = new JPanel(new MigLayout("fillx",
                "10[left]r[]10",
                "10[fill]r[]"));
        navBar = new JPanel(new MigLayout("fillx",
                "r[right]r"));
        windows = new JPanel(cards);

        this.add(rootPanel);

        mb = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem nuevo = new JMenu("Nuevo");
        JMenuItem opciones = new JMenu("Opciones");
        archivo.add(nuevo);
        archivo.add(opciones);
        mb.add(archivo);

        rootPanel.add(mb, "span, north, wrap");
        rootPanel.add(navBar, "west");
        rootPanel.add(windows, "east");

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        navBar.add(addButton, "wrap");

        String [] ventanas = {"tarea 1", "tarea 2"};
        cb = new JComboBox(ventanas);
        cb.setSelectedIndex(0);
        cb.addActionListener(this);

        navBar.add(cb, "span 2, left, wrap");

        JPanel tarea1 = new JPanel();
        tarea1.add(new JLabel("Esta es la tarea 1"));
        JPanel tarea2 = new JPanel();
        tarea2.add(new JLabel("Esta es la tarea 2"));

        windows.add(tarea1, "tarea 1");
        windows.add(tarea2, "tarea 2");

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
