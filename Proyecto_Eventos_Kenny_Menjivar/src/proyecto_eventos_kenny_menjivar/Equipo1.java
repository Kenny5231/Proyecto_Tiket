/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
public class Equipo1 {
    private static String Nombrejugador;
    public Equipo1(String jugador){
    Nombrejugador= jugador;
    }

    public static String getNombrejugador() {
        return Nombrejugador;
    }

    public static void setNombrejugador(String Nombrejugador) {
        Equipo1.Nombrejugador = Nombrejugador;
    }
    @Override
    public String toString(){
    return "Nombre: "+Nombrejugador;
    }
    
}
