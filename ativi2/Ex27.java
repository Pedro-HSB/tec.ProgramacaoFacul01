
import java.util.Scanner;
 
/**
27. O cardápio de uma lanchonete é o seguinte:
 
Especificação          Código           Preço
 
Cachorro quente     100                 1,20
 
Bauru simples          101                 1,30
 
Bauru com ovo        102                 1,50
 
Hambúrger               103                 1,20
 
Cheeseburguer        104                 1,30
 
Refrigerante             105                 1,00
 
Faça um programa na Linguagem Java que leia o código do item pedido,
 a quantidade e calcule o valor a ser pago por aquele lanche.
  Considere que a cada execução somente será calculado um item.
 */
public class Ex27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigo;
        int quantidade;
        double preco = 0.0;
        System.out.println("Digite o código do item: ");
        codigo = leia.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = leia.nextInt();
        switch (codigo) {
            case 100:
                preco = 1.20;
                break;
            case 101:
                preco = 1.30;
                break;
            case 102:
                preco = 1.50;
                break;
            case 103:
                preco = 1.20;
                break;
            case 104:
                preco = 1.30;
                break;
            case 105:
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                break;
   
                }
        System.out.println("O valor a ser pago é: " + preco * quantidade);
        leia.close();
    }
}
