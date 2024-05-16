
import java.util.Scanner;
 
/**
36. Faça um programa na Linguagem  Java  que apresente os valores de conversão
 de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10
  graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar
   os valores das duas temperaturas.
 */
public class exemplo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int celsius = 0, fahrenheit = 0;
        for (celsius = 10; celsius <= 100; celsius += 10) {
            fahrenheit = (int) ((celsius * 9) / 5 + 32);
            System.out.println(celsius + "ºC = " + fahrenheit + "ºF");
        }
    }
}