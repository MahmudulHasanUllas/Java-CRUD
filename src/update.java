
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ULLAS
 */
public class update extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    
    
    public update(int value) {
        initComponents();
        
         setDefaultCloseOperation(update.DISPOSE_ON_CLOSE);
        
        
        
        
        
        
        
        
      
        
          
    }

    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Specialist = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        hospital = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(88, 66, 132));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(450, 500, 120, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctors ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 160, 40);

        id.setBackground(new java.awt.Color(243, 243, 255));
        id.setFont(id.getFont().deriveFont(id.getFont().getSize()+14f));
        id.setForeground(new java.awt.Color(0, 51, 255));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(290, 40, 280, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctors Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 170, 40);

        dname.setBackground(new java.awt.Color(243, 243, 255));
        dname.setFont(dname.getFont().deriveFont(dname.getFont().getSize()+14f));
        dname.setForeground(new java.awt.Color(0, 51, 255));
        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });
        jPanel1.add(dname);
        dname.setBounds(290, 100, 280, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Specialist");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 160, 160, 40);

        Specialist.setBackground(new java.awt.Color(243, 243, 255));
        Specialist.setFont(Specialist.getFont().deriveFont(Specialist.getFont().getSize()+14f));
        Specialist.setForeground(new java.awt.Color(0, 51, 255));
        Specialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialistActionPerformed(evt);
            }
        });
        jPanel1.add(Specialist);
        Specialist.setBounds(290, 160, 280, 40);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hospital");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 220, 160, 40);

        hospital.setBackground(new java.awt.Color(243, 243, 255));
        hospital.setFont(hospital.getFont().deriveFont(hospital.getFont().getSize()+14f));
        hospital.setForeground(new java.awt.Color(0, 51, 255));
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });
        jPanel1.add(hospital);
        hospital.setBounds(290, 220, 280, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telephone_No");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 280, 260, 40);

        time.setBackground(new java.awt.Color(243, 243, 255));
        time.setFont(time.getFont().deriveFont(time.getFont().getSize()+14f));
        time.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.add(time);
        time.setBounds(290, 280, 280, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 340, 160, 40);

        address.setBackground(new java.awt.Color(243, 243, 255));
        address.setFont(address.getFont().deriveFont(address.getFont().getSize()+14f));
        address.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.add(address);
        address.setBounds(290, 340, 280, 40);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("District");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 400, 170, 40);

        district.setBackground(new java.awt.Color(243, 243, 255));
        district.setFont(district.getFont().deriveFont(district.getFont().getSize()+14f));
        district.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.add(district);
        district.setBounds(290, 400, 280, 40);

        save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save.setText("update");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(290, 500, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 590);

        setSize(new java.awt.Dimension(632, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id.setText("");
        dname.setText("");
        Specialist.setText("");
        hospital.setText("");
        time.setText("");
        address.setText("");
        district.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void SpecialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpecialistActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Type ' ID ' to update !");
        }else{

            try {

                con = DriverManager.getConnection("jdbc:mysql://localhost/bd doctors", "root", "");
                String sql = "UPDATE users SET Doctors_Name=?,Specialist=?,Hospital=?,Time_Telephone_no=?,Address=?,District=? WHERE ID=?";
                pst = con.prepareStatement(sql);
                pst.setString(7, id.getText());
                pst.setString(1, dname.getText());
                pst.setString(2, Specialist.getText());
                pst.setString(3, hospital.getText());
                pst.setString(4, time.getText());
                pst.setString(5, address.getText());
                pst.setString(6, district.getText());
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated successfully");
                    
                
                Main textarea = new Main();
                    textarea.setResizable(false);
                    textarea.setVisible(true);
                    setVisible(false);
            
            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Specialist;
    private javax.swing.JTextField address;
    private javax.swing.JButton clear;
    private javax.swing.JTextField district;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField hospital;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
