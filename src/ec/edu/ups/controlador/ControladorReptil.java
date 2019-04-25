/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Reptil;
import java.util.Map;
import java.util.TreeMap;

/**
 * Clase ControladorReptil implementada usando la interface Map y la clase TreeMap.
 * 
 * @author Darwin Leon, Est.
 */
public class ControladorReptil {
    
    private Map<Integer, Reptil> listaR;
    private int cod;
    
    public ControladorReptil(){
        listaR = new TreeMap<>();
        cod =0;   
    }
    
    /**
     * Crea un objeto con el codigo aumentando su valor y lo añade a la lista.
     * @param rep es el objeto creado de la clase Reptil.
     */
    public void create(Reptil rep) {
        cod++;
        rep.setCodigo(cod);
        listaR.put(cod, rep);
    }
    
    
     /**
     * Metodo read de la clase ControladorReptil .
     *
     * @param codigo que es ingresado desde el teclado para la lectura.
     */
    public Reptil read(int codigo) {
       
            if (listaR.get(codigo)!= null) {
                return listaR.get(codigo);
            }
        return null;
    }
    
    /**
     * Actualiza datos mdiante el codigo.
     * @param repU 
     */
     public void update(Reptil repU){
           listaR.put(repU.getCodigo(), repU);
    }
    
     /**
     * Elimina un objeto
     * @param cod 
     */
    public void delete(int cod) {
        listaR.remove(cod);
    }
    
    
    public void imprimir(){
        for (Map.Entry<Integer, Reptil> obj :listaR.entrySet()) {
            int key = obj.getKey();
            String nombreRep =obj.getValue().getNombre();
            System.out.println(" COD: "+key+" Nombre del Reptil: "+nombreRep);
        }
    }
    
    
    
    
}
