/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import estructuras.ArbolAVL;
import estructuras.ArbolB;
import estructuras.ListaCircular;
import estructuras.TablaHash;
import java.util.ArrayList;
import objetos.Asignacion;
import objetos.Catedratico;
import objetos.Curso;
import objetos.Edificio;
import objetos.Estudiante;
import objetos.Horario;
import objetos.Salon;
import objetos.Usuario;

/**
 *
 * @author erikssonherlo
 */
public class EstructuraGeneral {
    
    private static ListaCircular<Usuario> listaUsuarios = new ListaCircular<Usuario>();
    private static ListaCircular<Edificio> listaEdificios = new ListaCircular<Edificio>();
    private static ListaCircular<Curso> listaCursos = new ListaCircular<Curso>();
    private static TablaHash<Estudiante> tablaEstudiantes = new TablaHash<Estudiante>();
    private static ArbolAVL<Catedratico> arbolCatedraticos = new ArbolAVL<Catedratico>();
    private static ArbolB<Horario> arbolHorarios = new ArbolB<Horario>(3);
    private static ListaCircular<Asignacion> listaAsignaciones = new ListaCircular<Asignacion>();
    private static Usuario usuarioActual;

    public static void inicializarSistema() {
        listaUsuarios.add(new Usuario(123, "Eriksson Hernández López", "1", Usuario.SUPER));
        listaUsuarios.add(new Usuario(111, "Juanito Alcachofa", "1", Usuario.COLABORADOR));
        Estudiante estudiante = new Estudiante(201830459, "Fredi Leis", "Quiche");
        tablaEstudiantes.add(estudiante);
        //listaUsuarios.add(new Usuario(222, "Fredi Leis", "1", Usuario.ESTUDIANTE, estudiante));
        
        /*listaUsuarios.add(new Usuario(123, "Alejandro", "1", Usuario.COLABORADOR));
        addEstudiante(123, "lexis", "zona1");
        addEstudiante(1234, "lexis", "zona1");
        addEstudiante(1235, "lexis", "zona1");
        listaEdificios.add((new Edificio("edificio1")));
        addSalonEdificio("edificio1", 1, 2);
        listaCursos.add(new Curso(1,"ciencias",2,20));
        arbolCatedraticos.add(new Catedratico(1,"alfredo ","chileverde"));
        Horario horario = getDataHorario(0, "9:00", "lunes","1", "1", "edificio1", 1);
        if(horario != null){
            addHorario(horario);
        }else{
            System.out.println("Algo salio mal con el horario");
        }*/
    }

    public static boolean loginUser(String user, String password) {
        Usuario usuario = (Usuario) listaUsuarios.getInformacion(user);
        if (usuario != null)
        {
            if (usuario.getPassword().equals(password))
            {
                usuarioActual = usuario;
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    public static void cerrarSesion() {
        if (usuarioActual != null)
        {
            usuarioActual = null;
        }
    }

    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    /**
     * **
     * METODOS PARA LISTA DE USUARIOS
     */
    public static boolean agregarUsuario(int id, String nombre, String password, String type, Estudiante estudiante) {
        boolean add = listaUsuarios.add(new Usuario(id, nombre, password, type, estudiante));
       // listaUsuarios.mostrarDatos();
        return add;
    }

    public static Usuario buscarUsuario(int id) {
        Usuario user = listaUsuarios.getInformacion(String.valueOf(id));
        return user;
    }

    public static boolean eliminarUsuario(int id) {
        return listaUsuarios.eliminar(String.valueOf(id));
    }

    public static boolean actualizarUsuario(Usuario user) {
        return listaUsuarios.actualizar(user);
    }

    public static ListaCircular<Usuario> getListaUsuario() {
        return listaUsuarios;
    }

    public static boolean isEmptyUsuario() {
        return listaUsuarios.estaVacia();
    }

    
    /**
     * METODOS PARA LISTA DE EDIFICIOS
     */
    public static boolean agregarEdificio(String nombre) {
        boolean add = listaEdificios.add(new Edificio(nombre));
        return add;
    }

    public static Edificio buscarEdificio(String nombre) {
        Edificio edificio = listaEdificios.getInformacion(nombre);
        return edificio;
    }

    public static boolean eliminarEdificio(String nombre) {
        return listaEdificios.eliminar(nombre);
    }

    public static ListaCircular<Edificio> getListaEdificios() {
        return listaEdificios;
    }

    
    /**
     * METODOS PARA LISTA DE SALONES
     */
    public static boolean agregarSalonEdificio(String nombre, int numero_salon, int capacidad) {
        Edificio edificio = listaEdificios.getInformacion(nombre);
        if (edificio != null)
        {
            return edificio.getListaSalones().agregar(new Salon(numero_salon, capacidad));
        }
        return false;
    }

    public static boolean eliminarSalonEdificio(String nombre, String numero_salon) {
        Edificio edificio = listaEdificios.getInformacion(nombre);
        return edificio.getListaSalones().eliminar(numero_salon);
    }

    public static Salon buscarSalonEdificio(String nombre, String numero_salon) {
        Edificio edificio = listaEdificios.getInformacion(nombre);
        return edificio.getListaSalones().getTipo(numero_salon);
    }

    public static boolean actualizarSalonEdificio(String nombre, Salon salon) {
        Edificio edificio = listaEdificios.getInformacion(nombre);
        return edificio.getListaSalones().actualiar(salon);
    }

    /**
     * METODOS PARA LISTA DE CURSO
     */
    public static boolean agregarCurso(int id, String nombre, int semester, int credits) {
        return listaCursos.add(new Curso(id, nombre, semester, credits));
    }

    public static Curso buscarCurso(String id) {
        return listaCursos.getInformacion(id);
    }

    public static boolean eliminarCurso(String id) {
        return listaCursos.eliminar(id);
    }

    public static boolean actualizarCurso(Curso curso) {
        return listaCursos.actualizar(curso);
    }

    public static ArrayList<Curso> getCursos() {
        return listaCursos.getNodos();
    }

    public static ListaCircular<Curso> getListaCursos() {
        return listaCursos;
    }

    /**
     * METODOS PARA TABLA HASH DE ESTUDIANTES
     */
    public static boolean agregarEstudiante(int carnet, String nombre, String direccion) {
        return tablaEstudiantes.add(new Estudiante(carnet, nombre, direccion));
    }

    public static Estudiante buscarEstudiante(int carnet) {
        return tablaEstudiantes.buscarInformacion(carnet);
    }

    public static boolean eliminarEstudiante(int carnet) {
        return tablaEstudiantes.remover(carnet);
    }

    public static void actualizarEstudiante(Estudiante estudiante) {
        tablaEstudiantes.actualizar(estudiante);
    }

    public static ArrayList<Estudiante> getEstudiantes() {
        return tablaEstudiantes.getNodos();
    }

    public static TablaHash<Estudiante> getTablaEstudiante() {
        return tablaEstudiantes;
    }

    /**
     * *
     * METODOS PARA ARBOL DE CATEDRATICOS
     */
    public static ArbolAVL<Catedratico> getArbolCatedraticos() {
        return arbolCatedraticos;
    }

    public static boolean agregarCatedratico(int id, String nombre, String direccion) {
        return arbolCatedraticos.agregar(new Catedratico(id, nombre, direccion));
    }

    public static Catedratico buscarCatedratico(int id) {
        return arbolCatedraticos.getInformacion(id);
    }

    public static boolean eliminarCatedratico(int id) {
        return arbolCatedraticos.remover(id);
    }

    public static boolean actualizarCatedratico(Catedratico catedratico) {
        return arbolCatedraticos.actualizar(catedratico);
    }

    public static ArrayList<Catedratico> getCatedraticos() {
        return arbolCatedraticos.getNodos();
    }

    /**
     * *
     * METODOS PARA ARBOL DE HORARIOS
     */
    public static Horario getDataHorario(int id, String periodo, String dia, String cursoId, String salonId, String edificioId, int catedraticoId) {
        Edificio edificio = listaEdificios.getInformacion(edificioId);
        Salon salon = edificio.getListaSalones().getTipo(salonId);
        Catedratico catedratico = arbolCatedraticos.getInformacion(catedraticoId);
        Curso curso = listaCursos.getInformacion(cursoId);
        if (edificio != null && salon != null && catedratico != null && curso != null)
        {
            return new Horario(id, periodo, dia, curso, salon, edificio, catedratico);
        } else
        {
            return null;
        }
    }

    public static Horario buscarHorario(int id) {
        return (Horario) arbolHorarios.buscarPorLlave(id);
    }

    public static boolean agregarHorario(Horario horario) {
        return arbolHorarios.insertar(horario);
    }

    public static ArrayList<Horario> getHorarios() {
        return arbolHorarios.getHorarios();
    }
    
    public static ArbolB<Horario> getArbolHorario(){
        return arbolHorarios;
    }
    

    /**
     * METODOS PARA LISTA DE ASIGNACIONES
     */
    public static ListaCircular<Asignacion> getListaAsignaciones() {
        return listaAsignaciones;
    }

    public static boolean agregarAsignacion(int id, Horario horario, Estudiante estudiante, int zona, int examen_final) {
        return listaAsignaciones.add(new Asignacion(id, estudiante, zona, examen_final, horario));
    }

    public static int getAsignacionesSize() {
        return listaAsignaciones.getSize();
    }

    public static int getAsignacionesSalon(int salon, String edificio) {
        return listaAsignaciones.getAsignacionesSalon(salon, edificio);
    }

    public static ArrayList<Asignacion> getAsignaciones(int carnet) {
        return listaAsignaciones.getAsignacionesEstudiante(carnet);
    }
}
