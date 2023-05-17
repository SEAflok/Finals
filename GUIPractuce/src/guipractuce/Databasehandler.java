package guipractuce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Databasehandler {
    double pax;
    double dishes;
    double[] Tfees = new double[5];
    double Reservation;
    String[] soup;
    String[] main;
    String[] dessert;
    
    public Connection connection;
    
    public Databasehandler() throws SQLException {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","Gwapojosef#1");
            System.out.println("Connected");
        } 
            catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(GUIPractuce.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertData(/*there should be parameters passed by other classes when inserting*/) throws SQLException {
        String sql = "INSERT INTO table (column1, column2, column3) VALUES (?, ?, ?)";//not final 

        try (PreparedStatement statement = connection.prepareStatement(sql)) 
            {
                // Set parameter values which are passed from other classes

                // Execute the query
                System.out.println("Data inserted successfully.");
            }
        //closes connection
        finally
        {
            if (connection != null)
            {
                try
                {
                    System.out.println("Closing connection");
                    connection.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(GUIPractuce.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void fetchPrices() throws SQLException{
        String sql = "select * FROM PRICES";
        ResultSet resultSet = null;


        try (PreparedStatement statement = connection.prepareStatement(sql)) 
            {
                // Execute the query
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    pax = resultSet.getDouble(1);
                    dishes = resultSet.getDouble(2);
                    Tfees[0] = resultSet.getDouble(3);
                    Tfees[1] = resultSet.getDouble(4);
                    Tfees[2] = resultSet.getDouble(5);
                    Tfees[3] = resultSet.getDouble(6);
                    Tfees[4] = resultSet.getDouble(7);
                    Reservation = resultSet.getDouble(8);
                    System.out.println(pax + " " + dishes);
                }
                
                System.out.println("Fetched Data successfully.");
                
            }
        //closes connection
        finally
        {
            if (connection != null)
            {
                try
                {
                    System.out.println("Closing connection");
                    connection.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(GUIPractuce.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void fetchDishes() throws SQLException{
        String sql = "select * FROM DISHES";
        ResultSet resultSet = null;
        
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
            {
                int i = 0;
                soup = new String[50];
                main = new String[50];
                dessert = new String[50];
                
                // Execute the query
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    soup[i] = resultSet.getString(1);
                    main[i] = resultSet.getString(2);
                    dessert[i] = resultSet.getString(3);
                    
                    System.out.println(soup[i] + " " + main[i] + " " + dessert[i]);
                    i++;
                }
                
                System.out.println("Fetched Data successfully.");
                
            }
        //closes connection
        finally
        {
            if (connection != null)
            {
                try
                {
                    System.out.println("Closing connection");
                    connection.close();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(GUIPractuce.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
