public class ListaRanking {
    private Nodo cabeza;

    public ListaRanking() {
        this.cabeza = null;

    }

    public void insertarFinal(Ranking ranking) {
        Nodo nuevo = new Nodo(ranking);

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
    public Ranking buscarRanking(String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getRanking().getNombre().equals(nombre)) {
                return actual.getRanking();
            }
            actual = actual.getSiguiente();
        }
        return null; // No se encontró el ranking
    }
    public void RegistrarPuntuacion(String nombre, int puntuacion) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getRanking().getNombre().equals(nombre)) {
                actual.getRanking().setPuntuacion(puntuacion);
                return;
            }
            actual = actual.getSiguiente();
        }
        // Si no se encuentra el ranking, se puede agregar uno nuevo
        insertarFinal(new Ranking(nombre, puntuacion));
    }
    public void selectionSortPorPuntuacion() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return; // La lista está vacía o tiene un solo elemento
        }

        Nodo actual = cabeza;
        while (actual != null) {
            Nodo maximo = actual;
            Nodo siguiente = actual.getSiguiente();

            while (siguiente != null) {
                if (siguiente.getRanking().getPuntuacion() > maximo.getRanking().getPuntuacion()) {
                    maximo = siguiente;
                }
                siguiente = siguiente.getSiguiente();
            }

            // Intercambiar los rankings
            Ranking temp = actual.getRanking();
            actual.setRanking(maximo.getRanking());
            maximo.setRanking(temp);

            actual = actual.getSiguiente();
        }
    }
    public Ranking encontrarMaximo() {
        if (cabeza == null) {
            return null; // La lista está vacía
        }

        Nodo actual = cabeza;
        Ranking maximo = actual.getRanking();

        while (actual != null) {
            if (actual.getRanking().getPuntuacion() > maximo.getPuntuacion()) {
                maximo = actual.getRanking();
            }
            actual = actual.getSiguiente();
        }
        return maximo;
    }
    public boolean buscarValoresRepetidos() {
        Nodo actual = cabeza;

        while (actual != null) {
            Nodo siguiente = actual.getSiguiente();
            while (siguiente != null) {
                if (actual.getRanking().getNombre().equals(siguiente.getRanking().getNombre())) {
                    return true; // Se encontró un valor repetido
                }
                siguiente = siguiente.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
        return false; // No se encontraron valores repetidos
    }

    public void mostrarRanking() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getRanking().getNombre() + " - " + actual.getRanking().getPuntuacion());
            actual = actual.getSiguiente();
        }
    }
}
