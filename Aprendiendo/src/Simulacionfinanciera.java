
import java.util.Scanner;

public class Simulacionfinanciera {
    public static void main(String[] args) throws Exception {
        //matriz donde las filas representan los clientes y las columnas los dias, se requiere calcular el promedio de cada cliente y el promedio de cada dia, luego se requiere calcular las variaciones diarias y los maximos y minimos de cada cliente y cada dia
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de clientes: ");
        int numClientes = sc.nextInt();

        System.out.println("Ingrese el numero de dias: ");
        int numDias = sc.nextInt();

        double[][] matriz = new double[numClientes][numDias];
        for (int i = 0; i < numClientes; i++) {
            for (int j = 0; j < numDias; j++) {
                System.out.println("Ingrese el valor para el cliente " + (i + 1) + " en el dia " + (j + 1) + ": ");
                matriz[i][j] = sc.nextDouble();
                }
            }
        //calcular el promedio de cada cliente
        double[] promedioClientes = new double[numClientes];
        for (int i = 0; i < numClientes; i++) {
            double suma = 0;
            for (int j = 0; j < numDias; j++) {
                suma += matriz[i][j];
            }
            promedioClientes[i] = suma / numDias;
            System.out.println("El promedio del cliente " + (i + 1) + " es: " + promedioClientes[i]);
        }
        //calcular el promedio de cada dia
        double[] promedioDias = new double[numDias];
        for (int j = 0; j < numDias; j++) {
            double suma = 0;
            for (int i = 0; i < numClientes; i++) {
                suma += matriz[i][j];
            }
            promedioDias[j] = suma / numClientes;
            System.out.println("El promedio del dia " + (j + 1) + " es: " + promedioDias[j]);
        }
        //calcular las variaciones diarias
        double[] variacionesDiarias = new double[numDias];
        for (int j = 0; j < numDias; j++) {
            double suma = 0;
            for (int i = 0; i < numClientes; i++) {
                suma += matriz[i][j];
            }
            variacionesDiarias[j] = suma / numClientes;
                if (j > 0) {
                    variacionesDiarias[j] = variacionesDiarias[j] - variacionesDiarias[j - 1];
                }
            System.out.println("La variacion diaria del dia " + (j + 1) + " es: " + variacionesDiarias[j]);
        }
        //calcular los maximos y minimos de cada cliente
        double[] maximosClientes = new double[numClientes];
        double[] minimosClientes = new double[numClientes];
        for (int i = 0; i < numClientes; i++) {
            double maximo = matriz[i][0];
            double minimo = matriz[i][0];
            for (int j = 1; j < numDias; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            maximosClientes[i] = maximo;
            minimosClientes[i] = minimo;
                System.out.println("El maximo del cliente " + (i + 1) + " es: " + maximosClientes[i]);
                System.out.println("El minimo del cliente " + (i + 1) + " es: " + minimosClientes[i]);
        }
        //calcular los maximos y minimos de cada dia
        double[] maximosDias = new double[numDias];
        double[] minimosDias = new double[numDias];
        for (int j = 0; j < numDias; j++) {
            double maximo = matriz[0][j];
            double minimo = matriz[0][j];
            for (int i = 1; i < numClientes; i++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            maximosDias[j] = maximo;
            minimosDias[j] = minimo;
                System.out.println("El maximo del dia " + (j + 1) + " es: " + maximosDias[j]);
                System.out.println("El minimo del dia " + (j + 1) + " es: " + minimosDias[j]);
        }
    }
}
