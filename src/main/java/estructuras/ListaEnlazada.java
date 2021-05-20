/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import objetos.Salon;

/**
 *
 * @author erikssonherlo
 */
public class ListaEnlazada<T> {
    private Nodo<T> raiz;
    private Nodo<T> fin;
    
    public ListaEnlazada(){
        this.raiz = null;
        this.fin = null;
    }
    
    /**
     * METODO PARA AGREGAR UN TIPO DE OBJETO A LA LISTA GENERICA
     * @param tipo
     * @return 
     */
    public boolean agregar(T tipo){
         Nodo<T> nuevoNodo = new Nodo<T>(tipo);
        if (raiz == null)
        {
            raiz = nuevoNodo;
            fin = nuevoNodo;
        } else if (noExiste(tipo))
        {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        } else
        {
            System.out.println("EL OBJETO YA EXISTE: " + getId(tipo));
            return false;
        }
        ordenar();
        return true;
    }

    /**
     * METODO PARA VERIFICAR LA EXISTENCIA DE UN OBJETO
     * @param tipo
     * @return 
     */
    public boolean noExiste(T tipo){
        Nodo<T> aux = raiz;
        String aux_Id;
        String tipo_Id = getId(tipo);
        while (aux != null)
        {
            aux_Id = getId(aux.getTipo());
            if (aux_Id.equals(tipo_Id))
            {
                return false;
            } else
            {
                aux = aux.getSiguiente();
            }
        }
        return true;
    }
    
    /**
     * OBTENER EL ID DE UN OBJETO DE TIPO SALON Y CONVERTIRLO A NUMERICO
     * @param tipo
     * @return 
     */
    private String getId(T tipo) {
        if (tipo instanceof Salon)
        {
            Salon salon = (Salon) tipo;
            return String.valueOf(salon.getId());
        }
        return null;
    }
    
    /**
     * OBTENER EL ID NUMERICO DE UN OBJETO DE TIPO SALON
     * @param tipo
     * @return 
     */
    private int getIdNumerico(T tipo){
        if (tipo instanceof Salon)
        {
            Salon salon = (Salon) tipo;
            return salon.getId();
        }
        return 0;
    }
    
    /**
     * OBTENER EL NODO POR MEDIO DEL ID
     * @param id
     * @return 
     */
     private Nodo<T> getNodo(String id) {
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            while (aux != null)
            {
                String id_Aux = getId(aux.getTipo());
                if (id.equals(id_Aux))
                {
                    return aux;
                } else
                {
                    aux = aux.getSiguiente();
                }
            }
        }
        return null;
    }

     /**
      * OBTENER EL TIPO DE OBJETO, POR MEDIO DE SU ID
      * @param id
      * @return 
      */
    public T getTipo(String id) {
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            while (aux != null)
            {
                String id_Aux = getId(aux.getTipo());
                if (id.equals(id_Aux))
                {
                    return aux.getTipo();
                } else
                {
                    aux = aux.getSiguiente();
                }
            }
        }
        return null;
    }
    
    /**
     * OBTENER EL NODO ANTERIOR
     * @param nodo
     * @return 
     */
     private Nodo<T> getAnterior(Nodo<T> nodo) {
        Nodo<T> aux = raiz;

        while (aux != null)
        {
            if (aux.getSiguiente()== nodo)
            {
                return aux;
            } else
            {
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    /**
     * ELIMINAR POR MEDIO DEL ID
     * @param id
     * @return 
     */
    public boolean eliminar(String id) {
        if (raiz != null)
        {
            Nodo<T> nodo = getNodo(id);
            if (nodo != null)
            {
                String id_Raiz = getId(raiz.getTipo());
                String id_Fin = getId(fin.getTipo());
                if (raiz == fin)
                {
                    raiz = fin = null;
                    return true;
                } else if (id.equals(id_Raiz))
                {
                    raiz = raiz.getSiguiente();
                    return true;
                } else if (id.equals(id_Fin))
                {
                    fin = getAnterior(fin);
                    
                    fin.setSiguiente(null);
                    return true;
                }
                Nodo<T> nodoAnterior = getAnterior(nodo);
                Nodo<T> nodoSiguiente = nodo.getSiguiente();
                nodoAnterior.setSiguiente(nodoSiguiente);
                return true;
            }
        }
        return false;
    }

    public boolean actualiar(T tipo) {
        String id = getId(tipo);
        Nodo<T> nodo = getNodo(id);
        if (nodo != null)
        {
            nodo.setTipo(tipo);
            
            return true;
        } else
        {
            return false;
        }
    }

    public T get(int indice) {
        int indice_Aux = 0;
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            while (aux != null)
            {
                if (indice_Aux == indice)
                {
                    return aux.getTipo();
                } else
                {
                    aux = aux.getSiguiente();
                    indice_Aux++;
                }
            }
        }
        return null;
    }

    public int getSize() {
        int size = 0;
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            while (aux != null)
            {
                size++;
                aux = aux.getSiguiente();
            }
        }
        return size;
    }
    
     public void mostrarDatos() {
        System.out.println("\n-------------------------------------------");
        if (raiz != null)
        {
            Nodo<T> aux = raiz;
            while (aux != null)
            {
                if (aux.getTipo() instanceof Salon)
                {
                    System.out.println("************ SALON ************");
                    Salon salon = (Salon) aux.getTipo();
                    System.out.println("Numero: " + salon.getId());
                    System.out.println("Capacidad: " + salon.getCapacidad());
                    if (aux.getSiguiente() != null)
                    {
                        System.out.println(" Siguiente: " + getId(aux.getSiguiente().getTipo()));
                    }
                }

                aux = aux.getSiguiente();
            }
        } else
        {
            System.out.println("************ LISTA VACIA ************");
        }
    }
     
    /**
     * ORDENAR LA LISTA ENLAZADA EN BASE AL ID
     */
    public void ordenar() {
        int size = getSize();
        if (size > 1)
        {
            for (int i = 0; i < getSize(); i++)
            {
                Nodo<T> actual = raiz;
                Nodo<T> siguiente = actual.getSiguiente();
                for (int j = 1; j < getSize(); j++)
                {
                    int id_Actual = getIdNumerico(actual.getTipo());
                    int id_Siguiente = getIdNumerico(siguiente.getTipo());
                    if ( id_Actual < id_Siguiente )
                    {
                        T tipo_Actual = actual.getTipo();
                        actual.setTipo(siguiente.getTipo());
                        siguiente.setTipo(tipo_Actual);
                        actual = actual.getSiguiente();
                        siguiente = siguiente.getSiguiente();
                    } else
                    {
                        actual = actual.getSiguiente();
                        siguiente = siguiente.getSiguiente();
                    }
                }
            }
        }
    }
    
    /**
     * CLASE NODO GENERICA, UTILIZADA PARA QUE CUALQUIER OBJETO PUEDA CREAR UNA LISTA ENLAZADA
     * @param <T> 
     */
     private class Nodo<T> {

        private T tipo;
        private Nodo<T> siguiente;

        public Nodo(T tipo, Nodo<T> siguiente) {
            this.tipo = tipo;
            this.siguiente = siguiente;
        }

        public Nodo(T tipo) {
            this.tipo = tipo;
        }

       

        public T getTipo() {
            return tipo;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setTipo(T tipo) {
            this.tipo = tipo;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
    }
}
