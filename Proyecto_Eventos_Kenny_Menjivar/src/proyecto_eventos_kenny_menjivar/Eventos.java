/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import static proyecto_eventos_kenny_menjivar.AlmacenUsuarios.listaUsuarios;

/**
 *
 * @author Kenny
 */
public class Eventos {
    private Enum estado=Enum.Activo;
    private double multa=0;
    private String nombre;
    private String code;
    private String tipevento;
    private String fechaevento;
    private String Usercreate;
    private double monto;
    private String Descripcion;
    private int cantpersonas;
    private String tipodeporte;
    private String tipomusica;
    private String equipo1;
    private String equipo2;
    private static String jugador1a;
    private static String jugador2a;
    static ArrayList<Equipo1> equi1 = new ArrayList<Equipo1>();
    static ArrayList<Equipo2> equi2 = new ArrayList<Equipo2>();
    static ArrayList<Musical> musical = new ArrayList<Musical>();
    public Eventos(String nombreevento, String fecha, String code, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin,String equipo1,String equipo2){
    this.nombre= nombreevento;
    this.fechaevento= fecha;
    this.code= code;
    this.cantpersonas=cantidadper;
    this.Descripcion=descripcion;
    this.tipevento=tipoevento;
    this.monto=monto;
    this.tipodeporte=tipodeporte;
    this.tipomusica=tipomusica;
    this.Usercreate=Userloggin;
    this.equipo1=equipo1;
    this.equipo2=equipo2;
    }
    public void AgregarPlayer(){
    String Sjugadores1 = JOptionPane.showInputDialog("Ingrese la cantidad de jugadores del Equipo 1");
    String Sjugadores2 = JOptionPane.showInputDialog("Ingrese la cantidad de jugadores del Equipo 2");
    int jugadores1=Integer.parseInt(Sjugadores1);
    int jugadores2=Integer.parseInt(Sjugadores2);
    boolean mostrar1=true;
    boolean mostrar2=true;
    //para agregar el primero
    for(int i=0;i<jugadores1;i++){
        if(mostrar1){
    JOptionPane.showMessageDialog(null, "Ingrese el nombre de los jugadores del primer equipo");
        mostrar1=false;
        }    
     jugador1a = JOptionPane.showInputDialog("Ingrese el nombre de jugardor numero: "+i);
        System.out.println("1.Jugador "+i+": "+jugador1a);
    equi1.add(new Equipo1(jugador1a));
    }
    //para agregar el segundo equipo
    for(int i=0;i<jugadores2;i++){
        if(mostrar2){
             JOptionPane.showMessageDialog(null, "Ingrese el nombre de los jugadores del segundo equipo");    
            mostrar2=false;
          }
    String jugador2 = JOptionPane.showInputDialog("Ingrese el nombre de jugardor numero: "+i);
    System.out.println("2.Jugador "+i+": "+jugador2a);
    equi2.add(new Equipo2(jugador2));
    }
    
        System.out.println("Se han agregado todos los jugadores");
        System.out.println("Primer equipo: ");
        for (Equipo1 a : equi1) {
            System.out.println(a.toString() + " jugador1");
        }
        System.out.println("Segundo equipo: ");
        for (Equipo2 e : equi2) {
            System.out.println(e.toString() + " jugador2");
        }
        
    }
    
//    public void Agregarmusic(){
//     String Smusicoscan = JOptionPane.showInputDialog("Ingrese la cantidad de personas que conforman el equipo:");
//     int musicoscan=Integer.parseInt(Smusicoscan);  
//        for(int i=0;i<musicoscan;i++){
//                String musico = JOptionPane.showInputDialog("Ingrese el nombre del musico numero: "+i);
//                String Intrumento = JOptionPane.showInputDialog("Ingrese el nombre del Intrumento numero: "+i);
//            musical.add(new Musical(musico,Intrumento));
//        }
//        for (Musical a : musical) {
//            System.out.println(a.toString() + " miembro");
//        }
//    }
    private int musicoscan;
     public void AgregarmusicRecursiva(int i) {
        if (i < musicoscan) {
            String musico = JOptionPane.showInputDialog("Ingrese el nombre del músico número: " + i);
            String instrumento = JOptionPane.showInputDialog("Ingrese el nombre del instrumento número: " + i);
            musical.add(new Musical(musico, instrumento));
            AgregarmusicRecursiva(i + 1);
        }
    }
    public void Agregarmusic() {
        String Smusicoscan = JOptionPane.showInputDialog("Ingrese la cantidad de personas que conforman el equipo:");
        musicoscan = Integer.parseInt(Smusicoscan);

        AgregarmusicRecursiva(0);

        for (Musical a : musical) {
            System.out.println(a.toString() + " miembro");
        }
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTipevento() {
        return tipevento;
    }

    public void setTipevento(String tipevento) {
        this.tipevento = tipevento;
    }

    public String getFechaevento() {
        return fechaevento;
    }

    public void setFechaevento(String fechaevento) {
        this.fechaevento = fechaevento;
    }

    public String getUsercreate() {
        return Usercreate;
    }

    public void setUsercreate(String Usercreate) {
        this.Usercreate = Usercreate;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public double getMulta() {
        return multa;
    }

//    public String getFechacreate() {
//        return fechacreate;
//    }
//
//    public void setFechacreate(String fechacreate) {
//        this.fechacreate = fechacreate;
//    }
    public void setMulta(double multa) {  
        System.out.println("multa llego es de: "+multa);
        this.multa = multa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantpersonas() {
        return cantpersonas;
    }

    public void setCantpersonas(int cantpersonas) {
        this.cantpersonas = cantpersonas;
    }

    public String getTipodeporte() {
        return tipodeporte;
    }

    public void setTipodeporte(String tipodeporte) {
        this.tipodeporte = tipodeporte;
    }

    public String getTipomusica() {
        return tipomusica;
    }

    public void setTipomusica(String tipomusica) {
        this.tipomusica = tipomusica;
    }
    public String toString(int n){
        if(getEstado().equals("Cancelado")){
        multa=100;
        }
      return"CODIGO: "+code +"– TIPO: "+tipevento+" - TITULO: "+ nombre+"– FECHA: "+fechaevento+" – Multa: "+multa+"\n";
    }
    public String toString(boolean lt){
        return "CODIGO: "+code +"– TIPO: "+tipevento+" - TITULO: "+ nombre+"– FECHA: "+fechaevento+" – MONTO: "+monto+"\n";
    }
    public String toString(String t){
    return "ID: "+code +" – TIPO: "+tipevento+" – TITULO: "+nombre +" – ESTADO: "+estado+" - MONTO: "+monto+"\n";
    }
    @Override
    
    public String toString() {
    StringBuilder info = new StringBuilder("Evento{\n");
    info.append("Nombre='").append(nombre).append("',\n");
    info.append("Estado evento= '").append(getEstado()).append("',\n");
    info.append("codigo='").append(code).append("',\n");
    info.append("fecha evento='").append(fechaevento).append("',\n");
    info.append("descripcion='").append(Descripcion).append("',\n");
    info.append("cantidad personas='").append(cantpersonas).append("',\n");
    info.append("Usuario que lo creo='").append(Usercreate).append("',\n");
    info.append("tipo de evento='").append(tipevento).append("',\n");
    info.append("Monto='").append(monto).append("',\n");
    if (tipevento.equals("Musical")) {
        info.append("tipo de musica='").append(tipomusica).append("'}\n");
        info.append("Musicos:\n");
        for (Musical musi : musical) {
            if (musi != null) {
                info.append(musi.toString()).append("\n");
            }
        }
    } else if (tipevento.equals("Deportivo")) {
        info.append("tipo de deporte='").append(tipodeporte).append("'}\n\n");
        info.append("Equipo1:\n");
        for (Equipo1 equi : equi1) {
            if (equi != null) {
                info.append("Jugador: ").append(equi.toString()).append("\n");
            }
        }
        info.append("Equipo2:\n");
        for (Equipo2 equipo : equi2) {
            if (equipo != null) {
                info.append("Jugador: ").append(equipo.toString()).append("\n");
            }
        }
    }

    return info.toString();
}

    
    // Getter para obtener el estado
    public Enum getEstado() {
        return estado;
    }

    // Setter para actualizar el estado
    public void setEstado(Enum estado) {
        this.estado = estado;
    }
    public int compareTo(Eventos otroEvento) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date fechaEvento = dateFormat.parse(this.getFechaevento());
            Date otraFechaEvento = dateFormat.parse(otroEvento.getFechaevento());
            // Compara las fechas de los eventos para la ordenación
            return otraFechaEvento.compareTo(fechaEvento); // Para ordenar de más reciente a más antigua
        } catch (ParseException e) {
            e.printStackTrace();
            // Manejo de errores
            return 0; // Cambia esto según tus necesidades
        }
    }
  }
