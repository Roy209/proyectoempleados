/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SergioSystem
 * 
 * Esta clase se encarga de Gestionar a un conjunto de cliente, en este caso
 * para agregar y Eliminar
 */
public class ManejoEmpleado {
    
    private  ArrayList<Empleado> ListaEmpleado;
    
    public ManejoEmpleado(){
        this.ListaEmpleado = new ArrayList<>();
    }

    //Getter y Setter
    public ArrayList<Empleado> getListaEmpleado() {
        return ListaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> ListaEmpleado) {
        this.ListaEmpleado = ListaEmpleado;
    }
    
    
    
    
    //SobreCarga 1 del Metodo AddEmpleado, agrega directamene un empledo al arrayLis
    public void AddEmpleado(Empleado P){
        this.ListaEmpleado.add(P);
    }
    
    
    /*Sobrecargar 2 del metodo AddEmpledo, se pasa todos los datos de un empleamos,
    creamos al nuevo empleado y lo agregamos al arrayList*/
    public void AddEmpleado(String nombre, String apellido, double sueldo, String nacimiento){
        Empleado EmpleadoNuevo = new Empleado(nombre,apellido,sueldo,nacimiento);
        this.ListaEmpleado.add(EmpleadoNuevo);
    }
    
    //Metodo que elimina Un Empleado
    
    /*public Boolean Delete(String Nombre){
        boolean bandera=false;  // La bandera va indicar si se logro borrar o no a un Empleado True=Borro False=NoBorro
        int index = Buscar(Nombre);
        
        if(index >= 0){
            this.ListaEmpleado.remove(index);
        }
        return bandera;   
    }*/
    
    public void Delete(int index){
       
        if(index >= 0){
            this.ListaEmpleado.remove(index);
        }
    }
    
    /*private int Buscar(String Nombre){
        int index = -1;  // Se inicia en -1 por que se supone que aun no se a buscado
        int contador = 0;
        for(Empleado E : this.ListaEmpleado){
            if(E.getNombre().equalsIgnoreCase(Nombre)){   //Si el nombre coincide pasamos su posicion en el index
                index = contador;
            }
            contador++;
        }
        return index;
    }*/
    
    
    
    
}
