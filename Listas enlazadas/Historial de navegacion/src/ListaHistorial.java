public class ListaHistorial {
    private Nodo cabeza;

    public ListaHistorial() {
        this.cabeza = null;
    }

    public void insertarFinal(Historial historial) {
        Nodo nuevo = new Nodo(historial);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    public Historial buscarHistorial(String url) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getHistorial().getUrl().equals(url)) {
                return actual.getHistorial();
            }
            actual = actual.getSiguiente();
        }
        return null; // No se encontró el historial
    }
    public boolean eliminarHistorial(String url) {
        if (cabeza == null) {
            return false; // Lista vacía
        }
        if (cabeza.getHistorial().getUrl().equals(url)) {
            cabeza = cabeza.getSiguiente(); // Eliminar el primer nodo
            return true;
        }
        Nodo actual = cabeza;

        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getHistorial().getUrl().equalsIgnoreCase(url)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Eliminar el nodo siguiente
                return true;
            }
            actual.setSiguiente(actual.getSiguiente());;
        }
        return false; // No se encontró el historial
    }
    public void listarHistorial() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getHistorial().toString());
            actual = actual.getSiguiente();
        }
    }
}