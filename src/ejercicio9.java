import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        /*Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit
         y Kelvin. Usa las siguientes fórmulas:
         Fahrenheit = Celsius * 9/5 + 32
         Kelvin = Celsius + 273.15 */
         Scanner scanner = new Scanner(System.in);

         System.out.println("digite la cantidad de grados Celsius :");
         double gradosCelsius = scanner.nextDouble();
         System.out.println("en grados Fahrenheit seria : "+((gradosCelsius * 9/5) + 32) +" Fahrenheit" );
         System.out.println("en grados Kelvin seria : "+ (gradosCelsius+ 273.15)+ " Kelvin");
    }
}
