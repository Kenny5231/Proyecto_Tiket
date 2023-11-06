/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
public final class preciosfinal extends AlmacenUsuarios {
    String nombreCompleto;
    String username;
    String contraseña;
    int edad;
    String tipoUsuario;
    public preciosfinal(String nombreCompleto, String username, String contraseña, int edad, String tipoUsuario) {
        super(nombreCompleto, username, contraseña, edad, tipoUsuario); 
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
        this.tipoUsuario = tipoUsuario;
    }
    //Atrubuto y funciones finales
    private final double grama=2000; 
    private final double seguro_grama=0.30;
    private final double idemnizacion=0.50;        

    public double getGrama() {
        return grama;
    }

    public double getSeguro_grama() {
        return seguro_grama;
    }

    public double getIdemnizacion() {
        return idemnizacion;
    }
    
}
