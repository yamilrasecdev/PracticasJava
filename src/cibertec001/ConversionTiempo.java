package cibertec001;

import java.util.Scanner;
/*
 Este programa convierte una cantidad de minutos ingresada por el usuario a horas y minutos.
 */
public class ConversionTiempo {
    public static void main(String[] args) {
        // Declaración de variables
        int minutosIngresados, horas, minutosRestantes;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa la cantidad de minutos: ");
        minutosIngresados = scanner.nextInt();

        // Cálculo
        horas = minutosIngresados / 60;
        minutosRestantes = minutosIngresados % 60;

        // Impresión
        System.out.println(minutosIngresados + " minutos son equivalentes a " + horas + " horas y " + minutosRestantes + " minutos.");

        scanner.close();
    }
}
