package co.edu.uniquindio;

import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {
        ListaSimpleEnlazada<String> lista = new ListaSimpleEnlazada<>();

        lista.agregarPrimero("una lista");
        lista.agregarPrimero("desde");
        lista.agregarPrimero("A todos");
        lista.agregarPrimero(" Hola");
        // lista.agregarEnPosicionEspecifica("mclovin",3);

        ListaSimpleEnlazada<Integer> lista2 = new ListaSimpleEnlazada<>();

        lista2.insercionNatural(3);
        lista2.insercionNatural(4);


        lista.mostrar();

    }
}