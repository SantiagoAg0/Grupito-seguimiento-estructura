package co.edu.uniquindio;

import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<String> lista = new ListaDoblementeEnlazada<>();

        lista.agregarPrimero("una lista");
        lista.agregarPrimero("desde");
        lista.agregarPrimero("A todos");
        lista.agregarPrimero(" Hola");
        // lista.agregarEnPosicionEspecifica("mclovin",3);

        ListaDoblementeEnlazada<Integer> lista2 = new ListaDoblementeEnlazada<>();

        lista2.insercionNatural(3);
        lista2.insercionNatural(4);


        lista.mostrar();

    }
}