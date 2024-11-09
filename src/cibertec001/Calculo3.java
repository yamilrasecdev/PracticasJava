package cibertec001;

import java.util.Scanner;
/*
 Dada una cantidad de dinero y las edades de tres personas, diseñe un programa que reparta el dinero en forma proporcional a las edades.
El monto que le corresponde a cada persona se calcula con la siguiente fórmula:
 * */
public class Calculo3 {

	public static void main(String[] args) {
		
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        //Declaracipon de variables        
        double montoP1,montoP2,montoP3,montoRepartir;//Decimales
        int edadP1,edadP2,edadP3,sumaEdades;//Enteros
               
        //Lectura de datos
        System.out.print("Ingresa el monto a repartir: ");
        montoRepartir= entrada.nextDouble();
        
        System.out.print("Ingresa edad Persona 1: ");
        edadP1 = entrada.nextInt();
        
        System.out.print("Ingresa edad Persona 2: ");
        edadP2 = entrada.nextInt();
        
        System.out.print("Ingresa edad Persona 3: ");
        edadP3 = entrada.nextInt();
                
        //calculosla suma de todas la edades
        sumaEdades=edadP1+edadP2+edadP3;
        
        //calcula la cantidad de dinero para cada persona
        montoP1=(edadP1*montoRepartir)/sumaEdades;
        montoP2=(edadP2*montoRepartir)/sumaEdades;
        montoP3=(edadP3*montoRepartir)/sumaEdades;
        
        //Salida, impresion de resultado
        System.out.println("El monto repartir Persona 1  :" + montoP1 );
        System.out.println("El monto repartir Persona 2  :" + montoP2 );
        System.out.println("El monto repartir Persona 3  :" + montoP3 );
        
        entrada.close();
	}

}
