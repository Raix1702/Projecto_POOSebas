/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Registrar_Movimientos_Caja_Chica;
//import java.util.HashSet;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
  *
 * @author sebas
 */
public class RegistrarMovimientosCajaChica extends javax.swing.JFrame {
    

    /**
     * Creates new form RegistrarMovimientosCajaChica
     */
    public RegistrarMovimientosCajaChica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tmov = new javax.swing.JComboBox<>();
        cmov = new javax.swing.JTextField();
        mmov = new javax.swing.JTextField();
        fmov = new javax.swing.JTextField();
        registrar2 = new javax.swing.JButton();

        registrar1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        registrar1.setText("REGISTRAR");
        registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Registro de movimientos en la caja chica");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Fecha del Movimiento");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Tipo de Movimiento");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Codigo de Movimiento");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Monto de Movimiento");

        tmov.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tmov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingreso", "Egreso" }));
        tmov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmovActionPerformed(evt);
            }
        });

        cmov.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cmov.setForeground(new java.awt.Color(102, 255, 102));
        cmov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmovActionPerformed(evt);
            }
        });

        mmov.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        mmov.setForeground(new java.awt.Color(102, 255, 102));
        mmov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmovActionPerformed(evt);
            }
        });

        fmov.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fmov.setForeground(new java.awt.Color(102, 255, 102));
        fmov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmovActionPerformed(evt);
            }
        });

        registrar2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        registrar2.setText("GUARDAR");
        registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mmov, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmov, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmov, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmov, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(135, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(registrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tmov, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mmov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(registrar2)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmovActionPerformed

    private void cmovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmovActionPerformed
             // TODO add your handling code here:
            

    }//GEN-LAST:event_cmovActionPerformed

    private void mmovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmovActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mmovActionPerformed

    private void fmovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmovActionPerformed

    private void registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar1ActionPerformed
        
    }//GEN-LAST:event_registrar1ActionPerformed

    private void registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar2ActionPerformed
        //Creacion del objeto
         RegistroMovimiento rmov = new RegistroMovimiento();
        try{
            //crea una instancia de simpledate con la forma a ingresar dia mes año
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            //Seteado para que no acepte fechas invalidas
            fecha.setLenient(false);
            //Valida la fecha
            Date fechaMovimiento = fecha.parse(fmov.getText());
             
                rmov.setCmov(cmov.getText());
                rmov.setFmov(fmov.getText());
                rmov.setTmov((String) tmov.getSelectedItem());
                rmov.setMmov(Integer.parseInt(mmov.getText()));
                JOptionPane.showMessageDialog (null,"DATOS INGRESADOS CORRECTAMENTE");
            }
            catch(ParseException e){
                JOptionPane.showMessageDialog(null,"ERROR INGRESE LOS DATOS NUEVAMENTE");
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"ERROR MONTO INVALIDO");
    }
    }//GEN-LAST:event_registrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarMovimientosCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimientosCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimientosCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimientosCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarMovimientosCajaChica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cmov;
    private javax.swing.JTextField fmov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mmov;
    private javax.swing.JButton registrar1;
    private javax.swing.JButton registrar2;
    private javax.swing.JComboBox<String> tmov;
    // End of variables declaration//GEN-END:variables
}
