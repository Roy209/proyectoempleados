/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Keni
 */
public class ManejoArchivo {
    
    private String NombreArchivo;
    
    public ManejoArchivo(String NombreArchivo){
        this.NombreArchivo = NombreArchivo;
    }
    
    
    public void EcribirArchivo( ArrayList<Empleado> listPerson) {
       FileWriter write;
       String archivoTexto = NombreArchivo;
       try{
           write = new FileWriter(archivoTexto);
           
           for(Empleado p : listPerson ){
              write.write(p.getNombre()+" "+p.getApellido()+" "+p.getSalario()+" "+p.getNacimiento()+"\n");  
           }
          
           write.close();
       }catch(IOException e){
           System.out.println(e.getMessage());  
       }
    }
    
    public void EcribirArchivo(String cadena, boolean sobreEscribir) {
       FileWriter write;
       String archivoTexto = NombreArchivo;
       try{
           if(sobreEscribir){
               write = new FileWriter(archivoTexto,false);
           }else{
              write = new FileWriter(archivoTexto,true); 
              write.write(cadena+"\n"); 
           }
             
            write.close();
       }catch(IOException e){
           System.out.println(e.getMessage());  
       }
    }
    
    public ArrayList<Empleado> LeerArchivo() {
        ArrayList<Empleado> ListaEmpleado = new ArrayList<>();
         try {
            FileReader read = new FileReader(this.NombreArchivo);
            BufferedReader bf = new BufferedReader(read);
            String cadena;
            Empleado E;
            cadena = bf.readLine();
            while(cadena!=null){
                System.out.println(cadena);
                String[] info = cadena.split("-");
                E = new Empleado(info[0],info[1],Double.parseDouble(info[2]), info[3]);
                ListaEmpleado.add(E);
                cadena = bf.readLine();
            }
              
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no Encontrado");
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return ListaEmpleado; 
    }
}

