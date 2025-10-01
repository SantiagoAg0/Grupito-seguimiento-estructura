package co.edu.uniquindio.ColaSimple;

public class Cola<T> {
    private Nodo<T> inicio;
    private Nodo<T> fin;

    private int tam;

    public Cola() {
        inicio = null;
        fin = null;
        tam = 0;
    }

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

    public void encolar( T dato){
        Nodo<T> newNodo = new Nodo<>(dato);
        if(inicio == null){

           inicio = newNodo;
           fin = newNodo;
           tam++;
        }

        fin.setProximo(newNodo);
        fin = newNodo;
        tam++;
    }
    
    public void desencolar (){

       if (inicio == null){
         return null;
       }
       
       Nodo<T> actual = inicio;
       
       inicio = inicio.getProximo();
       tam--;
       
       if (inicio == null){
       fin == null;
       }

      
     }
}
