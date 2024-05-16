
import java.util.Scanner;
 
/**
23. Faça um programa na Linguagem  Java  que efetue a leitura de cinco números inteiros
 e identificar o maior e o menor valor. Não execute a ordenação de valores.
 */
public class Ex23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = leia.nextInt();
            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
        }
    }
}