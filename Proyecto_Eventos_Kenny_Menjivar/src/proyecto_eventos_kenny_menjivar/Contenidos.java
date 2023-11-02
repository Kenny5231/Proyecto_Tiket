/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
import java.util.ArrayList;


public class Contenidos extends Usuario {
     private ArrayList<Integer>eventosCreados;
      public Contenidos(String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
        this.eventosCreados = new ArrayList<>();
        }
  public void agregarEventoCreado(int eventoId) {
        eventosCreados.add(eventoId);
    }
}
