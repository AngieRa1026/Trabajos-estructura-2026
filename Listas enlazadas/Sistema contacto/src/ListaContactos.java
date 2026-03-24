public class ListaContactos {
    private Nodo cabeza;

    public ListaContactos() {
        this.cabeza = null;
    }

    public void insertarFinal(Contacto contacto) {
        Nodo nuevo = new Nodo(contacto);

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
    public Contacto buscarContacto(String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getContacto().getNombre().equals(nombre)) {
                return actual.getContacto();
            }
            actual = actual.getSiguiente();
        }
        return null; // No se encontró el contacto
    }
    public boolean eliminarContacto(String nombre) {
        if (cabeza == null) {
            return false; // Lista vacía
        }
        if (cabeza.getContacto().getNombre().equals(nombre)) {
            cabeza = cabeza.getSiguiente(); // Eliminar el primer nodo
            return true;
        }
        Nodo actual = cabeza;

        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getContacto().getNombre().equalsIgnoreCase(nombre)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Eliminar el nodo siguiente
                return true;
            }
            actual.setSiguiente(actual.getSiguiente());;
        }
        return false; // No se encontró el contacto
    }
    public void listarContactos() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.getContacto());
            actual = actual.getSiguiente();
        }
    }
}
