package co.edu.uniquindio;

public class ListaSimpleEnlazada< T extends Comparable<T>>  {
    private Nodo<T> primero;
    private int tam;

    public ListaSimpleEnlazada() {
        primero = null;
        tam = 0;
    }

    public void agregarPrimero(T dato){
        Nodo<T> newNodo = new Nodo(dato);

        if(primero == null){
            primero = newNodo;
            tam++;
        }else{
            newNodo.setProximo(primero);
            primero = newNodo;
            tam++;
        }
    }

    public void mostrar(){
        Nodo<T> actual = primero;
        String mensaje = "[";
        do {
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }while(actual !=null);

        mensaje += "]";
        System.out.println(mensaje);
    }

    public void agregarUltimo (T dato){
        Nodo<T> newNodo = new Nodo(dato);
        if(primero == null){
            primero = newNodo;
            tam++;
        }else{
            Nodo<T> actual = primero;
            while(actual.getProximo() != null){
                actual = actual.getProximo();
            }
            actual.setProximo(newNodo);
            tam++;
        }
    }

    public void agregarEnPosicionEspecifica(T dato, int posicion) {

        if (posicion <= 0) { // pequeña excepcion por si se pide un posicio 0 o negativo, agregarlo al inicio
            agregarPrimero(dato);
            return;
        }
        if (posicion >= tam) { // pequeña excepcion por si la posicion es igual o mayor al tamaño y agregar al final
            agregarUltimo(dato);
            return;
        }

        Nodo<T> nuevo = new Nodo<>(dato);
        Nodo<T> actual = primero;
        for (int i = 0; i < posicion - 1; i++) {
            actual = actual.getProximo();
        }
        nuevo.setProximo(actual.getProximo());
        actual.setProximo(nuevo);
        tam++;
    }

    public boolean esVacia(T datoBusqueda){
        return primero == null && tam == 0;
    }

    public int localizar(T dato){

        Nodo<T> actual = primero;
        int indexBusqueda = 0;

        while (actual  != null) {
            if (actual.getDato().equals(dato)) {
                return indexBusqueda;

            }
            indexBusqueda++;
            actual = actual.getProximo();

        }

        return -1;
    }

    public boolean buscar(T dato){

        Nodo<T> actual = primero;
        boolean flag = false;

        while (actual  != null) {
            if (actual.getDato().equals(dato)) {
                flag=true;

            }
            actual = actual.getProximo();

        }

        return flag;
    }

    public boolean eliminar (T dato){
        Nodo<T> actual = primero;

        if (actual.getDato().equals(dato)) {
            primero = actual.getProximo();
            tam--;
        }else {

            while (actual.getProximo() != null) {
                if(actual.getProximo().getDato().equals(dato)){
                    actual.setProximo(actual.getProximo().getProximo());
                    tam--;
                    return true;
                }
                actual = actual.getProximo();
            }
        }
        return false;
    }

    // metodo para insercion de manera natural

    public void insercionNatural (T dato ){
        Nodo<T> nuevo = new Nodo(dato);

        if (primero == null || dato.compareTo(primero.getDato()) <= 0) {
            nuevo.setProximo(primero);
            primero = nuevo;
        } else {
            Nodo<T> actual = primero;
            while(actual.getProximo() != null && actual.getProximo().getDato().compareTo(dato) < 0 ) {
                actual = actual.getProximo();

            }

            nuevo.setProximo(actual.getProximo().getProximo());
            actual.setProximo(nuevo);

        }

        tam++;

    }

    public boolean eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= tam) {
            return false; // posición fuera de rango
        }

        if (posicion == 0) {
            // eliminar primero
            primero = primero.getProximo();
            tam--;
            return true;
        }

        Nodo<T> actual = primero;
        for (int i = 0; i < posicion - 1; i++) {
            actual = actual.getProximo();
        }

        // actual está en el nodo anterior al que queremos eliminar
        actual.setProximo(actual.getProximo().getProximo());
        tam--;
        return true;
    }


}
