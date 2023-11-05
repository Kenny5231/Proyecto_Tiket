/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static proyecto_eventos_kenny_menjivar.AlmacenUsuarios.listaEventos;

/**
 *
 * @author Kenny
 */
public class Eventos_Alma extends AlmacenUsuarios {
    
    String nombreCompleto;
    String username;
    String contraseña;
    int edad;
    String tipoUsuario;
    public Eventos_Alma(String nombreCompleto, String username, String contraseña, int edad, String tipoUsuario) {
        super(nombreCompleto, username, contraseña, edad, tipoUsuario); // Llama al constructor de AlmacenUsuarios
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
        this.tipoUsuario = tipoUsuario;
    }
    
    
    public String eventospasados() {
        String info="";
    ArrayList<Eventos> eventosPasados = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Date fechaActual = new Date();  // Obtener la fecha y hora actual

    for (Eventos event : listaEventos) {
        Date fechaEvento = null;
        try {
            fechaEvento = dateFormat.parse(event.getFechaevento());
        } catch (ParseException e) {
            e.printStackTrace();
            continue;  // Saltar este evento si la fecha no se pudo analizar correctamente
        }

        if (fechaEvento.before(fechaActual)) {
            eventosPasados.add(event);
        }
    }

    // Ahora, 'eventosPasados' contiene los eventos que han pasado. Puedes hacer lo que quieras con esta lista.
    for (Eventos eventoPasado : eventosPasados) {
        System.out.println("Evento pasado: " + eventoPasado.getCode());
        info+=eventoPasado.toString(true);
    }
    return info;
    }
    
}
