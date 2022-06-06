/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;
import java.awt.Toolkit;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Cpt.coldblood
 */
public class Bookings extends javax.swing.JFrame {

    
    
    /**
     * Creates new form Bookings
     */
    public Bookings() {
        initComponents();
        populatetable();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ic.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNights = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        txtBno = new javax.swing.JTextField();
        txtCno = new javax.swing.JTextField();
        txtRno = new javax.swing.JTextField();
        chkBreakfast = new javax.swing.JCheckBox();
        chkLunch = new javax.swing.JCheckBox();
        chkDinner = new javax.swing.JCheckBox();
        chkCleaning = new javax.swing.JCheckBox();
        chkWifi = new javax.swing.JCheckBox();
        chkBar = new javax.swing.JCheckBox();
        btnConfirm = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnMain = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        txtPredicted = new javax.swing.JTextField();
        btncal = new javax.swing.JButton();
        dateCheckIn = new com.toedter.calendar.JDateChooser();
        dateCheckOut = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCheckin_out = new javax.swing.JTable();
        bac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bookings");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 210, 60));

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Boking Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 61, 130, 35));

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 103, 130, 34));

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Room Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 154, 130, 29));

        jLabel5.setBackground(new java.awt.Color(51, 255, 51));
        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("Services Needed");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 193, 130, 34));

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("Check In Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 303, 130, 36));

        jLabel7.setBackground(new java.awt.Color(51, 255, 51));
        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("Check Out Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 313, 130, -1));

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("No. of days");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 24));

        jLabel9.setBackground(new java.awt.Color(51, 255, 51));
        jLabel9.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 0));
        jLabel9.setText("No. of Nights");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 130, 24));

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Payable amount for the ordered services and room without taxes ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 33));

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("This is not the final payment value.It is just a brief forecasted bill amount .");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 495, 640, 43));

        txtNights.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtNights, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 150, 24));

        txtDays.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 174, 24));

        txtBno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtBno, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 61, 390, 35));

        txtCno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtCno, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 103, 390, 35));

        txtRno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtRno, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 151, 390, 35));

        chkBreakfast.setBackground(new java.awt.Color(102, 102, 255));
        chkBreakfast.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        chkBreakfast.setText("Breakfast");
        getContentPane().add(chkBreakfast, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 198, -1, -1));

        chkLunch.setBackground(new java.awt.Color(102, 102, 255));
        chkLunch.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        chkLunch.setText("Lunch");
        getContentPane().add(chkLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 230, -1, -1));

        chkDinner.setBackground(new java.awt.Color(102, 102, 255));
        chkDinner.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        chkDinner.setText("Dinner");
        getContentPane().add(chkDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 260, -1, -1));

        chkCleaning.setBackground(new java.awt.Color(102, 102, 255));
        chkCleaning.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        chkCleaning.setText("Cleaning");
        getContentPane().add(chkCleaning, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 198, -1, -1));

        chkWifi.setBackground(new java.awt.Color(102, 102, 255));
        chkWifi.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        chkWifi.setText("Wifi");
        getContentPane().add(chkWifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 230, -1, -1));

        chkBar.setBackground(new java.awt.Color(102, 102, 255));
        chkBar.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        chkBar.setText("Bar");
        getContentPane().add(chkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 260, -1, -1));

        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 0, 0));
        btnConfirm.setText("Confirm booking");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, 50));

        btnClr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClr.setForeground(new java.awt.Color(255, 0, 0));
        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });
        getContentPane().add(btnClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 120, 50));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 0, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 120, 50));

        btnDel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 0, 0));
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 120, 50));

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("It may change due to various aspects.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 500, -1));

        btnMain.setForeground(new java.awt.Color(0, 0, 204));
        btnMain.setText("MainMenu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        getContentPane().add(btnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        btnlogout.setForeground(new java.awt.Color(0, 0, 204));
        btnlogout.setText("LogOut");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, -1));

        btnPay.setText("Continue to Payment");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 430, 40));

        txtPredicted.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtPredicted, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 270, 30));

        btncal.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btncal.setForeground(new java.awt.Color(0, 0, 255));
        btncal.setText("Calculate");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });
        getContentPane().add(btncal, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 350, 100, -1));

        dateCheckIn.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(dateCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, -1));

        dateCheckOut.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(dateCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 170, -1));

        tableCheckin_out.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Room No.", "Check in Date", "Check out Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCheckin_out);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 538, -1));

        bac.setForeground(new java.awt.Color(255, 0, 0));
        bac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/48077114-abstract-blur-hotel-lobby-background.jpg"))); // NOI18N
        bac.setText("Calculate");
        bac.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        getContentPane().add(bac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void populatetable(){
        DBConnect con = new DBConnect();
        Connection c1=con.connect();
        try{
            PreparedStatement s1=c1.prepareStatement("select bid,rno,checkin,checkout from booking");
            ResultSet rs2=s1.executeQuery();
            
           tableCheckin_out.setModel(DbUtils.resultSetToTableModel(rs2));
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    

    }
    
    
    
    
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed


String bid,cno,rno,breakfast="no",lunch="no",dinner="no",cleaning="no",wifi="no",bar="no",days,nights,checkin,out;float pay;Float roomcharge=0f;
       bid=txtBno.getText();
       cno=txtCno.getText();
       rno=txtRno.getText();
       checkin=((JTextField)dateCheckIn.getDateEditor().getUiComponent()).getText();
       out=((JTextField)dateCheckOut.getDateEditor().getUiComponent()).getText();
        System.out.println(out);
        System.out.println(checkin);
       String sid1="";String sid2="";String sid3="";String sid4="";String sid5="";String sid6="";
       if(chkBreakfast.isSelected()){
       breakfast="yes";  
       sid1="S002";
       }
       if(chkLunch.isSelected()){
           lunch="yes";
            sid2="S001";
       }
       if(chkDinner.isSelected()){
           dinner="yes";
            sid3="S003";
       }
       if(chkCleaning.isSelected()){
           cleaning="yes";
            sid4="S004";
       }
       if(chkWifi.isSelected()){
           wifi="yes";
            sid5="S005";
       }
       if(chkBar.isSelected()){
           bar="yes";
            sid6="S006";
       }
       
        LocalDate cin=LocalDate.parse(checkin);
        LocalDate cout=LocalDate.parse(out);
        Long daydif=ChronoUnit.DAYS.between(cin, cout);
       txtDays.setText(String.valueOf(daydif));
       int x=Integer.parseInt(txtDays.getText());
       int y=x+1;
       nights=String.valueOf(y);
       days=String.valueOf(daydif);
       txtNights.setText(nights);
       if(bid.isEmpty()||cno.isEmpty()||rno.isEmpty()||checkin.isEmpty()||out.isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "Please do notleave Empty", "Empty Fields", ERROR_MESSAGE);
           
       }
       else{
       
       DBConnect con1=new DBConnect();
       Connection c1=con1.connect();
       try{
           Statement s1 =c1.createStatement();
           int co=s1.executeUpdate("insert into booking values('"+bid+"','"+cno+"','"+rno+"','"+breakfast+"','"+lunch+"','"+dinner+"','"+cleaning+"','"+wifi+"','"+bar+"','"+checkin+"','"+out+"','"+days+"','"+nights+"')");
            if(co==1){
                JOptionPane.showMessageDialog(rootPane, "Successful Booking","booked",INFORMATION_MESSAGE);
                    populatetable();
                    
                   
            }
       }
       catch(SQLException e){
           System.out.println(e.getMessage());
       }
       DBConnect conn=new DBConnect();
        Connection cp=conn.connect();
       
        try{
            Statement s5=cp.createStatement();
        
        
        ResultSet rsroom=s5.executeQuery("select charges from rooms where rno='"+rno+"'");
           
     
            Float servicecharge1=0f,servicecharge2=0f,servicecharge3=0f,servicecharge4=0f,servicecharge5=0f,servicecharge6=0f;
            while (rsroom.next()){
                 roomcharge=Float.parseFloat(rsroom.getString(1));
                
            }
             ResultSet rsService1=s5.executeQuery("select charges from service where sid='"+sid1+"'");
            while(rsService1.next()){
                servicecharge1=rsService1.getFloat(1);
                 if (servicecharge1.isNaN()){
                    servicecharge1=0f;
                }
            }
            ResultSet rsService2=s5.executeQuery("select charges from service where sid='"+sid2+"'");
              while(rsService2.next()){
                servicecharge2=rsService2.getFloat(1);
                if (servicecharge2.isNaN()){
                    servicecharge2=0f;
                }
            }
              ResultSet rsService3=s5.executeQuery("select charges from service where sid='"+sid3+"'"); 
              while(rsService3.next()){
                servicecharge3=rsService3.getFloat(1);
                 if (servicecharge3.isNaN()){
                    servicecharge3=0f;
                }
                }
              ResultSet rsService4=s5.executeQuery("select charges from service where sid='"+sid4+"'");
                  while(rsService4.next()){
                servicecharge4=rsService4.getFloat(1);
                 if (servicecharge4.isNaN()){
                    servicecharge4=0f;
                }
                
                  }
                  ResultSet rsService5=s5.executeQuery("select charges from service where sid='"+sid5+"'");
                    while(rsService5.next()){
                servicecharge5=rsService5.getFloat(1);
                     if (servicecharge5.isNaN()){
                    servicecharge5=0f;
                }
                    } 
                    ResultSet rsService6=s5.executeQuery("select charges from service where sid='"+sid6+"'");
                    while(rsService6.next()){
                servicecharge6=rsService6.getFloat(1);
                     if (servicecharge6.isNaN()){
                    servicecharge6=0f;
                }
                    }
            
        Float totpred = (roomcharge+servicecharge1+servicecharge2+servicecharge3+servicecharge4+servicecharge5+servicecharge6)*x;
        ImageIcon Icon=new ImageIcon("1-25-512.png");
        JOptionPane.showMessageDialog(rootPane, "The total Amount of your bill will approximately will be Rs."+totpred,"PredictBill",INFORMATION_MESSAGE,Icon);
        txtPredicted.setText(totpred.toString());
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
       
}
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed
        String checkin,out,days,nights;
        checkin=((JTextField)dateCheckIn.getDateEditor().getUiComponent()).getText();
       out=((JTextField)dateCheckOut.getDateEditor().getUiComponent()).getText();
        if(checkin.isEmpty()||out.isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "Select both check in and out","Error",WARNING_MESSAGE);
        }
        else{LocalDate cin=LocalDate.parse(checkin);
        LocalDate cout=LocalDate.parse(out);
        Long daydif=ChronoUnit.DAYS.between(cin, cout);
       txtDays.setText(String.valueOf(daydif));
       int x=Integer.parseInt(txtDays.getText());
       int y=x+1;
       nights=String.valueOf(y);
       days=String.valueOf(daydif);
       txtNights.setText(nights);
        }
    }//GEN-LAST:event_btncalActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
       txtBno.setText(null);
       txtCno.setText(null);
       txtNights.setText(null);
       txtRno.setText(null);
       txtDays.setText(null);
       bac.setText(null);
       chkBreakfast.setSelected(false);
       chkLunch.setSelected(false);
       chkDinner.setSelected(false);
       chkCleaning.setSelected(false);
       chkWifi.setSelected(false);
       chkBar.setSelected(false);
       dateCheckIn.setDate(null);
       dateCheckOut.setDate(null);
    }//GEN-LAST:event_btnClrActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search=JOptionPane.showInputDialog(null,"Enter the Booking ID number of the employee to search","Search");
         DBConnect con1=new DBConnect();
          con1.connect();
        
        try {
            Statement s1=con1.connect().createStatement();
            ResultSet rs1=s1.executeQuery("select * from booking where bid='"+search+"'");
            while(rs1.next()){
              txtBno.setText(rs1.getString(1));
              txtCno.setText(rs1.getString(2));
              txtRno.setText(rs1.getString(3));
              String x="yes";
              if(x.equalsIgnoreCase(rs1.getString(4))){
                  chkBreakfast.setSelected(true);
              }  
               if(x.equalsIgnoreCase(rs1.getString(5))){
                  chkLunch.setSelected(true);
              }  
                if(x.equalsIgnoreCase(rs1.getString(6))){
                  chkDinner.setSelected(true);
              }  
                if(x.equalsIgnoreCase(rs1.getString(7))){
                  chkCleaning.setSelected(true);
              }  
                 if(x.equalsIgnoreCase(rs1.getString(8))){
                  chkWifi.setSelected(true);
              }  
                 if(x.equalsIgnoreCase(rs1.getString(9))){
                  chkBar.setSelected(true);
              }
                 dateCheckIn.setDate(rs1.getDate(10));
                 dateCheckOut.setDate(rs1.getDate(11));
                 txtDays.setText(rs1.getString(12));
                 txtNights.setText(rs1.getString(13));
            }
        }
            catch(SQLException e){
                    
                    }
        if(txtBno.equals(null)){
            JOptionPane.showMessageDialog(rootPane, "Could not Locate booking","ERROR",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
       String BID=JOptionPane.showInputDialog(rootPane, "Enter the Room Number to delete data","Delete Room Data",WARNING_MESSAGE);
        
        DBConnect con1=new DBConnect();
      
          con1.connect();
        try {
            Statement s1=con1.connect().createStatement();
            int co=s1.executeUpdate("delete from booking where BID='"+BID+"'");
            if(co==1){
                JOptionPane.showMessageDialog(rootPane, "Deleted");
                populatetable();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Could not delete.Try Again after checking the room Number","Error",ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
           int x=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want to log out", "LOG OUT", YES_NO_CANCEL_OPTION, WARNING_MESSAGE);
       if (x==0){
           Login login=new Login();login.setVisible(true);this.setVisible(false);
       }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        Mainmenu m= new Mainmenu();
            m.setVisible(true);
            
            this.setVisible(false);
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if(txtPredicted.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Confirm the booking before proceeding o payment","Complete Booking",INFORMATION_MESSAGE);
        }
        else{this.setVisible(false);
      Payments pm=new Payments();
      Payments.txtForecast.setText(txtPredicted.getText());
      Payments.txtCno.setText(txtCno.getText());
      pm.setVisible(true);
        }
    }//GEN-LAST:event_btnPayActionPerformed

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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookings().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bac;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btncal;
    private javax.swing.JButton btnlogout;
    private javax.swing.JCheckBox chkBar;
    private javax.swing.JCheckBox chkBreakfast;
    private javax.swing.JCheckBox chkCleaning;
    private javax.swing.JCheckBox chkDinner;
    private javax.swing.JCheckBox chkLunch;
    private javax.swing.JCheckBox chkWifi;
    private com.toedter.calendar.JDateChooser dateCheckIn;
    private com.toedter.calendar.JDateChooser dateCheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCheckin_out;
    private javax.swing.JTextField txtBno;
    private javax.swing.JTextField txtCno;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtNights;
    public static javax.swing.JTextField txtPredicted;
    private javax.swing.JTextField txtRno;
    // End of variables declaration//GEN-END:variables
}