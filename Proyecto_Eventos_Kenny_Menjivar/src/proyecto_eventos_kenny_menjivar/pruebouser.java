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
class pruebouser {
    private String nombreCompleto;
    public String username;
    private String contraseña;
    private int edad;
    private String tipoUsuario;
    static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    static String Userloging;
    static String Contraloging;
    static String nameloging;
    static int edadloggin;
    static String tipouserloggin;

    
    
    public void cambiarInformacion(String username, String newUsername, String newNombreCompleto, int newEdad, String newTipoUsuario,String newpassword) {
        Usuario usuario = buscarUsuarioPorUsername(listaUsuarios, username);
        if (usuario != null) {
            usuario.setUsername(newUsername);
            usuario.setNombreCompleto(newNombreCompleto);
            usuario.setEdad(newEdad);
            usuario.setTipoUsuario(newTipoUsuario);
            usuario.setContraseña(newpassword);
        }
    }

    public static String getTipouserloggin() {
        return tipouserloggin;
    }

    public static void setTipouserloggin(String tipouserloggin) {
        pruebouser.tipouserloggin = tipouserloggin;
    }
    

    public static String getContraloging() {
        return Contraloging;
    }

    public static void setContraloging(String Contraloging) {
        pruebouser.Contraloging = Contraloging;
    }

    public static String getNameloging() {
        return nameloging;
    }

    public static void setNameloging(String nameloging) {
        pruebouser.nameloging = nameloging;
    }

    public static int getEdadloggin() {
        return edadloggin;
    }

    public static void setEdadloggin(int edadloggin) {
        pruebouser.edadloggin = edadloggin;
    }
    
    public void definologing(String Usserloging){
        System.out.println("estamos en defino");
    this.nameloging=buscarnombre(Usserloging);
        System.out.println(nameloging);
    this.Contraloging= encontrarContraseña(Usserloging);    
        System.out.println(Contraloging);
    this.edadloggin= buscaredad(Usserloging); 
        System.out.println(edadloggin);
    this.tipouserloggin=buscartipouser(Usserloging);
        System.out.println(tipouserloggin);
    }
    
    public String buscartipouser(String username){
     for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario.getTipoUsuario();
            }
        }
        return null; // Devuelve null si el usuario no se encuentra en la lista
    }
    public int buscaredad(String username){
     for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario.getEdad();
            }
        }
        return 0; // Devuelve null si el usuario no se encuentra en la lista
    }
    
    
    public String buscarnombre(String username){
     for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario.getNombreCompleto();
            }
        }
        return null; // Devuelve null si el usuario no se encuentra en la lista
    }
    
    
    
    public pruebouser(String nombreCompleto, String username, String contraseña, int edad, String tipoUsuario) {
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario buscarUsuarioPorUsername(ArrayList<Usuario> listaUsuarios, String usernameBuscado) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(usernameBuscado)) {
                return usuario; // Se encontró un usuario con el username buscado
            }
        }
        return null; // No se encontró un usuario con el username buscado
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void agregaruser(String nombreCompleto, String username, String password, int edad, String tipoUsuario) {
        listaUsuarios.add(new Usuario(nombreCompleto, username, password, edad, tipoUsuario));
    }

    public void mostrarlista() {
        for (Usuario u : listaUsuarios) {
            System.out.println(u + " auu");
        }
    }

    public String encontrarContraseña(String nombreUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(nombreUsuario)) {
                return usuario.getContraseña();
            }
        }
        return null; // Devuelve null si el usuario no se encuentra en la lista
    }
    public  void eliminarUsuario(String username) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(username)) {
                listaUsuarios.remove(usuario);
                System.out.println("Usuario eliminado: " + username);
                return;
            }
        }
        System.out.println("Usuario no encontrado: " + username);
    }
}