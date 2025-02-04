
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnrafaelrondilla
 */
public class transactionHistoryForm extends javax.swing.JFrame {
    
    public void populateTable()
    {
        try
        {
            /*Class.forName("org.apache.derby.jdbc.ClientDriver");
            String fidelString = "jdbc:derby://localhost:1527/UserLogin";
            Connection fidelcon = DriverManager.getConnection(fidelString, "login", "login");
            Statement fidelstmt = fidelcon.createStatement();
            */
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
            Connection con = DriverManager.getConnection(drive, "", "");
            Statement stmt = con.createStatement();
            
            ResultSet record;
            record = stmt.executeQuery("select transid, pID, date_ from patientrecord");
            tblTransHistory.setModel(DbUtils.resultSetToTableModel(record));
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }

    /**
     * Creates new form transactionHistoryForm
     */
    public transactionHistoryForm() {
        initComponents();
        
        btnSearch.setVisible(false);
        btnClear.setVisible(false);
        btnCancel.setVisible(false);
        ckdDate.setVisible(false);
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransHistory = new javax.swing.JTable();
        lblsrch = new javax.swing.JLabel();
        ckdDate = new javax.swing.JLabel();
        btnDate = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        txtFromDate = new javax.swing.JTextField();
        fromDate = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        txtToDate = new javax.swing.JTextField();
        fromDate1 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTransHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTransHistory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 740, 400));

        lblsrch.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lblsrch.setForeground(new java.awt.Color(255, 255, 255));
        lblsrch.setText("Search transactions from:");
        getContentPane().add(lblsrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        ckdDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginHistoryForm/ckdDate.png"))); // NOI18N
        ckdDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckdDateMouseClicked(evt);
            }
        });
        getContentPane().add(ckdDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 50));

        btnDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginHistoryForm/btnDate.png"))); // NOI18N
        btnDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDateMouseClicked(evt);
            }
        });
        getContentPane().add(btnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 50));

        lblFrom.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(255, 255, 255));
        lblFrom.setText("from:");
        getContentPane().add(lblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 30));

        txtFromDate.setFont(new java.awt.Font("Helvetica", 2, 14)); // NOI18N
        txtFromDate.setText("yyyy-mm-dd");
        txtFromDate.setBorder(null);
        txtFromDate.setEnabled(false);
        txtFromDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFromDateFocusGained(evt);
            }
        });
        getContentPane().add(txtFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, 30));

        fromDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginHistoryForm/box.png"))); // NOI18N
        getContentPane().add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        lblTo.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lblTo.setForeground(new java.awt.Color(255, 255, 255));
        lblTo.setText("to:");
        getContentPane().add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 30));

        txtToDate.setFont(new java.awt.Font("Helvetica", 2, 14)); // NOI18N
        txtToDate.setText("yyyy-mm-dd");
        txtToDate.setBorder(null);
        txtToDate.setEnabled(false);
        txtToDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtToDateFocusGained(evt);
            }
        });
        getContentPane().add(txtToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, 30));

        fromDate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginHistoryForm/box.png"))); // NOI18N
        getContentPane().add(fromDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        buttonsPanel.setOpaque(false);
        buttonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/buttons-hover/CANCEL-hover.png"))); // NOI18N
        btnCancel.setToolTipText("cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        buttonsPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/buttons-hover/CANCEL.png"))); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
        });
        buttonsPanel.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/buttons-hover/CLEAR-hover.png"))); // NOI18N
        btnClear.setToolTipText("clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        buttonsPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/buttons-hover/CLEAR.png"))); // NOI18N
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
        });
        buttonsPanel.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginHistoryForm/buttons/SEARCH-HOV.png"))); // NOI18N
        btnSearch.setToolTipText("submit");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        buttonsPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginHistoryForm/buttons/SEARCH.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
        });
        buttonsPanel.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 310, 70));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transactionHistory/TRANSACTION HISTORY.png"))); // NOI18N
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transactionHistory/Layer 2.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        mainForm m = new mainForm();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
        btnCancel.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseExited

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        // TODO add your handling code here:
        btnCancel.setVisible(true);
    }//GEN-LAST:event_cancelMouseEntered

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        txtFromDate.setText("yyyy-mm-dd");
        txtFromDate.setEnabled(false);
        txtToDate.setText("yyyy-mm-dd");
        txtToDate.setEnabled(false);
        ckdDate.setVisible(false);

    }//GEN-LAST:event_btnClearMouseClicked

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
        btnClear.setVisible(false);
    }//GEN-LAST:event_btnClearMouseExited

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        // TODO add your handling code here:
        btnClear.setVisible(true);
    }//GEN-LAST:event_clearMouseEntered

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        
        //enter db code here
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String fidelString = "jdbc:derby://localhost:1527/UserLogin";
            Connection fidelcon = DriverManager.getConnection(fidelString, "login", "login");
            Statement fidelstmt = fidelcon.createStatement();
            ResultSet fidelrecord1;
            fidelrecord1 = fidelstmt.executeQuery("select transid, pID, date_ from patientrecord where date_ between '"+txtFromDate.getText()+"' and '"+txtToDate.getText()+"'");
            tblTransHistory.setModel(DbUtils.resultSetToTableModel(fidelrecord1));
            fidelstmt.close();
            fidelcon.close();
        }
        catch(Exception e)
        {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        btnSearch.setVisible(false);
    }//GEN-LAST:event_btnSearchMouseExited

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        // TODO add your handling code here:
        btnSearch.setVisible(true);
    }//GEN-LAST:event_searchMouseEntered

    private void btnDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDateMouseClicked
        // TODO add your handling code here:
        ckdDate.setVisible(true);
        txtFromDate.setEnabled(true);
        txtToDate.setEnabled(true);

    }//GEN-LAST:event_btnDateMouseClicked

    private void ckdDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckdDateMouseClicked
        // TODO add your handling code here:
        ckdDate.setVisible(false);
        txtFromDate.setEnabled(false);
        txtToDate.setEnabled(false);
        txtToDate.setText("yyyy-mm-dd");
        txtFromDate.setText("yyyy-mm-dd");
    }//GEN-LAST:event_ckdDateMouseClicked

    private void txtFromDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFromDateFocusGained
        // TODO add your handling code here:
        txtFromDate.setText("");
    }//GEN-LAST:event_txtFromDateFocusGained

    private void txtToDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtToDateFocusGained
        // TODO add your handling code here:
        txtToDate.setText("");
    }//GEN-LAST:event_txtToDateFocusGained

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
            java.util.logging.Logger.getLogger(transactionHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactionHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactionHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactionHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transactionHistoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDate;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel ckdDate;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel fromDate;
    private javax.swing.JLabel fromDate1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblsrch;
    private javax.swing.JLabel search;
    private javax.swing.JTable tblTransHistory;
    private javax.swing.JTextField txtFromDate;
    private javax.swing.JTextField txtToDate;
    // End of variables declaration//GEN-END:variables
}
