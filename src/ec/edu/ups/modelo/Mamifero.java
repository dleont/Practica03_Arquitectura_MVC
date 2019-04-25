/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Darwin
 */
public class Mamifero extends Animal {
    
    private int cantPatas;
    private int cantMamas;
    private String tiempoGest;
    private double peso;
    
    public Mamifero(){
    }

    public Mamifero(int cantPatas, int cantMamas, String tiempoGest, double peso, int codigo, String nombre, String tipoAnimal, String sexo) {
        super(codigo, nombre, tipoAnimal, sexo);
        this.cantPatas = cantPatas;
        this.cantMamas = cantMamas;
        this.tiempoGest = tiempoGest;
        this.peso = peso;
    }

    //METODOS SETTER'S Y GETTER'S
    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public int getCantMamas() {
        return cantMamas;
    }

    public void setCantMamas(int cantMamas) {
        this.cantMamas = cantMamas;
    }

    public String getTiempoGest() {
        return tiempoGest;
    }

    public void setTiempoGest(String tiempoGest) {
        this.tiempoGest = tiempoGest;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Metodo toString convierte un objeto en cadena de texto y ademas llama al 
     * metodo toString de la clase "padre" mediante el 'super.toString()'.
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " Cantidad de patas= " + cantPatas +"\n"+ "Cantidad de mamas= " + cantMamas +
                ", Tiempo de Gestacion en meses= " + tiempoGest + ", Peso= " + peso+" kg ";
    }
    
   
}
