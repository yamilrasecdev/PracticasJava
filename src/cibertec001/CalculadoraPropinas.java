package cibertec001;

import java.util.Scanner;
/*
 Este programa permite al usuario ingresar el monto de una cuenta y un porcentaje de propina deseado. 
 Luego calcula el monto total a pagar con la propina incluida.
 */
public class CalculadoraPropinas {
    public static void main(String[] args) {
        // Declaración de variables
        double cuenta, porcentajePropina, montoPropina, total;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa el monto de la cuenta: ");
        cuenta = scanner.nextDouble();

        System.out.print("Ingresa el porcentaje de propina que deseas dejar: ");
        porcentajePropina = scanner.nextDouble();

        // Cálculo
        montoPropina = cuenta * (porcentajePropina / 100);
        total = cuenta + montoPropina;

        // Impresión
        System.out.println("La propina es: " + montoPropina);
        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}
