package guipractuce;

import java.util.Random;
import javax.swing.JOptionPane;

public class ADMINCHECKER extends JOptionPane{
    
    Random rand = new Random();
    int code = rand.nextInt(1000);//random number
    String uniquecode = String.valueOf(code);//converts to string for label
     
    ADMINCHECKER()
    {
    }
    
    void check() 
    {
        String condition = JOptionPane.showInputDialog(null, "CLIENT#" + uniquecode + "\nENTER CODE","TYPE OF USER",QUESTION_MESSAGE);
        
        if(condition.equals("ADMIN"))
        {
            menuPanel menuPanel = new menuPanel();
        }
        else
        {
//            menuBar set = new menuBar();
//            set.disableButton(condition);
            menuPanel menuPanel = new menuPanel();
////            menuPanel menuPanel = new menuPanel();
        }
    }
    
}
