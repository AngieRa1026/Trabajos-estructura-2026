public class Main {
    public static void main(String[] args) {
        GestionContactos gestion = new GestionContactos();

        gestion.agregarContacto(new Contacto("Alice", "123456789", "alice@example.com"));
        gestion.agregarContacto(new Contacto("Bob", "987654321", "bob@example.com"));
        
        System.out.println("Listado de contactos:");
        gestion.listarContactos();

        System.out.println("Buscando contacto 'Alice':");
        System.out.println(gestion.buscarContacto("Alice"));

        System.out.println("Eliminando contacto 'Bob':");
        System.out.println(gestion.eliminarContacto("Bob"));
    
        System.out.println("Listado de contactos :");
        gestion.listarContactos();
        }
}