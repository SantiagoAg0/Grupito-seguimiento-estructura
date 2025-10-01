package co.edu.uniquindio.BiCola;

import co.edu.uniquindio.ColaSimple.Nodo;

public class BiCola<T> {

    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tam;

    public BiCola() {
        inicio = null;
        fin = null;
        tam = 0;
    }

    // Getters y Setters
    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public boolean estaVacia() {
        return tam == 0;
    }

