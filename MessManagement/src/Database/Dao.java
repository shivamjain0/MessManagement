package Database;

import DataModels.Student;
import com.sun.media.jfxmedia.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import DataModels.Item;
import DataModels.StudentRecord;
import java.util.ArrayList;
import java.util.List;

/**  All tables creation done
     all insertions done
     * getStudentList done
     * getStudentBill done
     * deleteStudent done 
     * --- TODO , when to delete the student
     * --- TODO , deletion of the items ( try to create items table as sequence)
 */

public class Dao {
    private static Statement stmt;
    private static ResultSet rs = null;
    
    public static void createTables(){        
        
        if( isTableExits("studentsData") )
            createTableStudentsData();
        if( isTableExits("itemsData") )
            createTableItemsData();
        if( isTableExits("studentsRecord") )
            createTableStudentsRecord();
    }
    
    public static void deleteItem( int itemId ){
        // TODO 
    }
    
    private static void createTableStudentsData(){
        try{
           stmt = Database.getConnection().createStatement();
               System.out.println("New table in making");
               
                stmt.executeUpdate("create table StudentsData"
                   + "(name varchar(20) not null,"
                   + "hostelRollNo varchar(3) primary key,"
                   + "cousre varchar(20) not null);");
                                
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
       }
    }
    
    private static void createTableItemsData(){
        try{
           stmt = Database.getConnection().createStatement();
               System.out.println("New table in making");
                            
                stmt.executeUpdate("create table itemsData(itemId varchar(2) primary"
                        + " key AUTO_INCREMENT, itemName varchar(20) not null,"
                        + "price varchar(3) not null);");
                
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
       }
    }
    
    private static void createTableStudentsRecord(){
        try{
           stmt = Database.getConnection().createStatement();
               System.out.println("New table in making");
               
                stmt.executeUpdate(" create table studentsRecord(hostelRollNo "
                        + "varchar(3) , itemId varchar(2) ,foreign key "
                        + "(hostelRollNo) references studentsData(hostelRollNo), "
                        + "foreign key (itemId) references itemsData(itemId));");                
                
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
       }
    }

    public static void insertStudent(Student student){
        try{           
             stmt = Database.getConnection().createStatement();
             String query = "insert into studentsData values('"+student.getName()+"','"+student.getHostelRollNo()+"','"+student.getCourse()+"');";       
             int result = stmt.executeUpdate(query);
             System.out.println("Data inserted : "+result);
             stmt.close();
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
    }
    
    public static void insertItem(Item item){
        try{ 
             stmt = Database.getConnection().createStatement();
             String query = "insert into itemsData values('"+item.getItemId()+"','"+item.getItemName()+"','"+item.getPrice()+"');";
             int result = stmt.executeUpdate(query);
             System.out.println("Data inserted : "+result);
             stmt.close();
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
    }
    
    public static void insertStudentsRecord(StudentRecord studentRecord){
        try{
            stmt = Database.getConnection().createStatement();
            String query = "insert into studentsRecord values('"+studentRecord.getHostelRollNo()+"','"+studentRecord.getItemId()+"');";
            int result = stmt.executeUpdate(query);
            System.out.println("Data inserted : "+result);
            stmt.close();
        }catch( SQLException e){
            Logger.logMsg(0, e.getMessage());
        }
    }
    
    public static ArrayList getStudentList(){
        ArrayList<Student> list = new ArrayList<>();
        try{
           stmt = Database.getConnection().createStatement();
           rs = stmt.executeQuery("SELECT * from studentsData;");
           while(rs.next()){
               Student s = new Student();
               s.setName(rs.getString("name"));
               s.setCourse(rs.getString("cousre"));
               s.setHostelRollNo(rs.getString("hostelRollNo"));
               list.add(s);
           }
           return list;
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
        return list;
    }
    
    public static ArrayList getItemList(){
        ArrayList<Item> list = new ArrayList<>();
        try{
           stmt = Database.getConnection().createStatement();
           rs = stmt.executeQuery("SELECT * from itemsData;");
           while(rs.next()){
               Item i = new Item();
               i.setItemId(rs.getString("itemId"));
               i.setItemName(rs.getString("itemName"));
               i.setPrice(rs.getString("price"));
               list.add(i);
           }
           return list;
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
        return list;
    }
    
    public static void deleteStudent( int rollNo,String studentRecord ){
        if( Integer.parseInt(getStudentBill(studentRecord)) != 0 ){
            System.out.println(rollNo+ "has not cleared the bill yet. "
                    + "Clear the bill first");
        }
        else{
            try{
                stmt = Database.getConnection().createStatement();
                String query = "delete from studentsRecord where hostelRollNo = rollNo;";
                stmt.executeUpdate(query); 
                
                query = "delete from studentsData where hostelRollNo = rollNo;";
                stmt.executeUpdate(query); 
            }
            catch( SQLException e){
                Logger.logMsg(0, e.getMessage());
            }
        }
    }
    
    public static ArrayList<String> getItemIdList(List<String> itemNameList){
        try{
            ArrayList<String> itemIdList;
            itemIdList = new ArrayList<>();
            stmt = Database.getConnection().createStatement();
            for( int i = 0; i < itemNameList.size(); i++){
                rs = stmt.executeQuery("select itemId from itemsData where itemName"
                        + " = '"+itemNameList.get(i)+"'");
                rs.next();
                itemIdList.add(rs.getString("itemId"));
            }
            return itemIdList;
        }
            catch( SQLException e ){
            Logger.logMsg(0, e.getMessage());
        }
        return new ArrayList<>();
    }
    
    public static String getStudentBill(String hostelRollNo){
        try{
            stmt = Database.getConnection().createStatement();
            rs = stmt.executeQuery("select sum(itemsData.price) as TotalBill from itemsData "
                + "inner join "
                + "studentsRecord on itemsData.itemId = "
                + "studentsRecord.itemId where "
                + "studentsRecord.hostelRollNo = "+hostelRollNo+";");
            while( rs.next() ){
                return rs.getString("TotalBill");
            }
           
            }catch( SQLException e ){
            Logger.logMsg(0, e.getMessage());
        }
        return null;
    }
    
   
   private static boolean isTableExits(String tableName){
       try{
            int i = 1;
            boolean result = false;
            stmt = Database.getConnection().createStatement();
            rs = stmt.executeQuery("SELECT name as Table_Names FROM "
                    + "sqlite_schema WHERE type = 'table';");
            while( rs.next() ){
                result = tableName.equals(rs.getString(i));
                i++;
            }
            return result;
       }catch( SQLException e){
           Logger.logMsg(0, e.getMessage());
       }
       return false;
   }

   static boolean isRollNoValid(String hostelRollNo){
       try{
           stmt = Database.getConnection().createStatement();
           rs = stmt.executeQuery("SELECT hostelRollno from studentsData;");
           while(rs.next()){
               if( rs.getString("hostelRollNo").equals(hostelRollNo) )
                   return true;
           }
           return false;
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
       return false;
   }
   
   
   public static ArrayList getSelectedItemsPriceList(List<String> selectedItemsName){
       try{
           ArrayList<String> itemPriceList = new ArrayList<>();
           stmt = Database.getConnection().createStatement();
           for( int i = 0; i < selectedItemsName.size(); i++){
                rs = stmt.executeQuery("SELECT price from itemsData where itemName"
                        + " = '"+selectedItemsName.get(i) +"';");
                while(rs.next()){
                    itemPriceList.add(rs.getString("price"));
                }
           }
           return itemPriceList;
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
       return new ArrayList<>();
   }
   
    public static Student getStudentDetail(String rollNo){
        try{
            stmt = Database.getConnection().createStatement();
            rs = stmt.executeQuery("SELECT *from StudentsData where hostelRollNo"
                 + " = '"+rollNo+"';");
                 rs.next();
            return new Student(rs.getString("name"),rs.getString("cousre"),rs.getString("hostelRollNo"));
        }catch( SQLException e ){
           Logger.logMsg(0, e.getMessage());
        }
        return new Student();
    }
}
