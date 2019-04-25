/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 * Clase hija 4 en la cual los objetos son son manupulados mediante la interfaz
 * Map que tiene la clase TreeMap.
 * @author Darwin Leon, Est.
 */
public class Reptil  extends Animal{
    
    //Atributos propios de la clase Reptil.
    private int cantPatas;
    private String tipoSangre;
    private String tipoAlimento;
    private String tipoRespiracion;
    
    /**
     * Constructor vacio
     */
    public Reptil(){
        
    }

    /**
     * Constructor con los paremetros de la clase y ademas con los que hereda.
     * @param cantPatas
     * @param tipoSangre
     * @param tipoAlimento
     * @param tipoRespiracion
     * @param codigo
     * @param nombre
     * @param tipoAnimal
     * @param sexo 
     */
    public Reptil(int cantPatas, String tipoSangre, String tipoAlimento, String tipoRespiracion, int codigo, String nombre, String tipoAnimal, String sexo) {
        super(codigo, nombre, tipoAnimal, sexo);
        this.cantPatas = cantPatas;
        this.tipoSangre = tipoSangre;
        this.tipoAlimento = tipoAlimento;
        this.tipoRespiracion = tipoRespiracion;
    }

    //METODOS SETTER'S Y GETTER'S
    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getTipoRespiracion() {
        return tipoRespiracion;
    }

    public void setTipoRespiracion(String tipoRespiracion) {
        this.tipoRespiracion = tipoRespiracion;
    }

    /**
     * Metodo toString convierte un objeto en cadena de texto.
     * @return  los atributos de  la clase y ademas los que hereda.
     */
    @Override
    public String toString() {
        return super.toString() + " cantidad de Patas= " + cantPatas + ", tipo de Sangre= " + tipoSangre +
                ", tipo de Alimento= " + tipoAlimento + ", tipo de Respiracion= " + tipoRespiracion ;
    }
    
    
    
    
    
    
    
    
}
