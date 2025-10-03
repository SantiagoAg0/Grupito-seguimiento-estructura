package co.edu.uniquindio.BiCola;

public class Nodo<T> {
    private T dato;
    private Nodo<T> proximo;
    private Nodo<T> anterior; //Referencia al siguiente elemento

    public Nodo(T dato) {
        this.dato = dato;
        proximo = null; //Null inicialmente ya que no referencia a nada antes de estar en la lista
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", proximo=" + proximo + ", anterior=" + anterior +
                '}';
    }


}
