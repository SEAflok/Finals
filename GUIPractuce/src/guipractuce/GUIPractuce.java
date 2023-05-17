    package guipractuce;

    import java.sql.SQLException;
    import java.awt.Color;

    import javax.swing.ImageIcon;

    public class GUIPractuce {
        public static void main(String[] args) throws SQLException {

            

            int W = 1080, H = 720;
            String Title = "EVENT.io";

            Color bg = new Color(0x123456);
            ImageIcon icon = new ImageIcon("EVENTIOicon.png");
            
            Databasehandler data = new Databasehandler();
//            mainPanel main = new mainPanel(bg,icon,W,H);
            data.fetchDishes();
//            booking booking = new booking();

        }
    }
