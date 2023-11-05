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
        int deportivo=0;
        double mondepo=0;
        int musical=0;
        double montmusical=0;
        int religioso=0;
        double monreli=0;
        int totalevent=0;
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
        if(eventoPasado.getTipevento().equals("Deportivo")){
        deportivo++;
        mondepo=eventoPasado.getMonto();
        }else if(eventoPasado.getTipevento().equals("Musical")){
        musical++;
        montmusical=eventoPasado.getMonto();
        }else if(eventoPasado.getTipevento().equals("Religioso")){
        religioso++;
        monreli=eventoPasado.getMonto();
        }
    }
    totalevent=deportivo+musical+religioso;
    double total=montmusical+mondepo+monreli;
    info+="*****Eventos que fueron deportivos*****\n"+deportivo+" Fueron deportivos.\n"+religioso+" Fueron religiosos.\n"+musical+" Fueron musical.\n *****Monto*****\n"+mondepo+" es el monto del tipo deportivo.\n"+montmusical+" es el monto del tipo musical.\n"+monreli+" es el monto del tipo\n"+"Total generado: "+total;
    
    
    return info;
    }
    
    
    
    public String eventosfuturos() {
    String info = "";
    int deportivo=0;
        double mondepo=0;
        int musical=0;
        double montmusical=0;
        int religioso=0;
        double monreli=0;
        int totalevent=0;
    ArrayList<Eventos> eventosFuturos = new ArrayList<>();
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

        if (fechaEvento.after(fechaActual)) {
            eventosFuturos.add(event);
        }
    }

    // Ahora, 'eventosFuturos' contiene los eventos futuros. Puedes hacer lo que quieras con esta lista.
    for (Eventos eventoFuturo : eventosFuturos) {
        System.out.println("Evento futuro: " + eventoFuturo.getCode());
        info += eventoFuturo.toString(true);
        if(eventoFuturo.getTipevento().equals("Deportivo")){
        deportivo++;
        mondepo=eventoFuturo.getMonto();
        }else if(eventoFuturo.getTipevento().equals("Musical")){
        musical++;
        montmusical=eventoFuturo.getMonto();
        }else if(eventoFuturo.getTipevento().equals("Religioso")){
        religioso++;
        monreli=eventoFuturo.getMonto();
        }
    }
    totalevent=deportivo+musical+religioso;
    double total=montmusical+mondepo+monreli;
    info+="*****Eventos que fueron deportivos*****\n"+deportivo+" Fueron deportivos.\n"+religioso+" Fueron religiosos.\n"+musical+" Fueron musical.\n *****Monto*****\n"+mondepo+" es el monto del tipo deportivo.\n"+montmusical+" es el monto del tipo musical.\n"+monreli+" es el monto del tipo\n"+"Total generado: "+total;
    
    return info;
    }

    
}
