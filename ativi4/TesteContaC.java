// 57. Fazer um programa para ler os dados de uma conta corrente:

// ·      Número da Conta;

// ·      Nome do Cliente;

// ·      CPF;

// ·      Saldo Da conta.

// Em seguida, mostrar a tela todos os atributos. Utilize classe.

public class Main {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente(109073462,1000.00,209478382);
        conta1.exibirInfo();
        conta1.depositar(1000);
        conta1.saldoConta();
    }
}