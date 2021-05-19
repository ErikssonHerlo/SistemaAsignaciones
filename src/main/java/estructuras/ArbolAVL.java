/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;
import objetos.Catedratico;

/**
 *
 * @author erikssonherlo
 */
public class ArbolAVL<T> {
    
    private Nodo<T> raiz;
    private boolean nodoAgregado = false;
    private boolean nodoEliminado = false;
    private ArrayList<T> listaNodos;

    public ArbolAVL() {
        this.raiz = null;
    }

    public void clearAll() {
        raiz = null;
    }

    public int getId(Nodo<T> nodo) {
        T informacion = nodo.getInformacion();
        if (informacion instanceof Catedratico)
        {
            return ((Catedratico) informacion).getId();
        }
        return 0;
    }

    public int getInformacionId(T informacion) {
        if (informacion instanceof Catedratico)
        {
            return ((Catedratico) informacion).getId();
        }
        return 0;
    }

    public boolean remover(int id) {
        nodoEliminado = false;
        raiz = eliminar(raiz, id);
        return nodoEliminado;
    }

    public Nodo<T> eliminar(Nodo<T> nodoActual, int id) {
        if (nodoActual == null)
        {
            return nodoActual;
        }

        if (id < getId(nodoActual))
        {
            nodoActual.setIzquierda(eliminar(nodoActual.getIzquierda(), id));
        } else if (id > getId(nodoActual))
        {
            nodoActual.setDerecha(eliminar(nodoActual.getDerecha(), id));
        } else
        {
            if ((nodoActual.getIzquierda() == null) || (nodoActual.getDerecha() == null))
            {
                Nodo<T> aux = null;
                if (nodoActual.getDerecha() == aux)
                {
                    aux = nodoActual.getIzquierda();
                } else
                {
                    aux = nodoActual.getDerecha();
                }

                if (aux == null)
                {
                    nodoActual = null;
                } else
                {
                    nodoActual = aux;
                }
                nodoEliminado = true;
            } else
            {
                Nodo<T> aux = getMayor(nodoActual.getIzquierda());
                nodoActual.setInformacion(aux.getInformacion());
                nodoActual.setIzquierda(eliminar(nodoActual.getIzquierda(), getId(aux)));

            }
        }

        if (nodoActual == null)
        {
            return nodoActual;
        }

        nodoActual.setAltura(maxAltura(getAltura(nodoActual.getIzquierda()), getAltura(nodoActual.getDerecha())) + 1);

        int fe = getFE(nodoActual);

        if (fe > 1 && getFE(nodoActual.getDerecha()) >= 0)
        {
            return rotacionIzquierda(nodoActual);
        }

        if (fe < -1 && getFE(nodoActual.getIzquierda()) <= 0)
        {
            return rotacionDerecha(nodoActual);
        }

        if (fe > 1 && getFE(nodoActual.getDerecha()) < 0)
        {
            nodoActual.setDerecha(rotacionDerecha(nodoActual.getDerecha()));
            return rotacionIzquierda(nodoActual);
        }

        if (fe < -1 && getFE(nodoActual.getIzquierda()) > 0)
        {
            nodoActual.setIzquierda(rotacionIzquierda(nodoActual.getIzquierda()));
            return rotacionDerecha(nodoActual);
        }

        return nodoActual;
    }

    public boolean agregar(T informacion) {
        nodoAgregado = true;
        raiz = insertar(raiz, new Nodo<T>(informacion));
        return nodoAgregado;
    }

    private Nodo<T> insertar(Nodo<T> nodoActual, Nodo<T> nuevoNodo) {
        if (nodoActual == null)
        {
            return nuevoNodo;
        }

        if (getId(nuevoNodo) < getId(nodoActual))
        {
            nodoActual.setIzquierda(insertar(nodoActual.getIzquierda(), nuevoNodo));
        } else if (getId(nuevoNodo) > getId(nodoActual))
        {
            nodoActual.setDerecha(insertar(nodoActual.getDerecha(), nuevoNodo));
        } else
        {
            nodoAgregado = false;
            return nodoActual;
        }

        nodoActual.setAltura(1 + maxAltura(getAltura(nodoActual.getIzquierda()), getAltura(nodoActual.getDerecha())));

        int fe = getFE(nodoActual);

        if (fe > 1 && getId(nuevoNodo) > getId(nodoActual.getDerecha()))
        {
            return rotacionIzquierda(nodoActual);
        }

        if (fe < -1 && getId(nuevoNodo) > getId(nodoActual.getIzquierda()))
        {
            return rotacionDerecha(nodoActual);
        }

        if (fe >= 2 && getFE(nodoActual.getDerecha()) < 0)
        {
            nodoActual.setDerecha(rotacionDerecha(nodoActual.getDerecha()));
            return rotacionIzquierda(nodoActual);
        }

        if (fe <= -2 && getFE(nodoActual.getIzquierda()) > 0)
        {
            nodoActual.setIzquierda(rotacionIzquierda(nodoActual.getIzquierda()));
            return rotacionDerecha(nodoActual);
        }

        return nodoActual;
    }

    public T getInformacion(int id) {
        Nodo<T> informacion = buscar(raiz, id);
        if (informacion != null)
        {
            return buscar(raiz, id).getInformacion();
        }
        return null;
    }

    public Nodo<T> getNodo(int id) {
        return buscar(raiz, id);
    }

    private Nodo<T> buscar(Nodo<T> nodoActual, int id) {
        if (nodoActual == null)
        {
            return null;
        } else if (id == getId(nodoActual))
        {
            return nodoActual;
        } else if (id < getId(nodoActual))
        {
            return buscar(nodoActual.getIzquierda(), id);
        } else
        {
            return buscar(nodoActual.getDerecha(), id);
        }
    }

    public ArrayList<T> getNodos() {
        listaNodos = new ArrayList<>();
        getInformacionNodos(raiz);
        return listaNodos;
    }

    private void getInformacionNodos(Nodo<T> nodo) {
        if (nodo == null)
        {
            return;
        }

        getInformacionNodos(nodo.getIzquierda());
        listaNodos.add(nodo.getInformacion());
        getInformacionNodos(nodo.getDerecha());
    }

    public boolean actualizar(T informacion) {
        Nodo<T> nodo = getNodo(getInformacionId(informacion));

        if (nodo != null)
        {
            nodo.setInformacion(informacion);
            return true;
        } else
        {
            return false;
        }
    }

    private Nodo<T> rotacionDerecha(Nodo<T> nodoActual) {
        Nodo<T> nuevaRaiz = nodoActual.getIzquierda();
        Nodo<T> aux = nuevaRaiz.getDerecha();

        nuevaRaiz.setDerecha(nodoActual);
        nodoActual.setIzquierda(aux);

        nodoActual.setAltura(maxAltura(getAltura(nodoActual.getIzquierda()), getAltura(nodoActual.getDerecha())) + 1);
        nuevaRaiz.setAltura(maxAltura(getAltura(nuevaRaiz.getIzquierda()), getAltura(nuevaRaiz.getDerecha())) + 1);

        return nuevaRaiz;
    }

    private Nodo<T> rotacionIzquierda(Nodo<T> nodoActual) {
        Nodo<T> nuevaRaiz = nodoActual.getDerecha();
        Nodo<T> aux = nuevaRaiz.getIzquierda();

        nuevaRaiz.setIzquierda(nodoActual);
        nodoActual.setDerecha(aux);

        nodoActual.setAltura(maxAltura(getAltura(nodoActual.getIzquierda()), getAltura(nodoActual.getDerecha())) + 1);
        nuevaRaiz.setAltura(maxAltura(getAltura(nuevaRaiz.getIzquierda()), getAltura(nuevaRaiz.getDerecha())) + 1);

        return nuevaRaiz;
    }

    private int maxAltura(int a, int b) {
        return (a > b) ? a : b;
    }

    private int getAltura(Nodo<T> nodoActual) {
        if (nodoActual == null)
        {
            return 0;
        }

        return nodoActual.getAltura();
    }
/**
 * FACTOR DE EQUILIBRIO
 * @param nodoActual
 * @return 
 */
    private int getFE(Nodo<T> nodoActual) {
        if (nodoActual == null)
        {
            return 0;
        }

        return getAltura(nodoActual.getDerecha()) - getAltura(nodoActual.getIzquierda());
    }

    private Nodo<T> getMayor(Nodo<T> nodo) {
        Nodo<T> nodoActual = nodo;

        while (nodoActual.getDerecha() != null)
        {
            nodoActual = nodoActual.getDerecha();
        }

        return nodoActual;
    }

    public void mostrarArbol() {
        System.out.println("Arbol AVL");
        mostrarInformacion(raiz);
    }

    private void mostrarInformacion(Nodo<T> nodo) {

        if (raiz != null)
        {

            if (nodo.getIzquierda() == null && nodo.getDerecha() == null)
            {
                System.out.println("Nodo: " + getId(nodo));
            }
            if (nodo.getDerecha() != null)
            {
                System.out.println("Nodo: " + getId(nodo) + " Hijo derecho: " + getId(nodo.getDerecha()));
                mostrarInformacion(nodo.getDerecha());
            }
            if (nodo.getIzquierda() != null)
            {
                System.out.println("Nodo: " + getId(nodo) + " Hijo Izquierdo: " + getId(nodo.getIzquierda()));
                mostrarInformacion(nodo.getIzquierda());
            }
        } else
        {
            System.out.println("ARBOL AVL VACIO");
        }

    }

    private class Nodo<T> {

        private T informacion;
        private int altura;
        private Nodo<T> izquierda;
        private Nodo<T> derecha;

        public Nodo(T informacion) {
            this.informacion = informacion;
            this.altura = 1;
        }

        public Nodo(T informacion, int altura, Nodo<T> izquierda, Nodo<T> derecha) {
            this.informacion = informacion;
            this.altura = altura;
            this.izquierda = izquierda;
            this.derecha = derecha;
        }

        public T getInformacion() {
            return informacion;
        }

        public int getAltura() {
            return altura;
        }

        public Nodo<T> getIzquierda() {
            return izquierda;
        }

        public Nodo<T> getDerecha() {
            return derecha;
        }

        public void setInformacion(T informacion) {
            this.informacion = informacion;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public void setIzquierda(Nodo<T> izquierda) {
            this.izquierda = izquierda;
        }

        public void setDerecha(Nodo<T> derecha) {
            this.derecha = derecha;
        }

       
    }
}
