package Pila;

public class Pila<T> {
    private Nodo<T> inicio;
    private Nodo<T> fin;

    private int tam;

    public Pila (){
        inicio = null;
        fin = null;
        this.tam = 0;
    }

    public enpilar (T dato){
        Nodo<T> newNodo = new Nodo<>(dato);
        if(inicio ==null){
            inicio = newNodo;
            fin = newNodo;
            tam+++;
        }

        inicio.setAnterior(newNodo);
        inicio = newNodo;
        tam++;
    }

    public desenpilar(T dato){
        
    }
    
}
