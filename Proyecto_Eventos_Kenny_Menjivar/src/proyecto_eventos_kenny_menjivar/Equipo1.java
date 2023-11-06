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
    private  String Nombrejugador;
    public Equipo1(String jugador){
    Nombrejugador= jugador;
    }

    public String getNombrejugador() {
        return Nombrejugador;
    }

    public void setNombrejugador(String Nombrejugador) {
        this.Nombrejugador = Nombrejugador;
    }
    
    @Override
    public String toString(){
    return "Nombre: "+Nombrejugador;
    }
    
}
