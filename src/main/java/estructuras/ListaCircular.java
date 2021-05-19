/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;
import objetos.Asignacion;
import objetos.Curso;
import objetos.Edificio;
import objetos.Horario;
import objetos.Usuario;

/**
 *
 * @author erikssonherlo
 */
public class ListaCircular<T> {
    
    private Nodo<T> raiz;
    private Nodo<T> fin;
    private int size;

    public ListaCircular() {
        raiz = null;
        fin = null;
    }

    public boolean add(T informacion) {
        Nodo nuevoNodo = new Nodo<T>(informacion);

        if (raiz == null)
        {
            raiz = nuevoNodo;
            fin = nuevoNodo;
            raiz.setSiguiente(raiz);
            raiz.setAnterior(fin);
        } else if (noExiste(informacion))
        {
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(raiz);
            nuevoNodo.setAnterior(fin);
            fin = nuevoNodo;
            raiz.setAnterior(fin);
        } else
        {
            String id = getId(informacion);
            return false;
        }
        size++;
        return true;
    }

    private boolean noExiste(T informacion) {
        String auxId;
        String id = getId(informacion);

        Nodo<T> aux = raiz;

        do
        {
            auxId = getId(aux.getInformacion());
            if (auxId.equals(id))
            {
                return false;
            }
            aux = aux.getSiguiente();

        } while (aux != raiz);

        return true;
    }

    /**
     * OBTENER EL TIPO DE OBJETO QUE UTILIZARA LA LISTA CIRCULAR
     * @param informacion
     * @return 
     */
    private String getId(T informacion) {
        if (informacion instanceof Usuario)
        {
            Usuario user = (Usuario) informacion;
            return String.valueOf(user.getId());
        } else if (informacion instanceof Edificio)
        {
            Edificio edificio = (Edificio) informacion;
            return edificio.getNombre();
        } else if (informacion instanceof Curso)
        {
            Curso curso = (Curso) informacion;
            return String.valueOf(curso.getId());
        } else if (informacion instanceof Asignacion)
        {
            Asignacion asignacion = (Asignacion) informacion;
            return String.valueOf(asignacion.getId());
        }
        return null;
    }

    public Nodo<T> getNodo(String id) {
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            do
            {
                String id_aux = getId(aux.getInformacion());
                if (id.equals(id_aux))
                {
                    return aux;
                } else
                {
                    aux = aux.getSiguiente();
                }
            } while (aux != raiz);
        }
        return null;
    }

    public T getInformacion(String id) {
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            do
            {
                String id_aux = getId(aux.getInformacion());
                if (id.equals(id_aux))
                {
                    return aux.getInformacion();
                } else
                {
                    aux = aux.getSiguiente();
                }
            } while (aux != raiz);
        }
        return null;

    }

    public boolean eliminar(String id) {
        if (raiz != null)
        {
            Nodo<T> nodo = getNodo(id);
            if (nodo != null)
            {
                String id_Raiz = getId(raiz.getInformacion());
                String id_Fin = getId(fin.getInformacion());
                if (raiz == fin)
                {
                    raiz = fin = null;
                    size--;
                    return true;
                } else if (id.equals(id_Raiz))
                {
                    raiz = raiz.getSiguiente();
                } else if (id.equals(id_Fin))
                {
                    fin = fin.getAnterior();
                }
                Nodo<T> nodoAnterior = nodo.getAnterior();
                Nodo<T> nodoSiguiente = nodo.getSiguiente();
                nodoAnterior.setSiguiente(nodoSiguiente);
                nodoSiguiente.setAnterior(nodoAnterior);
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean actualizar(T informacion) {
        Nodo<T> nodo = getNodo(getId(informacion));
        if (nodo != null)
        {
            nodo.setInformacion(informacion);
            return true;
        }

        return false;
    }

    public ArrayList<T> getNodos() {
        ArrayList<T> lista = new ArrayList<>();
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            do
            {
                lista.add(aux.getInformacion());
                aux = aux.getSiguiente();
            } while (aux != raiz);
        }
        return lista;
    }

    public void mostrarDatos() {
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            System.out.println("**************************************");
            do
            {
                if (aux.getInformacion() instanceof Usuario)
                {
                    Usuario user = (Usuario) aux.getInformacion();
                    System.out.println("************ USUARIO ************");
                    System.out.println("ID: " + user.getId());
                    System.out.println("Nombre: " + user.getNombre());
                    System.out.println("Password: " + user.getPassword());
                    System.out.println("Tipo: " + user.getTipoUsuario());

                } else if (aux.getInformacion() instanceof Edificio)
                {
                    Edificio edificio = (Edificio) aux.getInformacion();
                    System.out.println("************ EDIFICIO ************");
                    System.out.println("Nombre: " + edificio.getNombre());
                    System.out.println("\tSalones:");
                    edificio.getListaSalones().mostrarDatos();
                } else if (aux.getInformacion() instanceof Curso)
                {
                    Curso curso = (Curso) aux.getInformacion();
                    System.out.println("************ CURSO ************");
                    System.out.println("Codigo: " + curso.getId());
                    System.out.println("Nombre: " + curso.getNombre());
                    System.out.println("Semestre: " + curso.getSemestre());
                    System.out.println("Creditos: " + curso.getCreditos());
                } else if (aux.getInformacion() instanceof Asignacion)
                {
                    Asignacion asignacion = (Asignacion) aux.getInformacion();
                    System.out.println("************ ASIGNACION ************");
                    System.out.println("Codigo: " + asignacion.getId());
                    System.out.println("Horario: " + asignacion.getHorario().getPeriodo());
                    System.out.println("Estudiante: " + asignacion.getEstudiante().getId());
                    System.out.println("Zona: " + asignacion.getZona());
                    System.out.println("Final: " + asignacion.getExamenFinal());
                }

                if (aux.getSiguiente() != null)
                {
                    System.out.println("Siguiente: " + getId(aux.getSiguiente().getInformacion()));
                }
                if (aux.getAnterior() != null)
                {
                    System.out.println("Anterior: " + getId(aux.getAnterior().getInformacion()));
                }
                aux = aux.getSiguiente();
            } while (aux != raiz);
        } else
        {
            System.out.println("******* LISTA CIRCULAR VACIA *******");
        }
    }

    public boolean estaVacia() {
        if (raiz != null && fin != null)
        {
            return false;
        } else
        {
            return true;
        }
    }

    public int getAsignacionesSalon(int salon, String edificio) {
        int contador = 0;
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            do
            {
                if (aux.getInformacion() instanceof Asignacion)
                {
                    Asignacion asignacion = (Asignacion) aux.getInformacion();
                    Horario horario = asignacion.getHorario();

                    if (horario.getEdificio().getNombre().equals(edificio) && horario.getSalon().getId() == salon)
                    {
                        contador++;
                    }
                    aux = aux.getSiguiente();
                }
            } while (aux != raiz);
        }
        return contador;
    }
    
    public ArrayList<Asignacion> getAsignacionesEstudiante(int carnet) {
        ArrayList<Asignacion> listaAsignaciones = new ArrayList<>();
        if (raiz != null) {
            Nodo<T> aux = raiz;

            do {
                if (aux.getInformacion() instanceof Asignacion) {
                    Asignacion asignacion = (Asignacion) aux.getInformacion();
                    if (asignacion.getEstudiante().getId() == carnet) {
                        listaAsignaciones.add(asignacion);
                    }
                }
                aux = aux.getSiguiente();
            } while (aux != raiz);
        }
        return listaAsignaciones;
    }

    public int getSize() {
        return size;
    }

    private class Nodo<T> {

        private T informacion;
        private Nodo<T> siguiente;
        private Nodo<T> anterior;

        public Nodo(T informacion, Nodo<T> siguiente, Nodo<T> anterior) {
            this.informacion = informacion;
            this.siguiente = siguiente;
            this.anterior = anterior;
        }

        private Nodo(T informacion) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public T getInformacion() {
            return informacion;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public Nodo<T> getAnterior() {
            return anterior;
        }

        public void setInformacion(T informacion) {
            this.informacion = informacion;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }

        public void setAnterior(Nodo<T> anterior) {
            this.anterior = anterior;
        }

     

    }
}
