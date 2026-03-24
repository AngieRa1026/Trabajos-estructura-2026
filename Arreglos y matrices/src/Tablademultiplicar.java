
import java.util.Scanner;

public class Tablademultiplicar {
    public static void main(String[] args) throws Exception {
    
        Scanner Scanner = new Scanner(System.in);
        //ingresar la nota de 10 estudiantes y mostrar cuantos aprobaron y cuantos reprobaron
        double nota;
        int aprobados = 0;
        int reprobados = 0;
        double max = 0;
        double min = 10;
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ": ");
            nota = Scanner.nextDouble();
            if (nota >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
            suma += nota;
            if (nota > max) {
                max = nota;
            }
            if (nota < min) {
                min = nota;
            }
            
        }
        System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
        System.out.println("Cantidad de estudiantes reprobados: " + reprobados);
        System.out.println("La nota maxima es: " + max);
        System.out.println("La nota minima es: " + min);
        System.out.println("El promedio de las notas es: " + (suma / 10));

}
}
