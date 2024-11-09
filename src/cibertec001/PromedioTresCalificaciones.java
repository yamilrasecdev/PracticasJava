package cibertec001;

import java.util.Scanner;

public class PromedioTresCalificaciones {
    public static void main(String[] args) {
        // Declaración de variables
        double calificacion1, calificacion2, calificacion3, promedio;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa la primera calificación: ");
        calificacion1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda calificación: ");
        calificacion2 = scanner.nextDouble();

        System.out.print("Ingresa la tercera calificación: ");
        calificacion3 = scanner.nextDouble();

        // Cálculo
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Impresión
        System.out.println("El promedio de las calificaciones es: " + promedio);

        scanner.close();
    }
}
