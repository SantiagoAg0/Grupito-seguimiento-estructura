package co.edu.uniquindio.BiCola;

import co.edu.uniquindio.ColaSimple.Nodo;


public class Bicola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tam;
    
    public Bicola() {
        this.frente = null;
        this.fin = null;
        this.tam = 0;
    }
    
    // Agregar nodo al inicio
    public void agregarAlInicio(Nodo<T> nuevoNodo) {
        if (estaVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setProximo(frente);
            frente.setAnterior(nuevoNodo);
            frente = nuevoNodo;
        }
        tam++;
    }
    
    // Agregar nodo al final
    public void agregarAlFin(Nodo<T> nuevoNodo) {
        if (estaVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(fin);
            fin = nuevoNodo;
        }
        tam++;
    }
    
    // Eliminar nodo del inicio
    public Nodo<T> eliminarDelInicio() {
        if (estaVacia()) {
            return null;
        }
        
        Nodo<T> nodoEliminado = frente;
        
        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            frente = frente.getProximo();
            frente.setAnterior(null);
        }
        tam--;
        return nodoEliminado;
    }
    
    // Eliminar nodo del final
    public Nodo<T> eliminarDelFin() {
        if (estaVacia()) {
            return null;
        }
        
        Nodo<T> nodoEliminado = fin;
        
        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            fin = fin.getAnterior();
            fin.setProximo(null);
        }
        tam--;
        return nodoEliminado;
    }
    
    public boolean estaVacia() {
        return frente == null;
    }
    
    public int tamaño() {
        return tam;
    }
}
