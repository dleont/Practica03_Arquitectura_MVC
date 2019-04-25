/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Mamifero;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase ControladorMamifero implementada usando la interface List y la clase
 * ArrayList.
 *
 * @author Darwin Leon, Est.
 */
public class ControladorMamifero {

    private List<Mamifero> lista;
    private int cod;

    public ControladorMamifero() {
        lista = new ArrayList<>();
        cod = 1;
    }

    public void create(Mamifero mamifero) {
        mamifero.setCodigo(cod);
        cod++;
        lista.add(mamifero);
    }

    public Mamifero read(int cod) {
        //for each
        for (Mamifero mamiferoR : lista) {
            if (mamiferoR.getCodigo()==cod) {
                return mamiferoR;
                
            } else {
                System.out.println(" El mamifero de codigo: " + cod + " no existe o fue eliminado");
            }
        }
        return null;
    }

    public void update(Mamifero mamifero) {
        //busco el indice
        for (int i = 0; i < lista.size(); i++) {
            Mamifero elemento = lista.get(i);
            if (elemento.getCodigo() == mamifero.getCodigo()) {  
                lista.remove(i);
                lista.add(mamifero);
                break;
            }
        }
    }

    public void delete(int cod) {
        for (int i = 0; i < lista.size(); i++) {
            Mamifero mamifero = lista.get(i);
            if (mamifero.getCodigo() == cod) {
                lista.remove(i);
                break;
            }
        }
    }
    
    /**
     * Lista todos los objetos creados dentro de esta clase.
     * @param codigo 
     */
    public void listar(int codigo){
          for (Mamifero listarM : lista) {
              if(listarM.getCodigo()==codigo){
                  System.out.println(" ");
                 System.out.println(lista); 
              }
        }   
    }

    

}
