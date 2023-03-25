package UI;

import DataModels.Item;
import DataModels.ItemListener;
import DataModels.Student;
import DataModels.StudentListener;
import DataModels.StudentRecord;
import Database.DBManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class StudentLogin extends javax.swing.JFrame implements StudentListener, ItemListener{
    
/* Roll no of student whose account is opened in this window */
    private String studentRollNo;
    
/* All items list which are to be shown for selection */
    private ArrayList<Item> ItemList; 
    
/* Selected items list which are to be inserted in the studentsRecord table */
    private ArrayList<String> itemIdList;
    
/* Price list to be shown on the UI for the selected items */
    private ArrayList<String> selectedItemsPriceList;
    
/* Student, whose account is 'singed in' to add items */
    private Student student;
    
/* Selected items list, to be shown in the (text area)itemListText */
    private List<String> items;
    
/* Total bill value of the student whose account is opened */
    private String TotalBill;

/* Bill sum of all selected values to add */
    private int selectedValuesBillSum;
    
    public StudentLogin() {
    }

    public StudentLogin(String rollNo){
        studentRollNo = rollNo;
        initComponents();
        initBill(studentRollNo);
        initStudent(studentRollNo);
        initItemList();
        
    }
    
    private void initStudent(String rollNo){
        DBManager.fetchStudentDetail(rollNo, this);
    }
    
    @Override
    public void getStudentDetail() {
        student = DBManager.getStudentDetail();
        nameText.setText(student.getName());
        rollNoText.setText(student.getHostelRollNo());
        courseText.setText(student.getCourse());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bill = new javax.swing.JLabel();
        addItem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemListText = new javax.swing.JTextArea();
        itemInsertedSuccessfullyText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rollNo = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        selectItemToAddText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        rollNoText = new javax.swing.JLabel();
        courseText = new javax.swing.JLabel();
        totalBill = new javax.swing.JLabel();
        studentAccount = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        bill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bill.setText("STUDENT BILL IS : ");

        addItem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addItem.setText("ADD");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        itemList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        itemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(itemList);

        itemListText.setEditable(false);
        itemListText.setColumns(20);
        itemListText.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        itemListText.setRows(5);
        jScrollPane3.setViewportView(itemListText);

        itemInsertedSuccessfullyText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ITEMS TO ADD :");

        name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name.setText("NAME : ");

        rollNo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rollNo.setText("ROLL NO:");

        course.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        course.setText("COURSE :");

        selectItemToAddText.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        selectItemToAddText.setText("               SELECT ITEMS TO ADD");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rollNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        courseText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        totalBill.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        totalBill.setText("TOTAL BILL IS : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rollNoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(courseText, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectItemToAddText, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemInsertedSuccessfullyText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectItemToAddText, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(totalBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rollNoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rollNo, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemInsertedSuccessfullyText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addItem)
                        .addGap(11, 11, 11))))
        );

        studentAccount.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        studentAccount.setForeground(new java.awt.Color(255, 255, 255));
        studentAccount.setText("STUDENT ACCOUNT");

        goBack.setIcon(new javax.swing.ImageIcon("E:\\1063872_arrow_arrow back_back_left_previous_icon (1).png")); // NOI18N
        goBack.setText("GO BACK");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(goBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        List<String> selectedItems = itemList.getSelectedValuesList();
        if(items.isEmpty())
            JOptionPane.showMessageDialog(this, "No selected items there", "ALERT",JOptionPane.WARNING_MESSAGE);
        else{
        /** Item names passed to get the respective item id's */
            DBManager.fetchItemIdList(this, selectedItems);
            itemInsertedSuccessfullyText.setText("Items inserted successfully");
            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run(){
                    itemList.clearSelection();
                    itemListText.setText("");
                    itemInsertedSuccessfullyText.setText("");
                    bill.setText("STUDENT BILL IS : ");
                    
                    TotalBill = String.valueOf(Integer.parseInt(TotalBill) + selectedValuesBillSum);
                    totalBill.setText("TOTAL BILL IS : "+TotalBill);
                }
            }, 1500);
        }
       
    }//GEN-LAST:event_addItemActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        dispose();
        HomePage obj = new HomePage(" Student Login");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void itemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemListMouseClicked
        
/* For new line in the item list text area */    
        itemListText.setLineWrap(true);
        items = itemList.getSelectedValuesList();    
        
/* It fetches the selected items price list w.r.t their names*/
        DBManager.fetchSelectedItemsPriceList(this, items);
    }//GEN-LAST:event_itemListMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JLabel bill;
    private javax.swing.JLabel course;
    private javax.swing.JLabel courseText;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel itemInsertedSuccessfullyText;
    private javax.swing.JList<String> itemList;
    private javax.swing.JTextArea itemListText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel rollNo;
    private javax.swing.JLabel rollNoText;
    private javax.swing.JLabel selectItemToAddText;
    private javax.swing.JLabel studentAccount;
    private javax.swing.JLabel totalBill;
    // End of variables declaration//GEN-END:variables

    private void initItemList(){
         DBManager.fetchItemList(this);
    }
    
    @Override
    public void getItemList() {
        ItemList = DBManager.getItemList();
        setItemList();
    }
    
    private void setItemList(){
        DefaultListModel model = new DefaultListModel();
        System.out.println(ItemList.size());
        for( int i = 0; i < ItemList.size(); i++ ){
            model.addElement(ItemList.get(i).getItemName());
        }
        itemList.setModel(model);
    }
    
    private void initBill(String s){
        DBManager.fetchStudentBill(this,s);
    }
    
    @Override
    public void getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getBill() {
        TotalBill = DBManager.getStudentbill();
        if( TotalBill == null )
            TotalBill = "0";
        totalBill.setText(totalBill.getText()+TotalBill);
    }

    @Override
    public void checkRollNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getItemIdList() {
        itemIdList = DBManager.getItemIdList();
        
        for( int i = 0 ; i < itemIdList.size(); i++ ){
            DBManager.insertStudentRecord(new StudentRecord(studentRollNo,itemIdList.get(i)));
        }
    }

    @Override
    public void getSelectedItemsPriceList() {
        
        selectedItemsPriceList = DBManager.getSelectedItemsPriceList();
        selectedValuesBillSum = 0;
        if( items.isEmpty() ){
            itemListText.setText("");
/* Directly initializing sum = 0 (int) as no item is selected yet */
            selectedValuesBillSum = 0;
            
/* Initializing bill text everytime so that the value of sum that is shown in
            the bill text not get appended */
            
            bill.setText("STUDENT BILL IS : ");
            bill.setText(bill.getText()+Integer.toString(selectedValuesBillSum));
        }
        if( items.size() > 0 ){
            itemListText.setText(items.get(0)+"(RS."+selectedItemsPriceList.get(0)+")");
            
/* Coverting sum to integer so that we can sum up the 'sum' for multiple 
             selected items */        
            selectedValuesBillSum = Integer.parseInt(selectedItemsPriceList.get(0));
            
/* Initializing bill text everytime so that the value of sum that is shown in
            the bill text not get appended */
            
            bill.setText("STUDENT BILL IS : ");
            bill.setText(bill.getText()+selectedValuesBillSum);
        }
        for( int i = 1; i<items.size(); i++){
            itemListText.setText(itemListText.getText()+","+items.get(i)+"(RS."+selectedItemsPriceList.get(i)+")");
            
/* Coverting sum to integer so that we can sum up the 'sum' for multiple 
             selected items */          
            selectedValuesBillSum += Integer.parseInt(selectedItemsPriceList.get(i));
            
/* Initializing bill text everytime so that the value of sum that is shown in
            the bill text not get appended */
            
            bill.setText("STUDENT BILL IS : ");
            bill.setText(bill.getText()+Integer.toString(selectedValuesBillSum));
        }
    }    
}
