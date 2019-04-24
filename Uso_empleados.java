/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Arrays;
import javax.xml.transform.OutputKeys;


/**
 *
 * @author Gabriel
 */
public class Uso_empleados {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado misEmpleados[]= new Empleado[3];
        misEmpleados[0]= new Empleado("Juan",10000,2000,11,05);
        misEmpleados[1]= new Jefatura("pedro",20000,2000,11,05);
        misEmpleados[2]= new Empleado("Jose",8000,2000,11,05);
        Jefatura jefealmacen=(Jefatura) misEmpleados[1];
        System.out.println(jefealmacen.tomarDecisiones("dar vacaciones a juan, su id es: "+ misEmpleados[0].id));
        System.out.println("el Jefe: " +jefealmacen.nombre + " tiene un bonus de:" + jefealmacen.estableceBonus(1000));
        
        for(int i=0; i<misEmpleados.length;i++){
            Arrays.sort(misEmpleados);
            System.out.println(misEmpleados[i]);
        }
         String s="";
        boolean mayor= s=="cadena";
               
        System.out.println(s);
               
               
    }
    
    
        
    
}
