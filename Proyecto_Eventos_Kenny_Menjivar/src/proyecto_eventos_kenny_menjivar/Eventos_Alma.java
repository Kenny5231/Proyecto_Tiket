/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
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
    Date fechaActual = new Date();

    for (Eventos event : listaEventos) {
        Date fechaEvento = null;
        try {
            fechaEvento = dateFormat.parse(event.getFechaevento());
        } catch (ParseException e) {
            e.printStackTrace();
            continue;  
        }

        if (fechaEvento.after(fechaActual)) {
            eventosFuturos.add(event);
        }
    }

    
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
    
    public String encontrarfecha(String fecha1, String fecha2) {
    String info = "";
    int deportivo = 0;
    double mondepo = 0;
    int musical = 0;
    double montmusical = 0;
    int religioso = 0;
    double monreli = 0;
    int totalevent = 0;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    try {
        Date fechaInicial = dateFormat.parse(fecha1);
        Date fechaFinal = dateFormat.parse(fecha2);

        for (Eventos event : listaEventos) {
            Date fechaEvento = null;
            try {
                fechaEvento = dateFormat.parse(event.getFechaevento());
            } catch (ParseException e) {
                e.printStackTrace();
                continue; 
            }

            if (fechaEvento.after(fechaInicial) && fechaEvento.before(fechaFinal)) {
                System.out.println("Evento dentro del rango: " + event.getCode());
                info += event.toString(true);
                if (event.getTipevento().equals("Deportivo")) {
                    deportivo++;
                    mondepo = event.getMonto();
                } else if (event.getTipevento().equals("Musical")) {
                    musical++;
                    montmusical = event.getMonto();
                } else if (event.getTipevento().equals("Religioso")) {
                    religioso++;
                    monreli = event.getMonto();
                }
            }
        }

        totalevent = deportivo + musical + religioso;
        double total = montmusical + mondepo + monreli;
        info += "*****Eventos dentro del rango de fechas*****\n"
                + deportivo + " Fueron deportivos.\n" + religioso + " Fueron religiosos.\n" + musical + " Fueron musicales.\n"
                + "*****Montos*****\n" + mondepo + " es el monto del tipo deportivo.\n" + montmusical + " es el monto del tipo musical.\n"
                + monreli + " es el monto del tipo religioso.\n" + "Total generado: " + total;
    } catch (ParseException e) {
        e.printStackTrace();
        return "Error al analizar las fechas.";
    } catch (NullPointerException e) {
        e.printStackTrace();
        return "Una de las fechas es nula.";
    }

    return info;
}

public String eventospasados() {
    String info = "";
    int deportivo = 0;
    double mondepo = 0;
    int musical = 0;
    double montmusical = 0;
    int religioso = 0;
    double monreli = 0;
    int totalevent = 0;
    ArrayList<Eventos> eventosPasados = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Date fechaActual = new Date(); 

    for (Eventos event : listaEventos) {
        Date fechaEvento = null;
        try {
            fechaEvento = dateFormat.parse(event.getFechaevento());
        } catch (ParseException e) {
            e.printStackTrace();
            continue; 
        }

        if (fechaEvento.before(fechaActual)) {
            eventosPasados.add(event);
        }
    }

    Comparator<Eventos> fechaComparator = new Comparator<Eventos>() {
        @Override
        public int compare(Eventos evento1, Eventos evento2) {
            try {
                Date fecha1 = dateFormat.parse(evento1.getFechaevento());
                Date fecha2 = dateFormat.parse(evento2.getFechaevento());
                return fecha2.compareTo(fecha1); 
            } catch (ParseException e) {
                e.printStackTrace();
                return 0;
            }
        }
    };

    Collections.sort(eventosPasados, fechaComparator);

    for (Eventos eventoPasado : eventosPasados) {
        info += eventoPasado.toString(true);
        if (eventoPasado.getTipevento().equals("Deportivo")) {
            deportivo++;
            mondepo = eventoPasado.getMonto();
        } else if (eventoPasado.getTipevento().equals("Musical")) {
            musical++;
            montmusical = eventoPasado.getMonto();
        } else if (eventoPasado.getTipevento().equals("Religioso")) {
            religioso++;
            monreli = eventoPasado.getMonto();
        }
    }
    totalevent = deportivo + musical + religioso;
    double total = montmusical + mondepo + monreli;
    info += "*****Eventos que fueron deportivos*****\n" + deportivo + " Fueron deportivos.\n" + religioso
            + " Fueron religiosos.\n" + musical + " Fueron musical.\n *****Monto*****\n" + mondepo
            + " es el monto del tipo deportivo.\n" + montmusical + " es el monto del tipo musical.\n" + monreli
            + " es el monto del tipo\n" + "Total generado: " + total;

    return info;
}

    public boolean diasiguiente(String fecha) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    try {
        Date fechaProporcionada = sdf.parse(fecha);

        Date fechaActual = new Date();

        Calendar calFechaActual = Calendar.getInstance();
        calFechaActual.setTime(fechaActual);

        Calendar calFechaProporcionada = Calendar.getInstance();
        calFechaProporcionada.setTime(fechaProporcionada);
        calFechaActual.add(Calendar.DAY_OF_MONTH, 1);

        if (calFechaActual.get(Calendar.YEAR) == calFechaProporcionada.get(Calendar.YEAR) &&
            calFechaActual.get(Calendar.MONTH) == calFechaProporcionada.get(Calendar.MONTH) &&
            calFechaActual.get(Calendar.DAY_OF_MONTH) == calFechaProporcionada.get(Calendar.DAY_OF_MONTH)) {
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        System.err.println("Error al analizar la fecha: " + e.getMessage());
        return false;
    }
}

    



    
}
