import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        /*Crea un programa que calcule el área y el perímetro de un rectángulo. 
        Solicita al usuario la longitud y el ancho del rectángulo.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite la longitud del rectangulo");
        double longitudRectangulo = scanner.nextDouble();
        System.out.println("digite el ancho del rectangulo");
        double anchoRectangulo = scanner.nextDouble();
        // aqui voy a desarrollar las ecuaciones que son area = largo*ancho y perimetro = 2*(largo+ancho)
        System.out.println("el area del rectangulo es : "+(longitudRectangulo*anchoRectangulo));
        System.out.println("el perimetro del rectangulo es : "+(2*(longitudRectangulo+anchoRectangulo)));
    }
}
