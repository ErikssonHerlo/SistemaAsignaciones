/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

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
public class CargaArchivo {
    
    
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Catedratico> listaCatedraticos;
    private ArrayList<Edificio> listaEdificios;
    private ArrayList<Salon> listaSalones;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Horario> listaHorarios;
    private ArrayList<Asignacion> listaAsignaciones;

    public CargaArchivo(ArrayList<Estudiante> listaEstudiantes, ArrayList<Usuario> listaUsuarios, ArrayList<Catedratico> listaCatedraticos, ArrayList<Edificio> listaEdificios, ArrayList<Salon> listaSalones, ArrayList<Curso> listaCursos, ArrayList<Horario> listaHorarios, ArrayList<Asignacion> listaAsignaciones) {
        this.listaEstudiantes = listaEstudiantes;
        this.listaUsuarios = listaUsuarios;
        this.listaCatedraticos = listaCatedraticos;
        this.listaEdificios = listaEdificios;
        this.listaSalones = listaSalones;
        this.listaCursos = listaCursos;
        this.listaHorarios = listaHorarios;
        this.listaAsignaciones = listaAsignaciones;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Catedratico> getListaCatedraticos() {
        return listaCatedraticos;
    }

    public ArrayList<Edificio> getListaEdificios() {
        return listaEdificios;
    }

    public ArrayList<Salon> getListaSalones() {
        return listaSalones;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Horario> getListaHorarios() {
        return listaHorarios;
    }

    public ArrayList<Asignacion> getListaAsignaciones() {
        return listaAsignaciones;
    }

    public void mostrarDatos() {
        for (int i = 0; i < getListaEstudiantes().size(); i++)
        {
            System.out.println("****************ESTUDIANTE****************");
            Usuario obj = getListaUsuarios().get(i);
            System.out.println("Carnet " + obj.getId());
            System.out.println("Nombre " + obj.getNombre());
            System.out.println("Password " + obj.getPassword());
            System.out.println("Tipo " + obj.getTipoUsuario());
        }
        for (int i = 0; i < getListaUsuarios().size(); i++)
        {
            Usuario obj = getListaUsuarios().get(i);
            System.out.println("****************USUARIO****************");
            System.out.println("Carnet " + obj.getId());
            System.out.println("Nombre " + obj.getNombre());
            System.out.println("Password " + obj.getPassword());
            System.out.println("Tipo " + obj.getTipoUsuario());
        }
        for (int i = 0; i < getListaCatedraticos().size(); i++)
        {
            System.out.println("****************CATEDRATICO****************");
            Catedratico obj = getListaCatedraticos().get(i);
            System.out.println("Carnet " + obj.getId());
            System.out.println("Nombre " + obj.getNombre());
            System.out.println("Direccion " + obj.getDireccion());
        }

        for (int i = 0; i < getListaEdificios().size(); i++)
        {
            System.out.println("**************EDIFICIO******************");
            Edificio obj = getListaEdificios().get(i);
            System.out.println("Nombre " + obj.getNombre());
        }

        for (int i = 0; i < getListaSalones().size(); i++)
        {
            System.out.println("***************SALON*****************");
            Salon obj = getListaSalones().get(i);
            System.out.println("Numero " + obj.getId());
            System.out.println("Capacidad " + obj.getCapacidad());
            System.out.println("Edificio " + obj.getEdificio());
        }

        for (int i = 0; i < getListaCursos().size(); i++)
        {
            System.out.println("***************CURSOS*****************");
            Curso obj = getListaCursos().get(i);
            System.out.println("Numero " + obj.getId());
            System.out.println("Nombre " + obj.getNombre());
            System.out.println("Semestre " + obj.getSemestre());
            System.out.println("Creditos " + obj.getCreditos());
        }

        for (int i = 0; i < getListaHorarios().size(); i++)
        {
            System.out.println("***************HORARIOS*****************");
            Horario obj = getListaHorarios().get(i);
            System.out.println("Numero " + obj.getId());
            System.out.println("Periodo " + obj.getPeriodo());
            System.out.println("Dia " + obj.getDia());
            System.out.println("Curso " + obj.getIdCurso());
            System.out.println("Salon " + obj.getIdSalon());
            System.out.println("Edificio " + obj.getIdEdificio());
            System.out.println("Catedratico " + obj.getIdCatedratico());
        }

        for (int i = 0; i < getListaAsignaciones().size(); i++)
        {
            System.out.println("***************ASIGNACIONES*****************");
            Asignacion obj = getListaAsignaciones().get(i);
            System.out.println("Carnet " + obj.getIdEstudiante());
            System.out.println("Horario " + obj.getIdHorario());
            System.out.println("Zona " + obj.getZona());
            System.out.println("Final " + obj.getExamenFinal());
        }
    }

    public void cargarDatos() {
        cargarEstudiantes();
        cargarUsuarios();
        cargarCatedraticos();
        cargarEdificios();
        cargarSalones();
        cargarCursos();
        cargarHorarios();
        cargarAsignaciones();
        EstructuraGeneral.getListaEdificios().mostrarDatos();
        EstructuraGeneral.getListaCursos().mostrarDatos();
        EstructuraGeneral.getArbolHorario().mostrarArbolB();
        EstructuraGeneral.getListaAsignaciones().mostrarDatos();
    }

    private void cargarEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes)
        {
            EstructuraGeneral.agregarEstudiante(estudiante.getId(), estudiante.getNombre(), estudiante.getDireccion());
        }
    }

    private void cargarUsuarios() {
        for (Usuario usuario : listaUsuarios)
        {
            if (usuario.getTipoUsuario().equals(Usuario.ESTUDIANTE))
            {
                Estudiante estudiante = EstructuraGeneral.buscarEstudiante(usuario.getId());
                if (estudiante != null)
                {
                    EstructuraGeneral.agregarUsuario(usuario.getId(), usuario.getNombre(), usuario.getPassword(), usuario.getTipoUsuario(), estudiante);
                }
            } else
            {
                EstructuraGeneral.agregarUsuario(usuario.getId(), usuario.getNombre(), usuario.getPassword(), usuario.getTipoUsuario(), null);
            }
        }
    }

    private void cargarCatedraticos() {
        for (Catedratico catedratico : listaCatedraticos)
        {
            EstructuraGeneral.agregarCatedratico(catedratico.getId(), catedratico.getNombre(), catedratico.getDireccion());
        }
    }

    private void cargarEdificios() {
        for (Edificio edificio : listaEdificios)
        {
            EstructuraGeneral.agregarEdificio(edificio.getNombre());
        }
    }

    private void cargarSalones() {
        for (Salon salon : listaSalones)
        {
            EstructuraGeneral.agregarSalonEdificio(salon.getEdificio(), salon.getId(), salon.getCapacidad());
        }
    }

    private void cargarCursos() {
        for (Curso curso : listaCursos)
        {
            EstructuraGeneral.agregarCurso(curso.getId(), curso.getNombre(), curso.getSemestre(), curso.getCreditos());
        }
    }

    private void cargarHorarios() {
        for (Horario horario : listaHorarios)
        {
            Horario horarioFinal = EstructuraGeneral.getDataHorario(
                    horario.getId(),
                    horario.getPeriodo(),
                    horario.getDia(),
                    String.valueOf(horario.getIdCurso()),
                    String.valueOf(horario.getIdSalon()),
                    horario.getIdEdificio(),
                    horario.getIdCatedratico()
            );
            if (horarioFinal != null)
            {
                EstructuraGeneral.agregarHorario(horarioFinal);
            }
        }
    }

    private void cargarAsignaciones() {
        for (Asignacion asignacion : listaAsignaciones)
        {
            Estudiante estudiante = EstructuraGeneral.buscarEstudiante(asignacion.getIdEstudiante());
            Horario horario = EstructuraGeneral.buscarHorario(asignacion.getIdHorario());
            if(estudiante != null && horario != null){
                System.out.println("Asignacion "+estudiante.getId());
                EstructuraGeneral.agregarAsignacion(EstructuraGeneral.getAsignacionesSize(), horario, estudiante, asignacion.getZona(), asignacion.getExamenFinal());
            }
        }
    }

}
