/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import static proyecto_eventos_kenny_menjivar.pruebouser.listaUsuarios;

/**
 *
 * @author Kenny
 */
class Puente extends pruebouser {

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
    
    public void actualizardatos(String username){
        System.out.println("actualizamos");
      super.definologing(username);
        // Obtener y actualizar los datos desde la superclase (pruebouser)
        
        this.passwordlogin = super.getContraloging();
        System.out.println("comtra es:"+Password);
        
        this.namelogin = super.getNameloging();
        System.out.println("nombre es:"+name);
        
        this.tipouserlogin = super.getTipouserloggin();
        System.out.println("tipouser:"+tipouser);
        
        this.edadlogin = super.getEdadloggin();  
        System.out.println("edad es:"+edad);
        
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
        return "no hay"; // Cambié "no ay" a "no hay" para corregir la ortografía.
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
}
