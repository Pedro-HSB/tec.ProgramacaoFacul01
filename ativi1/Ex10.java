
public class Ex10 {

    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.

        Scanner leia = new Scanner(System.in);

        int num1;

        System.out.print("Digite o um numero: ");
        num1 = leia.nextInt();

        System.out.printf("\no resultado e : " + num1*num1);
    }
}
