/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.util.ArrayList;

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
//    static ArrayList<Equipo1> equi1 = new ArrayList<Equipo1>();
//    static ArrayList<Equipo2> equi2 = new ArrayList<Equipo2>();
//    static ArrayList<Musical> musical = new ArrayList<Musical>();
    public Eventos(String nombreevento, String fecha, String code, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin){
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
        return "Usuario{" +
                "Username='" + nombre + '\'' +
                ", codigo='" + code + '\'' +
                ", fecha evento='" + fechaevento + '\'' +
                ", descripcion=" + Descripcion +
                ", cantidad personas='" + cantpersonas + '\'' +
                ", Usuario que lo creo: "+Usercreate+'\''+
                '}';
    }

//    public static ArrayList<Musical> getMusical() {
//        return musical;
//    }
//
//    public static void setMusical(ArrayList<Musical> musical) {
//        Eventos.musical = musical;
//    }
  }
