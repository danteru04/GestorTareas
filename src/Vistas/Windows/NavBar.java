package Vistas.Windows;

import Vistas.Home;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavBar extends JPanel implements ActionListener {
    public JPanel rootPanel;
    public JButton addButton;
    public JComboBox cb;

    public NavBar(){
        rootPanel = new JPanel(new MigLayout(
            "fill, wrap, insets 10",
            "[right]",
            "15[][]")) {
            @Override
            protected void paintComponent(Graphics g) {
                Paint p = new GradientPaint(
                        0.0f, 0.0f, new Color(85, 255, 0, 140),
                        getWidth(), getHeight(), new Color(102, 255, 255, 140), true
                );
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(p);
                g2d.fillRect(0,0, getWidth(), getHeight());
            }
        };

        this.add(rootPanel);

        addButton = new JButton("Agregar");
        addButton.addActionListener(this);
        rootPanel.add(addButton);

        String [] ventanas = {"tarea 1", "tarea 2"};
        cb = new JComboBox(ventanas);
        cb.setSelectedIndex(0);
        cb.addActionListener(this);
        rootPanel.add(cb);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.addButton){
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
        if (e.getSource() == this.cb){
            Home.cards.show(Home.windows, (String)this.cb.getSelectedItem());
            System.out.println(this.cb.getSelectedItem());
        }
    }
}
