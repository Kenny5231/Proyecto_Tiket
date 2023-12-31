/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import javax.swing.JOptionPane;

/**
 *
 * @author Kenny
 */
public class Eliminar_evento extends javax.swing.JFrame {
    Administrador_eventos event;
    Puente puente;
    Eventos_Alma funcion;
    preciosfinal fin;
    /**
     * Creates new form Eliminar_evento
     */
    public Eliminar_evento() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        back = new javax.swing.JButton();
        code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Eliminar evento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 160, 60));

        jLabel2.setText("Ingrese el codigo que desea eliminar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        String username ="name";
        String password ="pasword";
        String name = "haajkl"; 
        String fullName = "vß∆ghv"; 
        int age = 87;
        String userType = "Admin";
        puente = new Puente(username, password, name, age, userType);
        funcion =new Eventos_Alma(username, password, name, age, userType);
        fin = new preciosfinal(username, password, name, age, userType);
        
        String codigo=code.getText();
        if(puente.buscarevent(codigo)){
        String fecha=puente.agarrarfecha(codigo);
           if(puente.getUserloggin().equals(puente.createevent(codigo))){
               
           if(funcion.diasiguiente(fecha)&& !puente.sendtpuser(codigo).equals("Religioso")){
                        double monto=puente.enviomonto(codigo);
                        double multa=monto*fin.getIdemnizacion();
                        puente.sendmunta(codigo, multa);
                       JOptionPane.showMessageDialog(null, "Se le a cobrado: "+multa+"Lps. por indemnización");
           }else{
            JOptionPane.showMessageDialog(null, "No se a cobrado indemnización");
           }
        puente.eliminarEvent(codigo);
            JOptionPane.showMessageDialog(null, "Se ha elimano el Evento con el codigo: "+codigo);
        event = new Administrador_eventos();
        event.setVisible(true);
        this.dispose();
        
        
           }else{
           JOptionPane.showMessageDialog(null, "No puedes relizar esta accion, No eres el creador del evento");
           }
        
        }else{
                    JOptionPane.showMessageDialog(null, "Ha ingresado un codigo inexistente");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        event = new Administrador_eventos();
        event.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton back;
    private javax.swing.JTextField code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
