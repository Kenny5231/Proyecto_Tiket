/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenny
 */
public class Crear_evento extends javax.swing.JFrame {
    Administrador_eventos event;
    Deportes_panel dp;
    Panel_musical mp;
    Puente puente;
    preciosfinal precio;
    /**
     * Creates new form Crear_evento
     */
    private JComboBox <String> horasComboBox;
    private JComboBox <String> minutosComboBox;
    public boolean antes=true;
    public String modo="nulo";
    private static double monto=-10000;
    private int capacidad;
    
    
    
    public Crear_evento() {
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

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        Combo_tipo_de_evento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        nombreevent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        guardar_avance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        Panel = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        cantpersonas = new javax.swing.JTextField();
        Todo_listo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        hora = new javax.swing.JComboBox<>();
        minuto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        montoaco = new javax.swing.JTextField();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setText("Crear Evento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 180, 60));

        Combo_tipo_de_evento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deportivo", "Religioso", "Musical" }));
        getContentPane().add(Combo_tipo_de_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de evento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Codigo del evento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Nombre del evento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        Codigo.setText("21");
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        nombreevent.setText("13");
        getContentPane().add(nombreevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("Descripcion del evento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 20));

        guardar_avance.setText("Guardar Datos");
        guardar_avance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_avanceActionPerformed(evt);
            }
        });
        getContentPane().add(guardar_avance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        descripcion.setColumns(20);
        descripcion.setRows(5);
        descripcion.setText("414");
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 300, 250));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad de personas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, -1));

        cantpersonas.setText("35");
        getContentPane().add(cantpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, -1));

        Todo_listo.setText("Todo listo");
        Todo_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Todo_listoActionPerformed(evt);
            }
        });
        getContentPane().add(Todo_listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("Fecha y hora:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, -1));

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 50, -1));

        minuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59" }));
        getContentPane().add(minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 100, 70, -1));

        jLabel8.setText("Hora:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 40, -1));

        jLabel9.setText("Minuto:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel10.setText("Monto acordado:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 160, 20));
        getContentPane().add(montoaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_avanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_avanceActionPerformed
        // TODO add your handling code here:
        String name=" ";
        String user="";
        String pasword="";
        String tipouser="";
        
        int Edad=0;
        puente = new Puente(name, user, pasword, Edad,tipouser);
        precio = new preciosfinal(name, user, pasword, Edad,tipouser);
        if(antes){
        modo=Combo_tipo_de_evento.getSelectedItem().toString();
        String SMonto=montoaco.getText();
    try {
         double Monto = Integer.parseInt(SMonto);
         monto=Monto;
         System.out.println("dentro de try monto: "+monto);
    } catch (NumberFormatException e) {
        monto=-100;
    }
            System.out.println("tras que salgo de try: "+monto);
//        antes=false;
System.out.println("porno");
        if(modo.equals("Religioso")){
            System.out.println("Religioso");
            
        }else if(modo.equals("Deportivo")){
            System.out.println("Deportivo");
            dp= new Deportes_panel();
            dp.setSize(300,250);
            dp.setLocation(0,0);
            Panel.removeAll();
            Panel.add(dp,BorderLayout.CENTER);
            Panel.revalidate();
            Panel.repaint(); 
        }else if(modo.equals("Musical")){
            System.out.println("Musical");
            mp = new Panel_musical();
            mp.setSize(300,250);
            mp.setLocation(0,0);
            Panel.removeAll();
            Panel.add(mp,BorderLayout.CENTER);
            Panel.revalidate();
            Panel.repaint(); 
        }
        }else{
        String code= Codigo.getText();
        String tipoevent = Combo_tipo_de_evento.getSelectedItem().toString();
        String nombreevento= nombreevent.getText();
        String Descripcion= descripcion.getText();
        
       
        // Obtener el texto del TextField y convertirlo a un entero
        int Cantpersonas = Integer.parseInt(cantpersonas.getText());
        String fechafinal="";

        System.out.println("halooooo: "+Cantpersonas);
        java.util.Date selectedDate = Fecha.getDate();
        String fecha;
        String Hora = hora.getSelectedItem().toString();
        String Minuto = minuto.getSelectedItem().toString();
        if (selectedDate != null) {
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
          fecha = f.format(selectedDate) + " " +Hora+":"+Minuto;
            fechafinal="Fecha: "+f.format(selectedDate)+" Hora: "+Hora+" Minuto: "+Minuto;
         System.out.println("fecha: " + fecha);
         } else {
            fecha="";
         }
        String tipomusic="Ninguno";
        String tipojuego="Ninguno";
        String equipo1="Ninguno";
        String equipo2="Ninguno";
        String userloging=puente.getUserloggin();
        if(modo.equals("Musical")){
         tipomusic=mp.getTipomusica();
         capacidad=25000;
        }else if(modo.equals("Deportivo")){
        tipojuego=dp.getTipodeporte();
        capacidad=20000;
        equipo1=dp.getEquipo1();
        equipo2=dp.getEquipo2();
        }else if(modo.equals("Religioso")){
        capacidad=30000;
        }
                
         //double monto=0;
        //puente.agregarevent();
        //if(modo.equals("Deportivo")||modo.equals("Musical")&& !equipo1.equals("Ninguno")&& !equipo2.equals("Ninguno")&& !tipojuego.equals("Ninguno")||!tipomusic.equals("Ninguno")){
            
        
        if(capacidad>Cantpersonas){    
            if(monto>0){  
        if(!modo.equals("nulo")){
        if(!code.equals("") && !tipoevent.equals("") && !nombreevento.equals("") && !Descripcion.equals("") && Cantpersonas!=0 && !fecha.equals("")){
        
        if(puente.buscarevent(code)==false){
            
            
        if(modo.equals("Musical")){
            double seguro= monto*precio.getSeguro_grama();
            monto+=seguro;
        }else if(modo.equals("Religioso")){
            monto+=precio.getGrama();
        }   
            
            
            
            
        puente.agregarevent(nombreevento,fecha,code,Cantpersonas,Descripcion,tipoevent,monto,tipomusic,tipojuego,userloging,equipo1,equipo2);
        JOptionPane.showMessageDialog(null, "Evento creado a la "+fechafinal);
        puente.mostrarevent();
            System.out.println("CODE;                ++++++++:"+code);
        puente.agregarinfoevent(code,userloging);
        event = new Administrador_eventos();    
        event.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese codigo");
        }
        }else{
            JOptionPane.showMessageDialog(null, "No ha llenado todos los datos");
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "No guardo los cambios");
        }
        }else{
            JOptionPane.showMessageDialog(null, "No agrego monto o agrego un monto negativo");
        }
        }else{
            JOptionPane.showMessageDialog(null, "El estadio no soporta dicha cantidad");
        }
        
        
        
        }
        
        
    }//GEN-LAST:event_guardar_avanceActionPerformed

    private void Todo_listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Todo_listoActionPerformed
        // TODO add your handling code here:
        if(antes)
            antes=false;
        else
            antes=true;
    }//GEN-LAST:event_Todo_listoActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JComboBox<String> Combo_tipo_de_evento;
    private com.toedter.calendar.JDateChooser Fecha;
    private java.awt.Panel Panel;
    private javax.swing.JButton Todo_listo;
    private javax.swing.JTextField cantpersonas;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton guardar_avance;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> minuto;
    private javax.swing.JTextField montoaco;
    private javax.swing.JTextField nombreevent;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
