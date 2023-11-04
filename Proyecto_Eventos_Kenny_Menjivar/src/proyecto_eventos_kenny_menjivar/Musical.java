/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
public class Musical {
    private static String nameMiembro;
    private static String Instrumento;
    
    public Musical(String miembro,String Instrumento){
    nameMiembro=miembro;
    this.Instrumento=Instrumento;
    }

    public static String getNameMiembro() {
        return nameMiembro;
    }

    public static void setNameMiembro(String nameMiembro) {
        Musical.nameMiembro = nameMiembro;
    }

    public static String getInstrumento() {
        return Instrumento;
    }

    public static void setInstrumento(String Instrumento) {
        Musical.Instrumento = Instrumento;
    }
    @Override
    public String toString(){
    return "Nombre: "+nameMiembro+"\n Intruemento:"+Instrumento;
    }
    
    
}
