package UI;

import DataModels.Student;
import DataModels.StudentListener;
import Database.DBManager;
import javax.swing.JOptionPane;

public class NewStudentLogin extends javax.swing.JFrame implements StudentListener {

    public NewStudentLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        hostelRollNo = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        hostelRollNoText = new javax.swing.JTextField();
        courseText = new javax.swing.JTextField();
        signUp = new javax.swing.JButton();
        insertItemMessage = new javax.swing.JLabel();
        signUpWindowNameLabel = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setText("NAME :");

        hostelRollNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hostelRollNo.setText("HOSTEL ROLL NO :");

        course.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        course.setText("COURSE : ");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        hostelRollNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        courseText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        signUp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        signUp.setText("SIGN UP");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        insertItemMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseText)
                            .addComponent(hostelRollNoText)
                            .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hostelRollNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 478, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(insertItemMessage)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostelRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostelRollNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(insertItemMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        signUpWindowNameLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        signUpWindowNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpWindowNameLabel.setText("NEW STUDENT");

        goBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        goBack.setIcon(new javax.swing.ImageIcon("E:\\1063872_arrow_arrow back_back_left_previous_icon (1).png")); // NOI18N
        goBack.setText(" GO BACK");
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
                .addComponent(signUpWindowNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goBack)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signUpWindowNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        if(chechForStudentData() == 0);
        else{
            try{
                if( "".equals(hostelRollNoText.getText()) || "".equals(nameText.getText()) 
                        || "".equals(courseText.getText()))
                    JOptionPane.showMessageDialog(this,"Please fill all the fields",
                            "ALERT",JOptionPane.WARNING_MESSAGE);
                else{
                    
                    DBManager.checkRollNo(this,hostelRollNoText.getText());        
                }
            }catch( NumberFormatException e){
                JOptionPane.showMessageDialog(this,"RollNo can have only integer values",
                        "ALERT",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_signUpActionPerformed

    private int chechForStudentData(){
        int flag = 1;
        char[] Name, Course;
        Name = nameText.getText().toCharArray();
        Course = courseText.getText().toCharArray();
        for( int i = 0; i < Name.length; i++){
            if( Name[i] >= 65 && Name[i] <= 122 || Name[i] == 32 );
            else{
                flag = 0;
                JOptionPane.showMessageDialog(this,"Name can have only character values",
                    "ALERT",JOptionPane.WARNING_MESSAGE);
                return flag;
            }
        }
        for( int i = 0; i < Course.length; i++){
            if( Course[i] >= 65 && Course[i] <= 122 );
            else{
                flag = 0;
                JOptionPane.showMessageDialog(this,"Course can have only character values",
                    "ALERT",JOptionPane.WARNING_MESSAGE);
                return flag;
            }
        }
        return flag;
    }
    
    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        dispose();
        HomePage temp = new HomePage(" Student Login");
        temp.setLocationRelativeTo(null);
        temp.setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    
    private Student getData(){
        String Name = nameText.getText();
        String HostelRollNo = hostelRollNoText.getText();
        String Course = courseText.getText();
        if( Name == null && HostelRollNo == null && Course == null ){
            return new Student();
        }
        else{
            return new Student(Name,Course,HostelRollNo);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel course;
    private javax.swing.JTextField courseText;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel hostelRollNo;
    private javax.swing.JTextField hostelRollNoText;
    private javax.swing.JLabel insertItemMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel signUpWindowNameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getBill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkRollNo() {
        if(DBManager.isRollNoValid(hostelRollNoText.getText()))
            JOptionPane.showMessageDialog(this,"There's already a student present with that roll no",
                    "ALERT",JOptionPane.WARNING_MESSAGE);
        else{
            /* Throws NumberFormatException if input is not in integer form */
                    Integer.parseInt(hostelRollNoText.getText());
                    DBManager.insertStudent(getData());
                    
                    dispose();
                    HomePage temp = new HomePage(" Student Login");
                    temp.setLocationRelativeTo(null);
                    temp.setVisible(true);
        }
    }

    @Override
    public void getStudentDetail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
