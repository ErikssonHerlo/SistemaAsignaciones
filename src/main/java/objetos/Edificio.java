/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import estructuras.ListaEnlazada;

/**
 *
 * @author erikssonherlo
 */
public class Edificio {
    private String nombre;
    private ListaEnlazada<Salon> listaSalones;
    
    public Edificio(String nombre){
        this.nombre = nombre;
        this.listaSalones = new ListaEnlazada<>();
    }

    public Edificio(String nombre, ListaEnlazada<Salon> listaSalones) {
        this.nombre = nombre;
        this.listaSalones = listaSalones;
    }

    public String getNombre() {
        return nombre;
    }

    public ListaEnlazada<Salon> getListaSalones() {
        return listaSalones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaSalones(ListaEnlazada<Salon> listaSalones) {
        this.listaSalones = listaSalones;
    }
    
    
    
}
