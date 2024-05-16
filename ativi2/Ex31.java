
import java.util.Scanner;
 
/**
31. Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.
 */
public class Ex31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = leia.nextInt();
        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            fatorial = fatorial * i;
        }
    }
}