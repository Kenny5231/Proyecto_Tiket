/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.util.ArrayList;
import static proyecto_eventos_kenny_menjivar.AlmacenUsuarios.listaUsuarios;
//import static proyecto_eventos_kenny_menjivar.Controladordeusuarios.listaUsuarios;

/**
 *
 * @author Kenny
 */
public class Usuario {
    private String nombreCompleto;
    private String username;
    private String contraseña;
    private int edad;
    private String tipoUsuario;
    private ArrayList<Creados> listaeventoscreadosuser = new ArrayList<>();
    private String[] arreglo = new String[150];

    public void agregarevet(String code) {
        System.out.println("Se creo");
        System.out.println("EL CODIGO QUE LLEGA ES: " + code);
        listaeventoscreadosuser.add(new Creados(code));
        for (Creados l : listaeventoscreadosuser) {
            System.out.println(l.toString() + " fuap-creo");
        }
    }

    public String[] eventocreados() {
        for (Creados l : listaeventoscreadosuser) {
            System.out.println(l.toString() + " pinga");
        }

        int tamaño = listaeventoscreadosuser.size();
        arreglo = new String[tamaño];

        for (int i = 0; i < tamaño; i++) {
            Creados event = listaeventoscreadosuser.get(i);
            arreglo[i] = event.toString();
            System.out.println(arreglo[i] + " pinga");
        }
        return arreglo;
    }
    
    
    public Usuario(String nombreCompleto, String username, String contraseña, int edad, String tipoUsuario) {
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
        this.tipoUsuario = tipoUsuario;
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

//    public String getEventoscreados() {
//        return eventoscreados;
//    }
//
//    public void setEventoscreados(String eventoscreados) {
//        this.eventoscreados+= eventoscreados;
//    }
    
    
   
    
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", username='" + username + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", edad=" + edad +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
    
}
   