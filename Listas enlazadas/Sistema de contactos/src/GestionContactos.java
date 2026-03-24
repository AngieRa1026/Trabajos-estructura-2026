
import java.util.*;


public class GestionContactos {
    private ArrayList<Contacto> lista;

    public GestionContactos() {
        lista = new ArrayList<>();
    }
    public void agregarContacto(Contacto contacto) {
        lista.add(contacto);
        System.out.println("Contacto agregado: " + contacto.getNombre());
    }
    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null; // No se encontró el contacto
    }
    public boolean eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            return lista.remove(contacto);
        }
        return false;
    }
    public void listarContactos() {
            for (Contacto contacto : lista) {
                System.out.println(contacto);
            }
        }
    }
