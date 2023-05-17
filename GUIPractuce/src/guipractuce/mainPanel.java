package guipractuce;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainPanel extends JFrame implements ActionListener {
    
    JButton button = new JButton();
    Intro intro = new Intro();
    
    mainPanel(Color bg,ImageIcon icon,int W,int H)
    {
        
        button.setBounds(132, 430, 800, 100);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setText("Book Reservation");
        button.setFont(new Font("Times New Roman",Font.BOLD,40));
        button.setForeground(new Color(250,250,250));
        button.setBackground(new Color(178,34,34));
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(this);
        
        this.setIconImage(icon.getImage());
        this.setTitle("Event.io");
        this.setVisible(true);
        this.setSize(W, H);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(button);
        this.add(intro);
        this.getContentPane().setBackground(bg);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == button)
        {
//            ADMINCHECKER checker = new ADMINCHECKER();
//            checker.check();
            menuPanel menuPanel = new menuPanel();
            this.dispose();
        }
        
    }
    public class Intro extends JLabel{
    
    Intro()
    {
        
        ImageIcon logo = new ImageIcon("EVENTIOlogo.png");
        this.setText("Your Choice, Our Move");
        this.setIcon(logo);
        
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.BOTTOM);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setForeground(new Color(0xFFFFFF));
        this.setFont(new Font("Times New Roman",Font.BOLD,45));
        this.setIconTextGap(0);
        this.setBounds(230,0, 636, 425);
        this.setVisible(true);
    }
}
}
