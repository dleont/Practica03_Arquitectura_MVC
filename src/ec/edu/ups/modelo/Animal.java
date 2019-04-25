/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 * Clase Animal considerada "padre" que contiene atributos que se heredaran a 
 * las siguientes clases hijas.
 * 
 * @author Darwin Leon, Est.
 */
public abstract class Animal implements Comparable<Animal> {
    private int codigo;
    private String nombre;
    private String tipoAnimal;
    private String sexo;
    
    /**
     * Constructor vacio.
     */
    public Animal(){
    }
    
    /**
     *  Constructor con todos los parametros.
     * @param codigo
     * @param nombre
     * @param tipoAnimal
     * @param sexo 
     */
    public Animal(int codigo, String nombre, String tipoAnimal, String sexo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.tipoAnimal=tipoAnimal;
        this.sexo=sexo;
    }

    //METODOS SETTER'S Y GETTER'S
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo toString convierte un objeto en cadena de texto.
     * @return 
     */
    @Override
    public String toString() {
        return  "\n"+" ► codigo= " + codigo + ", nombre= " + nombre + 
                ", tipo Animal= " + tipoAnimal + ", sexo= " + sexo ;
    }

    //
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
