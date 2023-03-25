package UI;

import DataModels.Item;
import Database.DBManager;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class InsertItem extends javax.swing.JFrame {

    public InsertItem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        itemName = new javax.swing.JLabel();
        itemId = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        itemNameText = new javax.swing.JTextField();
        itemIdText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        addItem = new javax.swing.JButton();
        itemInsertMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        itemName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        itemName.setText("ITEM NAME :");

        itemId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        itemId.setText("ITEM ID : ");

        price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        price.setText("PRICE :");

        itemNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        itemIdText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        priceText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addItem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addItem.setText("ADD ITEM");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        itemInsertMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceText)
                            .addComponent(itemIdText)
                            .addComponent(itemNameText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(itemId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(itemInsertMessage))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemInsertMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSERT ITEM");

        goBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(goBack)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        if(chechForItemData() == 0);
        else{
            try{
                if( "".equals(itemNameText.getText()) || "".equals(itemIdText.getText()) || 
                        "".equals(priceText.getText()) )
                    JOptionPane.showMessageDialog(this, "ENTER ALL FIELDS",
                            "ALERT", JOptionPane.WARNING_MESSAGE);
                else{
                    // it throws NumberFormatException if input is not in integer form
                    Integer.parseInt(priceText.getText());
                    
                    DBManager.insertItem(getItem());
                    itemInsertMessage.setText("INSERT ITEM SUCCESSFULLY");
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask(){
                        @Override
                        public void run(){
                            itemInsertMessage.setText("");
                            itemNameText.setText("");
                            itemIdText.setText("");
                            priceText.setText("");
                        }
                    }, 2000);
                }
            }
            catch( NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Price can have only integer values",
                        "ALERT",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_addItemActionPerformed
    
    private int chechForItemData(){
        int flag = 1;
        char[] Name;
        Name = itemNameText.getText().toCharArray();
        try{
            // it throws NumberFormatException if input is not in integer form
            Integer.parseInt(itemIdText.getText());

            for( int i = 0; i < Name.length; i++){
                if( Name[i] >= 65 && Name[i] <= 122 || Name[i] == 32 );
                else{
                    flag = 0;
                    JOptionPane.showMessageDialog(this,"Item name can have only character values",
                        "ALERT",JOptionPane.WARNING_MESSAGE);
                    return flag;
                }
            }
        }catch( NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Item id can have only integer values",
            "ALERT",JOptionPane.WARNING_MESSAGE);
            flag = 0;
        }
        return flag;
    }
    
    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        dispose();
        Menu temp = new Menu();
        temp.setLocationRelativeTo(null);
        temp.setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private Item getItem(){
        String ItemName = itemNameText.getText();
        String ItemId = itemIdText.getText();
        String Price =  priceText.getText();
        System.out.println("item inserted");
        return new Item(ItemName,ItemId,Price);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel itemId;
    private javax.swing.JTextField itemIdText;
    private javax.swing.JLabel itemInsertMessage;
    private javax.swing.JLabel itemName;
    private javax.swing.JTextField itemNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceText;
    // End of variables declaration//GEN-END:variables
}
