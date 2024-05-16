
import java.util.Scanner;

/*
54. Criar um vetor A do tipo inteiro de 5 elementos–	
Solicitar os valores para o usuário e inserir no vetor A–	
Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada 
elemento lido calcular o fatorial e gravar no B–	
Após de todos os elementos do vetor A, mostrar os dois vetores
*/

public class Ex54 {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A: ");
            vetorA[i] = leia.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = vetorA[i]; j > 1; j--) {
                vetorB[i] = vetorB[i] * (j - 1);
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("o fatorial de " + vetorA[i] +  " e " + vetorB[i]);
        }
    }
}
