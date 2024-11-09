package cibertec001;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
    	// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        //Declaracipon de variables
        double radio;
        double area;
        //Lectura de datos 
        System.out.print("Ingresa el radio del círculo: ");
        radio = entrada.nextDouble();

        //Calculo
        area = Math.PI * Math.pow(radio, 2);
        
        //Salida, impresion de resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        
        entrada.close();
    }//fin del método main o programa
}// fin de la clase SumaDosNumeros 
