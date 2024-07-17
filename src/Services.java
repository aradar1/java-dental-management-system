
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.SwingUtilities;


public class Services extends javax.swing.JFrame {
            
    public Services() {
        initComponents();
        
           setTable();
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uoPanel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        addSer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        servTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        servName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        servPrice = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        servBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        upPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        curBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uoPanel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jPanel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addSer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addSer.setText("Add");
        addSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSerActionPerformed(evt);
            }
        });
        jPanel2.add(addSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 38));

        servTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        servTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(servTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 11, 240, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Service Name: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("Service Name");

        servName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(servName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Service Price");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        servPrice.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        servPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servPriceActionPerformed(evt);
            }
        });
        jPanel2.add(servPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 130, -1));

        btnCancel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 38));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/Layer 1.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 290));

        uoPanel.addTab("Add Service", jPanel2);

        update.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Service");

        servBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        servBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Price");

        upPrice.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Current Price");

        curBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        curBox.setEnabled(false);
        curBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(servBox, 0, 211, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(curBox)
                            .addComponent(upPrice)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(servBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        uoPanel.addTab("Update Service", jPanel3);

        getContentPane().add(uoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 340));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/Layer 1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 460, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSerActionPerformed
        // TODO add your handling code here:
 
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
            Connection con = DriverManager.getConnection(drive, "", "");
            Statement stmt = con.createStatement();
            String insertsql = "insert into serviceinfo(serviceName,rate) values('"+servName.getText()+"',"+servPrice.getText()+")";
            stmt.execute(insertsql);
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(null,"Service Successfully added");
            servName.setText("");
            servPrice.setText("");
            setTable();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_addSerActionPerformed

    private void servBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servBoxActionPerformed
        // TODO add your handling code here:

            try
            {
                if(servBox.getSelectedIndex()!=-1)
                {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
                    Connection con = DriverManager.getConnection(drive, "", "");
                    Statement stmt = con.createStatement();
                    ResultSet record;
                    record = stmt.executeQuery("select rate from serviceinfo where serviceName ='"+servBox.getSelectedItem().toString()+"'");
                    servTable.setModel(DbUtils.resultSetToTableModel(record));
                    stmt.close();
                    con.close();
                    //ResultSet rs = serv.getRec("Select ppr_price from packageprice where ppr_packagename ='"+servBox.getSelectedItem().toString()+"';");
                    if(record.next())
                    {
                        curBox.setText(record.getString("rate"));
                    }
                }

            }   
            catch(Exception E)
            {
                JOptionPane.showMessageDialog(null,E.getMessage());
            }
        
    }//GEN-LAST:event_servBoxActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(!upPrice.getText().matches("[0-9]+"))
        {
           JOptionPane.showMessageDialog(null,"Only positive numbers may be entered in Service Price");
        }
        else
        {
            try
            {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
                Connection con = DriverManager.getConnection(drive, "", "");
                Statement stmt = con.createStatement();
                
                stmt.execute("update serviceinfo set rate ="+upPrice.getText()+" where serviceName = '"+servBox.getSelectedItem().toString()+"';");
                stmt.close();
                con.close();
                //serv.insdelup("update packageprice set ppr_price="+upPrice.getText()+" where ppr_packagename='"+servBox.getSelectedItem().toString()+"';");
                upPrice.setText("");
                servBox.setSelectedIndex(-1);
                curBox.setText("");
                
                JOptionPane.showMessageDialog(null,"Price has been Updated");
                setTable();
                
            }   
            catch(Exception E)
            {
            JOptionPane.showMessageDialog(null,E.getMessage());
            }
        }
    }//GEN-LAST:event_updateActionPerformed
    public void setTable()
    {
         try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
            Connection con = DriverManager.getConnection(drive, "", "");
            Statement stmt = con.createStatement();
            ResultSet record;
            record = stmt.executeQuery("select serviceName from serviceinfo");
           
            
            
            while(record.next())
                {
                   // servBox.addItem(record.getString("Service_Name"));
                                    {
                    if(SwingUtilities.isEventDispatchThread()){
                        servBox.addItem(record.getString("serviceName"));
                    }
                    else{
                        SwingUtilities.invokeLater(new Runnable(){
                            @Override
                            public void run(){
                                try{
                                servBox.addItem(record.getString("serviceName"));
                                 }
                                catch(Exception e) {}
                                        
                            }
                        });
                    }
                }
            }
            ResultSet record1;
            record1 = stmt.executeQuery("select sID as Service_ID, serviceName as Service_Name, Rate from serviceinfo");
            servTable.setModel(DbUtils.resultSetToTableModel(record1));
            stmt.close();
            con.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }
    private void servPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servPriceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_servPriceActionPerformed

    private void curBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curBoxActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        mainForm mf = new mainForm();
        this.setVisible(false);
        mf.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSer;
    private javax.swing.JButton btnCancel;
    private javax.swing.JTextField curBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> servBox;
    private javax.swing.JTextField servName;
    private javax.swing.JTextField servPrice;
    private javax.swing.JTable servTable;
    private javax.swing.JTabbedPane uoPanel;
    private javax.swing.JTextField upPrice;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
