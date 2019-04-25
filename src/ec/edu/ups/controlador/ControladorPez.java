/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Pez;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase  ControladorPez implementada usando la interface Set y la clase HashSet.
 * @author Darwin Leon, Est.
 */
public class ControladorPez {
    
     //Interfaz Set guarda lista de objetos en un HashSet el cual permite el ingreso
    //de un objeto con un unico codigo. Aqui agregamos el codigo automaticamente.
    private Set<Pez> listaP;
    private int cod;

    public ControladorPez() {
        listaP = new HashSet<>();
        cod = 1;
    }

    public void create(Pez pez) {
        pez.setCodigo(cod);
        listaP.add(pez);
        cod++;
    }
    
    /**
     * Metodo read de la clase ControladorPez .
     *
     * @param codigo que es ingresado desde el teclado para la lectura.
     * @return el objeto tren.
     */
    public Pez read(int codigo) {
        for (Pez pezR : listaP) {
            if (pezR.getCodigo() == codigo) {
                System.out.println(" ");
                System.out.println("Si existe:  ");
                return pezR;
            }else{
                if(pezR.getCodigo()!=codigo){
                    System.out.println(" El codigo del pez no existe o ya fue eliminado");
                }
            }
        }
        return null;
    }
    
    /**
     *
     * @param pez
     * @return
     */
    public void update(Pez pez) {
            if (listaP.contains(pez)) {  
                listaP.remove(pez);
                listaP.add(pez);
            }  
    }

    /**
     *
     * @param codigo 
     * @param pez
     */
    public void delete(Pez pez) {
       if(listaP.contains(pez))
                listaP.remove(pez);    
    }
    
    /**
     * Imprime todos los objetos de la lista que han sido creados 
     * en base a un Set y clase HashSet.
     */
    public void imprimir(){
        for (Pez pez : listaP) {
            System.out.println(pez);
        }
    }
    
  
}
