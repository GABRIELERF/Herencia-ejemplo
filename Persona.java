/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gabriel
 */
public abstract class Persona {
     String nombre ;
 
       public Persona(String nombre) {
        this.nombre = nombre;
    }
    public abstract String dameDescripcion();

    public String toString(){
    String s="";
    s+="El nombre de la persona es: "+nombre;
    return s;
    
    }
    
      
    
}
