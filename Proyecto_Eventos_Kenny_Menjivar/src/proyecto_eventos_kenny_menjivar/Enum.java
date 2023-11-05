/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
public enum Enum {
    Activo ("Activo"),
    Cancelado("Cancelado");
    private final String estado;
    private Enum(String estado){
    this.estado=estado;
    }
    public String getEstado(){
    return estado;
    }
}
