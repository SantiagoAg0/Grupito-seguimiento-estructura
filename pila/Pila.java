package co.edu.uniquindio.pila;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pila<T extends Comparable<? super T>> {
    private Nodo<T> cima;  
    private int tam;       

    public Pila() {
        cima = null;
        tam = 0;
    }

    public void empilar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setProximo(cima); 
        cima = nuevo;         
        tam++;
    }

    public T desempilar() {
        if (estaVacia()) {
            return null; 
        }

        T dato = cima.getDato();  
        cima = cima.getProximo();  
        tam--;

        return dato;
    }

    public boolean estaVacia() {
        return tam == 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pila: ");
        Nodo<T> actual = cima;
        while (actual != null) {
            sb.append(actual.getDato()).append(" -> ");
            actual = actual.getProximo();
        }
        sb.append("null");
        return sb.toString();
    }

    private void ordenarPila(Comparator<T> comp) {
        List<T> datos = new ArrayList<>();
        Nodo<T> actual = cima;
        while (actual != null) {
            datos.add(actual.getDato());
            actual = actual.getProximo();
        }
        datos.sort(comp);

        actual = cima;
        for (T dato : datos) {
            actual.setDato(dato);
            actual = actual.getProximo();
        }
    }

    public void ordenarNatural() {
        ordenarPila(Comparator.naturalOrder());
    }

    public void ordenarAscendente() {
        ordenarPila(Comparator.naturalOrder());
    }

    public void ordenarDescendente() {
        ordenarPila(Comparator.reverseOrder());
    }
}
