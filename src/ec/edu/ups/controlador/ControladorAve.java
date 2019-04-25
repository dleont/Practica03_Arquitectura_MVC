/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ave;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Clase  ControladorAve debe ser implementada usando la interface SortedSet y la clase TreeSet.
 * @author Darwin Leon, Est.
 */
public class ControladorAve {
    
     //Interfaz SortedSet guarda lista de objetos en un TreeSet el cual permite el ingreso
    //de un objeto con un unico codigo. Aqui se genera el codigo automaticamente.
    private SortedSet<Ave> listaAve;
    private int cod;
    
   
    public ControladorAve(){
        listaAve = new TreeSet<>();
        cod = 0; 
}
    
    public void create(Ave ave) {
        cod++;
        ave.setCodigo(cod);
        listaAve.add(ave);
    }
    
     /**
     * Metodo read de la clase ControladorAve .
     *
     * @param codigo que es ingresado desde el teclado para la lectura.
     * @return el objeto ave.
     */
    public Ave read(int codigo) {
        for (Ave aveR : listaAve) {
            if (aveR.getCodigo()== codigo) {
                return aveR;
            }
        } 
        return null;
    }
    
    public Ave update(Ave aveU){
            if (listaAve.contains(aveU)) { 
                listaAve.remove(aveU);
                listaAve.add(aveU); 
            }
        return null;
    }
    
     /**
     *
     * @param codigo 
     */
    public void delete(Ave ave) {
        for (Ave aveD : listaAve) {
            if (aveD.equals(ave)) {
                listaAve.remove(aveD);
                break;
            }  
        }    
    }
    
   
    public void imprimir(){
        for (Ave aveI : listaAve) {
            System.out.println(aveI);
        }
    }
     
    
}
