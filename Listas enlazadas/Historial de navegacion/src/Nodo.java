public class Nodo {
    private Historial historial;
    private Nodo siguiente;

    public Historial getHistorial() {
        return historial;
    }
    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo(Historial historial) {
        this.historial = historial;
        this.siguiente = null;
    }
}