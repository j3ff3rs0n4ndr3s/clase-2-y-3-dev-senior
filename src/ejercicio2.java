import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*
        En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga 
       en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
        ¿Crees que es correcto el precio?
        En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto
         */
        Scanner scanner = new Scanner(System.in);
        
        
        Double precio = 5.95*10 ;
       System.out.println("digite el numero de  kilos: ");
       double precioPorKilos = scanner.nextDouble();
       System.out.println("el precio es : " +precioPorKilos*precio +" $ el kilo" );

       /*
        no esta bien ya que 1000 gramos es 1 kilo si hacemos la conversion y miramos el precio a 
        5.95 los 100 gramos damos cuenta que si 1000 gramos es elk quilo lo multiplico por 10 y esto nos daria a 
        59.5 el Kilo
        hice el programa para que puedan digitar la cantidad de kilos deceados y el los convierta para saber el precio 
        */
    }
}

