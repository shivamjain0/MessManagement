package messmanagement;

import Database.Dao;
import Database.Database;
import UI.HomePage;
import java.sql.Connection;

public class MessManagement {
    
    public static void main(String[] args) {
        
        Connection con = Database.getConnection();
         if(con == null){
          System.out.println("connection failed");
       }else{
          System.out.println("connection success");
           Dao.createTables();
           HomePage obj = new HomePage(" Student Login");
           obj.setLocationRelativeTo(null);
           obj.setVisible(true);
       }
    }
}
