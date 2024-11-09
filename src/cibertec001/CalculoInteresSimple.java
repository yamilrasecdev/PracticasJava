package cibertec001;

import java.util.Scanner;
/*
 Este programa calcula el interés simple basado en el capital, la tasa de interés y el tiempo ingresados por el usuario.

 * */
public class CalculoInteresSimple {
    public static void main(String[] args) {
        // Declaración de variables
        double capital, tasaInteres, tiempo, interesSimple;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa el capital (en soles): ");
        capital = scanner.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        tasaInteres = scanner.nextDouble();

        System.out.print("Ingresa el tiempo en años: ");
        tiempo = scanner.nextDouble();

        // Cálculo
        interesSimple = capital * (tasaInteres / 100) * tiempo;

        // Impresión
        System.out.println("El interés simple es: " + interesSimple);

        scanner.close();
    }
}
