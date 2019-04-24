/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.GregorianCalendar;

/**
 *
 * @author Gabriel
 */
public class Jefatura extends Empleado implements Jefes,Trabajadores{

    private double incentivo;
    private double sueldoTotal;
//Contructores
    public Jefatura(String nombre, double incentivo) {
        super(nombre);
        this.incentivo = incentivo;
    }

    public Jefatura(String nombre, double sueldo, int year, int mouth, int day) {
        super(nombre, sueldo, year, mouth, day);
        GregorianCalendar calendario = new GregorianCalendar(year, mouth, day);
        altaContrato = calendario.getTime();

    }
//Metodos
    public void darIncentivo(double incentivo) {

        this.incentivo = incentivo;
    }

    public double sueldoJefe() {

        sueldoTotal = super.sueldo;
        return sueldoTotal;
    }

    @Override
    public String dameDescripcion() {
        return "Este empleado tiene un ID: " + id;
    }
    
    @Override
    public String tomarDecisiones(String decision){
    
        return "Un miembro de la direccion a tomado la decision de:" + decision;
    }
    public void estableceIncentivo(double b){
        incentivo=b;
    }
    
    public double dameSueldo(){
        double sueldo_jefe=dameSueldo();
        return sueldo_jefe+incentivo;
    }
    
    @Override
     public double estableceBonus(double gratificacion){
        double prima=2000;
        
        return Trabajadores.BONUSBASE + gratificacion + prima;
    }

    @Override
    public String toString() {
        String s = "Los datos de los Jefes son: \n";
        s += "ID: " + dameDescripcion() + ", ";
        s += "Nombre: " + nombre + ", ";
        s += "Sueldo: " + sueldoJefe() + " y ";
        s += "Alta contrato: " + altaContrato;

        return s;
    }

}
