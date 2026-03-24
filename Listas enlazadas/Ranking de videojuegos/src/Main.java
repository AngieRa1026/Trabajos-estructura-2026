public class Main {
    public static void main(String[] args) {
        ListaRanking lista = new ListaRanking();
        lista.insertarFinal(new Ranking("Juego A", 85));
        lista.insertarFinal(new Ranking("Juego B", 90));
        lista.insertarFinal(new Ranking("Juego C", 80));
        lista.insertarFinal(new Ranking("Juego D", 92));
        lista.insertarFinal(new Ranking("Juego E", 88));

        System.out.println("Ranking de videojuegos:");
        lista.mostrarRanking();

        System.out.println("\nBuscando ranking de 'Juego B':");
        System.out.println(lista.buscarRanking("Juego B"));

        System.out.println("\nRegistrando nueva puntuación para 'Juego A':");
        lista.RegistrarPuntuacion("Juego A", 95);
        System.out.println("Valor actualizado de 'Juego A': " + lista.buscarRanking("Juego A"));

        System.out.println("Ordenando ranking por puntuación:");
        lista.selectionSortPorPuntuacion();

        System.out.println("\nRanking de videojuegos actualizado:");
        lista.mostrarRanking();

        System.out.println("Encontrando el videojuego con la puntuación más alta:");
        System.out.println(lista.encontrarMaximo());

        System.out.println("Buscar valores repetidos:");
        System.out.println("¿Hay valores repetidos? " + lista.buscarValoresRepetidos());

    }

}
