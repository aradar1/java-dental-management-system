
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.*;
import net.proteanit.sql.DbUtils;

//import javax.swing.text.Document;
//import com.itextpdf.layout.Document; 
import java.io.FileOutputStream;
import com.itextpdf.text.*;

import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnrafaelrondilla
 */
public class updatePatientForm extends javax.swing.JFrame {
    
    BillMaker bm = new BillMaker();
    Document doc;
    public String pdfcomponent = "";
    public String remarks="";
       public void createPDF() {
     try{  
       doc = new Document();
       PdfWriter.getInstance(doc, new FileOutputStream(userLog.getCurrentDateTimeMS()+".pdf"));
       doc.open();
        }
     catch(Exception e){}
       }

    //add selected tooth from the list
    public void settooth(String set) {
        remarks += set;
        txtToothList.setText(remarks);
        userLog.numOfTeeth +=1;
    }

    //remove selected tooth from the list
    public void deltooth(String del) {
        if (remarks.contains(del)) {
            remarks = remarks.replaceAll(del, "");
            txtToothList.setText(remarks);
            userLog.numOfTeeth -=1;
        }
    }
    
    public void populateTable()
    {
        try
        {
            /*Class.forName("org.apache.derby.jdbc.ClientDriver");
            String fidelString = "jdbc:derby://localhost:1527/UserLogin";
            Connection fidelcon = DriverManager.getConnection(fidelString, "login", "login");
            Statement fidelstmt = fidelcon.createStatement();
            ResultSet fidelrecord;*/
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
            Connection con = DriverManager.getConnection(drive, "", "");
            Statement stmt = con.createStatement();
            ResultSet record;
            record = stmt.executeQuery("select pID as Patient_ID, pName as Patient_Name, pBirthdate as Date_of_Birth from patientinfo");
            tblPatients.setModel(DbUtils.resultSetToTableModel(record));
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
    
    public String idGenerator()
    {
        Random ran = new Random();
        String id = String.valueOf(ran.nextInt(9000000) + 1000000);
        return id;
    }

    /**
     * Creates new form updatePatientForm1
     */
    public updatePatientForm() {
        initComponents();
        
        txtToothList.setText("");
        cU1.setVisible(false);
        cU2.setVisible(false);
        cU3.setVisible(false);
        cU4.setVisible(false);
        cU5.setVisible(false);
        cU6.setVisible(false);
        cU7.setVisible(false);
        cU8.setVisible(false);
        cU9.setVisible(false);
        cU10.setVisible(false);
        cU11.setVisible(false);
        cU12.setVisible(false);
        cU13.setVisible(false);
        cU14.setVisible(false);
        cU15.setVisible(false);
        cU16.setVisible(false);
        cL17.setVisible(false);
        cL18.setVisible(false);
        cL19.setVisible(false);
        cL20.setVisible(false);
        cL21.setVisible(false);
        cL22.setVisible(false);
        cL23.setVisible(false);
        cL24.setVisible(false);
        cL25.setVisible(false);
        cL26.setVisible(false);
        cL27.setVisible(false);
        cL28.setVisible(false);
        cL29.setVisible(false);
        cL30.setVisible(false);
        cL31.setVisible(false);
        cL32.setVisible(false);

        btnUpdate.setVisible(false);
        btnClear.setVisible(false);
        btnCancel.setVisible(false);

        chkBonding.setVisible(false);
        chkBraces.setVisible(false);
        chkBridges.setVisible(false);
        chkCrowns.setVisible(false);
        chkDentures.setVisible(false);
        chkExtract.setVisible(false);
        chkFilling.setVisible(false);
        chkGum.setVisible(false);
        chkOral.setVisible(false);
        chkRoot.setVisible(false);
        chkSealant.setVisible(false);
        chkWhite.setVisible(false);
        chkVeneers.setVisible(false);

        txtPatID.setBackground(new Color(0, 0, 0, 0));
        txtName.setBackground(new Color(0, 0, 0, 0));
        txtBday.setBackground(new Color(0, 0, 0, 0));
        
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        remarksPanel = new javax.swing.JPanel();
        txtrVeneers = new javax.swing.JTextField();
        txtrWhite = new javax.swing.JTextField();
        txtrSealant = new javax.swing.JTextField();
        txtrRoot = new javax.swing.JTextField();
        txtrOral = new javax.swing.JTextField();
        txtrGum = new javax.swing.JTextField();
        txtrFilling = new javax.swing.JTextField();
        txtrExtract = new javax.swing.JTextField();
        txtrDentures = new javax.swing.JTextField();
        txtrCrowns = new javax.swing.JTextField();
        txtrBridges = new javax.swing.JTextField();
        txtrBraces = new javax.swing.JTextField();
        txtrBonding = new javax.swing.JTextField();
        txtBday = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPatID = new javax.swing.JLabel();
        servicesPanel = new javax.swing.JPanel();
        chkVeneers = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        chkWhite = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        chkSealant = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        chkRoot = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        chkOral = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        chkGum = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        chkFilling = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        chkExtract = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        chkDentures = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        chkCrowns = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        chkBridges = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        chkBraces = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        chkBonding = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        txtToothList = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        selectTooth = new javax.swing.JLabel();
        toothChart = new javax.swing.JLabel();
        lowerToothPanel = new javax.swing.JPanel();
        cL32 = new javax.swing.JLabel();
        cL31 = new javax.swing.JLabel();
        cL30 = new javax.swing.JLabel();
        cL29 = new javax.swing.JLabel();
        cL28 = new javax.swing.JLabel();
        cL27 = new javax.swing.JLabel();
        cL26 = new javax.swing.JLabel();
        cL25 = new javax.swing.JLabel();
        cL24 = new javax.swing.JLabel();
        cL23 = new javax.swing.JLabel();
        cL22 = new javax.swing.JLabel();
        cL21 = new javax.swing.JLabel();
        cL20 = new javax.swing.JLabel();
        cL19 = new javax.swing.JLabel();
        cL18 = new javax.swing.JLabel();
        cL17 = new javax.swing.JLabel();
        L32 = new javax.swing.JLabel();
        L31 = new javax.swing.JLabel();
        L30 = new javax.swing.JLabel();
        L29 = new javax.swing.JLabel();
        L28 = new javax.swing.JLabel();
        L27 = new javax.swing.JLabel();
        L26 = new javax.swing.JLabel();
        L25 = new javax.swing.JLabel();
        L24 = new javax.swing.JLabel();
        L23 = new javax.swing.JLabel();
        L22 = new javax.swing.JLabel();
        L21 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        L19 = new javax.swing.JLabel();
        L18 = new javax.swing.JLabel();
        L17 = new javax.swing.JLabel();
        upperToothPanel = new javax.swing.JPanel();
        cU16 = new javax.swing.JLabel();
        cU15 = new javax.swing.JLabel();
        cU14 = new javax.swing.JLabel();
        cU13 = new javax.swing.JLabel();
        cU12 = new javax.swing.JLabel();
        cU11 = new javax.swing.JLabel();
        cU10 = new javax.swing.JLabel();
        cU9 = new javax.swing.JLabel();
        cU8 = new javax.swing.JLabel();
        cU7 = new javax.swing.JLabel();
        cU6 = new javax.swing.JLabel();
        cU5 = new javax.swing.JLabel();
        cU4 = new javax.swing.JLabel();
        cU3 = new javax.swing.JLabel();
        cU2 = new javax.swing.JLabel();
        cU1 = new javax.swing.JLabel();
        U16 = new javax.swing.JLabel();
        U15 = new javax.swing.JLabel();
        U14 = new javax.swing.JLabel();
        U13 = new javax.swing.JLabel();
        U12 = new javax.swing.JLabel();
        U11 = new javax.swing.JLabel();
        U10 = new javax.swing.JLabel();
        U9 = new javax.swing.JLabel();
        U8 = new javax.swing.JLabel();
        U7 = new javax.swing.JLabel();
        U6 = new javax.swing.JLabel();
        U5 = new javax.swing.JLabel();
        U4 = new javax.swing.JLabel();
        U3 = new javax.swing.JLabel();
        U2 = new javax.swing.JLabel();
        U1 = new javax.swing.JLabel();
        newPatForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1150, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Date of Birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPatients);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 350, 220));

        remarksPanel.setOpaque(false);
        remarksPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtrVeneers.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrVeneers.setForeground(new java.awt.Color(204, 204, 204));
        txtrVeneers.setText("type remarks here...");
        txtrVeneers.setBorder(null);
        txtrVeneers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrVeneersFocusGained(evt);
            }
        });
        remarksPanel.add(txtrVeneers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 300, 20));

        txtrWhite.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrWhite.setForeground(new java.awt.Color(204, 204, 204));
        txtrWhite.setText("type remarks here...");
        txtrWhite.setBorder(null);
        txtrWhite.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrWhiteFocusGained(evt);
            }
        });
        remarksPanel.add(txtrWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, 300, 20));

        txtrSealant.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrSealant.setForeground(new java.awt.Color(204, 204, 204));
        txtrSealant.setText("type remarks here...");
        txtrSealant.setBorder(null);
        txtrSealant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrSealantFocusGained(evt);
            }
        });
        remarksPanel.add(txtrSealant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 300, 20));

        txtrRoot.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrRoot.setForeground(new java.awt.Color(204, 204, 204));
        txtrRoot.setText("type remarks here...");
        txtrRoot.setBorder(null);
        txtrRoot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrRootFocusGained(evt);
            }
        });
        remarksPanel.add(txtrRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 300, -1));

        txtrOral.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrOral.setForeground(new java.awt.Color(204, 204, 204));
        txtrOral.setText("type remarks here...");
        txtrOral.setBorder(null);
        txtrOral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrOralFocusGained(evt);
            }
        });
        remarksPanel.add(txtrOral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 300, 20));

        txtrGum.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrGum.setForeground(new java.awt.Color(204, 204, 204));
        txtrGum.setText("type remarks here...");
        txtrGum.setBorder(null);
        txtrGum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrGumFocusGained(evt);
            }
        });
        remarksPanel.add(txtrGum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 20));

        txtrFilling.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrFilling.setForeground(new java.awt.Color(204, 204, 204));
        txtrFilling.setText("type remarks here...");
        txtrFilling.setBorder(null);
        txtrFilling.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrFillingFocusGained(evt);
            }
        });
        remarksPanel.add(txtrFilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 300, -1));

        txtrExtract.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrExtract.setForeground(new java.awt.Color(204, 204, 204));
        txtrExtract.setText("type remarks here...");
        txtrExtract.setBorder(null);
        txtrExtract.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrExtractFocusGained(evt);
            }
        });
        remarksPanel.add(txtrExtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 300, 20));

        txtrDentures.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrDentures.setForeground(new java.awt.Color(204, 204, 204));
        txtrDentures.setText("type remarks here...");
        txtrDentures.setBorder(null);
        txtrDentures.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrDenturesFocusGained(evt);
            }
        });
        remarksPanel.add(txtrDentures, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, 20));

        txtrCrowns.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrCrowns.setForeground(new java.awt.Color(204, 204, 204));
        txtrCrowns.setText("type remarks here...");
        txtrCrowns.setBorder(null);
        txtrCrowns.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrCrownsFocusGained(evt);
            }
        });
        remarksPanel.add(txtrCrowns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 300, 20));

        txtrBridges.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrBridges.setForeground(new java.awt.Color(204, 204, 204));
        txtrBridges.setText("type remarks here...");
        txtrBridges.setBorder(null);
        txtrBridges.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrBridgesFocusGained(evt);
            }
        });
        remarksPanel.add(txtrBridges, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 20));

        txtrBraces.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrBraces.setForeground(new java.awt.Color(204, 204, 204));
        txtrBraces.setText("type remarks here...");
        txtrBraces.setBorder(null);
        txtrBraces.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrBracesFocusGained(evt);
            }
        });
        remarksPanel.add(txtrBraces, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, -1));

        txtrBonding.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtrBonding.setForeground(new java.awt.Color(204, 204, 204));
        txtrBonding.setText("type remarks here...");
        txtrBonding.setBorder(null);
        txtrBonding.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrBondingFocusGained(evt);
            }
        });
        remarksPanel.add(txtrBonding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 300, -1));

        getContentPane().add(remarksPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 320, 320));

        txtBday.setFont(new java.awt.Font("Helvetica", 2, 14)); // NOI18N
        txtBday.setForeground(new java.awt.Color(204, 204, 204));
        txtBday.setText("yyyy-mm-dd");
        txtBday.setBorder(null);
        txtBday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBdayFocusGained(evt);
            }
        });
        getContentPane().add(txtBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 20));

        txtName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 30));

        txtPatID.setFont(new java.awt.Font("Helvetica", 2, 14)); // NOI18N
        txtPatID.setText("txtPatID");
        getContentPane().add(txtPatID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 20));

        servicesPanel.setOpaque(false);
        servicesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkVeneers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkVeneers.setBorder(null);
        chkVeneers.setBorderPainted(false);
        chkVeneers.setContentAreaFilled(false);
        chkVeneers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkVeneers.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkVeneers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVeneersActionPerformed(evt);
            }
        });
        servicesPanel.add(chkVeneers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 30, 20));

        btn13.setBorderPainted(false);
        btn13.setContentAreaFilled(false);
        btn13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 30, 20));

        chkWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkWhite.setBorderPainted(false);
        chkWhite.setContentAreaFilled(false);
        chkWhite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chkWhite.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        chkWhite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chkWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkWhiteActionPerformed(evt);
            }
        });
        servicesPanel.add(chkWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 20, 30));

        btn12.setBorderPainted(false);
        btn12.setContentAreaFilled(false);
        btn12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 30, 30));

        chkSealant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkSealant.setBorder(null);
        chkSealant.setBorderPainted(false);
        chkSealant.setContentAreaFilled(false);
        chkSealant.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkSealant.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSealant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSealantActionPerformed(evt);
            }
        });
        servicesPanel.add(chkSealant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 20));

        btn11.setBorderPainted(false);
        btn11.setContentAreaFilled(false);
        btn11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 20));

        chkRoot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkRoot.setBorder(null);
        chkRoot.setBorderPainted(false);
        chkRoot.setContentAreaFilled(false);
        chkRoot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkRoot.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRootActionPerformed(evt);
            }
        });
        servicesPanel.add(chkRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 30, 30));

        btn10.setBorderPainted(false);
        btn10.setContentAreaFilled(false);
        btn10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 30, 30));

        chkOral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkOral.setBorder(null);
        chkOral.setBorderPainted(false);
        chkOral.setContentAreaFilled(false);
        chkOral.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkOral.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkOral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOralActionPerformed(evt);
            }
        });
        servicesPanel.add(chkOral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 30, 20));

        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 30, 20));

        chkGum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkGum.setBorder(null);
        chkGum.setBorderPainted(false);
        chkGum.setContentAreaFilled(false);
        chkGum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkGum.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkGum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGumActionPerformed(evt);
            }
        });
        servicesPanel.add(chkGum, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 30, 20));

        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 30, 20));

        chkFilling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkFilling.setBorder(null);
        chkFilling.setBorderPainted(false);
        chkFilling.setContentAreaFilled(false);
        chkFilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkFilling.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkFilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFillingActionPerformed(evt);
            }
        });
        servicesPanel.add(chkFilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 30, 30));

        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 30, 30));

        chkExtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkExtract.setBorder(null);
        chkExtract.setBorderPainted(false);
        chkExtract.setContentAreaFilled(false);
        chkExtract.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkExtract.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExtractActionPerformed(evt);
            }
        });
        servicesPanel.add(chkExtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 30, 20));

        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 20, 20));

        chkDentures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkDentures.setBorder(null);
        chkDentures.setBorderPainted(false);
        chkDentures.setContentAreaFilled(false);
        chkDentures.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkDentures.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkDentures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDenturesActionPerformed(evt);
            }
        });
        servicesPanel.add(chkDentures, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 30, 30));

        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 30, 30));

        chkCrowns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkCrowns.setBorder(null);
        chkCrowns.setBorderPainted(false);
        chkCrowns.setContentAreaFilled(false);
        chkCrowns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkCrowns.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCrowns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCrownsActionPerformed(evt);
            }
        });
        servicesPanel.add(chkCrowns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 30, 20));

        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 30, 20));

        chkBridges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkBridges.setBorder(null);
        chkBridges.setBorderPainted(false);
        chkBridges.setContentAreaFilled(false);
        chkBridges.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkBridges.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBridges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBridgesActionPerformed(evt);
            }
        });
        servicesPanel.add(chkBridges, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 30, 30));

        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 30, 20));

        chkBraces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkBraces.setBorder(null);
        chkBraces.setBorderPainted(false);
        chkBraces.setContentAreaFilled(false);
        chkBraces.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkBraces.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBraces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBracesActionPerformed(evt);
            }
        });
        servicesPanel.add(chkBraces, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 30, 30));

        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 30, 30));

        chkBonding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newPatientForm/chk.png"))); // NOI18N
        chkBonding.setBorder(null);
        chkBonding.setBorderPainted(false);
        chkBonding.setContentAreaFilled(false);
        chkBonding.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkBonding.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBonding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBondingActionPerformed(evt);
            }
        });
        servicesPanel.add(chkBonding, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        servicesPanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        getContentPane().add(servicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 310));

        txtToothList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtToothList.setForeground(new java.awt.Color(255, 255, 255));
        txtToothList.setText("txtToothList");
        getContentPane().add(txtToothList, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 450, 40));

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
        buttonsPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/buttons-hover/CANCEL.png"))); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
        });
        buttonsPanel.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

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

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updatePatientForm/UPDATE-H.png"))); // NOI18N
        btnUpdate.setToolTipText("submit");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        buttonsPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updatePatientForm/UPDATE.png"))); // NOI18N
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
        });
        buttonsPanel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 330, 70));

        selectTooth.setFont(new java.awt.Font("Helvetica", 2, 14)); // NOI18N
        selectTooth.setForeground(new java.awt.Color(255, 255, 255));
        selectTooth.setText("(please select teeth to be repaired)");
        getContentPane().add(selectTooth, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, 20));

        toothChart.setFont(new java.awt.Font("Helvetica", 2, 18)); // NOI18N
        toothChart.setForeground(new java.awt.Color(255, 255, 255));
        toothChart.setText("tooth chart");
        getContentPane().add(toothChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 100, -1));

        lowerToothPanel.setOpaque(false);
        lowerToothPanel.setLayout(null);

        cL32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/32.png"))); // NOI18N
        cL32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL32MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL32);
        cL32.setBounds(20, 40, 22, 22);

        cL31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/31.png"))); // NOI18N
        cL31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL31MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL31);
        cL31.setBounds(20, 60, 22, 22);

        cL30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/30.png"))); // NOI18N
        cL30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL30MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL30);
        cL30.setBounds(20, 80, 22, 22);

        cL29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/29.png"))); // NOI18N
        cL29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL29MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL29);
        cL29.setBounds(20, 100, 22, 22);

        cL28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/28.png"))); // NOI18N
        cL28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL28MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL28);
        cL28.setBounds(20, 120, 22, 22);

        cL27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/27.png"))); // NOI18N
        cL27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL27MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL27);
        cL27.setBounds(30, 140, 22, 22);

        cL26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/26.png"))); // NOI18N
        cL26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL26MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL26);
        cL26.setBounds(40, 160, 22, 22);

        cL25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/25.png"))); // NOI18N
        cL25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL25MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL25);
        cL25.setBounds(60, 160, 22, 22);

        cL24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/24.png"))); // NOI18N
        cL24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL24MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL24);
        cL24.setBounds(80, 160, 22, 22);

        cL23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/23.png"))); // NOI18N
        cL23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL23MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL23);
        cL23.setBounds(100, 160, 22, 22);

        cL22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/22.png"))); // NOI18N
        cL22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL22MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL22);
        cL22.setBounds(110, 140, 22, 22);

        cL21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/21.png"))); // NOI18N
        cL21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL21MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL21);
        cL21.setBounds(120, 120, 22, 22);

        cL20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/20.png"))); // NOI18N
        cL20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL20MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL20);
        cL20.setBounds(120, 100, 22, 22);

        cL19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/19.png"))); // NOI18N
        cL19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL19MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL19);
        cL19.setBounds(120, 80, 22, 22);

        cL18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/18.png"))); // NOI18N
        cL18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL18MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL18);
        cL18.setBounds(120, 60, 22, 22);

        cL17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLowerClicked/17.png"))); // NOI18N
        cL17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cL17MouseClicked(evt);
            }
        });
        lowerToothPanel.add(cL17);
        cL17.setBounds(120, 40, 22, 22);

        L32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/32.png"))); // NOI18N
        L32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L32MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L32);
        L32.setBounds(20, 40, 22, 22);

        L31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/31.png"))); // NOI18N
        L31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L31MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L31);
        L31.setBounds(20, 60, 22, 22);

        L30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/30.png"))); // NOI18N
        L30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L30MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L30);
        L30.setBounds(20, 80, 22, 22);

        L29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/29.png"))); // NOI18N
        L29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L29MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L29);
        L29.setBounds(20, 100, 22, 22);

        L28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/28.png"))); // NOI18N
        L28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L28MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L28);
        L28.setBounds(20, 120, 22, 22);

        L27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/27.png"))); // NOI18N
        L27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L27MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L27);
        L27.setBounds(30, 140, 22, 22);

        L26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/26.png"))); // NOI18N
        L26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L26MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L26);
        L26.setBounds(40, 160, 22, 22);

        L25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/25.png"))); // NOI18N
        L25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L25MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L25);
        L25.setBounds(60, 160, 22, 22);

        L24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/24.png"))); // NOI18N
        L24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L24MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L24);
        L24.setBounds(80, 160, 22, 22);

        L23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/23.png"))); // NOI18N
        L23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L23MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L23);
        L23.setBounds(100, 160, 22, 22);

        L22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/22.png"))); // NOI18N
        L22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L22MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L22);
        L22.setBounds(110, 140, 22, 22);

        L21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/21.png"))); // NOI18N
        L21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L21MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L21);
        L21.setBounds(120, 120, 22, 22);

        L20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/20.png"))); // NOI18N
        L20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L20MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L20);
        L20.setBounds(120, 100, 22, 22);

        L19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/19.png"))); // NOI18N
        L19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L19MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L19);
        L19.setBounds(120, 80, 22, 22);

        L18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/18.png"))); // NOI18N
        L18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L18MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L18);
        L18.setBounds(120, 60, 22, 22);

        L17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothLower/17.png"))); // NOI18N
        L17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L17MouseClicked(evt);
            }
        });
        lowerToothPanel.add(L17);
        L17.setBounds(120, 40, 22, 22);

        getContentPane().add(lowerToothPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 180, 190));

        upperToothPanel.setOpaque(false);
        upperToothPanel.setLayout(null);

        cU16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/16.png"))); // NOI18N
        cU16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU16MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU16);
        cU16.setBounds(150, 150, 22, 22);

        cU15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/15.png"))); // NOI18N
        cU15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU15MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU15);
        cU15.setBounds(150, 130, 22, 22);

        cU14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/14.png"))); // NOI18N
        cU14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU14MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU14);
        cU14.setBounds(150, 110, 22, 22);

        cU13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/13.png"))); // NOI18N
        cU13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU13MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU13);
        cU13.setBounds(150, 90, 22, 22);

        cU12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/12.png"))); // NOI18N
        cU12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU12MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU12);
        cU12.setBounds(150, 70, 22, 22);

        cU11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/11.png"))); // NOI18N
        cU11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU11MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU11);
        cU11.setBounds(140, 50, 22, 22);

        cU10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/10.png"))); // NOI18N
        cU10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU10MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU10);
        cU10.setBounds(120, 40, 22, 22);

        cU9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/9.png"))); // NOI18N
        cU9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU9MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU9);
        cU9.setBounds(100, 30, 22, 22);

        cU8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/8.png"))); // NOI18N
        cU8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU8MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU8);
        cU8.setBounds(80, 30, 22, 22);

        cU7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/7.png"))); // NOI18N
        cU7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU7MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU7);
        cU7.setBounds(60, 40, 22, 22);

        cU6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/6.png"))); // NOI18N
        cU6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU6MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU6);
        cU6.setBounds(40, 50, 22, 22);

        cU5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/5.png"))); // NOI18N
        cU5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU5MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU5);
        cU5.setBounds(30, 70, 22, 22);

        cU4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/4.png"))); // NOI18N
        cU4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU4MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU4);
        cU4.setBounds(30, 90, 22, 22);

        cU3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/3.png"))); // NOI18N
        cU3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU3MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU3);
        cU3.setBounds(30, 110, 22, 22);

        cU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/2.png"))); // NOI18N
        cU2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU2MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU2);
        cU2.setBounds(30, 130, 22, 22);

        cU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpperClicked/1.png"))); // NOI18N
        cU1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cU1MouseClicked(evt);
            }
        });
        upperToothPanel.add(cU1);
        cU1.setBounds(30, 150, 22, 22);

        U16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/16.png"))); // NOI18N
        U16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U16MouseClicked(evt);
            }
        });
        upperToothPanel.add(U16);
        U16.setBounds(150, 150, 22, 22);

        U15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/15.png"))); // NOI18N
        U15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U15MouseClicked(evt);
            }
        });
        upperToothPanel.add(U15);
        U15.setBounds(150, 130, 22, 22);

        U14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/14.png"))); // NOI18N
        U14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U14MouseClicked(evt);
            }
        });
        upperToothPanel.add(U14);
        U14.setBounds(150, 110, 22, 22);

        U13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/13.png"))); // NOI18N
        U13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                U13MouseEntered(evt);
            }
        });
        upperToothPanel.add(U13);
        U13.setBounds(150, 90, 22, 22);

        U12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/12.png"))); // NOI18N
        U12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U12MouseClicked(evt);
            }
        });
        upperToothPanel.add(U12);
        U12.setBounds(150, 70, 22, 22);

        U11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/11.png"))); // NOI18N
        U11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U11MouseClicked(evt);
            }
        });
        upperToothPanel.add(U11);
        U11.setBounds(140, 50, 22, 22);

        U10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/10.png"))); // NOI18N
        U10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                U10MouseEntered(evt);
            }
        });
        upperToothPanel.add(U10);
        U10.setBounds(120, 40, 22, 22);

        U9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/9.png"))); // NOI18N
        U9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U9MouseClicked(evt);
            }
        });
        upperToothPanel.add(U9);
        U9.setBounds(100, 30, 22, 22);

        U8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/8.png"))); // NOI18N
        U8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U8MouseClicked(evt);
            }
        });
        upperToothPanel.add(U8);
        U8.setBounds(80, 30, 22, 22);

        U7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/7.png"))); // NOI18N
        U7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                U7MouseEntered(evt);
            }
        });
        upperToothPanel.add(U7);
        U7.setBounds(60, 40, 22, 22);

        U6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/6.png"))); // NOI18N
        U6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U6MouseClicked(evt);
            }
        });
        upperToothPanel.add(U6);
        U6.setBounds(40, 50, 22, 22);

        U5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/5.png"))); // NOI18N
        U5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U5MouseClicked(evt);
            }
        });
        upperToothPanel.add(U5);
        U5.setBounds(30, 70, 22, 22);

        U4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/4.png"))); // NOI18N
        U4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U4MouseClicked(evt);
            }
        });
        upperToothPanel.add(U4);
        U4.setBounds(30, 90, 22, 22);

        U3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/3.png"))); // NOI18N
        U3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U3MouseClicked(evt);
            }
        });
        upperToothPanel.add(U3);
        U3.setBounds(30, 110, 22, 22);

        U2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/2.png"))); // NOI18N
        U2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                U2MouseEntered(evt);
            }
        });
        upperToothPanel.add(U2);
        U2.setBounds(30, 130, 22, 22);

        U1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalInfo/toothUpper/1.png"))); // NOI18N
        U1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U1MouseClicked(evt);
            }
        });
        upperToothPanel.add(U1);
        U1.setBounds(30, 150, 22, 22);

        getContentPane().add(upperToothPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 180, 200));

        newPatForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/createNewUserForm/UPDATEPAT.png"))); // NOI18N
        getContentPane().add(newPatForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtrVeneersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrVeneersFocusGained
        // TODO add your handling code here:
        txtrVeneers.setText("");
        txtrVeneers.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrVeneersFocusGained

    private void txtrWhiteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrWhiteFocusGained
        // TODO add your handling code here:
        txtrWhite.setText("");
        txtrWhite.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrWhiteFocusGained

    private void txtrSealantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrSealantFocusGained
        // TODO add your handling code here:
        txtrSealant.setText("");
        txtrSealant.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrSealantFocusGained

    private void txtrRootFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrRootFocusGained
        // TODO add your handling code here:
        txtrRoot.setText("");
        txtrRoot.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrRootFocusGained

    private void txtrOralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrOralFocusGained
        // TODO add your handling code here:
        txtrOral.setText("");
        txtrOral.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrOralFocusGained

    private void txtrGumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrGumFocusGained
        // TODO add your handling code here:
        txtrGum.setText("");
        txtrGum.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrGumFocusGained

    private void txtrFillingFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrFillingFocusGained
        // TODO add your handling code here:
        txtrFilling.setText("");
        txtrFilling.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrFillingFocusGained

    private void txtrExtractFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrExtractFocusGained
        // TODO add your handling code here:
        txtrExtract.setText("");
        txtrExtract.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrExtractFocusGained

    private void txtrDenturesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrDenturesFocusGained
        // TODO add your handling code here:
        txtrDentures.setText("");
        txtrDentures.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrDenturesFocusGained

    private void txtrCrownsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrCrownsFocusGained
        // TODO add your handling code here:
        txtrCrowns.setText("");
        txtrCrowns.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrCrownsFocusGained

    private void txtrBridgesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrBridgesFocusGained
        // TODO add your handling code here:
        txtrBridges.setText("");
        txtrBridges.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrBridgesFocusGained

    private void txtrBracesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrBracesFocusGained
        // TODO add your handling code here:
        txtrBraces.setText("");
        txtrBraces.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrBracesFocusGained

    private void txtrBondingFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrBondingFocusGained
        // TODO add your handling code here:
        txtrBonding.setText("");
        txtrBonding.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtrBondingFocusGained

    private void txtBdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBdayFocusGained
        // TODO add your handling code here:
        txtBday.setText("");
        txtBday.setForeground(Color.black);
    }//GEN-LAST:event_txtBdayFocusGained

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void chkVeneersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVeneersActionPerformed
        // TODO add your handling code here:
        chkVeneers.setVisible(false);
    }//GEN-LAST:event_chkVeneersActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        chkVeneers.setVisible(true);
    }//GEN-LAST:event_btn13ActionPerformed

    private void chkWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkWhiteActionPerformed
        // TODO add your handling code here:
        chkWhite.setVisible(false);
    }//GEN-LAST:event_chkWhiteActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        chkWhite.setVisible(true);
    }//GEN-LAST:event_btn12ActionPerformed

    private void chkSealantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSealantActionPerformed
        // TODO add your handling code here:
        chkSealant.setVisible(false);
    }//GEN-LAST:event_chkSealantActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        chkSealant.setVisible(true);
    }//GEN-LAST:event_btn11ActionPerformed

    private void chkRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRootActionPerformed
        // TODO add your handling code here:
        chkRoot.setVisible(false);
    }//GEN-LAST:event_chkRootActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        chkRoot.setVisible(true);
    }//GEN-LAST:event_btn10ActionPerformed

    private void chkOralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOralActionPerformed
        // TODO add your handling code here:
        chkOral.setVisible(false);
    }//GEN-LAST:event_chkOralActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        chkOral.setVisible(true);
    }//GEN-LAST:event_btn9ActionPerformed

    private void chkGumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGumActionPerformed
        // TODO add your handling code here:
        chkGum.setVisible(false);
    }//GEN-LAST:event_chkGumActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        chkGum.setVisible(true);
    }//GEN-LAST:event_btn8ActionPerformed

    private void chkFillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFillingActionPerformed
        // TODO add your handling code here:
        chkFilling.setVisible(false);
    }//GEN-LAST:event_chkFillingActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        chkFilling.setVisible(true);
    }//GEN-LAST:event_btn7ActionPerformed

    private void chkExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExtractActionPerformed
        // TODO add your handling code here:
        chkExtract.setVisible(false);
    }//GEN-LAST:event_chkExtractActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        chkExtract.setVisible(true);
    }//GEN-LAST:event_btn6ActionPerformed

    private void chkDenturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDenturesActionPerformed
        // TODO add your handling code here:
        chkDentures.setVisible(false);
    }//GEN-LAST:event_chkDenturesActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        chkDentures.setVisible(true);
    }//GEN-LAST:event_btn5ActionPerformed

    private void chkCrownsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCrownsActionPerformed
        // TODO add your handling code here:
        chkCrowns.setVisible(false);
    }//GEN-LAST:event_chkCrownsActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        chkCrowns.setVisible(true);
    }//GEN-LAST:event_btn4ActionPerformed

    private void chkBridgesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBridgesActionPerformed
        // TODO add your handling code here:
        chkBridges.setVisible(false);
    }//GEN-LAST:event_chkBridgesActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        chkBridges.setVisible(true);
    }//GEN-LAST:event_btn3ActionPerformed

    private void chkBracesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBracesActionPerformed
        // TODO add your handling code here:
        chkBraces.setVisible(false);
    }//GEN-LAST:event_chkBracesActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        chkBraces.setVisible(true);
    }//GEN-LAST:event_btn2ActionPerformed

    private void chkBondingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBondingActionPerformed
        // TODO add your handling code here:
        chkBonding.setVisible(false);
    }//GEN-LAST:event_chkBondingActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        chkBonding.setVisible(true);
    }//GEN-LAST:event_btn1ActionPerformed

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
        remarks="";

        cU1.setVisible(false);
        cU2.setVisible(false);
        cU3.setVisible(false);
        cU4.setVisible(false);
        cU5.setVisible(false);
        cU6.setVisible(false);
        cU7.setVisible(false);
        cU8.setVisible(false);
        cU9.setVisible(false);
        cU10.setVisible(false);
        cU11.setVisible(false);
        cU12.setVisible(false);
        cU13.setVisible(false);
        cU14.setVisible(false);
        cU15.setVisible(false);
        cU16.setVisible(false);
        cL17.setVisible(false);
        cL18.setVisible(false);
        cL19.setVisible(false);
        cL20.setVisible(false);
        cL21.setVisible(false);
        cL22.setVisible(false);
        cL23.setVisible(false);
        cL24.setVisible(false);
        cL25.setVisible(false);
        cL26.setVisible(false);
        cL27.setVisible(false);
        cL28.setVisible(false);
        cL29.setVisible(false);
        cL30.setVisible(false);
        cL31.setVisible(false);
        cL32.setVisible(false);

        txtToothList.setText("");

        chkBonding.setVisible(false);
        chkBraces.setVisible(false);
        chkBridges.setVisible(false);
        chkCrowns.setVisible(false);
        chkDentures.setVisible(false);
        chkExtract.setVisible(false);
        chkFilling.setVisible(false);
        chkGum.setVisible(false);
        chkOral.setVisible(false);
        chkRoot.setVisible(false);
        chkSealant.setVisible(false);
        chkWhite.setVisible(false);
        chkVeneers.setVisible(false);
        
        txtPatID.setText("");
        txtName.setText("");
        txtBday.setText("yyyy-mm-dd");
        txtBday.setForeground(Color.gray);

        txtrBraces.setText("type remarks here...");
        txtrBraces.setForeground(Color.gray);
        txtrBonding.setText("type remarks here...");
        txtrBonding.setForeground(Color.gray);
        txtrBridges.setText("type remarks here...");
        txtrBridges.setForeground(Color.gray);
        txtrCrowns.setText("type remarks here...");
        txtrCrowns.setForeground(Color.gray);
        txtrDentures.setText("type remarks here...");
        txtrDentures.setForeground(Color.gray);
        txtrExtract.setText("type remarks here...");
        txtrExtract.setForeground(Color.gray);
        txtrFilling.setText("type remarks here...");
        txtrFilling.setForeground(Color.gray);
        txtrGum.setText("type remarks here...");
        txtrGum.setForeground(Color.gray);
        txtrOral.setText("type remarks here...");
        txtrOral.setForeground(Color.gray);
        txtrRoot.setText("type remarks here...");
        txtrRoot.setForeground(Color.gray);
        txtrSealant.setText("type remarks here...");
        txtrSealant.setForeground(Color.gray);
        txtrWhite.setText("type remarks here...");
        txtrWhite.setForeground(Color.gray);
        txtrVeneers.setText("type remarks here...");
        txtrVeneers.setForeground(Color.gray);

        txtName.requestFocus();
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

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:

        try
        {
            Paragraph pa = new Paragraph();
            /*Class.forName("org.apache.derby.jdbc.ClientDriver");
            String fidelString = "jdbc:derby://localhost:1527/UserLogin";
            Connection fidelcon = DriverManager.getConnection(fidelString, "login", "login");*/
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
            Connection con = DriverManager.getConnection(drive, "", "");
            String operations = "";
            if(chkBonding.isVisible())
            {
                Statement stmt1 = con.createStatement();
                String insertsql1 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'bonding "+txtToothList.getText()+"', '"+txtrBonding.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt1.execute(insertsql1);
                stmt1.close();
                operations +="Bonding ";
                
            }
            if(chkBraces.isVisible())
            {
                Statement stmt2 = con.createStatement();
                String insertsql2 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'braces "+txtToothList.getText()+"', '"+txtrBraces.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt2.execute(insertsql2);
                stmt2.close();
                operations +="Braces ";
            }
            if(chkBridges.isVisible())
            {
                Statement stmt3 = con.createStatement();
                String insertsql3 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'bridges "+txtToothList.getText()+"', '"+txtrBridges.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt3.execute(insertsql3);
                stmt3.close();
                operations +="Bridges ";
            }
            if(chkCrowns.isVisible())
            {
                Statement stmt4 = con.createStatement();
                String insertsql4 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'crowns "+txtToothList.getText()+"', '"+txtrCrowns.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt4.execute(insertsql4);
                stmt4.close();
                operations +="Crowns ";
            }
            if(chkDentures.isVisible())
            {
                Statement stmt5 = con.createStatement();
                String insertsql5 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'dentures "+txtToothList.getText()+"', '"+txtrDentures.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt5.execute(insertsql5);
                stmt5.close();
                operations +="Dentures";
            }
            if(chkOral.isVisible())
            {
                Statement stmt6 = con.createStatement();
                String insertsql6 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'oral examination "+txtToothList.getText()+"', '"+txtrOral.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt6.execute(insertsql6);
                stmt6.close();
                operations +="Oral ";
            }
            if(chkExtract.isVisible())
            {
                Statement stmt7 = con.createStatement();
                String insertsql7 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'tooth extraction "+txtToothList.getText()+"', '"+txtrExtract.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt7.execute(insertsql7);
                stmt7.close();
                operations +="Extract ";
            }
            if(chkFilling.isVisible())
            {
                Statement stmt8 = con.createStatement();
                String insertsql8 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'dental filling "+txtToothList.getText()+"', '"+txtrFilling.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt8.execute(insertsql8);
                stmt8.close();
                operations +="Filling ";
            }
            if(chkRoot.isVisible())
            {
                Statement stmt9 = con.createStatement();
                String insertsql9 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'root canal "+txtToothList.getText()+"', '"+txtrRoot.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt9.execute(insertsql9);
                stmt9.close();
                operations +="Root ";
            }
            if(chkSealant.isVisible())
            {
                Statement stmt10 = con.createStatement();
                String insertsql10 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'sealant "+txtToothList.getText()+"', '"+txtrSealant.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt10.execute(insertsql10);
                stmt10.close();
                operations +="Sealant ";
            }
            if(chkGum.isVisible())
            {
                Statement stmt11 = con.createStatement();
                String insertsql11 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'tooth surgery "+txtToothList.getText()+"', '"+txtrGum.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt11.execute(insertsql11);
                stmt11.close();
                operations +="Gum ";
            }
            if(chkVeneers.isVisible())
            {
                Statement stmt12 = con.createStatement();
                String insertsql12 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'veneers "+txtToothList.getText()+"', '"+txtrVeneers.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt12.execute(insertsql12);
                stmt12.close();
                operations +="Veneers ";
            }
            if(chkWhite.isVisible())
            {
                Statement stmt13 = con.createStatement();
                String insertsql13 = "insert into patientrecord(transID, pID, procedures, remarks, date_) values('"+userLog.getCurrentDateTimeMS()+"', '"+txtPatID.getText()+"', 'teeth whitening "+txtToothList.getText()+"', '"+txtrWhite.getText()+"', '"+java.time.LocalDate.now()+"')";
                stmt13.execute(insertsql13);
                stmt13.close();
                operations +="White ";
            }
            
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "Patient record updated!");
            con.close();
            
            createPDF();
            pdfcomponent = bm.CompanySignature();
            pdfcomponent += "                     Billing\n";
            pdfcomponent += "------------------------------------------------------------------------------------------------------------\n";
         
            
            pdfcomponent += "Name:  "+txtName.getText()+"\n";
            pdfcomponent += "Teeth Operated Upon: "+txtToothList.getText()+"\n";
            pdfcomponent += "Services Availed: "+operations+"\n";
            pdfcomponent += "Date: "+userLog.getCurrentDate()+"\n";
            pdfcomponent += "Rate: 1500.00 PHP";
            pdfcomponent += "Total: "+userLog.numOfTeeth * 1500+".00 PHP\n";
            pa = setParagraphFont(16f,20f,pdfcomponent);
            doc.add(pa);
            
        }
        catch(Exception e)
        {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateMouseClicked
  private Paragraph setParagraphFont(float fontSize, float lineSpacing, String text){
        Paragraph p = new Paragraph(new Phrase(lineSpacing,text,
               FontFactory.getFont(FontFactory.COURIER, fontSize)));
        
        return p;
    }
    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
        btnUpdate.setVisible(false);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
        btnUpdate.setVisible(true);
    }//GEN-LAST:event_updateMouseEntered

    private void cL32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL32MouseClicked
        // TODO add your handling code here:
        deltooth(" L32 ");
        cL32.setVisible(false);
    
    }//GEN-LAST:event_cL32MouseClicked

    private void cL31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL31MouseClicked
        // TODO add your handling code here:
        deltooth(" L31 ");
        cL31.setVisible(false);

    }//GEN-LAST:event_cL31MouseClicked

    private void cL30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL30MouseClicked
        // TODO add your handling code here:
        deltooth(" L30 ");
        cL30.setVisible(false);

    }//GEN-LAST:event_cL30MouseClicked

    private void cL29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL29MouseClicked
        // TODO add your handling code here:
        deltooth(" L29 ");
        cL29.setVisible(false);
     
    }//GEN-LAST:event_cL29MouseClicked

    private void cL28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL28MouseClicked
        // TODO add your handling code here:
        deltooth(" L28 ");
        cL28.setVisible(false);
      
    }//GEN-LAST:event_cL28MouseClicked

    private void cL27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL27MouseClicked
        // TODO add your handling code here:
        deltooth(" L27 ");
        cL27.setVisible(false);
   
    }//GEN-LAST:event_cL27MouseClicked

    private void cL26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL26MouseClicked
        // TODO add your handling code here:
        deltooth(" L26 ");
        cL26.setVisible(false);
  
    }//GEN-LAST:event_cL26MouseClicked

    private void cL25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL25MouseClicked
        // TODO add your handling code here:
        deltooth(" L25 ");
        cL25.setVisible(false);

    }//GEN-LAST:event_cL25MouseClicked

    private void cL24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL24MouseClicked
        // TODO add your handling code here:
        deltooth(" L24 ");
        cL24.setVisible(false);
     
    }//GEN-LAST:event_cL24MouseClicked

    private void cL23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL23MouseClicked
        // TODO add your handling code here:
        deltooth(" L23 ");
        cL23.setVisible(false);
 
    }//GEN-LAST:event_cL23MouseClicked

    private void cL22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL22MouseClicked
        // TODO add your handling code here:
        deltooth(" L22 ");
        cL22.setVisible(false);
  
    }//GEN-LAST:event_cL22MouseClicked

    private void cL21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL21MouseClicked
        // TODO add your handling code here:
        deltooth(" L21 ");
        cL21.setVisible(false);

    }//GEN-LAST:event_cL21MouseClicked

    private void cL20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL20MouseClicked
        // TODO add your handling code here:
        deltooth(" L20 ");
        cL20.setVisible(false);

    }//GEN-LAST:event_cL20MouseClicked

    private void cL19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL19MouseClicked
        // TODO add your handling code here:
        deltooth(" L19 ");
        cL19.setVisible(false);

    }//GEN-LAST:event_cL19MouseClicked

    private void cL18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL18MouseClicked
        // TODO add your handling code here:
        deltooth(" L18 ");
        cL18.setVisible(false);

    }//GEN-LAST:event_cL18MouseClicked

    private void cL17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cL17MouseClicked
        // TODO add your handling code here:
        deltooth(" L17 ");
        cL17.setVisible(false);
       
    }//GEN-LAST:event_cL17MouseClicked

    private void L32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L32MouseClicked
        // TODO add your handling code here:
        settooth(" L32 ");
        cL32.setVisible(true);

    }//GEN-LAST:event_L32MouseClicked

    private void L31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L31MouseClicked
        // TODO add your handling code here:
        settooth(" L31 ");
        cL31.setVisible(true);

    }//GEN-LAST:event_L31MouseClicked

    private void L30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L30MouseClicked
        // TODO add your handling code here:
        settooth(" L30 ");
        cL30.setVisible(true);

    }//GEN-LAST:event_L30MouseClicked

    private void L29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L29MouseClicked
        // TODO add your handling code here:
        settooth(" L29 ");
        cL29.setVisible(true);

    }//GEN-LAST:event_L29MouseClicked

    private void L28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L28MouseClicked
        // TODO add your handling code here:
        settooth(" L28 ");
        cL28.setVisible(true);
 
    }//GEN-LAST:event_L28MouseClicked

    private void L27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L27MouseClicked
        // TODO add your handling code here:
        settooth(" L27 ");
        cL27.setVisible(true);
 
    }//GEN-LAST:event_L27MouseClicked

    private void L26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L26MouseClicked
        // TODO add your handling code here:
        settooth(" L26 ");
        cL26.setVisible(true);
  
    }//GEN-LAST:event_L26MouseClicked

    private void L25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L25MouseClicked
        // TODO add your handling code here:
        settooth(" L25 ");
        cL25.setVisible(true);

    }//GEN-LAST:event_L25MouseClicked

    private void L24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L24MouseClicked
        // TODO add your handling code here:
        settooth(" L24 ");
        cL24.setVisible(true);

    }//GEN-LAST:event_L24MouseClicked

    private void L23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L23MouseClicked
        // TODO add your handling code here:
        settooth(" L23 ");
        cL23.setVisible(true);

    }//GEN-LAST:event_L23MouseClicked

    private void L22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L22MouseClicked
        // TODO add your handling code here:
        settooth(" L22 ");
        cL22.setVisible(true);

    }//GEN-LAST:event_L22MouseClicked

    private void L21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L21MouseClicked
        // TODO add your handling code here:
        settooth(" L21 ");

    }//GEN-LAST:event_L21MouseClicked

    private void L20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L20MouseClicked
        // TODO add your handling code here:
        settooth(" L20 ");
        cL20.setVisible(true);

    }//GEN-LAST:event_L20MouseClicked

    private void L19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L19MouseClicked
        // TODO add your handling code here:
        settooth(" L19 ");
        cL19.setVisible(true);

    }//GEN-LAST:event_L19MouseClicked

    private void L18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L18MouseClicked
        // TODO add your handling code here:
        settooth(" L18 ");
        cL18.setVisible(true);

    }//GEN-LAST:event_L18MouseClicked

    private void L17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L17MouseClicked
        // TODO add your handling code here:
        settooth(" L17 ");
        cL17.setVisible(true);
    }//GEN-LAST:event_L17MouseClicked

    private void cU16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU16MouseClicked
        // TODO add your handling code here:
        deltooth(" U16 ");
        cU16.setVisible(false);
    }//GEN-LAST:event_cU16MouseClicked

    private void cU15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU15MouseClicked
        // TODO add your handling code here:
        deltooth(" U15 ");
        cU15.setVisible(false);
    }//GEN-LAST:event_cU15MouseClicked

    private void cU14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU14MouseClicked
        // TODO add your handling code here:
        deltooth(" U14 ");
        cU14.setVisible(false);
    }//GEN-LAST:event_cU14MouseClicked

    private void cU13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU13MouseClicked
        // TODO add your handling code here:
        deltooth(" U13 ");
        cU13.setVisible(false);
    }//GEN-LAST:event_cU13MouseClicked

    private void cU12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU12MouseClicked
        // TODO add your handling code here:
        deltooth(" U12 ");
        cU12.setVisible(false);
    }//GEN-LAST:event_cU12MouseClicked

    private void cU11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU11MouseClicked
        // TODO add your handling code here:
        deltooth(" U11 ");
        cU11.setVisible(false);
    }//GEN-LAST:event_cU11MouseClicked

    private void cU10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU10MouseClicked
        // TODO add your handling code here:
        deltooth(" U10 ");
        cU10.setVisible(false);
    }//GEN-LAST:event_cU10MouseClicked

    private void cU9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU9MouseClicked
        // TODO add your handling code here:
        deltooth(" U9 ");
        cU9.setVisible(false);
    }//GEN-LAST:event_cU9MouseClicked

    private void cU8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU8MouseClicked
        // TODO add your handling code here:
        deltooth(" U8 ");
        cU8.setVisible(false);
    }//GEN-LAST:event_cU8MouseClicked

    private void cU7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU7MouseClicked
        // TODO add your handling code here:
        deltooth(" U7 ");
        cU7.setVisible(false);
    }//GEN-LAST:event_cU7MouseClicked

    private void cU6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU6MouseClicked
        // TODO add your handling code here:
        deltooth(" U6 ");
        cU6.setVisible(false);
    }//GEN-LAST:event_cU6MouseClicked

    private void cU5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU5MouseClicked
        // TODO add your handling code here:
        deltooth(" U5 ");
        cU5.setVisible(false);
    }//GEN-LAST:event_cU5MouseClicked

    private void cU4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU4MouseClicked
        // TODO add your handling code here:
        deltooth(" U4 ");
        cU4.setVisible(false);
    }//GEN-LAST:event_cU4MouseClicked

    private void cU3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU3MouseClicked
        // TODO add your handling code here:
        deltooth(" U3 ");
        cU3.setVisible(false);
    }//GEN-LAST:event_cU3MouseClicked

    private void cU2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU2MouseClicked
        // TODO add your handling code here:
        deltooth(" U2 ");
        cU2.setVisible(false);
    }//GEN-LAST:event_cU2MouseClicked

    private void cU1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cU1MouseClicked
        // TODO add your handling code here:
        deltooth(" U1 ");
        cU1.setVisible(false);
    }//GEN-LAST:event_cU1MouseClicked

    private void U16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U16MouseClicked
        // TODO add your handling code here:
        settooth(" U16 ");
        cU16.setVisible(true);
    }//GEN-LAST:event_U16MouseClicked

    private void U15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U15MouseClicked
        // TODO add your handling code here:
        settooth(" U15 ");
        cU15.setVisible(true);
    }//GEN-LAST:event_U15MouseClicked

    private void U14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U14MouseClicked
        // TODO add your handling code here:
        settooth(" U14 ");
        cU14.setVisible(true);
    }//GEN-LAST:event_U14MouseClicked

    private void U13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U13MouseClicked
        // TODO add your handling code here:
        settooth(" U13 ");
        cU13.setVisible(true);
    }//GEN-LAST:event_U13MouseClicked

    private void U13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_U13MouseEntered

    private void U12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U12MouseClicked
        // TODO add your handling code here:
        settooth(" U12 ");
        cU12.setVisible(true);
    }//GEN-LAST:event_U12MouseClicked

    private void U11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U11MouseClicked
        // TODO add your handling code here:
        settooth(" U11 ");
        cU11.setVisible(true);
    }//GEN-LAST:event_U11MouseClicked

    private void U10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U10MouseClicked
        // TODO add your handling code here:
        settooth(" U10 ");
        cU10.setVisible(true);
    }//GEN-LAST:event_U10MouseClicked

    private void U10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_U10MouseEntered

    private void U9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U9MouseClicked
        // TODO add your handling code here:
        settooth(" U9 ");
        cU9.setVisible(true);
    }//GEN-LAST:event_U9MouseClicked

    private void U8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U8MouseClicked
        // TODO add your handling code here:
        settooth(" U8 ");
        cU8.setVisible(true);
    }//GEN-LAST:event_U8MouseClicked

    private void U7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U7MouseClicked
        // TODO add your handling code here:
        settooth(" U7 ");
        cU7.setVisible(true);

    }//GEN-LAST:event_U7MouseClicked

    private void U7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_U7MouseEntered

    private void U6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U6MouseClicked
        // TODO add your handling code here:
        settooth(" U6 ");
        cU6.setVisible(true);
    }//GEN-LAST:event_U6MouseClicked

    private void U5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U5MouseClicked
        // TODO add your handling code here:
        settooth(" U5 ");
        cU5.setVisible(true);
    }//GEN-LAST:event_U5MouseClicked

    private void U4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U4MouseClicked
        // TODO add your handling code here:
        settooth(" U4 ");
        cU4.setVisible(true);
    }//GEN-LAST:event_U4MouseClicked

    private void U3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U3MouseClicked
        // TODO add your handling code here:
        settooth(" U3 ");
        cU3.setVisible(true);
    }//GEN-LAST:event_U3MouseClicked

    private void U2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseClicked
        // TODO add your handling code here:
        settooth(" U2 ");
        cU2.setVisible(true);
    }//GEN-LAST:event_U2MouseClicked

    private void U2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_U2MouseEntered

    private void U1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseClicked
        // TODO add your handling code here:
        settooth(" U1 ");
        cU1.setVisible(true);
    }//GEN-LAST:event_U1MouseClicked

    private void tblPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsMouseClicked
         int row = tblPatients.getSelectedRow();
        String id = (tblPatients.getModel().getValueAt(row, 0).toString());
        try
        {
            /*Class.forName("org.apache.derby.jdbc.ClientDriver");
            String fidelString = "jdbc:derby://localhost:1527/UserLogin";
            Connection fidelcon = DriverManager.getConnection(fidelString, "login", "login");
            Statement fidelstmt = fidelcon.createStatement();*/
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
           Connection con = DriverManager.getConnection(drive, "", "");
           Statement stmt = con.createStatement();
            String query = "select * from patientinfo where pID='"+id+"'";
            ResultSet result = stmt.executeQuery(query);
            
            if(result.next())
            {
                String field1 = result.getString("pID");
                txtPatID.setText(field1);
                String field2 = result.getString("pName");
                txtName.setText(field2);
                String field3 = result.getString("pBirthdate");
                txtBday.setText(field3);
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
    }//GEN-LAST:event_tblPatientsMouseClicked

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
            java.util.logging.Logger.getLogger(updatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatePatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L17;
    private javax.swing.JLabel L18;
    private javax.swing.JLabel L19;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L21;
    private javax.swing.JLabel L22;
    private javax.swing.JLabel L23;
    private javax.swing.JLabel L24;
    private javax.swing.JLabel L25;
    private javax.swing.JLabel L26;
    private javax.swing.JLabel L27;
    private javax.swing.JLabel L28;
    private javax.swing.JLabel L29;
    private javax.swing.JLabel L30;
    private javax.swing.JLabel L31;
    private javax.swing.JLabel L32;
    private javax.swing.JLabel U1;
    private javax.swing.JLabel U10;
    private javax.swing.JLabel U11;
    private javax.swing.JLabel U12;
    private javax.swing.JLabel U13;
    private javax.swing.JLabel U14;
    private javax.swing.JLabel U15;
    private javax.swing.JLabel U16;
    private javax.swing.JLabel U2;
    private javax.swing.JLabel U3;
    private javax.swing.JLabel U4;
    private javax.swing.JLabel U5;
    private javax.swing.JLabel U6;
    private javax.swing.JLabel U7;
    private javax.swing.JLabel U8;
    private javax.swing.JLabel U9;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel cL17;
    private javax.swing.JLabel cL18;
    private javax.swing.JLabel cL19;
    private javax.swing.JLabel cL20;
    private javax.swing.JLabel cL21;
    private javax.swing.JLabel cL22;
    private javax.swing.JLabel cL23;
    private javax.swing.JLabel cL24;
    private javax.swing.JLabel cL25;
    private javax.swing.JLabel cL26;
    private javax.swing.JLabel cL27;
    private javax.swing.JLabel cL28;
    private javax.swing.JLabel cL29;
    private javax.swing.JLabel cL30;
    private javax.swing.JLabel cL31;
    private javax.swing.JLabel cL32;
    private javax.swing.JLabel cU1;
    private javax.swing.JLabel cU10;
    private javax.swing.JLabel cU11;
    private javax.swing.JLabel cU12;
    private javax.swing.JLabel cU13;
    private javax.swing.JLabel cU14;
    private javax.swing.JLabel cU15;
    private javax.swing.JLabel cU16;
    private javax.swing.JLabel cU2;
    private javax.swing.JLabel cU3;
    private javax.swing.JLabel cU4;
    private javax.swing.JLabel cU5;
    private javax.swing.JLabel cU6;
    private javax.swing.JLabel cU7;
    private javax.swing.JLabel cU8;
    private javax.swing.JLabel cU9;
    private javax.swing.JLabel cancel;
    private javax.swing.JButton chkBonding;
    private javax.swing.JButton chkBraces;
    private javax.swing.JButton chkBridges;
    private javax.swing.JButton chkCrowns;
    private javax.swing.JButton chkDentures;
    private javax.swing.JButton chkExtract;
    private javax.swing.JButton chkFilling;
    private javax.swing.JButton chkGum;
    private javax.swing.JButton chkOral;
    private javax.swing.JButton chkRoot;
    private javax.swing.JButton chkSealant;
    private javax.swing.JButton chkVeneers;
    private javax.swing.JButton chkWhite;
    private javax.swing.JLabel clear;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel lowerToothPanel;
    private javax.swing.JLabel newPatForm;
    private javax.swing.JPanel remarksPanel;
    private javax.swing.JLabel selectTooth;
    private javax.swing.JPanel servicesPanel;
    private javax.swing.JTable tblPatients;
    private javax.swing.JLabel toothChart;
    private javax.swing.JTextField txtBday;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtPatID;
    private javax.swing.JLabel txtToothList;
    private javax.swing.JTextField txtrBonding;
    private javax.swing.JTextField txtrBraces;
    private javax.swing.JTextField txtrBridges;
    private javax.swing.JTextField txtrCrowns;
    private javax.swing.JTextField txtrDentures;
    private javax.swing.JTextField txtrExtract;
    private javax.swing.JTextField txtrFilling;
    private javax.swing.JTextField txtrGum;
    private javax.swing.JTextField txtrOral;
    private javax.swing.JTextField txtrRoot;
    private javax.swing.JTextField txtrSealant;
    private javax.swing.JTextField txtrVeneers;
    private javax.swing.JTextField txtrWhite;
    private javax.swing.JLabel update;
    private javax.swing.JPanel upperToothPanel;
    // End of variables declaration//GEN-END:variables
}
