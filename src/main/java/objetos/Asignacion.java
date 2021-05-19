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
public class Asignacion {
    private int id;
    private Estudiante estudiante;
    private int zona;
    private int examenFinal;
    private Horario horario;
    private int idEstudiante;
    private int idHorario;

    /**
     * CONSTRUCTOR PARA LA ASIGNACION DE UN ESTUDIANTE YA CREADO POR MEDIO DEL OBJETO
     * @param id
     * @param estudiante
     * @param zona
     * @param examenFinal
     * @param horario 
     */
    public Asignacion(int id, Estudiante estudiante, int zona, int examenFinal, Horario horario) {
        this.id = id;
        this.estudiante = estudiante;
        this.zona = zona;
        this.examenFinal = examenFinal;
        this.horario = horario;
    }

    /**
     * CONSTRUCTOR PARA LA ASIGNACION DE UN ESTUDIANTE POR MEDIO DEL ID
     * @param id
     * @param estudiante
     * @param zona
     * @param examenFinal
     * @param idEstudiante
     * @param idHorario 
     */
    public Asignacion(int id, Estudiante estudiante, int zona, int examenFinal, int idEstudiante, int idHorario) {
        this.id = id;
        this.estudiante = estudiante;
        this.zona = zona;
        this.examenFinal = examenFinal;
        this.idEstudiante = idEstudiante;
        this.idHorario = idHorario;
    }

    public int getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public int getZona() {
        return zona;
    }

    public int getExamenFinal() {
        return examenFinal;
    }

    public Horario getHorario() {
        return horario;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public void setExamenFinal(int examenFinal) {
        this.examenFinal = examenFinal;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    
    
}
