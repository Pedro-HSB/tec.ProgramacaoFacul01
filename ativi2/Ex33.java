
import java.util.Scanner;
 
/**
33. Faça um programa na Linguagem  Java  para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
 */
public class exemplo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 100; i++) {
            soma = soma + i + 1;
        }
    }
}