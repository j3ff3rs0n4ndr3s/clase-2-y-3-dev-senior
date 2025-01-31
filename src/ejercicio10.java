import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
    /*Crea un programa que calcule la media aritmética de tres números introducidos por el usuario. */
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite el primer numero");
    double numero1 = scanner.nextDouble();
    System.out.println("digite el segundo numero");
    double numero2 = scanner.nextDouble();
    System.out.println("digite el tercer numero");
    double numero3 = scanner.nextDouble();
    double media = (numero1+numero2+numero3)/3;
    System.out.println("la media de los numeros ingresados es : "+media);
    }
}
