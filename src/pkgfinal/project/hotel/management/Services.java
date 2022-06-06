/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

/**
 *
 * @author Cpt.coldblood
 */
public class Services extends javax.swing.JFrame {

    /**
     * Creates new form Services
     */
    public Services() {
        initComponents();
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
        txtSid = new javax.swing.JTextField();
        txtSname = new javax.swing.JTextField();
        txtIncharge = new javax.swing.JTextField();
        txtCharge = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSDesc = new javax.swing.JTextArea();
        btnReg = new javax.swing.JButton();
        btnSrch = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        lblMain = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service management");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 290, 70));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Service ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 101, 162, 43));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Service Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 162, 162, 43));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Service Charges Per Round");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 290, -1, 43));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Employee incharge");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 223, 162, 43));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Service Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 351, 162, 43));

        txtSid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 101, 252, 43));

        txtSname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSnameKeyPressed(evt);
            }
        });
        getContentPane().add(txtSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 162, 252, 43));

        txtIncharge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIncharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInchargeActionPerformed(evt);
            }
        });
        txtIncharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInchargeKeyPressed(evt);
            }
        });
        getContentPane().add(txtIncharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 223, 252, 43));

        txtCharge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCharge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 290, 252, 43));

        txtSDesc.setColumns(20);
        txtSDesc.setRows(5);
        jScrollPane1.setViewportView(txtSDesc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 351, 252, -1));

        btnReg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnReg.setText("Register");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 100, 40));

        btnSrch.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnSrch.setText("Search");
        btnSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 100, 40));

        btnDel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 90, 40));

        btnClr.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });
        getContentPane().add(btnClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 100, 40));

        lblMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMain.setForeground(new java.awt.Color(255, 0, 51));
        lblMain.setText("Mainmenu");
        lblMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMouseClicked(evt);
            }
        });
        getContentPane().add(lblMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        lblLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 0, 51));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/images.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/download.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 240, 190));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/images (2).jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 300, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/deepcleaning.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 590, 260));

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/aqualicious-light-blue-gradient-background.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInchargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInchargeActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
     String Sid,sname,sincharge,sdesc;float charge;
     Sid=txtSid.getText();
     sname=txtSname.getText();
     sincharge=txtIncharge.getText();
     sdesc=txtSDesc.getText();
     charge=Float.parseFloat(txtCharge.getText());
     boolean chg=false;
     if(charge==0f){
         chg=true;
     }
     Pattern p3 =Pattern.compile("^[a-zA-Z]+$");
          Matcher mat3=p3.matcher(sname);
     if(Sid.isEmpty()||sname.isEmpty()||sdesc.isEmpty()||sincharge.isEmpty()||chg){
         JOptionPane.showMessageDialog(rootPane, "Please Fill out All the details","Empty Fields",WARNING_MESSAGE);
     }
     else if(!mat3.matches()){
         JOptionPane.showMessageDialog(rootPane, "Please donot use any symbols or numbers in your name","Invalid entry",ERROR_MESSAGE);
     }
     else {DBConnect con=new DBConnect();
     Connection con1=con.connect();
     try{
         Statement s1=con1.createStatement();
         int co=s1.executeUpdate("insert into service values('"+Sid+"','"+sname+"','"+sincharge+"','"+charge+"','"+sdesc+"')");
         if(co==1){
             JOptionPane.showMessageDialog(null, "successfuly registered");
         }
     }
    catch(SQLException e)
    {
        e.getMessage();
    }
      txtSDesc.setText(null);
      txtSid.setText(null);
      txtSname.setText(null);
      txtIncharge.setText(null);
      txtCharge.setText(null);
     }
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
      txtSDesc.setText(null);
      txtSid.setText(null);
      txtSname.setText(null);
      txtIncharge.setText(null);
      txtCharge.setText(null);
     
    }//GEN-LAST:event_btnClrActionPerformed

    private void btnSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrchActionPerformed
        String search=JOptionPane.showInputDialog(null,"Enter the Service ID number of the employee to search","Search");
         DBConnect con1=new DBConnect();
          con1.connect();
        
        try {
            Statement s1=con1.connect().createStatement();
            ResultSet rs1=s1.executeQuery("select * from service where sid='"+search+"'");
            while(rs1.next()){
                txtSDesc.setText(rs1.getString(5));
                txtSid.setText(rs1.getString(1));
                txtSname.setText(rs1.getString(2));
                txtIncharge.setText(rs1.getString(3));
                txtCharge.setText(rs1.getString(4));
            
            
            }
            }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
         if(txtSid.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Entry Not Found", "Error", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSrchActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
       String sid=JOptionPane.showInputDialog(rootPane, "Enter the Room Number to delete data","Delete Room Data",WARNING_MESSAGE);
        
        DBConnect con1=new DBConnect();
      
          con1.connect();
        try {
            Statement s1=con1.connect().createStatement();
            int co=s1.executeUpdate("delete from service where sid='"+sid+"'");
            if(co==1){
                JOptionPane.showMessageDialog(rootPane, "Deleted");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Could not delete.Try Again after checking the Service ID","Error",ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
          int x=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want to log out", "LOG OUT", YES_NO_CANCEL_OPTION, WARNING_MESSAGE);
       if (x==0){
           Login login=new Login();login.setVisible(true);this.setVisible(false);
       }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMouseClicked
       Mainmenu n=new Mainmenu();
       n.setVisible(true);
       
    }//GEN-LAST:event_lblMainMouseClicked

    private void txtSnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSnameKeyPressed
           char c=evt.getKeyChar();
           if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
               txtSname.setEditable(true);
           }
           else{txtSname.setEditable(false);
           
           }
    }//GEN-LAST:event_txtSnameKeyPressed

    private void txtInchargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInchargeKeyPressed
         char c=evt.getKeyChar();
        char[] x=".".toCharArray();
        if(Character.isDigit(c)||Character.isDefined(x[0])){
            txtCharge.setEditable(true);
        }
        else{
             txtCharge.setEditable(false);
        }
    }//GEN-LAST:event_txtInchargeKeyPressed


    
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
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSrch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMain;
    private javax.swing.JFormattedTextField txtCharge;
    private javax.swing.JTextField txtIncharge;
    private javax.swing.JTextArea txtSDesc;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtSname;
    // End of variables declaration//GEN-END:variables
}