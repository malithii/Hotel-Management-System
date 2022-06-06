/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;

import java.awt.Toolkit;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
/**
 *
 * @author Cpt.coldblood
 */
public class Payments extends javax.swing.JFrame {

    /**
     * Creates new form Payments
     */
    public Payments() {
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

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPno = new javax.swing.JTextField();
        txtCno = new javax.swing.JTextField();
        txtForecast = new javax.swing.JFormattedTextField();
        txtAdd = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTax = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTot = new javax.swing.JFormattedTextField();
        btnCal = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPaydate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JFormattedTextField();
        txtPayment = new javax.swing.JFormattedTextField();
        btnClr = new javax.swing.JButton();
        btnSrch = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        txtbal = new javax.swing.JFormattedTextField();
        lblMenu = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payments");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Payments");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 214, 40));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel2.setText("Payment Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 49, -1, 36));

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 97, 117, 36));

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel4.setText("Forecasted Payments");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 194, 175, 36));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel5.setText("Additonal Financials");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 256, 175, 36));

        txtPno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtPno, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 49, 196, 37));

        txtCno.setEditable(false);
        txtCno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtCno, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 97, 196, 37));

        txtForecast.setEditable(false);
        txtForecast.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtForecast.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtForecast, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 192, 150, 42));

        txtAdd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddKeyPressed(evt);
            }
        });
        getContentPane().add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 256, 150, 37));

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel6.setText("Taxes And Other Charges");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 304, -1, 36));

        txtTax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTax.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaxKeyPressed(evt);
            }
        });
        getContentPane().add(txtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 304, 150, 37));

        jLabel7.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel7.setText("Payment Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 145, 117, 36));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel8.setText("Total Amount Payable");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 353, 175, 36));

        txtTot.setEditable(false);
        txtTot.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTot.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 352, 150, 40));

        btnCal.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        btnCal.setText("Calculate Total");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 410, 175, 32));

        btnPay.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 638, 91, 32));

        jLabel9.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel9.setText("Amount Paid");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 461, 175, 36));

        txtPaydate.setDateFormatString("yyyy-MM-dd");
        txtPaydate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtPaydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 190, 30));

        jLabel10.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel10.setText("Payment");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 512, 175, 36));

        jLabel11.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel11.setText("Balance");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 569, 175, 36));

        txtPaid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPaid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaidKeyPressed(evt);
            }
        });
        getContentPane().add(txtPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 460, 150, 40));

        txtPayment.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPayment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentKeyPressed(evt);
            }
        });
        getContentPane().add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 511, 150, 40));

        btnClr.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });
        getContentPane().add(btnClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 638, 89, 32));

        btnSrch.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        btnSrch.setText("Search");
        btnSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 638, 102, 32));

        lblLogout.setForeground(new java.awt.Color(0, 0, 255));
        lblLogout.setText("Log Out");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        txtbal.setEditable(false);
        txtbal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtbal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 570, 150, 36));

        lblMenu.setForeground(new java.awt.Color(0, 0, 255));
        lblMenu.setText("MainMenu");
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        getContentPane().add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 76, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/payment-background.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 0, 850, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
       String pno,cno,pdate;Float pred,add,tax,tot,paid=0f,pment,bal;
       pno=txtPno.getText();
       cno=txtCno.getText();
       pdate=((JTextField)txtPaydate.getDateEditor().getUiComponent()).getText();
       pred=Float.parseFloat(txtForecast.getText());
       add=Float.parseFloat(txtAdd.getText());
       tax=(pred+add)*0.08f;txtTax.setText(tax.toString());
       
       tot=tax+add+pred;txtTot.setText(tot.toString());
       DBConnect newcon=new DBConnect();
       Connection c=newcon.connect();
           try{
               Statement s1=c.createStatement();
               ResultSet rs1=s1.executeQuery("select * from payments");
               if(rs1.getString(2).equals(cno)){
                   while(rs1.next()){
                        paid+=rs1.getFloat(6);
                   }
                   txtPaid.setText(paid.toString());
               }
               else if(rs1.getString(2).isEmpty())
               {
                   s1.executeUpdate("insert into payments (pno,cno,pdate,forecast,total) values('"+pno+"','"+cno+"','"+pdate+"','"+pred+"','"+tot+"')");
                   
                   txtPaid.setText(paid.toString());
               }
           }
           catch(SQLException e){
               System.out.println(e.getMessage());
           }
       
       
       
       
       
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
      String pno=txtPno.getText();
      Float tot=Float.parseFloat(txtTot.getText());
      Float pd=Float.parseFloat(txtPaid.getText());
      Float pm=Float.parseFloat(txtPayment.getText());
      Float balance=tot-pd-pm;
      txtbal.setText(balance.toString());
      DBConnect py=new DBConnect();
      Connection conp=py.connect();
      try{
          Statement sp=conp.createStatement();
          sp.executeUpdate("insert into payments (paid,balance) values('"+pm+"','"+balance+"')");
          JOptionPane.showMessageDialog(rootPane, "Thank you for the payment.Hope you enjoy our services");
      }
      catch(SQLException e){
          System.out.println(e.getMessage());      }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
       txtAdd.setText(null);
       txtCno.setText(null);
       txtForecast.setText(null);
       txtPaid.setText(null);
       txtPaydate.setDate(null);
       txtPayment.setText(null);
       txtPno.setText(null);
       txtTax.setText(null);
       txtTot.setText(null);
       txtbal.setText(null);
       
       
       
    }//GEN-LAST:event_btnClrActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
           int x=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want to log out", "LOG OUT", YES_NO_CANCEL_OPTION, WARNING_MESSAGE);
       if (x==0){
           Login login=new Login();login.setVisible(true);this.setVisible(false);
       }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Mainmenu n=new Mainmenu();
        n.setVisible(true);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrchActionPerformed
       Float paid=0f;
        String searchcn=JOptionPane.showInputDialog(null,"Enter the Customer number of the customer to locate account","Search"); 
        String searchpn=JOptionPane.showInputDialog(null,"Enter the last payment number of the customer to search","Search");
         DBConnect con1=new DBConnect();
          con1.connect();
        
        try {
            Statement s1=con1.connect().createStatement();
             ResultSet rs1=s1.executeQuery("select * from payments");
               if(rs1.getString(2).equals(searchcn)){
                   while(rs1.next()){
                        paid+=rs1.getFloat(6);
                   }
                   txtPaid.setText(paid.toString());
               }
            
            
            
            ResultSet rs2=s1.executeQuery("select * from payments where pno='"+searchpn+"'");
            while(rs2.next()){
               txtPno.setText(rs2.getString(1));
               txtCno.setText(rs2.getString(2));
               txtPaydate.setDate(rs2.getDate(3));
               txtForecast.setText(rs2.getString(4));
               txtTot.setText(rs2.getString(5));
               txtbal.setText(rs2.getString(7));
               
               
               
            }
            }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSrchActionPerformed

    private void txtAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyPressed
        char c=evt.getKeyChar();
        char[] x=".".toCharArray();
        if(Character.isLetter(c)||Character.isWhitespace(c)||!Character.isDefined(x[0])){
            txtAdd.setEditable(false);
        }
        else{
             txtAdd.setEditable(true);
        }
    }//GEN-LAST:event_txtAddKeyPressed

    private void txtTaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxKeyPressed
  char c=evt.getKeyChar();
        char[] x=".".toCharArray();
        if(Character.isLetter(c)||Character.isWhitespace(c)||!Character.isDefined(x[0])){
            txtTax.setEditable(false);
        }
        else{
             txtTax.setEditable(true);
        }    }//GEN-LAST:event_txtTaxKeyPressed

    private void txtPaidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyPressed
  char c=evt.getKeyChar();
        char[] x=".".toCharArray();
        if(Character.isLetter(c)||Character.isWhitespace(c)||!Character.isDefined(x[0])){
            txtPaid.setEditable(false);
        }
        else{
             txtPaid.setEditable(true);
        }    }//GEN-LAST:event_txtPaidKeyPressed

    private void txtPaymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyPressed
  char c=evt.getKeyChar();
        char[] x=".".toCharArray();
        if(Character.isLetter(c)||Character.isWhitespace(c)||!Character.isDefined(x[0])){
            txtPayment.setEditable(false);
        }
        else{
             txtPayment.setEditable(true);
        }    }//GEN-LAST:event_txtPaymentKeyPressed

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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSrch;
    private javax.swing.JLabel img;
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
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JFormattedTextField txtAdd;
    public static javax.swing.JTextField txtCno;
    public static javax.swing.JFormattedTextField txtForecast;
    private javax.swing.JFormattedTextField txtPaid;
    private com.toedter.calendar.JDateChooser txtPaydate;
    private javax.swing.JFormattedTextField txtPayment;
    private javax.swing.JTextField txtPno;
    private javax.swing.JFormattedTextField txtTax;
    private javax.swing.JFormattedTextField txtTot;
    private javax.swing.JFormattedTextField txtbal;
    // End of variables declaration//GEN-END:variables
}