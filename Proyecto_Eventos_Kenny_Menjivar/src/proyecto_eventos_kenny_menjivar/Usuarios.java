/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eventos_kenny_menjivar;

/**
 *
 * @author Kenny
 */
public class Usuarios{
    private String Nombre;
    private String user;
    private String contra;
    private String edad;
    
    public Usuarios(String user, String contrasena, String NombreCom,String edad){
        this.Nombre=NombreCom;
        this.user=user;
        this.contra=contrasena;
        this.edad=edad;
    }
    
    public void setUser(String user){
    this.user=user;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setContrasena(String contrasena){
        this.contra=contrasena;
    }
    public String getContrasena(){
        return contra;
    }
 
   public void setNombreUsuario(String nuevoNombreUsuario){
       this.user=nuevoNombreUsuario;
   }
   
   public String getEdad(){
       return edad;
   }
   
   public void setEdad(String Edad){
      this.edad=Edad;
   }
   
}
