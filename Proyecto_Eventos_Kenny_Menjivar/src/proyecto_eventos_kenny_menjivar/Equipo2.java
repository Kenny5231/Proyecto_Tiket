/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
public class Equipo2 {
    private static String nombrejugador;
    
    public Equipo2(String jugador){
    nombrejugador=jugador;
    }

    public static String getNombrejugador() {
        return nombrejugador;
    }

    public static void setNombrejugador(String nombrejugador) {
        Equipo2.nombrejugador = nombrejugador;
    }
    @Override
    public String toString(){
    return "Nombre: "+nombrejugador;
    }
    
}
