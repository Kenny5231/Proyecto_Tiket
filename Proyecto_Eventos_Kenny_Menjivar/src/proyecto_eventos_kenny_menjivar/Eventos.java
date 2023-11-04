/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static proyecto_eventos_kenny_menjivar.AlmacenUsuarios.listaUsuarios;

/**
 *
 * @author Kenny
 */
public class Eventos {
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
    static ArrayList<Equipo1> equi1 = new ArrayList<Equipo1>();
    static ArrayList<Equipo2> equi2 = new ArrayList<Equipo2>();
    static ArrayList<Musical> musical = new ArrayList<Musical>();
    public Eventos(String nombreevento, String fecha, String code, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin,String equipo1,String equipo2){
        System.out.println("Llegamos a crear");
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
    
    public void Agregarmusic(){
     String Smusicoscan = JOptionPane.showInputDialog("Ingrese la cantidad de personas que conforman el equipo:");
     int musicoscan=Integer.parseInt(Smusicoscan);  
        for(int i=0;i<musicoscan;i++){
                String musico = JOptionPane.showInputDialog("Ingrese el nombre del musico numero: "+i);
                String Intrumento = JOptionPane.showInputDialog("Ingrese el nombre del Intrumento numero: "+i);
            musical.add(new Musical(musico,Intrumento));
        }
        for (Musical a : musical) {
            System.out.println(a.toString() + " miembro");
        }
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
    String jugador = JOptionPane.showInputDialog("Ingrese el nombre de jugardor numero: "+i);
    equi1.add(new Equipo1(jugador));
    }
    //para agregar el segundo equipo
    for(int i=0;i<jugadores2;i++){
        if(mostrar2){
             JOptionPane.showMessageDialog(null, "Ingrese el nombre de los jugadores del segundo equipo");    
            mostrar2=false;
          }
    String jugador2 = JOptionPane.showInputDialog("Ingrese el nombre de jugardor numero: "+i);
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

//    public String getFechacreate() {
//        return fechacreate;
//    }
//
//    public void setFechacreate(String fechacreate) {
//        this.fechacreate = fechacreate;
//    }

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
    @Override
    public String toString() {
        String info= "Usuario{\n" +
        "Username='"+nombre+"',\n" +
        "codigo='"+code+"',\n" +
        "fecha evento='"+fechaevento+"',\n" +
        "descripcion='"+Descripcion+"',\n" +
        "cantidad personas='"+cantpersonas+"',\n" +
        "Usuario que lo creo='"+Usercreate+"',\n" +
        "tipo de evento='"+tipevento+"',\n";
        if(tipevento.equals("Musical")){
            info+= "tipo de musica='"+tipomusica+"}";
        }else if (tipevento.equals("Deportivo")){
            info+="tipo de deporte='"+tipodeporte+"}";
        }
        return info;
    }

//    public static ArrayList<Musical> getMusical() {
//        return musical;
//    }
//
//    public static void setMusical(ArrayList<Musical> musical) {
//        Eventos.musical = musical;
//    }
  }
