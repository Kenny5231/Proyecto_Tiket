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
public class Menu_Principal_main extends javax.swing.JFrame {
    /**
     * Creates new form Menu_Principal
     */
   
    Administrador_eventos ae;
    Adminitrador_user reportes; 
    Reportes au;
    Iniciar_Sesion sesion;
    Puente puente;
            
            
            
    public Menu_Principal_main() {
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

        jLabel2 = new javax.swing.JLabel();
        Administrar_eve = new javax.swing.JButton();
        Administracion_usu = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Cerrar_Sesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setText("Menu Principal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 60));

        Administrar_eve.setText("Administracion de Eventos");
        Administrar_eve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Administrar_eveActionPerformed(evt);
            }
        });
        getContentPane().add(Administrar_eve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, -1));

        Administracion_usu.setText("Reportes");
        Administracion_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Administracion_usuActionPerformed(evt);
            }
        });
        getContentPane().add(Administracion_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, -1));

        Reportes.setText("Administracion de Usuarios");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });
        getContentPane().add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 110, -1));

        Cerrar_Sesion.setText("Cerrar_Sesion");
        Cerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_SesionActionPerformed(evt);
            }
        });
        getContentPane().add(Cerrar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_eventos_kenny_menjivar/Imagenes_proyecto_evento/60a17db86e0ef.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        // TODO add your handling code here:
        String name=" ";
        String user="";
        String pasword="";
        String tipouser="";
        int Edad=0;
        puente= new Puente(name, user, pasword, Edad,tipouser);
        if(puente.getTipouserlogin().equals("Administrador")){
         reportes = new Adminitrador_user();
         reportes.setVisible(true);
         this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Dicha accion esta bloqueada por el tipo de usuario");
        }
    }//GEN-LAST:event_ReportesActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void Administrar_eveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Administrar_eveActionPerformed
        // TODO add your handling code here:
        ae = new Administrador_eventos();
        ae.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Administrar_eveActionPerformed

    private void Cerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_SesionActionPerformed
        // TODO add your handling code here:
        sesion = new Iniciar_Sesion();
        sesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cerrar_SesionActionPerformed

    private void Administracion_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Administracion_usuActionPerformed
        // TODO add your handling code here:
        au= new Reportes();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Administracion_usuActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administracion_usu;
    private javax.swing.JButton Administrar_eve;
    private javax.swing.JButton Cerrar_Sesion;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
