package cibertec001;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        // Declaración de variables
        double base, altura, area;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa la base del rectángulo: ");
        base = scanner.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        altura = scanner.nextDouble();

        // Cálculo
        area = base * altura;

        // Impresión
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
}
