package guipractuce;

import java.awt .*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing .*;

    public class Cancel{
        
        Cancel(){

            new frame1();

        }

        public static class frame1 implements ActionListener{
            JFrame frame = new JFrame();
            JButton button_proceed = new JButton();


            JTextField text_name = new JTextField();
           JTextField text_address = new JTextField();
           JTextField text_email = new JTextField();
            JTextField text_contact = new JTextField();
            JTextField text_dateEvent = new JTextField();
            frame1() {
                /********************* label set-up *********************/
                JLabel label_1m = new JLabel();
                JLabel label_2m = new JLabel();
                JLabel label_3m = new JLabel();
                JLabel label_name = new JLabel();
                JLabel label_address = new JLabel();
                JLabel label_email = new JLabel();
                JLabel label_contact = new JLabel();
                JLabel label_eventType = new JLabel();
                JLabel label_dateEvent = new JLabel();

                label_1m.setText(" EVENT ");
                label_1m.setForeground(new Color(0XFFFFFF));
                label_1m.setBounds(390, 15, 500, 100);
                label_1m.setFont(new Font("Times New Roman", Font.PLAIN, 40));

                label_2m.setText(" IO ");
                label_2m.setBounds(549, 10, 1000, 100);
                label_2m.setFont(new Font("Times New Roman", Font.BOLD, 60));

                label_3m.setText(" Cancellation Process ");
                label_3m.setBounds(436, 59, 1000, 100);
                label_3m.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                label_3m.setForeground(Color.white);

                label_name.setText(" Name: ");
                label_name.setForeground(new Color(0XFFFFFF));
                label_name.setBounds(50, 110, 1000, 100);
                label_name.setFont(new Font("Times New Roman", Font.PLAIN, 20));


                label_address.setText(" Address: ");
                label_address.setForeground(new Color(0XFFFFFF));
                label_address.setBounds(50, 190, 1000, 100);
                label_address.setFont(new Font("Times New Roman", Font.PLAIN, 20));

                label_email.setText(" Email: ");
                label_email.setForeground(new Color(0XFFFFFF));
                label_email.setBounds(50, 270, 1000, 100);
                label_email.setFont(new Font("Times New Roman", Font.PLAIN, 20));

                label_contact.setText(" Contact Number: ");
                label_contact.setForeground(new Color(0XFFFFFF));
                label_contact.setBounds(50, 348, 1000, 100);
                label_contact.setFont(new Font("Times New Roman", Font.PLAIN, 20));

                label_eventType.setText(" Event Type: ");
                label_eventType.setForeground(new Color(0XFFFFFF));
                label_eventType.setBounds(50, 425, 1000, 100);
                label_eventType.setFont(new Font("Times New Roman", Font.PLAIN, 20));

                label_dateEvent.setText(" Date of Event: ");
                label_dateEvent.setForeground(new Color(0XFFFFFFF));
                label_dateEvent.setBounds(50, 502, 1000, 100);
                label_dateEvent.setFont(new Font("Times New Roman", Font.PLAIN, 20));

                /********************* Text set-up *********************/

                text_name.setBounds(50, 176, 980, 40);
                text_name.setBackground(Color.lightGray);
                text_name.setFont(new Font(" Arial", Font.BOLD, 20));
                text_name.setForeground(Color.BLACK);
                String name = text_name.getText();
                System.out.println("Name: " + name);

                text_address.setBounds(50, 254, 980, 40);
                text_address.setBackground(Color.lightGray);
                text_address.setFont(new Font(" Arial", Font.BOLD, 20));
                text_address.setForeground(Color.BLACK);


                text_email.setBounds(50, 334, 980, 40);
                text_email.setBackground(Color.lightGray);
                text_email.setFont(new Font(" Arial", Font.BOLD, 20));
                text_email.setForeground(Color.BLACK);


                text_contact.setBounds(50, 414, 980, 40);
                text_contact.setBackground(Color.lightGray);
                text_contact.setFont(new Font(" Arial", Font.BOLD, 20));
                text_contact.setForeground(Color.BLACK);

                text_dateEvent.setBounds(50, 568, 980, 40);
                text_dateEvent.setBackground(Color.lightGray);
                text_dateEvent.setFont(new Font(" Arial", Font.BOLD, 20));
                text_dateEvent.setForeground(Color.BLACK);

                /********************* Panel set-up 3rd message *********************/
                JPanel panel_3m = new JPanel();
                panel_3m.setBounds(420, 89, 200, 40);
                panel_3m.setBackground(new Color(221, 75, 75));

                /********************* Panel set-up of Event Type *********************/
                JPanel panel_EventType = new JPanel();
                panel_EventType.setBounds(50, 490, 980, 40);
                panel_EventType.setBackground(Color.lightGray);
                panel_EventType.setLayout(new BorderLayout());

                String[] eventTypes = {"     ", " Birthday Party", " Wedding", " Corporate Event", " Other"};

                JComboBox<String> comboBox_eventype = new JComboBox<String>(eventTypes);
                comboBox_eventype.setSize(990, 45);
                comboBox_eventype.setFont(new Font(" Arial", Font.BOLD, 20));
                comboBox_eventype.setForeground(Color.BLACK);
                comboBox_eventype.setBackground(Color.lightGray);

                panel_EventType.add(comboBox_eventype, BorderLayout.CENTER);

                /********************* Panel set-up Date Event *********************/


                /********************* Button set-up *********************/

                button_proceed.addActionListener(this);
                button_proceed.setBounds(382, 619, 300, 60);
                button_proceed.setText("Proceed");
                button_proceed.setFont(new Font("Arial", Font.BOLD, 22));
                button_proceed.setBackground(Color.lightGray);
                frame.add(button_proceed);



                /********************* Frame set-up *********************/

                frame.getContentPane().setBackground(new Color(1193046));
                frame.setSize(1080, 740); // dimension
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


                //********************* Add to frame set-up *********************/
                //labels
                frame.add(label_1m);
                frame.add(label_2m);
                frame.add(label_3m);
                frame.add(label_name);
                frame.add(label_address);
                frame.add(label_email);
                frame.add(label_contact);
                frame.add(label_eventType);
                frame.add(label_dateEvent);

                //panels
                frame.add(panel_3m);
                frame.add(panel_EventType);


                //text
                frame.add(text_name);
                frame.add(text_address);
                frame.add(text_email);
                frame.add(text_contact);
                frame.add(text_dateEvent);

                //button

                frame.setLayout(null);
                frame.setVisible(true);
            }
            String input = text_address.getText();
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == this.button_proceed) {
//                    frame.dispose();
                    frame2 frame2 = new frame2(frame);
                }
            }
        }

        public static class frame2 extends JFrame implements ActionListener {
            JFrame frame2 = new JFrame();
            JButton button_proceed2f = new JButton();
            JButton button_cancel2f = new JButton();
            JFrame frame1;
            frame2(JFrame frame){

                frame1 = frame;
                /*********** second frame label set-up ***********/
                JLabel label_cancelmesage = new JLabel();
                label_cancelmesage.setText("Are you sure you want to Cancel ? ");
                label_cancelmesage.setForeground(new Color(0XFFFFFF));
                label_cancelmesage.setBounds(98, 00, 600, 150);
                label_cancelmesage.setFont(new Font("Times New Roman", Font.ITALIC, 40));

                /*********** second frame Button set-up ***********/
                this.button_proceed2f.setBounds(98, 160, 280, 40);
                this.button_proceed2f.setText("Proceed");
                this.button_proceed2f.setFont(new Font("Arial", Font.BOLD, 22));
                this.button_proceed2f.setBackground(Color.lightGray);
                this.button_proceed2f.setBackground(Color.lightGray);
                this.button_proceed2f.addActionListener(this);


                /*********** Button for cancel in third frame ***********/
                this.button_cancel2f.setBounds(500, 160, 280, 40);
                this.button_cancel2f.setText("Cancel");
                this.button_cancel2f.setFont(new Font("Arial", Font.BOLD, 22));
                this.button_cancel2f.setBackground(new Color(0, 242, 222));
                this.button_cancel2f.addActionListener(this);



                /*********** second frame Frame set-up ***********/

                this.frame2.getContentPane().setBackground(new Color(1193046));
                this.frame2.add(label_cancelmesage);
                this.frame2.add(button_proceed2f);
                this.frame2.add(button_cancel2f);
                this.frame2.setBounds(100, 290, 900, 400);
                this.frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.frame2.setLayout(null);
                this.frame2.setVisible(true);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == this.button_proceed2f){
                    
                    frame1.dispose();
                    frame2.dispose();
                    new frame3();
                }
                else if(e.getSource() == this.button_cancel2f){
                    frame2.dispose();
                }
            }
        }

        public static class frame3 implements ActionListener{
            JButton button_return3f = new JButton();
            JFrame frame3 = new JFrame();

            frame3(){
                /*********** Third frame Label set-up ***********/
                JLabel label_proceed1m = new JLabel();
                label_proceed1m.setText(" EVENTO ");
                label_proceed1m.setBounds(300, 15, 1000, 100);
                label_proceed1m.setFont(new Font("Times New Roman", Font.PLAIN, 40));

                JLabel label_proceed2m = new JLabel();
                label_proceed2m.setText(" IO ");
                label_proceed2m.setBounds(455, 10, 1000, 100);
                label_proceed2m.setFont(new Font("Times New Roman", Font.BOLD, 60));

                JLabel label_proceed3m = new JLabel();
                label_proceed3m.setText(" Book Cancelled! ");
                label_proceed3m.setBounds(140, 110, 1000, 100);
                label_proceed3m.setFont(new Font("Times New Roman", Font.PLAIN, 90));

                /*********** Third frame Button set-up ***********/
                this.button_return3f.setBounds(290, 250, 280, 40);
                this.button_return3f.setText("RETURN");
                this.button_return3f.setFont(new Font("Arial", Font.BOLD, 19));
                this.button_return3f.setBackground(new Color(0, 242, 222));
                this.button_return3f.addActionListener(this);


                /*********** Third frame set-up ***********/
                frame3.setBounds(100, 290, 900, 400);
                frame3.add(label_proceed1m);
                frame3.add(label_proceed2m);
                frame3.add(label_proceed3m);
                frame3.add(button_return3f);
                frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame3.setLayout(null);
                frame3.setBackground(new Color(1193046));
                frame3.setVisible(true);
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == this.button_return3f){
                    frame3.dispose();
                }
            }
        }

    }
