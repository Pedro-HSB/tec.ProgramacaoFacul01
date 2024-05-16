public class ContaCorrente {
    private String nome;
    private String sexo;
    private int idade;
    private int numeroConta;
    private boolean contaConjunta;
    private double saldo;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public boolean isContaConjunta() {
        return contaConjunta;
    }
    
    public void setContaConjunta(boolean contaConjunta) {
        this.contaConjunta = contaConjunta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaC(String nome, String sexo, int idade, int numeroConta, boolean contaConjunta, double saldo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.numeroConta = numeroConta;
        this.contaConjunta = contaConjunta;
        this.saldo = saldo;
    }

    public ContaC() {
    }
    
    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void deposito(double valor) {
        saldo += valor;
    }
    
    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Conta conjunta: " + contaConjunta);
        System.out.println("Saldo: " + saldo);
    }
    }

