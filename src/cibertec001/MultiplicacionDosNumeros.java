package cibertec001;

import java.util.Scanner;

public class MultiplicacionDosNumeros {
    public static void main(String[] args) {
        // Declaración de variables
        int num1, num2, producto;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextInt();

        // Cálculo
        producto = num1 * num2;

        // Impresión
        System.out.println("El producto de los números es: " + producto);

        scanner.close();
    }
}
