package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
   private static Connection con;
   private static final String URL = "jdbc:sqlite:E:\\messManagement.db";
 
   private Database(){}
   
   public static Connection getConnection(){
       if(con==null){
           return newInstance();
       }
       return con;
   }
   
   private static Connection newInstance(){
       try{
           Class.forName("org.sqlite.JDBC");
           con = DriverManager.getConnection(URL);
       }catch(SQLException | ClassNotFoundException e){
           System.out.println(e);
       }
       return con;
   }
}

