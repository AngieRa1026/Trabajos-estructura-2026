public class Nodo {
    private Ranking ranking;
    private Nodo siguiente;

    public Ranking getRanking() {
        return ranking;
    }
    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo(Ranking ranking) {
        this.ranking = ranking;
        this.siguiente = null;
    }
}
