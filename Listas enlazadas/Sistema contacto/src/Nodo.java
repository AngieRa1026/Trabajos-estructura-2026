public class Nodo {
    private Contacto contacto;
    private Nodo siguiente;

    public Contacto getContacto() {
        return contacto;
    }
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo(Contacto contacto) {
        this.contacto = contacto;
    }
}
