package co.edu.uniquindio.Listacircular;

import co.edu.uniquindio.ListaSimpleEnlazada;

public class MainListaCircular {
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