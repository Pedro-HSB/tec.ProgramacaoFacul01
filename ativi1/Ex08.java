
public class Ex08 {

    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira

        Scanner leia = new Scanner(System.in);

        float dolarValor,dolar;

        System.out.println("calcule dolar para real");

        System.out.print("Digite o valor do dolar atual: ");
        dolarValor = leia.nextFloat();

        System.out.print("Digite quantos dolares voce possui: ");
        dolar = leia.nextFloat();


        System.out.println("os seus dolares em real e : " + (dolarValor * dolar) );
    }
}