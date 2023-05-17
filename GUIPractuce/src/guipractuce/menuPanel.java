package guipractuce;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class menuPanel extends JFrame{
    
    JLabel menu = new JLabel();
    ImageIcon icon = new ImageIcon("EVENTIOicon.png");
    
    JLabel images = new JLabel();
    JLabel images2 = new JLabel();
    JLabel images3 = new JLabel();
    ImageIcon image = new ImageIcon("image-removebg-preview (2).png");
    ImageIcon image1 = new ImageIcon("Food3.jpg");
    ImageIcon image5 = new ImageIcon("Food6.jpg");
    menuBar buttons = new menuBar();

    
    menuPanel()
    {
        
        //images in menu
        images3.setIcon(this.image5);
        images3.setVerticalAlignment(1);
        images3.setHorizontalAlignment(0);
        images3.setBounds(750, 150, 290, 465);
        images3.setVisible(true);

        images2.setIcon(this.image1);
        images2.setVerticalAlignment(1);
        images2.setHorizontalAlignment(0);
        images2.setBounds(25, 150, 325, 465);
        images2.setVisible(true);

        images.setIcon(this.image);
        images.setVerticalAlignment(1);
        images.setHorizontalAlignment(0);
        images.setBounds(230, 150, 636, 465);
        images.setVisible(true);
        
        menu.setVisible(true);
        menu.setIcon(icon);
        menu.setVerticalAlignment(JLabel.TOP);
        menu.setHorizontalAlignment(JLabel.CENTER);
        menu.setBounds(230, 0, 636, 425);
        
        this.setIconImage(icon.getImage());
        this.setTitle("Event.io");
        this.setVisible(true);
        this.setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(buttons);
        this.add(menu);
        this.add(images);
        this.add(images2);
        this.add(images3);
        this.getContentPane().setBackground(new Color(0x123456));
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public class menuBar extends JPanel implements ActionListener{
    
    JButton about = new JButton("About us");
    JButton book = new JButton("Book Reservation");
    JButton events = new JButton("Booked Events");
    JButton cancel = new JButton("Cancel Plans");
    
        menuBar()
        {
            about.setVisible(true);
            about.setFocusable(false);
            about.addActionListener(this);
        
            book.setVisible(true);
            book.setFocusable(false);
            book.addActionListener(this);
        
            events.setVisible(true);
            events.setFocusable(false);
            events.addActionListener(this);
        
            cancel.setVisible(true);
            cancel.setFocusable(false);
            cancel.addActionListener(this);
        
            this.setVisible(true);
            this.setBackground(null);
            this.add(about);
            this.add(book);
            this.add(events);
            this.add(cancel);
            this.setBounds(0, 150, 1080, 100);
            this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(e.getSource() == about)
            {
                aboutus aboutus = new aboutus();
            }
            if(e.getSource() == book)
            {
                try {
                    booking booking = new booking();
                } catch (SQLException ex) {
                    Logger.getLogger(menuPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(e.getSource() == events)
            {
                EventsBooked eventsBooked = new EventsBooked();
            }
            if(e.getSource() == cancel)
            {
                Cancel cancellation = new Cancel();
            }
        }
    }
}
