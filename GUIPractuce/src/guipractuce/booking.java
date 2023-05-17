package guipractuce;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class booking extends JFrame implements ActionListener{
    
    Databasehandler database;
    
    private int Totalcost = 0;
    private double pax;
    private double Tcharge[],Ccharge, Dishcost,Pserving,RCharge;
    private int dishes = 0,i1=0,i2=5,i3=0;
    private String area;
    
    JButton plus = new JButton("+");
    JButton plus1 = new JButton("+");
    JButton plus2 = new JButton("+");
    
    JButton negative = new JButton("-");
    JButton negative1 = new JButton("-");
    JButton negative2 = new JButton("-");
    
    JButton RefreshPrice = new JButton("↻");
    JButton next = new JButton("Next");
    
    JPanel catering = new JPanel();
    JPanel destination = new JPanel();
    JLabel logo = new JLabel();
    ImageIcon icon = new ImageIcon("EVENTIOicon.png");
    
    JTextField ratecost;
    JTextField Tfees;
    JFormattedTextField pax2;
    JFormattedTextField soup;
    JFormattedTextField mains;
    JFormattedTextField desserts;
    
    JComboBox fees;
    
    public booking() throws SQLException {
        //fetch the prices from database
        database = new Databasehandler();
        database.fetchPrices();
        
        pax = database.pax;
        Tcharge = database.Tfees;
        Dishcost = database.dishes;
        
        
        //start of catering Panel
        JLabel subtitle = new JLabel("Catering");
        JLabel description = new JLabel("<html><p># of dishes to be served:<br>" + "Soup w/ FREE croutons MAXIMUM of 3<br>" + 
                "Main dishes MAXIMUM of 10<br>" + "Dessert or Salad MAXIMUM of 3<p><html>");
        JLabel pax = new JLabel("PAX(Person per serving)");
        JLabel cost = new JLabel("Total Rate:");
        
        cost.setBounds(10, 150, 200, 30);
        cost.setFont(new Font("Times New Roman", Font.BOLD,18));
        cost.setForeground(Color.yellow);
        
        pax.setBounds(10, 40, 200, 50);
        pax.setFont(new Font("Times New Roman", Font.BOLD,18));
        pax.setForeground(Color.yellow);
        
        description.setBounds(400, 40, 400, 100);
        description.setFont(new Font("Times New Roman",Font.BOLD,18));
        description.setForeground(Color.yellow);
        
        subtitle.setFont(new Font("Times New Roman",Font.BOLD,30));
        subtitle.setForeground(Color.yellow);
        subtitle.setBounds(10, 10, 120, 30);
        
        //JTextFields
        
        //formatter for the dishes
        NumberFormatter formatter2 = new NumberFormatter();
        formatter2.setValueClass(Integer.class);
        formatter2.setMinimum(0);
        formatter2.setMaximum(3);
        formatter2.setAllowsInvalid(false);
        formatter2.setCommitsOnValidEdit(true);
        
        NumberFormatter formatter3 = new NumberFormatter();
        formatter3.setValueClass(Integer.class);
        formatter3.setMinimum(5);
        formatter3.setMaximum(10);
        formatter3.setAllowsInvalid(false);
        formatter3.setCommitsOnValidEdit(true);
        
        
        plus.setBounds(330, 65, 50, 20);
        plus.addActionListener(this);
        negative.setBounds(245, 65, 50, 20);
        negative.addActionListener(this);
        
        plus1.setBounds(330, 90, 50, 20);
        plus1.addActionListener(this);
        negative1.setBounds(245, 90, 50, 20);
        negative1.addActionListener(this);
        
        plus2.setBounds(330, 115, 50, 20);
        plus2.addActionListener(this);
        negative2.setBounds(245, 115, 50, 20);
        negative2.addActionListener(this);
        
        soup = new JFormattedTextField(formatter2);
        soup.setFont(new Font("Time New Roman",Font.PLAIN,18));
        soup.setValue(i1);
        soup.setPreferredSize(new Dimension(250,40));
        soup.setBounds(300, 65, 25, 20);
        
        mains = new JFormattedTextField(formatter3);
        mains.setFont(new Font("Time New Roman",Font.PLAIN,18));
        mains.setValue(i2);
        mains.setPreferredSize(new Dimension(250,40));
        mains.setBounds(300, 90, 25, 20);
        
        desserts = new JFormattedTextField(formatter2);
        desserts.setFont(new Font("Time New Roman",Font.PLAIN,18));
        desserts.setValue(i3);
        desserts.setPreferredSize(new Dimension(250,40));
        desserts.setBounds(300, 115, 25, 20);
        
        //formatter for the pax
        NumberFormatter formatter = new NumberFormatter();
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        //Formatted Textfield
        pax2 = new JFormattedTextField(formatter);
        pax2.setValue(0);
        pax2.setPreferredSize(new Dimension(250,40));
        pax2.setBounds(10, 80, 100, 30);
        pax2.setFont(new Font("Time New Roman",Font.PLAIN,18));
        //resfresh button for cost
        RefreshPrice.setBounds(215, 150, 50, 30);
        RefreshPrice.addActionListener(this);
        
        ratecost = new JTextField();
        ratecost.setEditable(false);
        ratecost.setPreferredSize(new Dimension(250,40));
        ratecost.setBounds(100, 150, 100, 30);
        ratecost.setFont(new Font("Time New Roman",Font.PLAIN,18));
        ratecost.setText("₱0.00");
        ratecost.setBackground(Color.black);
        ratecost.setForeground(Color.yellow);
        
        catering.add(cost);
        catering.add(pax);
        catering.add(pax2);
        catering.add(plus);
        catering.add(soup);
        catering.add(negative);
        catering.add(plus1);
        catering.add(mains);
        catering.add(negative1);
        catering.add(plus2);
        catering.add(desserts);
        catering.add(negative2);
        catering.add(RefreshPrice);
        catering.add(ratecost);
        catering.add(subtitle);
        catering.add(description);
        catering.setLayout(null);
        catering.setVisible(true); 
        catering.setBounds(150, 150, 768, 200);
        catering.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.yellow)));
        catering.setBackground(Color.black);
        //end of catering Panel
        
        //start of destination Panel
        JLabel subtitle3 = new JLabel("Destination Rates:");
        subtitle3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        subtitle3.setForeground(Color.white);
        subtitle3.setBounds(10, 10, 250, 30);
        
        JLabel location = new JLabel("Event Location:");
        location.setFont(new Font("Times New Roman", Font.BOLD,18));
        location.setForeground(Color.white);
        location.setBounds(10, 60, 200, 50);
        
        JLabel Tcharge = new JLabel("Transportation Charge:");
        Tcharge.setBounds(10, 150, 200, 30);
        Tcharge.setFont(new Font("Times New Roman", Font.BOLD,18));
        Tcharge.setForeground(Color.white);
        
        //comboBox
        String[] loc = {"(SELECT AREA)", "Lapu-Lapu Area", "Mandaue Area", "Cebu City Area", "Consolacion Area", "Talisay Area"};
        fees = new JComboBox(loc);
        fees.setFont(new Font("Time New Roman",Font.PLAIN,18));
        fees.setBounds(10, 95, 200, 30);
        fees.addActionListener(this);
        
        Tfees = new JTextField();
        Tfees.setEditable(false);
        Tfees.setPreferredSize(new Dimension(250,40));
        Tfees.setBounds(200, 150, 100, 30);
        Tfees.setFont(new Font("Time New Roman",Font.PLAIN,18));
        Tfees.setText("₱0.00");
        Tfees.setBackground(Color.pink);
        Tfees.setForeground(Color.white);
        
        JLabel description2 = new JLabel("<html><p>Note*<br>" + "Venue is discussed over the phone<p><html>");
        description2.setBounds(400, 0, 200, 200);
        description2.setFont(new Font("Times New Roman",Font.BOLD,18));
        description2.setForeground(Color.white);
        
        destination.add(description2);
        destination.add(Tfees);
        destination.add(fees);
        destination.add(Tcharge);
        destination.add(location);
        destination.add(subtitle3);
        destination.setLayout(null);
        destination.setVisible(true);
        destination.setBounds(150, 400, 768, 200);
        destination.setBackground(Color.pink);
        destination.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white)));
        //end of destination panel
        
        //image logo
        logo.setVisible(true);
        logo.setIcon(icon);
        logo.setVerticalAlignment(JLabel.TOP);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setBounds(230, 0, 636, 425);
        
        //'next' BUTTON
        next.addActionListener(this);
        next.setFont(new Font("Times New Roman",Font.BOLD,30));
        next.setEnabled(false);
        next.setBounds(460, 620, 100, 30);
//        next.setEnabled(false);
        
        //frame which the components are added
        this.setIconImage(icon.getImage());
        this.setTitle("Event.io");
        this.setVisible(true);
        this.setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x123456));
        this.add(next);
        this.add(destination);
        this.add(catering);
        this.add(logo);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Button in catering
        //#of SOUP
        if(e.getSource() == plus){
            if(i1 <3){
            i1++;
            }
            soup.setValue(i1);
        }
        if(e.getSource() == negative){
            if(i1 >0){
            i1--;
            }
            soup.setValue(i1);
        }
        //#of MAINS
        if(e.getSource() == plus1){
            if(i2 <10){
            i2++;
            }
            mains.setValue(i2);
        }
        //#of DESSERTS
        if(e.getSource() == negative1){
            if(i2 >5){
            i2--;
            }
            mains.setValue(i2);
        }
        if(e.getSource() == plus2){
            if(i3 <3){
            i3++;
            }
            desserts.setValue(i3);
        }
        if(e.getSource() == negative2){
            if(i3 >0){
            i3--;
            }
            desserts.setValue(i3);
        }
        
        Number value = (Number) pax2.getValue();
        Pserving = value.doubleValue();
        if(e.getSource() == RefreshPrice)
        {
            Number dish1 = (Number) soup.getValue();
            Number dish2 = (Number) mains.getValue();
            Number dish3 = (Number) desserts.getValue();
            dishes = dish1.intValue();
            dishes += dish2.intValue();
            dishes += dish3.intValue();
            if(Pserving < 10){
                ratecost.setText("PAX>10");
            }
            else{
                Ccharge = Pserving * pax + (dishes * Dishcost);
                ratecost.setText("₱" + Ccharge);
            }
        }
        
        //actions performed inside the Destinatin Panel
        if(e.getSource() == fees)
        {
            //Destination 
            if("Lapu-Lapu Area" == fees.getSelectedItem())
            {
                Tfees.setText("₱" + Tcharge[0]);
                area = (String) fees.getSelectedItem();
            }
            if("Mandaue Area" == fees.getSelectedItem())
            {
                Tfees.setText("₱" + Tcharge[1]);
                area = (String) fees.getSelectedItem();
            }
            if("Cebu City Area" == fees.getSelectedItem())
            {
                Tfees.setText("₱" + Tcharge[2]);
                area = (String) fees.getSelectedItem();
            }
            if("Consolacion Area" == fees.getSelectedItem())
            {
                Tfees.setText("₱" + Tcharge[3]);
                area = (String) fees.getSelectedItem();
            }
            if("Talisay Area" == fees.getSelectedItem())
            {
                Tfees.setText("₱" + Tcharge[4]);
                area = (String) fees.getSelectedItem();
            }
            if(0 == fees.getSelectedIndex())
            {
                Tfees.setText("₱0.00");
                area = null;
            }
        }
        
        if(area != null && Pserving >= 10 ){
            next.setEnabled(true);
            if(e.getSource()== next){
            //next window MENU
                this.hide();
                new menuSelection(this, i1,i2,i3);
            }
        }
        else{
            next.setEnabled(false);
        }
    }
    //new FRAME 'menuSELECTION'
    public class menuSelection extends JFrame{
        
        JButton goback;
        int soup,mains,desserts;
        
        menuSelection(JFrame booking, int i1, int i2, int i3){
            
            soup = i1; mains = i2; desserts = i3;//# of dishes serves as parameters for checkboxes
            
            //panel for checkboxes
            JPanel soup = new JPanel();
            soup.setBounds(0, 0, 0, 0);
            
            //Labels
            JLabel TitleSoup = new JLabel("SOUP");
            TitleSoup.setBounds(0, 0, 0, 0);
            
            //panel for compiling
            JPanel selection = new JPanel();
            selection.add(TitleSoup);
            selection.add(soup);
            selection.setBackground(null);
            selection.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white)));
            selection.setBounds(35,150,995,460);
            
            goback = new JButton("return");
            goback.addActionListener(e -> {
                this.dispose();
                booking.setVisible(true);
            });
            goback.setFont(new Font("Times New Roman",Font.BOLD,30));
            goback.setEnabled(true);
            goback.setBounds(460, 620, 150, 30);
        
            
            this.setIconImage(icon.getImage());
            this.setTitle("Event.io");
            this.setVisible(true);
            this.setSize(1080, 720);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.add(selection);
            this.add(logo);
            this.add(goback);
            this.getContentPane().setBackground(new Color(0x123456));
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
        
    }
}

