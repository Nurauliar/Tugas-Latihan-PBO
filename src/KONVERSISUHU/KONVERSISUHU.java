/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KONVERSISUHU;

import javax.swing.JOptionPane;

/**
 *
 * @author h
 */
public class KONVERSISUHU extends javax.swing.JFrame {
private double suhu;
    private double celcius1;
    private double celcius2;
    private double celcius3;
    private double celcius4;

    private double reamur1;
    private double reamur2;
    private double reamur3;
    private double reamur4;

    private double fahrenheit1;
    private double fahrenheit2;
    private double fahrenheit3;
    private double fahrenheit4;

    private double kelvin1;
    private double kelvin2;
    private double kelvin3;
    private double kelvin4;
    /**
     * Creates new form KONVERSISUHU
     */
    public KONVERSISUHU() {
        initComponents();
        rdcelcius.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfahrenheit = new javax.swing.JTextField();
        txtreamor = new javax.swing.JTextField();
        txtkelvin = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtsuhu = new javax.swing.JTextField();
        rdcelcius = new javax.swing.JRadioButton();
        rdfahrenheit = new javax.swing.JRadioButton();
        rdreamor = new javax.swing.JRadioButton();
        rdkelvin = new javax.swing.JRadioButton();
        btnkonversi = new javax.swing.JButton();
        txtcelcius = new javax.swing.JTextField();
        btnclear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        txtkelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelvinActionPerformed(evt);
            }
        });

        btnclear.setText("Hapus");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel3.setText("HASIL KONVERSI");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("PROGRAM CONVERSI SUHU");

        jLabel4.setText("Celcius");

        jLabel5.setText("Fahrenheit");

        jLabel6.setText("Reamur");

        jLabel7.setText("Kelvin");

        jLabel1.setText("INPUT CONVERSI");

        rdcelcius.setText("Celcius");
        rdcelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdcelciusActionPerformed(evt);
            }
        });

        rdfahrenheit.setText("Fahrenheit");

        rdreamor.setText("Reamur");

        rdkelvin.setText("Kelvin");

        btnkonversi.setText("Konversi");
        btnkonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkonversiActionPerformed(evt);
            }
        });

        btnclear1.setText("Keluar");
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(txtreamor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtfahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel6))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(btnclear1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(btnkonversi))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnclear)
                                        .addGap(23, 23, 23))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtsuhu))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdcelcius)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdfahrenheit)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdreamor)
                                    .addGap(32, 32, 32)
                                    .addComponent(rdkelvin))))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdreamor)
                    .addComponent(rdcelcius)
                    .addComponent(rdkelvin)
                    .addComponent(rdfahrenheit))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkonversi)
                    .addComponent(btnclear1)
                    .addComponent(btnclear))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtreamor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtkelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(402, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtkelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelvinActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtsuhu.setText("");
        txtcelcius.setText("");
        txtfahrenheit.setText("");
        txtreamor.setText("");
        txtkelvin.setText("");
        rdcelcius.setSelected(false);
        rdfahrenheit.setSelected(false);
        rdreamor.setSelected(false);
        rdkelvin.setSelected(false);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnkonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkonversiActionPerformed
        suhu = Double.parseDouble(txtsuhu.getText());
        if (rdcelcius.isSelected()){
            txtcelcius.setText("" + suhu*1);
            txtreamor.setText("" + suhu*4/5);
            txtfahrenheit.setText(""+ (suhu*9/5+32));
            txtkelvin.setText("" + (suhu + 273.15));

        } else
        if (rdreamor.isSelected()){
            txtcelcius.setText("" + suhu*5/4);
            txtreamor.setText("" + suhu*1);
            txtfahrenheit.setText(""+ (suhu*9/4+32));
            txtkelvin.setText("" + (suhu * 5/4 + 272));
        } else
        if (rdfahrenheit.isSelected()){
            Double fk = ((suhu-32)*5/9);
            txtcelcius.setText("" + (suhu-32)*5/9);
            txtreamor.setText("" + (suhu-32)*4/9);
            txtfahrenheit.setText(""+ (suhu));
            txtkelvin.setText("" + (fk+272));

        } else
        if (rdkelvin.isSelected()){
            txtcelcius.setText("" + (suhu-272));
            txtreamor.setText("" + (suhu-272)*4/5);
            txtfahrenheit.setText(""+ (suhu-272)*9/5);
            txtkelvin.setText("" + (suhu));
        }
    }//GEN-LAST:event_btnkonversiActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        // TODO add your handling code here:
         String Tanya = "Apakah Anda Yakin Ingin Keluar Aplikasi?";
        Boolean Yakin = JOptionPane.showConfirmDialog(rootPane, Tanya)==
                JOptionPane.YES_OPTION;
        if (Yakin){
        System.exit(0)
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void rdcelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdcelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdcelciusActionPerformed

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
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KONVERSISUHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnkonversi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdcelcius;
    private javax.swing.JRadioButton rdfahrenheit;
    private javax.swing.JRadioButton rdkelvin;
    private javax.swing.JRadioButton rdreamor;
    private javax.swing.JTextField txtcelcius;
    private javax.swing.JTextField txtfahrenheit;
    private javax.swing.JTextField txtkelvin;
    private javax.swing.JTextField txtreamor;
    private javax.swing.JTextField txtsuhu;
    // End of variables declaration//GEN-END:variables
}
