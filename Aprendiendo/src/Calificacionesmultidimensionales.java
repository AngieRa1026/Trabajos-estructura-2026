
import java.util.Scanner;

public class Calificacionesmultidimensionales {
    public static void main(String[] args) {
        //matriz donde las filas representan los estudiantes y las columnas representan las materias, se debe calcular el promedio por estudiante , idetificar al mejor estudiante y detectar riesgo academico (promedio menor a 6)
        Scanner sc = new Scanner(System.in);
        double promedioEstudiante = 0;
        int riesgoAcademico = 0;
        double mejorEstudiante = 0;


        System.out.println("Ingrese el numero de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        System.out.println("Ingrese el numero de materias: ");
        int numMaterias = sc.nextInt();

        double[][] calificaciones = new double[numEstudiantes][numMaterias];
        for (int i = 0; i < numEstudiantes; i++) {

            System.out.println("Ingrese las calificaciones del estudiante " + (i + 1));

            for (int j = 0; j < numMaterias; j++) {
                System.out.println("Materia " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
                }
        }
        
        for (int i = 0; i < numEstudiantes; i++) {
            double sumaCalificaciones = 0;
            for (int j = 0; j < numMaterias; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            promedioEstudiante = sumaCalificaciones / numMaterias;
            System.out.println("El promedio del estudiante " + (i + 1) + " es: " + promedioEstudiante);

            //identificar al mejor estudiante
            if (promedioEstudiante > mejorEstudiante) {
                mejorEstudiante = promedioEstudiante;
            }

            //detectar riesgo academico (promedio menor a 6);
            if (promedioEstudiante < 6) {
                riesgoAcademico++;
            }

        }
    
        System.out.println("El numero de estudiantes en riesgo academico es: " + riesgoAcademico);
        System.out.println("El mejor estudiante tiene un promedio de: " + mejorEstudiante);
}
}
