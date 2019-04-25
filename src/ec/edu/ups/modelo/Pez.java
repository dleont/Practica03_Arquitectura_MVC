/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 * Clase HIJA 2. Interfaz Set y HashSet.
 * @author Darwin Leon, Est.
 */
public class Pez extends Animal {

    private String tipoPez;
    private String tipoEsqueleto;
    private double tamaño;
    private double peso;
    
    /**
     * Constructor vacio.
     */
    public Pez (){
    }

    /**
     * Constrcutor con todos los parametros tanto de la clase como heredados.
     * @param tipoPez
     * @param tipoEsqueleto
     * @param tamaño
     * @param peso
     * @param codigo
     * @param nombre
     * @param tipoAnimal
     * @param sexo 
     */
    public Pez(String tipoPez, String tipoEsqueleto, double tamaño, double peso, int codigo, String nombre, String tipoAnimal, String sexo) {
        super(codigo, nombre, tipoAnimal, sexo);
        this.tipoPez = tipoPez;
        this.tipoEsqueleto = tipoEsqueleto;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    // Metodos SETTER'S Y GETTER'S
    public String getTipoPez() {
        return tipoPez;
    }

    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }

    public String getTipoEsqueleto() {
        return tipoEsqueleto;
    }

    public void setTipoEsqueleto(String tipoEsqueleto) {
        this.tipoEsqueleto = tipoEsqueleto;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Metodo toString convierte un objeto en una cadena de texto.
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"tipo de Pez= " + tipoPez +"\n"+ "tipo de Esqueleto= " + tipoEsqueleto +
                ", tamaño= " + tamaño +" cm "+", peso= " + peso + " lb";
    }
    
    
    @Override
    public int compareTo(Animal o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
