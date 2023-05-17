package guipractuce;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class aboutus implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();
    JLabel label9 = new JLabel();
    JLabel label10 = new JLabel();
    JLabel label11 = new JLabel();
    JLabel label12 = new JLabel();
    JLabel label13 = new JLabel();

    JLabel label14 = new JLabel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JButton button = new JButton();
    Color bg = new Color(1193046);

    JTextArea text = new JTextArea(100,25);
    JScrollPane pane;
    ImageIcon image = new ImageIcon("GFood.png");
    aboutus() {

        label1.setText("EVENT");
        label1.setBounds(400, 20, 1000, 100);
        label1.setFont(new Font(" Times New Roman", 0, 40));
        label1.setForeground(new Color(250, 250, 250));

        label2.setText("IO");
        label2.setBounds(550, 40, 350, 50);
        label2.setFont(new Font(" Times New Roman", 1, 60));
        label2.setForeground(new Color(250, 250, 250));

        label3.setText(" About Us ");
        label3.setBounds(455, 59, 350, 100);
        label3.setFont(new Font(" Arial", 0, 25));
        label3.setForeground(new Color(0));

        label4.setText(" Your Choice, ");
        label4.setBounds(430, 62, 350, 170);
        label4.setFont(new Font("Times New Roman", 0, 25));
        label4.setForeground(new Color(250, 250, 250));

        label5.setText("Our Move");
        label5.setBounds(440, 59, 350, 245);
        label5.setFont(new Font("Times New Roman", 0, 25));
        label5.setForeground(new Color(0, 153, 51));

        label6.setText("Notice: We don't Cater Reservation that is 2 days before the event");
        label6.setBounds(325, 68, 400, 290);
        label6.setFont(new Font("Tahoma", 2, 13));
        label6.setForeground(new Color(250, 250, 250));

        label7.setText("Mission: Our mission is to provide excellent catering solutions that meet diverse");
        label7.setBounds(263, 75, 550, 350);
        label7.setFont(new Font("Times New Roman", 0, 15));

        label8.setText("needs while promoting sustainability and social responsibility.");
        label8.setBounds(327, 75, 550, 400);
        label8.setFont(new Font("Times New Roman", 0, 15));

        label9.setText("Vision: Our vision is to become the leading catering service by providing exceptional");
        label9.setBounds(263, 90, 550, 450);
        label9.setFont(new Font("Times New Roman", 0, 15));

        label10.setText("nal food, outstanding service, and innovative solutions");
        label10.setBounds(318, 140, 550, 400);
        label10.setFont(new Font("Times New Roman", 0, 15));

        label11.setText("Goals: Our goal is to provide a consistently excellent catering experience that");
        label11.setBounds(263, 155, 550, 450);
        label11.setFont(new Font("Times New Roman", 0, 15));

        label12.setText("exceeds our customers' expectations, every time");
        label12.setBounds(318, 205, 550, 400);
        label12.setFont(new Font("Times New Roman", 0, 15));

        label14.setVisible(true);
        label14.setText("<html>" + //next line in JLabel <html>....<br/>......</html>
                        "   When it comes to catering, the quality of the food is of utmost importance. Our" +
                        "<br/>" +
                        "team of highly skilled chefs uses only the freshest ingredients to create mouthwatering " +
                        "<br/>" +
                        "dishes that are sure to delight your taste buds. Whether you prefer classic dishes or " +
                        "<br/>" +
                        "something more innovative, we can tailor our menu to meet your specific needs and preferences." +
                        "<br/><br/>" +
                        "   One of the key benefits of EventIO is the flexibility it offers. You can easily" +
                        "<br/>" +
                        "modify your order as per your need and track every aspect of your event from start to" +
                        "<br/> " +
                        "finish. Our intuitive interface makes it easy for you to manage every detail of your" +
                        "<br/>" +
                        "event, including selecting the menu, decorations, and other event needs. " +
                        "<br/><br/>" +
                        "   So why should you choose us for your next event? Because we are dedicated to providing" +
                        "<br/>" +
                        "you with the best possible catering experience, from start to finish. We guarantee that" +
                        "<br/>" +
                        "your guests will be impressed with the quality of the food and the level of service that" +
                        "<br/>" +
                        "we provide." +
                        "<br/><br/>" +
                        "   By choosing EventIO, you'll also be able to save time and money. With the power to customize" +
                        "<br/>" +
                        "your event on your own, you no longer need to pay a coordinator to manage your event for you." +
                        "<br/>" +
                        "This will significantly reduce the cost of your event, freeing up funds for other party needs." +
                        "<br/>" +
                        "Plus, with the added convenience of being able to manage your event anywhere and anytime," +
                        "<br/>" +
                        "you'll be able to save time and effort without sacrificing quality. EventIO is more than just" +
                        "<br/>" +
                        "an online catering system – it's a tool that empowers you to take control of your event planning." +
                        "<br/>" +
                        "With its user-friendly interface and flexible customization options, you'll be able to create " +
                        "<br/>" +
                        "the perfect party without any hassle. So, say goodbye to the stress of event planning and hello" +
                        "<br/>" +
                        "to a successful and memorable event with EventIO." +
                        "<br/><br/>" +
                        "For inquiries and reservation you can connect us here:" +
                        "<br/><br/>" +
                        "Fb page:   EventIo(Catering Service)" +
                        "<br/>" +
                        "Contact #: 0998 615 0212 || 0946 848 5671" +
                        "<br/>" +
                        "Email:     eventIo123@gmail.com</html>");
        label14.setForeground(new Color(0XFFFFFF));
        label14.setBounds(50, 500, 700,1000);
        label14.setFont(new Font("Times New Roman",0, 15));
        label14.setIcon(image);
//        this.label13.setText("Rating:");
//        this.label13.setBounds(250, 250, 550, 400);
//        this.label13.setFont(new Font("Times New Roman", 0, 23));
//        this.label13.setForeground(new Color(250, 250, 250));
//        JLabel stars = new JLabel();
//        stars.setText("\ud83c\udf1f\ud83c\udf1f\ud83c\udf1f\ud83c\udf1f⭐");
//        stars.setFont(new Font((String)null, 0, 40));
//        stars.setVisible(true);
//        stars.setBounds(0, 0, 500, 40);

        panel1.setBounds(420, 97, 190, 30);
        panel1.setBackground(new Color(255, 102, 102));
        panel1.setLayout((LayoutManager)null);

        panel2.setBounds(250, 235, 559, 60);
        panel2.setBackground(new Color(204, 255, 204));
        panel2.setLayout((LayoutManager)null);

        panel3.setBounds(250, 300, 559, 60);
        panel3.setBackground(new Color(204, 255, 204));
        panel3.setLayout((LayoutManager)null);

        panel4.setBounds(250, 367, 559, 60);
        panel4.setBackground(new Color(204, 255, 204));
        panel4.setLayout((LayoutManager)null);

        panel5.setBounds(250, 480, 559, 3);
        panel5.setBackground(Color.BLACK);
        panel5.setLayout((LayoutManager)null);
//        this.panel6.setBounds(250, 490, 559, 60);
////        this.panel6.add(stars);
//        this.panel6.setBackground(new Color(0, 255, 255));
//        this.panel6.setLayout((LayoutManager)null);
        panel7.setBounds(250, 130, 559, 4);
        panel7.setBackground(Color.BLACK);
        panel7.setLayout((LayoutManager)null);

        button.setBounds(400, 1500, 300, 50);
        button.setText("Return");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", 1, 23));
        button.setForeground(new Color(250, 250, 250));
        button.setBackground(new Color(178, 34, 34));
        button.addActionListener(this);

        frame.setSize(1080, 740);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.getContentPane().setBackground(this.bg);

        text.add(label1);
        text.add(label2);
        text.add(label3);
        text.add(label4);
        text.add(label5);
        text.add(label6);
        text.add(label7);
        text.add(label8);
        text.add(label9);
        text.add(label10);
        text.add(label11);
        text.add(label12);
        text.add(label13);
        text.add(label14);

        text.add(panel1);
        text.add(panel2);
        text.add(panel3);
        text.add(panel4);
        text.add(panel5);
        text.add(panel6);
        text.add(panel7);
        text.add(button);

//        text.add(label1);
//        text.add(label2);
//        text.add(label3);
//        text.add(label4);
        text.setBackground(new Color(0X1193046));
        text.setFocusable(false);
        text.setLocation(10,50);

        pane = new JScrollPane(text);
//        pane.setBounds(10,10,50,50);
        pane.setVisible(true);

        frame.add(pane);
        frame.setSize(1080,740);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
        }
    }
}