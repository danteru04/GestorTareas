package Vistas.Windows;

import DB.Usuarios_table;
import Vistas.Home;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavBar extends JPanel implements ActionListener {
    public JPanel rootPanel;
    public JButton addButton;
    public JComboBox cb;

    public NavBar(){
        rootPanel = new JPanel(new MigLayout(
            "fillx, wrap, insets 5",
            "[]",
            "[][]")) {
            @Override
            protected void paintComponent(Graphics g) {
                Paint p = new GradientPaint(
                        0.0f, 0.0f, new Color(85, 255, 0, 0),
                        getWidth(), getHeight(), new Color(102, 255, 255, 0), true
                );
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(p);
                g2d.fillRect(0,0, getWidth(), getHeight());
            }
        };

        Border border = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK),
                "Navigation Bar",
                1,
                0,
                new Font("DIALOG",1, 13),
                Color.BLACK);
        rootPanel.setBorder(border);

        this.add(rootPanel);

        addButton = new JButton("Agregar");
        addButton.addActionListener(this);

        String [] ventanas = {"tarea 1", "tarea 2"};
        cb = new JComboBox(ventanas);
        cb.setSelectedIndex(0);
        cb.addActionListener(this);

        rootPanel.add(addButton, "align right");
        rootPanel.add(cb, "align left, growx, span");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.addButton){
            Usuarios_table conexion = new Usuarios_table();
        }
        if (e.getSource() == this.cb){
            Home.cards.show(Home.windows, (String)this.cb.getSelectedItem());
            System.out.println(this.cb.getSelectedItem());
        }
    }
}
