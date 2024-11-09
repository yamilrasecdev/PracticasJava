package cibertec001;
import java.util.Scanner; // el programa usa la clase scaner

//Programa que recibe 2 numeros y muestra la suma
public class SumaDosNumeros {//inicio de la clase 
	
	//el metodo main empieza la ejecucion de la aplicación Java
	public static void main(String[] args) 
    {
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        //Declaracipon de variables
        double numero1;
        double numero2;
        double suma; 
        
        //Lectura de datos  //nextInt()
        System.out.print("Ingresa el primer número: ");//Solicita ingresar numero
         numero1 = entrada.nextDouble();//lee el primer numero del usuario			

        System.out.print("Ingresa el segundo número: ");
         numero2 = entrada.nextDouble();//lee el segundo numero del usuario	
         
         //Calculo
         suma = numero1 + numero2;
         
         //Salida muestra la suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        //
        entrada.close();
    }//fin del método main o programa
}// fin de la clase SumaDosNumeros
