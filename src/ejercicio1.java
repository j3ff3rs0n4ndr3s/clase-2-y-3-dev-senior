public class ejercicio1 {
    public static void main(String[] args) {
        /*
         El orden de los operadores aritméticos es muy importante ya que dependiendo del orden obtenemos
          un resultado u otro. En programación, el orden de los operadores es el mismo que el utilizado 
          en matemáticas.
          Calculadoras con diferentes precedencias de operadores
          En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las 
          instrucciones necesarias.
         */

       var operacion = 6/2*(1+2);
        System.out.println("operacion: " +operacion);
        
    /* 1. ¿cual es el resultado correcto de la operacion? ¿1 o 9?
el resultado correcto de la operacion es 9 ya que empezamos a despejar primero los parentecis y despues de ello 
seguimos con el orden que est primero la division y despues la multiplicacion
2. explique porque la otra calculadora da un retesultado diferente 
bueno lo que logro entender respecto por que en la otra calculadora da 1 es por que no sigue la gerarquia 
si no hace es la opercion d derecha a izquierda siendo asi nos queda por eso el valor de 1
*/    }
}
