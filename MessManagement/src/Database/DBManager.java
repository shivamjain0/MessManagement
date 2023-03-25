package Database;

import DataModels.Item;
import DataModels.ItemListener;
import DataModels.Student;
import DataModels.StudentListener;
import DataModels.StudentRecord;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static final Connection con;
    private static ArrayList<Student> studentList;
    private static ArrayList<Item> itemList;
    private static ArrayList<String> itemIdList;   
    private static ArrayList<String> selectedItemsPriceList;
    private static String bill;
    private static Student student;
    private static boolean rollNoCheck;
    
    static{
       con = Database.getConnection();
    }
    
    public static void insertStudent(Student s){
        new Thread(){
            @Override public void run(){
                Dao.insertStudent(s);
            }
        }.start();
    }
    
    public static void insertItem(Item item){
        new Thread(){
            @Override
            public void run(){
                Dao.insertItem(item);
            }
        }.start();
    }
    
    public static void insertStudentRecord(StudentRecord studentRecord){
        new Thread(){
            @Override
            public void run(){
                    Dao.insertStudentsRecord(studentRecord);
            }
        }.start();
    }
    
    public static void fetchStudentList(StudentListener listener){
        new Thread(){
            public void run(){
                studentList = Dao.getStudentList();
                listener.getStudents();
            }
        }.start();
    }
    
    public static void fetchItemList(ItemListener Listener){
        new Thread(){
            @Override
            public void run(){
                synchronized(Listener){
                   itemList = Dao.getItemList();
                   Listener.getItemList();
                }
            }
        }.start();
    }
    
    public static ArrayList getItemList(){
        return itemList;
    }
    
    public static ArrayList getStudentList(){
        return studentList;
    }
    
    public static void fetchStudentBill(StudentListener listener,String studentRecord){
        new Thread(){
            public void run(){
                synchronized(listener){
                    bill = Dao.getStudentBill(studentRecord);
                    listener.getBill();
                }
            }
        }.start();
    }
    
    public static String getStudentbill(){
        return bill;
    }

    public static void checkRollNo(StudentListener listener,String hostelRollNo){
        new Thread(){
            public void run(){
                rollNoCheck = Dao.isRollNoValid(hostelRollNo);
                listener.checkRollNo();
            }
        }.start();
    }
    
    public static boolean isRollNoValid(String hostelRollNo){
        return rollNoCheck;
    }
    
    public static void fetchItemIdList(ItemListener listener, List<String> itemNameList){
        new Thread(){
            public void run(){
                synchronized(listener){
                    itemIdList = (ArrayList)Dao.getItemIdList(itemNameList);
                    listener.getItemIdList();
                }
            }
        }.start();
    }
    
    public static ArrayList<String> getItemIdList(){
        return itemIdList;
    }
    
    public static void fetchSelectedItemsPriceList(ItemListener listener, List<String> selectedItemsName){
        new Thread(){
            @Override
            public void run(){
                synchronized(listener){
                    selectedItemsPriceList = Dao.getSelectedItemsPriceList(selectedItemsName);
                    listener.getSelectedItemsPriceList();
                }
            }
        }.start();
    }
    
    public static ArrayList<String> getSelectedItemsPriceList(){
        return selectedItemsPriceList;
    }
    
    public static void fetchStudentDetail( String rollNo, StudentListener listener ){
        new Thread(){
            @Override
            public void run(){
                synchronized(listener){
                    student = Dao.getStudentDetail(rollNo);
                    listener.getStudentDetail();
                }
            }
        }.start();
    }
    
    public static Student getStudentDetail(){
        return student;
    }
}
