/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Darwin Leon, Est.
 */
public class Ave extends Animal {
    
    //atributos privados de la clase Ave.
    private String colorPlumaje;
    private String tipoAve;
    private int tamaño;
    private String tiempoGest;
    
    /**
     * Constrcutor vacio.
     */
    public Ave(){ 
    }

    /**
     * Constructor con todos los paremetros de la clase y los que fueron heredados.
     * @param colorPlumaje
     * @param tipoAve
     * @param tamaño
     * @param tiempoGest
     * @param codigo
     * @param nombre
     * @param tipoAnimal
     * @param sexo 
     */
    public Ave(String colorPlumaje, String tipoAve, int tamaño, String tiempoGest, int codigo, String nombre, String tipoAnimal, String sexo) {
        super(codigo, nombre, tipoAnimal, sexo);
        this.colorPlumaje = colorPlumaje;
        this.tipoAve = tipoAve;
        this.tamaño = tamaño;
        this.tiempoGest = tiempoGest;
    }

    //METODOS SETTER'S Y GETTER'S.
    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoAve() {
        return tipoAve;
    }

    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTiempoGest() {
        return tiempoGest;
    }

    public void setTiempoGest(String tiempoGest) {
        this.tiempoGest = tiempoGest;
    }

    @Override
    public String toString() {
        return super.toString() + "color de Plumaje= " + colorPlumaje +"\n"+ 
                "tipo de Ave=" + tipoAve + ", tamaño= " + tamaño + ", tiempo de Gestacion= " + tiempoGest;
    }


    
    
   
}
