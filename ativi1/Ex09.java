public class Ex09 {
    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java  para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados

        Scanner leia = new Scanner(System.in);

        int num1,num2,num3 =0;

        System.out.print("Digite o primeiro numero: ");
        num1 = leia.nextInt();

        System.out.print("\nDigite o segundo numero: ");
        num2 = leia.nextInt();

        for (int i=0 ;i <2;i++){
            if (num1 != num2){
                num3 = num1;
            }
            else {
                num1 = num2;
            }
        }

        System.out.printf("\n agora o primeiro numero e "+ num2 +" e o segundo e "+num3 );
    }
}
