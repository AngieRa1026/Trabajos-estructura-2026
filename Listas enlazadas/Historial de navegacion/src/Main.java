public class Main {
    public static void main(String[] args) {
        ListaHistorial lista = new ListaHistorial();
        lista.insertarFinal(new Historial("https://www.google.com", "2024-06-01"));
        lista.insertarFinal(new Historial("https://www.github.com", "2024-06-02"));
        lista.insertarFinal(new Historial("https://www.stackoverflow.com", "2024-06-03"));

        System.out.println("Lista historial:");
        lista.listarHistorial();

        System.out.println("\nBuscando historial 'https://www.github.com':");
        System.out.println(lista.buscarHistorial("https://www.github.com"));

        System.out.println("\nEliminando historial 'https://www.google.com':");
        System.out.println(lista.eliminarHistorial("https://www.google.com"));

        System.out.println("\nLista historial :");
        lista.listarHistorial();
    }
}
