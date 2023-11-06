/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenny
 */
public class Edit_panel extends javax.swing.JPanel  {
//Deportesedit_panel in;
Deportes_panel in;
//Banda_musical mu;
Panel_musical mu;
Puente puente;
Editar_evento edit;
    /**
     * Creates new form Edit_panel
     */
    public Edit_panel() {
            
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
        tipoevent = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cantpersonas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        minuto = new javax.swing.JComboBox<>();
        refrescar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        newCode = new javax.swing.JTextField();
        Pane = new java.awt.Panel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de Evento:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        tipoevent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deportivo", "Religioso", "Musical" }));
        tipoevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoeventActionPerformed(evt);
            }
        });
        add(tipoevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del Evento:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 145, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion del Evento:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 20));

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 80));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de Personas:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 162, -1));
        add(cantpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 148, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("Fecha y hora:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));
        add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setText("Hora:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 52, -1));

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 50, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setText("Minuto:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        minuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59" }));
        add(minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        refrescar.setText("Refrescar");
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });
        add(refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 6, -1, 17));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Nuevo Codigo");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(newCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 140, -1));

        javax.swing.GroupLayout PaneLayout = new javax.swing.GroupLayout(Pane);
        Pane.setLayout(PaneLayout);
        PaneLayout.setHorizontalGroup(
            PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PaneLayout.setVerticalGroup(
            PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        add(Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 300, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
        // TODO add your handling code here:
        //Deportivo, Religioso, Musical
        in = new Deportes_panel();
        mu = new Panel_musical();
        String evento = tipoevent.getSelectedItem().toString();
        System.out.println("EL EVENTO ES: " + evento);

        if (evento.equals("Deportivo")) {
        in.setSize(300, 250);
        in.setLocation(0, 0);
        Pane.removeAll();
        Pane.add(in, BorderLayout.CENTER);
        } else if (evento.equals("Musical")) {
        mu.setSize(300, 250);
        mu.setLocation(0, 0);
        Pane.removeAll();
        Pane.add(mu, BorderLayout.CENTER);
        }else{
        Pane.removeAll();
        }
    }//GEN-LAST:event_refrescarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String nombre1=" ";
        String user="";
        String pasword="";
        String tipouser="";
        int Edad=0;
        puente= new Puente(nombre1, user, pasword, Edad,tipouser);
        edit =new Editar_evento();
        String name = nombre.getText();
        String newcode=newCode.getText();
        String Descripcion= descripcion.getText();
        String evento=tipoevent.getSelectedItem().toString();
        int canpersonas = Integer.parseInt(cantpersonas.getText()); 
        String code= edit.getCode();
        String tipoevento= tipoevent.getSelectedItem().toString();
        String Userloging= puente.getNamelogin();
        String equipo1= in.getEquipo1();
        String equipo2= in.getEquipo2();
        String tipomusic= mu.getTipomusica();
        String tipodepo= in.getTipodeporte();
        
        
        String fechafinal="";
        java.util.Date selectedDate = calendar.getDate();
        String fecha;
        String Hora = hora.getSelectedItem().toString();
        String Minuto = minuto.getSelectedItem().toString();
        if (selectedDate != null) {
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
          fecha = f.format(selectedDate);
            fechafinal=f.format(selectedDate)+" "+Hora+":"+Minuto;
         System.out.println("fecha: " + fecha);
         } else {
            fecha="";
         }
        System.out.println("fecha: "+fecha);
        
        if(evento.equals("Deportivo")){
        puente.agregarplayer(code);
        }else if(evento.equals("Musical")){
        puente.agregarmusic(code);
        }
        if(true){
            String usercreate=puente.createevent(code);
        puente.editevent(name, fechafinal, code, newcode, canpersonas, Descripcion, tipoevento, 0, tipomusic, tipodepo, Userloging, equipo1, equipo2);
        puente.cambio(usercreate, code, newcode);
        puente.mostrarlistaeventos();
                    JOptionPane.showMessageDialog(null, "Se han hecho exitosamente los cambios");
        }else{
                    JOptionPane.showMessageDialog(null, "No ha hecho los cambios necesarios");

        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void tipoeventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoeventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoeventActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private java.awt.Panel Pane;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JTextField cantpersonas;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> minuto;
    private javax.swing.JTextField newCode;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton refrescar;
    private javax.swing.JComboBox<String> tipoevent;
    // End of variables declaration//GEN-END:variables
}
