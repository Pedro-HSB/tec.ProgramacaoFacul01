
public class ContaCorrente{
    private int numero;
    private double saldo;

    private double cpf;

    public contaCorrente(int numero, double saldo, double cpf) {
        this.numero = numero;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public double getCPF() {
        return cpf;
    }

    public void setCPF(double cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInfo(){
        System.out.println("Numero: "+numero);
        System.out.println("Saldo: "+saldo);
        System.out.println("CPF: "+cpf);
    }

    public void saldoConta(){
        System.out.println("Saldo: "+saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }
}
