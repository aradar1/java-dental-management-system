
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnrafaelrondilla
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    //userLog u = new userLog();

    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        txtDate.setText("Today is: "+s.format(d));
    }
    
    void showTime(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                txtTime.setText("Time is: "+s.format(d)); 
            }
        }).start();
    }
    
    public loginForm() {
        initComponents();
        
        clk_passvisible.setVisible(false);
        btnLogin.setVisible(false);
        btnCancel.setVisible(false);
        //acctPanel.setVisible(false);
        //btnDentist.setVisible(false);
        //btnAsst.setVisible(false);
        
        
        //lblAcct.setText(null);
        
        txtUser.setBackground(new Color(0,0,0,0));
        txtPass.setBackground(new Color(0,0,0,0));
        
        showDate();
        showTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTime = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        clk_passvisible = new javax.swing.JLabel();
        passvisible = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime.setForeground(new java.awt.Color(255, 255, 153));
        txtTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTime.setText("Time:");
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 20));

        txtDate.setForeground(new java.awt.Color(255, 255, 153));
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDate.setText("Date:");
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, 20));

        loginPanel.setOpaque(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/cancel-hove.png"))); // NOI18N
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        loginPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -10, 80, 50));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/log in-hover.png"))); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        loginPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 80, 50));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/log in.png"))); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
        });
        loginPanel.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/cancel.png"))); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
        });
        loginPanel.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 180, 40));

        txtPass.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 149, 150, 30));

        txtUser.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 180, 40));

        clk_passvisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/pass_v.png"))); // NOI18N
        clk_passvisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clk_passvisibleMouseClicked(evt);
            }
        });
        getContentPane().add(clk_passvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 40, 40));

        passvisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/pass_v_c.png"))); // NOI18N
        passvisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passvisibleMouseClicked(evt);
            }
        });
        getContentPane().add(passvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 40, 40));

        pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/password.png"))); // NOI18N
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/username.png"))); // NOI18N
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin/Layer 1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        
        
        //enter database code here:
        
        try
        {
            Encryption encrypt = new Encryption();
            String password = encrypt.SHA1(Arrays.toString(txtPass.getPassword()));
            
           /* Class.forName("org.apache.derby.jdbc.ClientDriver");
            String fidelString = "jdbc:derby://localhost:1527/UserLogin";
            Connection fidelcon = DriverManager.getConnection(fidelString, "login", "login");
            Statement fidelstmt = fidelcon.createStatement();
            String query = "select * from users where uname='"+txtUser.getText()+"' and pword='"+password+"' and access_type='"+lblAcct.getText()+"'";
            ResultSet fidelresult = fidelstmt.executeQuery(query); */
           
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
           Connection con = DriverManager.getConnection(drive, "", "");
           Statement stmt = con.createStatement();
           
           String query = "select * from users where uname = '"+txtUser.getText()+"' and pword = '"+password+"'";
           ResultSet driveresult = stmt.executeQuery(query);
            
            if(driveresult.next())
            {
                JFrame frame = new JFrame();
                frame.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(frame, "Login Successful!");
                
                //String accessType = lblAcct.getText();
                
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");  
                String history = "insert into history(uname, date_, time_,activity) values('"+txtUser.getText()+"','"+java.time.LocalDate.now()+"', '"+sdf.format(cal.getTime())+"','Logged In')";
                stmt.execute(history);
                
                //userLog u = new userLog();
                userLog.ase = txtUser.getText().toString();
                
                
                /*if(accessType.equals("user"))
                {
                    mainForm main = new mainForm();
                    main.setVisible(true);
                    main.btnNewUser.setEnabled(false);
                    main.btnUpUser.setEnabled(false);
                    main.btnDelUser.setEnabled(false);
                    main.btnLoghis.setEnabled(false);
                    main.btnTally.setEnabled(false);
                    main.btntranshis.setEnabled(false);
                    this.setVisible(false);
                }
                else
                {
                    mainForm main = new mainForm();
                    main.setVisible(true);
                    this.setVisible(false);
                }*/
                mainForm main = new mainForm();
                main.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JFrame frame = new JFrame();
                frame.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(frame, "Invalid login! Try again.");
            }
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        // TODO add your handling code here:
        btnLogin.setVisible(true);
    }//GEN-LAST:event_loginMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
        btnCancel.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
      
        btnLogin.setVisible(false);
    }//GEN-LAST:event_btnLoginMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        // TODO add your handling code here:
        btnCancel.setVisible(true);
    }//GEN-LAST:event_cancelMouseEntered

    private void passvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passvisibleMouseClicked
        // TODO add your handling code here:
        passvisible.setVisible(false);
        clk_passvisible.setVisible(true);
        
        if (clk_passvisible.isVisible())
        {
            txtPass.setEchoChar((char)0);
        }
        
        
    }//GEN-LAST:event_passvisibleMouseClicked

    private void clk_passvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clk_passvisibleMouseClicked
        // TODO add your handling code here:
        passvisible.setVisible(true);
        clk_passvisible.setVisible(false);
        
        if(!clk_passvisible.isVisible()){
            txtPass.setEchoChar('*');
        }
        
        
    }//GEN-LAST:event_clk_passvisibleMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel clk_passvisible;
    private javax.swing.JLabel login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel passvisible;
    private javax.swing.JLabel txtDate;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JLabel txtTime;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
