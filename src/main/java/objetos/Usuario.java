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
public class Usuario {
    public static final String ESTUDIANTE = "estudiante";
    public static final String COLABORADOR = "colaborador";
    public static final String SUPER = "Super";
    
    private int id;
    private String nombre;
    private String password;
    private String tipoUsuario;
    private Estudiante estudiante;
    private Catedratico catedratico;

    /**
     * CONSTRUCTOR UTILIZADO PARA LA INSERCION DE CUALQUIER TIPO DE USUARIO
     * @param id
     * @param nombre
     * @param password
     * @param tipoUsuario 
     */
    public Usuario(int id, String nombre, String password, String tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * CONSTRUCTOR UTILIZADO PARA LA INSERCION DE USUARIOS DE TIPO ESTUDIANTE
     * @param id
     * @param nombre
     * @param password
     * @param tipoUsuario
     * @param estudiante 
     */
    public Usuario(int id, String nombre, String password, String tipoUsuario, Estudiante estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.estudiante = estudiante;
    }

    /**
     * CONSTRUCTOR UTILIZADO PARA LA INSERCION E USUARIOS DE TIPO CATEDRATICO
     * @param id
     * @param nombre
     * @param password
     * @param tipoUsuario
     * @param catedratico 
     */
    public Usuario(int id, String nombre, String password, String tipoUsuario, Catedratico catedratico) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.catedratico = catedratico;
    }

    public static String getESTUDIANTE() {
        return ESTUDIANTE;
    }

    public static String getCOLABORADOR() {
        return COLABORADOR;
    }

    public static String getSUPER() {
        return SUPER;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

   
    
    
    
}
