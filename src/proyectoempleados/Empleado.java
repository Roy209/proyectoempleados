/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleados;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author SergioSystem
 */
public class Empleado {
    private String Nombre;
    private String Apellido;
    private double Salario;
    private String Nacimiento;
    private string nose;
    
    public Empleado(){}
    public Empleado(String nombre, String apellido, double salario, String nacimiento){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Salario = salario;
        this.Nacimiento = nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;       
    }

    @Override
    public String toString() {
        return Nombre+"-"+ Apellido+"-"+ Salario+"-" + Nacimiento+"-" ;
    }
    
    
    
    
}
