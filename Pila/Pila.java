package co.edu.uniquindio;

public class Pila<T> {
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
}
