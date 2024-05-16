

public class Ex07 {
    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java para efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).

    Scanner leia = new Scanner(System.in);

    float valor,taxa,tempo;

        System.out.println("calcule a prestação");

    System.out.print("Digite o valor: ");
        valor = leia.nextFloat();

    System.out.print("Digite a taxa: ");
        taxa = leia.nextFloat();

        System.out.print("Digite a taxa: ");
        tempo = leia.nextFloat();


    System.out.println("o valor da prestação e : " + valor + (valor *(taxa/100) * tempo));
}


}