/*
 * To change this license cabezaer, choose License Cabezaers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import objetos.Estudiante;

/**
 *
 * @author erikssonherlo
 */
public class TablaHash<T> {
    
    private int Capacidad;
    private float OM;
    private int MaxSize;
    private List<T>[] array;
    private int size = 0;

    public TablaHash() {
        Capacidad = 37;
        OM = 0.55f;
        MaxSize = (int) (OM * Capacidad);
        array = new List[Capacidad];
        for (int i = 0; i < Capacidad; i++)
        {
            array[i] = new List<>();
        }
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public float getOM() {
        return OM;
    }

    public int getMaxSize() {
        return MaxSize;
    }

    public List<T>[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T buscarInformacion(int id) {
        int index = hashing(id);
        List<T> aux_lista;
        int contador = 0;
        while (contador <= getSize())
        {
            aux_lista = array[index];
            if (aux_lista.getCabeza() != null)
            {
                if (getId(aux_lista.getCabeza().valor) == id)
                {
                    return aux_lista.getCabeza().valor;
                }
            }
            index = hashingCollision(id, contador);
            contador++;
        }
        return null;
    }

    public int getId(T informacion) {
        if (informacion instanceof Estudiante)
        {
            Estudiante estudiante = (Estudiante) informacion;
            return estudiante.getId();
        }
        return 0;
    }

    public void actualizar(Estudiante estudianteEdited) {
        Estudiante estudiante = (Estudiante) buscarInformacion(estudianteEdited.getId());
        estudiante.setNombre(estudianteEdited.getNombre());
        estudiante.setDireccion(estudianteEdited.getDireccion());
        
     }

    public boolean add(T informacion) {
        if (buscarInformacion(getId(informacion)) != null)
        {
            return false;
        }

        if (contains(informacion))
        {
            int cont = 0;
            while (containsColission(getId(informacion), cont))
            {
                cont++;
            }
            addItemColission(informacion, cont);
            ++size;
            if (size == MaxSize)
            {
                resize(); // resize
                return true;
            }

        } else
        {
            addItem(informacion); // add item into array
            ++size; // increase size
            System.out.println();
            if (size == MaxSize)
            {
                resize(); // resize
                return true;
            }

        }

        return true;
    }

    private void addItem(T item) {
        int index = hashing(getId(item));
        array[index].agregar(item);
    }

    private void addItemColission(T item, int i) {
        int index = hashingCollision(getId(item), i); // rehash
        array[index].agregar(item);
    }

    public boolean contains(T item) {
        int index = hashing(getId(item));
        List<T> aux_list = array[index];
        if (aux_list.getCabeza() != null)
        {
            return true;
        }
        return false;
    }

    public boolean containsColission(int id, int i) {
        int index = hashingCollision(id, i);
        List<T> list = array[index];
        if (list.getCabeza() != null)
        {
            return true;
        }
        return false;
    }

    public boolean remover(int id) {
        int index = hashing(id);
        List<T> aux_list;
        int contador = 0;

        while (contador <= getSize())
        {
            aux_list = array[index];
            if (aux_list.getCabeza() != null)
            {
                if (getId(aux_list.getCabeza().valor) == id)
                {
                    aux_list.removerCabeza();
                    size--;
                    return true;
                }
            }
            index = hashingCollision(id, contador);
            contador++;
        }
        return false;

    }

    private boolean resize() {
        int temp = Capacidad;
        Capacidad = Capacidad << 1;
        MaxSize = (int) (OM * Capacidad);
        List<T>[] arrayCopy = array;
        array = new List[Capacidad];
        for (int i = 0; i < Capacidad; i++)
        {
            array[i] = new List<>();
        }
        for (int i = 0; i < temp; i++)
        {
            Iterator<T> it = arrayCopy[i].iterator();
            while (it.hasNext())
            {
                addItem(it.next());
            }
        }
        return true;
    }

    public int hashing(int item) {
        int hash = item % Capacidad;
        return hash;
    }

    public int hashingCollision(int item, int i) {
        int hash = ((item % 7) + 1) * i;
        return hash;
    }

    public ArrayList<T> getNodos() {
        ArrayList<T> lista = new ArrayList<>();
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].getCabeza() != null)
            {
                lista.add(array[i].getCabeza().valor);
            }

        }
        return lista;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < Capacidad; i++)
        {
            sb.append(array[i].toString() + (i == Capacidad - 1 ? "" : ", "));
        }
        return sb.toString();
    }

    /**
     * CLASE DE TIPO LIST UTILIZADA DE FORMA GENERICA PARA CUALQUIER TIPO DE OBJETO
     * @param <T> 
     */
    private class List<T> {

        public Node<T> getCabeza() {
            return cabeza;
        }

        public void removerCabeza() {
            cabeza = cola = null;
        }

        public void setCabeza(Node<T> cabeza) {
            this.cabeza = cabeza;
        }

        public Node<T> cabeza, cola;
        public int size;

        public List() {
            cabeza = cola = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void agregar(T valor) {
            if (cabeza == null)
            {
                cabeza = cola = new Node<>(valor);
            } else
            {
                cola.siguiente = new Node<>(valor);
                cola = cola.siguiente;
            }
            ++size;
        }

        public void remover(T valor) {
            Node<T> actual = cabeza, anterior = new Node<>(valor);
            anterior.siguiente = actual;
            while (actual != null)
            {
                if (valor.equals(actual.valor))
                {
                    anterior.siguiente = actual.siguiente;
                    --size;
                    return;
                }
            }
            throw new NoSuchElementException();
        }

        public String toString() {
            Node<T> actual = cabeza;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            while (actual != null)
            {
                sb.append(((Estudiante) actual.valor).getId() + ",");
                actual = actual.siguiente;
            }
            if (sb.length() > 1)
            {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("]");
            return sb.toString();
        }

        public Iterator<T> iterator() {
            return new ListIterator<>();
        }

           private class ListIterator<T> implements Iterator<T> {

            Node<T> next;

            public ListIterator() {
                next = (Node<T>) cabeza;
            }

            public boolean hasNext() {
                return next != null;
            }

            public T next() {
                if (next == null)
                {
                    throw new NoSuchElementException();
                }
                T val = next.valor;
                next = next.siguiente;
                return val;
            }
            // incorrect and needs to be corrected!

            public void remove() {
                if (next == null)
                {
                    throw new NoSuchElementException();
                }
                T val = next.valor;
                next = next.siguiente;
            }

        }

        private class Node<T> {

            public T valor;
            public Node<T> siguiente;

            public Node(T valor) {
                this.valor = valor;
                this.siguiente = null;
            }

            public T getValor() {
                return valor;
            }

            public Node<T> getSiguiente() {
                return siguiente;
            }

            public void setValor(T valor) {
                this.valor = valor;
            }

            public void setSiguiente(Node<T> siguiente) {
                this.siguiente = siguiente;
            }
            
        }
    }
}
