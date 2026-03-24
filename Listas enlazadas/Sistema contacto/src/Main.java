public class Main {
    public static void main(String[] args) {
        
        ListaContactos lista = new ListaContactos();
        lista.insertarFinal(new Contacto("Juan", "123456789", "juan@example.com"));
        lista.insertarFinal(new Contacto("Maria", "555555555", "maria@example.com"));
        lista.insertarFinal(new Contacto("Bob", "987654321", "bob@example.com"));

        System.out.println("Lista de contactos:");
        lista.listarContactos();

        System.out.println("\nBuscando contacto 'Maria':");
        System.out.println(lista.buscarContacto("Maria"));

        System.out.println("\nEliminando contacto 'Juan':");
        System.out.println(lista.eliminarContacto("Juan"));

        System.out.println("\nLista de contactos :");
        lista.listarContactos();
    }
}
