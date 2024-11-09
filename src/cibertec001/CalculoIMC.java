package cibertec001;

import java.util.Scanner;
/*
 Este programa calcula el IMC en función de la altura y el peso del usuario.

 * */
public class CalculoIMC {
    public static void main(String[] args) {
        // Declaración de variables
        double peso, altura, imc;
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        altura = scanner.nextDouble();

        // Cálculo
        imc = peso / (altura * altura);

        // Impresión
        System.out.println("Tu Índice de Masa Corporal (IMC) es: " + imc);

        scanner.close();
    }
}
