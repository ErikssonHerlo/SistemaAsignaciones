/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author erikssonherlo
 */
public class Salon {
    private int id;
    private int capacidad;
    private String edificio;

    /**
     * CONSTRUCTOR PARA LA CREACION DE SALONES AISLADOS O SIN EDIFICIO
     * @param id
     * @param capacidad 
     */
    public Salon(int id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    /**
     * CONSTRUCTOR PARA LA CREACION DE UN SALON EN UN EDIFICIO
     * @param id
     * @param capacidad
     * @param edificio 
     */
    public Salon(int id, int capacidad, String edificio) {
        this.id = id;
        this.capacidad = capacidad;
        this.edificio = edificio;
    }

    public int getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
    
    
    
}
