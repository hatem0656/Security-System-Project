/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_System;
import javax.swing.JOptionPane;

/**
 *
 * @author Ehab Khaled
 */
public class Empolyee_GUI extends javax.swing.JFrame {
public int ID_num ; 

    /**
     * Creates new form Empolyee
     */
    public Empolyee_GUI() {
        initComponents();
       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Confirm_button = new javax.swing.JButton();
        ID_textbox = new javax.swing.JPasswordField();
        check = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ID Validation");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 80, 40, 40);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome in your company");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 20, 260, 40);

        Confirm_button.setFont(new java.awt.Font("Segoe Script", 3, 11)); // NOI18N
        Confirm_button.setText("Confirm");
        Confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm_button);
        Confirm_button.setBounds(170, 190, 90, 30);

        ID_textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_textboxActionPerformed(evt);
            }
        });
        jPanel1.add(ID_textbox);
        ID_textbox.setBounds(160, 130, 110, 30);
        jPanel1.add(check);
        check.setBounds(80, 170, 0, 0);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_textboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_textboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_textboxActionPerformed

    private void Confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_buttonActionPerformed
       char c ;
       ID_num =Integer.parseInt(ID_textbox.getText());
       Empolyee E1 = new Empolyee () ;
       c = E1.Set_ID(ID_num);
       
       if ( c == 'k'){
       if ("ID Found".equals(E1.Check_ID())){
             JOptionPane.showMessageDialog(null, "ID Found ,Welcome Sir", "Entrance Successful" ,1);
       }
       else {
            JOptionPane.showMessageDialog(this, "ID not Found", "Warning", JOptionPane.ERROR_MESSAGE);
       }
       }
       else {
           JOptionPane.showMessageDialog(this, "Too large ID", "Warning", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_Confirm_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Empolyee_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empolyee_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empolyee_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empolyee_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empolyee_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm_button;
    private javax.swing.JPasswordField ID_textbox;
    private javax.swing.JLabel check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
