
public class Ex11 {
    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java que receba um número e mostre o resto da divisão por 6.

        Scanner leia = new Scanner(System.in);

        float num1;

        System.out.print("Digite o um numero: ");
        num1 = leia.nextInt();

        System.out.printf("\no resultado e : " + num1%6);
    }
}
