import java.util.Scanner;

public class ejercicio7 {
public static void main(String[] args) {
    /*
     Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma,
      resta, multiplicación y división con esos números. Muestra los resultados en la consola.
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite el primer numero");
    double primerNumero = scanner.nextDouble();
    System.out.println("digite el segundo numero");
    double segundoNumero = scanner.nextDouble();
    System.out.println("la suma de estos numeros da :"+(primerNumero+segundoNumero));
    System.out.println("la resta de estos numeros da :"+(primerNumero-segundoNumero));
    System.out.println("la multiplicacion de estos numeros da :"+(primerNumero*segundoNumero));
    System.out.println("la division de estos numeros da :"+(primerNumero/segundoNumero));
}   
    
}