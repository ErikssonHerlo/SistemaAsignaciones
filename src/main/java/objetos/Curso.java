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
public class Curso {
    private int id;
    private String nombre;
    private int semestre;
    private int creditos;

    /**
     * CONSTRUCTOR PARA LA CREACION DE UN CURSO
     * @param id
     * @param nombre
     * @param semestre
     * @param creditos 
     */
    public Curso(int id, String nombre, int semestre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    
}
