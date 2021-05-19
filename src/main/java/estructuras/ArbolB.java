/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;
import objetos.Horario;

/**
 *
 * @author erikssonherlo
 */
public class ArbolB<T> {

    private Nodo<T> raiz;
    private ArrayList<Horario> horarios;
    int grado;

    public ArbolB(int grado) {
        this.grado = grado;
        raiz = new Nodo<T>(grado);
    }

    public int encontrarLLaveMayor() {
        int llaveMax = getLlaveMayor(raiz);
        return llaveMax;
    }

    private int getLlaveMayor(Nodo<T> actual) {
        if (actual == null) {
            return 0;
        }

        while (!actual.isHoja()) {
            actual = actual.getHijo()[actual.getClaves()];
        }

        return llaveMayorNodo(actual);
    }

    private int llaveMayorNodo(Nodo<T> actual) {
        return getLlaveObject(actual.getLlaves()[actual.claves - 1]);
    }

    public boolean insertar(T tipo) {
        Nodo<T> aux = raiz;
        if (buscarNodo(getLLave(tipo)) == null) {
            if (aux.getClaves() == ((2 * grado) - 1)) {
                Nodo<T> nuevoNodo = new Nodo<T>(grado);
                raiz = nuevoNodo;
                nuevoNodo.setHoja(false);
                nuevoNodo.setClaves(0);
                nuevoNodo.getHijo()[0] = aux;
                separar(nuevoNodo, 0, aux);
                insercionNoCompletada(nuevoNodo, tipo);

            } else {
                insercionNoCompletada(aux, tipo);

            }
            return true;
        }
        System.out.println("Clave ya existe");
        return false;
    }

    private void separar(Nodo<T> x, int i, Nodo<T> y) {
        Nodo<T> z = new Nodo<T>(grado);
        z.setHoja(y.isHoja());
        z.setClaves((grado - 1));

        for (int j = 0; j < (grado - 1); j++) {
            z.getLlaves()[j] = y.getLlaves()[(j + grado)];
        }

        if (!y.isHoja()) {
            for (int k = 0; k < grado; k++) {
                z.getHijo()[k] = y.getHijo()[(k + grado)];
            }
        }

        y.setClaves((grado - 1));

        for (int j = x.getClaves(); j > i; j--) {
            x.getHijo()[(j + 1)] = x.getHijo()[j];
        }

        x.getHijo()[(i + 1)] = z;

        for (int j = x.getClaves(); j > i; j--) {
            x.getLlaves()[(j + 1)] = x.getLlaves()[j];
            x.getLlaves()[(j + 1)] = x.getLlaves()[j];
        }

        x.getLlaves()[i] = y.getLlaves()[(grado - 1)];
        x.setClaves(x.getClaves() + 1);
    }

    private void insercionNoCompletada(Nodo<T> nodo, T tipo) {
        int llave = getLLave(tipo);

        if (nodo.isHoja()) {
            int claves = nodo.getClaves();

            while (claves >= 1 && llave < getLlaveObject(nodo.getLlaves()[claves - 1])) {
                nodo.getLlaves()[claves] = nodo.getLlaves()[claves - 1];
                claves--;
            }

            nodo.getLlaves()[claves] = tipo;
            nodo.setClaves(nodo.getClaves() + 1);
        } else {
            int cont = 0;

            while (cont < nodo.getClaves() && llave > getLlaveObject(nodo.getLlaves()[cont])) {
                cont++;
            }

            if (nodo.getHijo()[cont].getClaves() == (2 * grado - 1)) {
                separar(nodo, cont, nodo.getHijo()[cont]);

                if (llave > getLlaveObject(nodo.getLlaves()[cont])) {
                    cont++;
                }
            }
            insercionNoCompletada(nodo.getHijo()[cont], tipo);

        }
    }

    public Nodo<T> buscarNodo(int llave) {
        return buscar(raiz, llave);
    }

    public Object buscarPorLlave(int llave) {
        Nodo<T> aux = buscar(raiz, llave);
        return aux.encontrar(llave);
    }

    private Nodo<T> buscar(Nodo<T> actual, int llave) {
        int i = 0;

        while (i < actual.getClaves() && llave > getLlaveObject(actual.getLlaves()[i])) {
            i++;
        }

        if (i < actual.getClaves() && llave == getLlaveObject(actual.getLlaves()[i])) {
            return actual;
        }

        if (actual.isHoja()) {
            return null;
        } else {
            return buscar(actual.getHijo()[i], llave);
        }
    }

    private int getLLave(T tipo) {
        if (tipo instanceof Horario) {
            return ((Horario) tipo).getId();
        }
        return 0;
    }

    private int getLlaveObject(Object tipo) {
        if (tipo instanceof Horario) {
            return ((Horario) tipo).getId();
        }
        return 0;
    }

    public void mostrarArbolB() {
        imprimirArbol(raiz);
    }

    private void imprimirArbol(Nodo<T> nodo) {
        nodo.imprimir();

        if (!nodo.isHoja()) {
            for (int j = 0; j <= nodo.getClaves(); j++) {
                if (nodo.getHijo()[j] != null) {
                    System.out.println();
                    imprimirArbol(nodo.getHijo()[j]);
                }
            }
        }
    }

    public ArrayList<Horario> getHorarios() {
        horarios = new ArrayList<>();
        return buscarHorarios(raiz);
    }

    private ArrayList<Horario> buscarHorarios(Nodo<T> nodo) {

        ArrayList<Horario> nodoHorarios = nodo.getHorarios();
        for (int i = 0; i < nodoHorarios.size(); i++) {
            horarios.add(nodoHorarios.get(i));
        }

        if (!nodo.isHoja()) {
            for (int j = 0; j <= nodo.getClaves(); j++) {
                if (nodo.getHijo()[j] != null) {
                    buscarHorarios(nodo.getHijo()[j]);
                }
            }
        }

        return horarios;
    }

    //******************************************************************************************************************
    
    /**
     * CLASE NODO PARA UTILIZAR UNA ESTRUCTURA GENERICA, PERO ORIENTADA A LOS
     * HORARIOS
     *
     * @param <T>
     */
    private class Nodo<T> {

        private int claves;
        private boolean hoja;
        private Object llaves[];
        private Nodo<T> hijo[];

        public Nodo(int t) {
            claves = 0;
            hoja = true;
            llaves = new Object[((2 * t) - 1)];
            hijo = new Nodo[(2 * t)];
        }

        public void imprimir() {
            System.out.print("[");
            for (int i = 0; i < claves; i++) {
                if (i < claves - 1) {
                    System.out.print(castLlave(llaves[i]) + " | ");
                } else {
                    System.out.print(castLlave(llaves[i]));
                }
            }
            System.out.print("]");
        }

        public ArrayList<Horario> getHorarios() {
            ArrayList<Horario> horarios = new ArrayList<>();
            for (int i = 0; i < claves; i++) {
                horarios.add((Horario) llaves[i]);
            }
            return horarios;
        }

        public Object encontrar(int llave) {
            for (int i = 0; i < claves; i++) {
                if (castLlave(llaves[i]) == llave) {
                    return llaves[i];
                }
            }
            return null;
        }

        public int castLlave(Object llave) {
            if (llave instanceof Horario) {
                return ((Horario) llave).getId();
            }
            return 0;
        }

        public int getClaves() {
            return claves;
        }

        public boolean isHoja() {
            return hoja;
        }

        public Object[] getLlaves() {
            return llaves;
        }

        public Nodo<T>[] getHijo() {
            return hijo;
        }

        public void setClaves(int claves) {
            this.claves = claves;
        }

        public void setHoja(boolean hoja) {
            this.hoja = hoja;
        }

        public void setLlaves(Object[] llaves) {
            this.llaves = llaves;
        }

        public void setHijo(Nodo<T>[] hijo) {
            this.hijo = hijo;
        }

    }
}
