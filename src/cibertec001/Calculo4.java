package cibertec001;

import java.util.Scanner;
/*
 Una empresa expondrá sus productos en una feria. 
 La empresa considera que el monto total de dinero a invertir estará distribuido de la siguiente manera:

RUBRO							 	%
Alquiler de espacio en la feria		23%
Publicidad							7%
Transporte							26%
Servicios feriales					12%
Decoración							21%
Gastos varios						11%
  */
public class Calculo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        //Declaracipon de variables
        double montoTotal, rubro1, rubro2, rubro3, rubro4, rubro5, rubro6;
                        
        //Lectura de datos
        System.out.print("Ingresa el monto total: ");
        montoTotal= entrada.nextDouble();
        
      //calculosla % por cada rubro
        rubro1=0.23*montoTotal;
        rubro2=0.07*montoTotal;
        rubro3=0.26*montoTotal;
        rubro4=0.12*montoTotal;
        rubro5=0.21*montoTotal;
        rubro6=0.11*montoTotal;
                
        //Salida, impresion de resultado
        System.out.println("El monto  Alquiler de espacio en la feria: "+rubro1);
        System.out.println("El monto  Publicidad: " + rubro2 );
        System.out.println("El monto  Transporte: " + rubro3 );
        System.out.println("El monto  Servicios feriales: " + rubro4 );
        System.out.println("El monto  Decoración: " + rubro5 );
        System.out.println("El monto  Gastos varios: " + rubro6 );               

        entrada.close();
	}

}
