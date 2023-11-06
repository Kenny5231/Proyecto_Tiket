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
public abstract class AlmacenUsuarios {
    
    private String Informacioneventuser="";
    private String nombreCompleto;
    public String username;
    private String contraseña;
    private int edad;
    private String tipoUsuario;
    static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    static ArrayList<Eventos> listaEventos = new ArrayList<Eventos>();
    static String Userloging;
    static String Contraloging;
    static String nameloging;
    static int edadloggin;
    static String tipouserloggin;
    static String fecha1;
    static String fecha2;
    Eventos event;
    Usuario user;
    Eventos_Alma info;
    Puente puente;
    
    
    
    
    
    
    
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
        AlmacenUsuarios.tipouserloggin = tipouserloggin;
    }
    

    public static String getContraloging() {
        return Contraloging;
    }

    public static void setContraloging(String Contraloging) {
        AlmacenUsuarios.Contraloging = Contraloging;
    }

    public static String getNameloging() {
        return nameloging;
    }

    public static void setNameloging(String nameloging) {
        AlmacenUsuarios.nameloging = nameloging;
    }

    public static int getEdadloggin() {
        return edadloggin;
    }

    public static void setEdadloggin(int edadloggin) {
        AlmacenUsuarios.edadloggin = edadloggin;
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
    
    
    
    public AlmacenUsuarios(String nombreCompleto, String username, String contraseña, int edad, String tipoUsuario) {
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
    //eventos
    public void agregarevento(String nombreevento, String fecha, String code, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin,String equipo1,String equipo2) {
        listaEventos.add(new Eventos( nombreevento, fecha, code, cantidadper, descripcion, tipoevento, monto, tipomusica, tipodeporte, Userloggin,equipo1,equipo2));
    }
    public void mostrarlistaeventos() {
        for (Eventos l : listaEventos) {
            System.out.println(l + " Yeahhh");
        }
    }
    public String mostrarinfoeventos(String code) {
        for (Eventos l : listaEventos) {
            if(l.getCode().equals(code)){
            System.out.println(l);
            return l.toString();
            }
        }
        return null;
    }

    public String getInformacioneventuser() {
        return Informacioneventuser;
    }

    public void setInformacioneventuser(String Informacioneventuser) {
        this.Informacioneventuser += Informacioneventuser;
    }
    
    public String eventosCreadosPorUsuario(String nombreUsuario) {
     return null;
    }
    public String buscarevento(ArrayList<Eventos>listaEventos,String codigo){
     for (Eventos event : listaEventos) {
            if (event.getCode().equals(codigo)) {
                return event.getCode();
            }
        }
        return null; // Devuelve null si el evento no se encuentra en la lista
    }
    public  void eliminarEvent(String code) {
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                event.setEstado(Enum.Cancelado);
                System.out.println("Estado: "+ event.getEstado());
                System.out.println("Codigo Cancelado: " + code);
                return;
            }
        }
        System.out.println("Usuario no encontrado: " + code);
    }
    public  void vereventdelete(String code) {
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                event.setEstado(Enum.Cancelado);
                System.out.println("Codigo Cancelado: " + code);
                return;
            }
        }
        System.out.println("Usuario no encontrado: " + code);
    }
    
    public String vereventdelete() {
    String info = "";
    int deportivo=0;
        double mondepo=0;
        int musical=0;
        double montmusical=0;
        int religioso=0;
        double monreli=0;
        int totalevent=0;

    for (Eventos event : listaEventos) {
        if (event.getEstado() == Enum.Cancelado) {
            info += event.toString(0);
            if(event.getTipevento().equals("Deportivo")){
        deportivo++;
        mondepo=event.getMulta();
        }else if(event.getTipevento().equals("Musical")){
        musical++;
        montmusical=event.getMulta();
        }else if(event.getTipevento().equals("Religioso")){
        religioso++;
        monreli=event.getMulta();
        }
        }
    }
    totalevent=deportivo+musical+religioso;
    double total=montmusical+mondepo+monreli;
    info+="*****Eventos que fueron deportivos*****\n"+deportivo+" Fueron deportivos.\n"+religioso+" Fueron religiosos.\n"+musical+" Fueron musical.\n *****Monto*****\n"+mondepo+" es el monto del tipo deportivo.\n"+montmusical+" es el monto del tipo musical.\n"+monreli+" es el monto del tipo\n"+"Total generado por indemnización: "+total;
    System.out.println("Eventos Cancelados: " + info);
    return info;
    }

    
    
    
    public Eventos buscarEventoPorcode(ArrayList<Eventos> listaEventos, String codeBuscado) {
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(codeBuscado)) {
                return event; // Se encontró un usuario con el username buscado
            }
        }
        return null; // No se encontró un usuario con el username buscado
    }
    public void editarevento(String nombreevento, String fecha, String code,String newcode, int cantidadper, String descripcion, String tipoevento,double monto,String tipomusica,String tipodeporte,String Userloggin,String equipo1,String equipo2) {
        Eventos eventos = buscarEventoPorcode(listaEventos,code);
        if (eventos != null) {
            eventos.setCode(newcode);
            eventos.setCantpersonas(cantidadper);
            eventos.setDescripcion(descripcion);
            eventos.setFechaevento(fecha);
            eventos.setTipevento(tipoevento);
            eventos.setTipodeporte(tipodeporte);
            eventos.setTipomusica(tipomusica);
        }
    }
    public void añadirplayes(String codigo){
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(codigo)) {
                event.AgregarPlayer();
            }
        }
    }
    public void añadirmusicos(String codigo){
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(codigo)) {
                event.Agregarmusic();
            }
        }
    }
    public void añadirinfouser(String codigo,String Userloging){
        for (Usuario usuarios : listaUsuarios) {
            if (usuarios.getUsername().equals(Userloging)) {
               usuarios.agregarevet(codigo);
            }
        }
    }
    public String usu(String codigo) {
        String info="";
        String[] arreglo = new String[150];
        
    for (Usuario usuarios : listaUsuarios) {
        if (usuarios.getUsername().equals(codigo)) {
            arreglo = usuarios.eventocreados();
        }
        }
    for(int i=0;i<arreglo.length;i++){
            System.out.println("ARREGLO:      ///"+arreglo[i]);
        }
    for(int i=0;i<arreglo.length;i++){
    if(!arreglo[i].equals("")){
        System.out.println("Si entre");
    info+=mostrarinfoeventos(arreglo[i]);
    }
    }
        System.out.println("no entre");
    return info;
    }
    
    public String info(){
    return event.toString(true);
    }
    //repotes
    public String pasados() {
        String nombreCompleto = "Nombre";
        String username = "Usuario";
        String contraseña = "Contraseña";
        int edad = 30;
        String tipoUsuario = "Tipo";
        info = new Eventos_Alma( nombreCompleto, username,contraseña,edad, tipoUsuario);
        return info.eventospasados();
    }
    public String Futuros() {
        String nombreCompleto = "Nombre";
        String username = "Usuario";
        String contraseña = "Contraseña";
        int edad = 30;
        String tipoUsuario = "Tipo";
        info = new Eventos_Alma( nombreCompleto, username,contraseña,edad, tipoUsuario);
        return info.eventosfuturos();
    }
    public String sendfecha(){
        String nombreCompleto = "Nombre";
        String username = "Usuario";
        String contraseña = "Contraseña";
        int edad = 30;
        String tipoUsuario = "Tipo";
        info = new Eventos_Alma( nombreCompleto, username,contraseña,edad, tipoUsuario);
        puente = new Puente(username, contraseña, nombreCompleto, edad, tipoUsuario);
        fecha1=puente.setenviofecha1();
        fecha2=puente.setenviofecha2();
        System.out.println("Estoy en almacen: fecha1: "+fecha1+" fecha2: "+fecha2);
    return info.encontrarfecha(fecha1,fecha2);
    }
    
    public  String getUssercreateevent(String code) {
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                return event.getUsercreate();
            }
        }
        return null;
    }
    public String getfecha(String code){
    for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                return event.getFechaevento();
            }
        }
        return null;
    }
    public double getmulta(String code){
    for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                return event.getMonto();
            }
        }
        return 0;
    }
    public void enviomultaevent(String code,double multa){
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                event.setMulta(multa);
            }
        }
    }
    public String sendtipouser(String code){
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                return event.getTipevento();
            }
        }
        return null;
    }
    
    public String sentinfo(String code){
        for (Eventos event : listaEventos) {
            if (event.getCode().equals(code)) {
                return event.toString("bkf");
            }
        }
        return null;
    }
    
    
    
    
    
    
}
