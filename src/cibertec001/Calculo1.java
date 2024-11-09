package cibertec001;

import java.util.Scanner;
/*
 Diseñe un programa que determine el área total (A) y el volumen (V) de un cilindro del que se conoce su radio (r) y su altura (h). 
 Considere las siguientes fórmulas:
  */
public class Calculo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        //Declaracipon de variables
        double r;//radio
        double h;//alto
        double are;//area
        double vol;//volumen
        
        //Lectura de datos
        System.out.print("Ingresa el radio: ");
        r = entrada.nextDouble();
        
        System.out.print("Ingresa el altura: ");
        h = entrada.nextDouble();
        
        //calculos
        are=2*3.1416*r*(r+h);
        vol=2*3.1416*r*r*h;
        
        //Salida, impresion de resultado
        System.out.println("El área del cilindro :" + are );
        System.out.println("El volumen del cilindro : " +  vol);
        
        entrada.close();
	}

}
