package formulariodinamico;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Paneles extends JPanel {
    private JLabel label;
    private JTextField txf;

    public Paneles() {
        this.setLayout(new GridLayout(3, 0, 1, 1));
        this.setSize(200,20);
        this.setBorder(BorderFactory.createLineBorder(Color.yellow));
        this.setBackground(Color.lightGray);
        
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public JTextField getTxf() {
        return txf;
    }

    public void setTxf(JTextField txt) {
        this.txf = txt;
    }
    
    
    
}
