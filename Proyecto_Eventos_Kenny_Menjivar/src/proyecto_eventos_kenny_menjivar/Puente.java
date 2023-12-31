/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.util.ArrayList;
import static proyecto_eventos_kenny_menjivar.AlmacenUsuarios.listaUsuarios;

/**
 *
 * @author Kenny
 */
class Puente extends AlmacenUsuarios {

    static String name = "ADMIN";
    static String Password = "supersecreto";
    static String Nombrecompleto = "";
    static String tipouser = "Administrador";
    static int edad = 20;
    static String Userloggin;
    //user logueado
    static String namelogin;
    static String passwordlogin;
    static String nombrecomlogin;
    static String tipouserlogin;
    static int edadlogin;
    private static String fecha1;
    private static String fecha2;
    public static String getNamelogin() {
        return namelogin;
    }

    public static void setNamelogin(String namelogin) {
        Puente.namelogin = namelogin;
    }

    public static String getPasswordlogin() {
        return passwordlogin;
    }

    public static void setPasswordlogin(String passwordlogin) {
        Puente.passwordlogin = passwordlogin;
    }

    public static String getNombrecomlogin() {
        return nombrecomlogin;
    }

    public static void setNombrecomlogin(String nombrecomlogin) {
        Puente.nombrecomlogin = nombrecomlogin;
    }

    public static String getTipouserlogin() {
        return tipouserlogin;
    }

    public static void setTipouserlogin(String tipouserlogin) {
        Puente.tipouserlogin = tipouserlogin;
    }

    public static int getEdadlogin() {
        return edadlogin;
    }

    public static void setEdadlogin(int edadlogin) {
        Puente.edadlogin = edadlogin;
    }
    
    public void cambiarinfo(String username, String newUsername, String newNombreCompleto, int newEdad, String newTipoUsuario,String password){
    super.cambiarInformacion(username, newUsername, newNombreCompleto, newEdad, newTipoUsuario,password);
    }

    public String informacion(String user){
    String info=super.eventosCreadosPorUsuario(user);
    return info;
    }
    
    public void actualizardatos(String username){
      super.definologing(username);
        // Obtener y actualizar los datos desde la superclase (pruebouser)
        
        this.passwordlogin = super.getContraloging();
        
        this.namelogin = super.getNameloging();
        
        this.tipouserlogin = super.getTipouserloggin();
        
        this.edadlogin = super.getEdadloggin();  
        
    }

    public static String getUserloggin() {
        return Userloggin;
    }

    public static void setUserloggin(String Userloggin) {
        Puente.Userloggin = Userloggin;
    }
    
    public Puente(String user, String contrasena, String NombreCom, int edad, String tipouser) {
        super(user, contrasena, NombreCom, edad, tipouser);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombrecompleto() {
        return Nombrecompleto;
    }

    public void setNombrecompleto(String Nombrecompleto) {
        this.Nombrecompleto = Nombrecompleto;
    }

    public String getTipouser() {
        return tipouser;
    }

    public void setTipouser(String tipouser) {
        this.tipouser = tipouser;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean BuscarUser(String User) {
        if (super.buscarUsuarioPorUsername(listaUsuarios, User) != null) {
            return true;
        }
        return false;
    }

    public String contraUser(String Username) {
        String storedPassword = super.encontrarContraseña(Username);
        if (storedPassword != null) {
            return storedPassword;
        }
        return "no hay"; 
    }

    public void crearUser(String nombreCompleto, String username, String Pasword, int edad, String Tipouser) {
        super.agregaruser(nombreCompleto, username, Pasword, edad, Tipouser);
    }

    public void mostrarlista() {
        super.mostrarlista();
    }

    public void eliminaruser(String Username) {
        super.eliminarUsuario(Username);
    }
     

    public void cambiarInformacion(String username, String newUsername, String newNombreCompleto, int newEdad, String newTipoUsuario) {
        Usuario usuario = buscarUsuarioPorUsername(listaUsuarios, username);
        if (usuario != null) {
            usuario.setUsername(newUsername);
            usuario.setNombreCompleto(newNombreCompleto);
            usuario.setEdad(newEdad);
            usuario.setTipoUsuario(newTipoUsuario);
        }
    }
    
    //evetos
    public void agregarevent(String nombreevento, String fecha, String code, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin,String equipo1,String equipo2){
        super.agregarevento(nombreevento, fecha, code, cantidadper, descripcion, tipoevento, monto, tipomusica, tipodeporte, Userloggin,equipo1,equipo2);
    }
    public void mostrarevent(){
    super.mostrarlistaeventos();
    }
    public boolean buscarevent(String code){
    if (super.buscarevento(listaEventos,code) != null) {
            return true;
        }
        return false;
    }
    public void eliminarevent(String code){
    super.eliminarEvent(code);
    }
    public String mostrarinfoevent(String code){
    return super.mostrarinfoeventos(code);
    }
    public void editevent(String nombreevento, String fecha, String code,String newcode, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin,String equipo1,String equipo2){
        super.editarevento(nombreevento, fecha, code, newcode, cantidadper, descripcion, tipoevento, monto, tipomusica, tipodeporte, Userloggin, equipo1, equipo2);
    }
    public void agregarplayer(String code){
     super.añadirplayes(code);
    }
    public void agregarmusic(String codigo){
    super.añadirmusicos( codigo);
    }
    public void agregarinfoevent(String code,String Userloging){
    super.añadirinfouser(code,Userloging);
    }
    public String intent(String codigo){
    return super.usu(codigo);
    }
    public String eventpasados(){
    return super.pasados();
    }
    public String eventFuturos(){
    return super.Futuros();
    }
    public String setenviofecha1(){
    return fecha1;
    }
    public String setenviofecha2(){
    return fecha2;
    }
    public void getenviofecha1(String Fecha1){
    this.fecha1=Fecha1;
    }
    public void getenviofecha2(String Fecha2){
    this.fecha2=Fecha2;

    }
    public String sendfecha(){
    return super.sendfecha();
    }
    public String eventdelete(){
        return super.vereventdelete();
    }
    public String createevent(String code){
    return super.getUssercreateevent(code);
    }
    public String agarrarfecha(String code){
    return super.getfecha(code);
    }
    public double enviomonto(String code){
    return super.getmulta(code);
    }
    public void sendmunta(String code,double multa){
    super.enviomultaevent(code, multa);
    }
    public String sendtpuser(String code){
    return super.sendtipouser(code);
    }
    public String sendverperfil(String code){
    return super.sentinfo(code);
    }
    public void cambio(String user, String code,String newcode){
    super.cambioevent(user, code, newcode);
    }
}