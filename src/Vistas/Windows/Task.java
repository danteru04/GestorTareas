package Vistas.Windows;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task extends JPanel implements ActionListener {
    public JPanel rootPanel;
    public MigLayout mig;

    public Task(){
        mig = new MigLayout("fillx",
                "35[]r[]r[]35",
                "30[fill, grow]r[]40");
        rootPanel = new JPanel(mig);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
