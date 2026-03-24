
import java.util.Scanner;

public class Monitoreodesensores {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        //matriz 3x3 para almacenar temperaturas, la fila es la zona y la columna es el tipo de sensor y detectar valores criticos
        double[][] temperaturas = new double[3][3];
        double max = 0;
        double min = 100;
        double suma = 0;
        int criticos = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la temperatura del sensor " + (j + 1) + " de la zona " + (i + 1) + ": ");
                temperaturas[i][j] = Scanner.nextDouble();
                suma += temperaturas[i][j];
                if (temperaturas[i][j] > max) {
                    max = temperaturas[i][j];
                }
                if (temperaturas[i][j] < min) {
                    min = temperaturas[i][j];
                }
                if (temperaturas[i][j] > 50) {
                    criticos++;
                }
            }
        }
        System.out.println("La temperatura maxima es: " + max);
        System.out.println("La temperatura minima es: " + min);
        System.out.println("El promedio de las temperaturas es: " + (suma / 9));
        System.out.println("Cantidad de temperaturas criticas: " + criticos);
        System.out.println("Las temperaturas criticas son: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (temperaturas[i][j] > 50) {
                    System.out.println("Zona " + (i + 1) + ", Sensor " + (j + 1) + ": " + temperaturas[i][j]);
                }
            }
        }
    }
}
