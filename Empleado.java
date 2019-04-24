/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Gabriel
 */
public class Empleado extends Persona implements Comparable,Trabajadores {

    double sueldo;
    Date altaContrato;
    int id;
    static int idNext = 0;
    double subesueldo;

    public Empleado(String nombre) {
        super(nombre);

    }

    public void subeSueldo(double sube) {

        sueldo += (sube / 100);

    }

    @Override
    public String dameDescripcion() {
        return "Este empleado tiene un ID : " + id;
    }

    public Empleado(String nombre, double sueldo, int year, int mouth, int day) {
        super(nombre);
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(year, mouth, day);
        altaContrato = calendario.getTime();
        ++idNext;
        id = idNext;

    }

    public int compareTo(Object miobjeto) {

        Empleado otroempleado = (Empleado) miobjeto;
        if (this.id > otroempleado.sueldo) {

            return -1;
        }
        if (this.id < otroempleado.sueldo) {

            return 1;
        }
        return 0;
    }
     public double estableceBonus(double gratificacion){
        
        
        return Trabajadores.BONUSBASE + gratificacion;
    }

    
  

    public String toString() {

        String s = "Datos del los empleados son: \n";
        s += "ID: " + dameDescripcion() + ", ";
        s += "Nombre: " + nombre + ", ";
        s += "Sueldo: " + sueldo + " y ";
        s += "Alta contrato: " + altaContrato;

        return s;
    }

}
