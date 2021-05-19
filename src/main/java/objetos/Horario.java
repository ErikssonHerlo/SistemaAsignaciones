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
public class Horario {
   private int id;
   private String periodo;
   private String dia;
   
   private Curso curso;
   private Salon salon;
   private Edificio edificio;
   private Catedratico catedratico;
   
   private int idCurso;
   private int idSalon;
   private String idEdificio;
   private int idCatedratico;

    public Horario(int id) {
        this.id = id;
    }

    /**
     * CONSTRUCTOR UTILIZADO PARA AGREGAR UN HORARIO
     * @param id
     * @param periodo
     * @param dia
     * @param curso
     * @param salon
     * @param edificio
     * @param catedratico 
     */
    public Horario(int id, String periodo, String dia, Curso curso, Salon salon, Edificio edificio, Catedratico catedratico) {
        this.id = id;
        this.periodo = periodo;
        this.dia = dia;
        this.curso = curso;
        this.salon = salon;
        this.edificio = edificio;
        this.catedratico = catedratico;
    }

    /**
     * CONSTRUCTOR UTILIZADO PARA CREAR UN HORARIO DESDE CERO
     * @param id
     * @param periodo
     * @param dia
     * @param idCurso
     * @param idSalon
     * @param idEdificio
     * @param idCatedratico 
     */
    public Horario(int id, String periodo, String dia, int idCurso, int idSalon, String idEdificio, int idCatedratico) {
        this.id = id;
        this.periodo = periodo;
        this.dia = dia;
        this.idCurso = idCurso;
        this.idSalon = idSalon;
        this.idEdificio = idEdificio;
        this.idCatedratico = idCatedratico;
    }

    public int getId() {
        return id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getDia() {
        return dia;
    }

    public Curso getCurso() {
        return curso;
    }

    public Salon getSalon() {
        return salon;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public String getIdEdificio() {
        return idEdificio;
    }

    public int getIdCatedratico() {
        return idCatedratico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public void setIdEdificio(String idEdificio) {
        this.idEdificio = idEdificio;
    }

    public void setIdCatedratico(int idCatedratico) {
        this.idCatedratico = idCatedratico;
    }
   
   
   
}
