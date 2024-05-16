
import java.util.Scanner;

/*
51. Fazer um procedimento para receber as
 notas da primeira e da segunda prova de cinco alunos.
  Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.
*/


public class Ex51 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] notas1 = new int[5];
        int[] notas2 = new int[5];
        int[] media1 = new int[5];
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + " da primeira prova: ");
            notas1[i] = leia.nextInt();
        }
        for (int i = 0; i < notas2.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + " da segunda prova: ");
            notas2[i] = leia.nextInt();
        }
        for (int i = 0; i < notas1.length; i++) {
            media1[i] = (notas1[i] + notas2[i])/2;
        }
        for (int i = 0; i < media1.length; i++) {
            System.out.println("A média do aluno " + (i + 1) + " é: " + media1[i]);
        }
    }
}

