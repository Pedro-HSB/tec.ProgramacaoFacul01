
import java.util.Scanner;
 
/**
24. Faça um programa na Linguagem  Java  que efetue a leitura de um número
 inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
 */
public class Ex24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = leia.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
