package guipractuce;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventsBooked extends JFrame{
    
    JLabel logo = new JLabel();
    ImageIcon icon = new ImageIcon("EVENTIOicon.png");
    
    EventsBooked()
    {
        logo.setVisible(true);
        logo.setIcon(icon);
        logo.setVerticalAlignment(JLabel.TOP);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setBounds(230, 0, 636, 425);
        
        this.setIconImage(icon.getImage());
        this.setTitle("Event.io");
        this.setVisible(true);
        this.setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(logo);
        this.getContentPane().setBackground(new Color(0x123456));
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
