package cibertec001;

import java.util.Scanner;
/*
 Diseñe un programa que determine el área de la base (𝐴) y el volumen (𝑉) de una pirámide de base rectangular 
 conociendo el largo (𝑚) y el ancho (𝑛) de la base y la altura (ℎ) de la pirámide. Considere las siguientes fórmulas:
 * */
public class Calculo2 {

	public static void main(String[] args) {
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        //Declaracipon de variables
        //largo
        double m;
        //ancho
        double n;
        //alto
        double h;
        
        double are;//area
        double vol;//volumen
        
        //Lectura de datos
        System.out.println("Ingresa el largo: ");
        m = entrada.nextDouble();
        
        System.out.println("Ingresa el ancho: ");
        n = entrada.nextDouble();
        
        System.out.print("Ingresa el alto: ");
        h = entrada.nextDouble();
        
        //calculos
        are=m*n;
        vol=are*h/3;        

        //Salida, impresion de resultado
        System.out.println("El área de la piramide :" + are );
        System.out.println("El volumen de la piramide  : " +  vol);
        
        //cierro entrada 
        entrada.close();
	}

}
