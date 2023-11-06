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
    private  String nameMiembro;
    private  String Instrumento;
    
    public Musical(String miembro,String Instrumento){
    nameMiembro=miembro;
    this.Instrumento=Instrumento;
    }

    public String getNameMiembro() {
        return nameMiembro;
    }

    public void setNameMiembro(String nameMiembro) {
        this.nameMiembro = nameMiembro;
    }

    public String getInstrumento() {
        return Instrumento;
    }

    public void setInstrumento(String Instrumento) {
        this.Instrumento = Instrumento;
    }

    
    @Override
    public String toString(){
    return "Nombre: "+nameMiembro+"\n Intruemento:"+Instrumento;
    }
    
    
}
