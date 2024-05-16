

import java.util.Scanner;
/*
64. Fazer um programa para ler os dados de um funcionário (nome, salário Bruto e Desconto).
 Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
 e mostrar novamente os dados do funcionário. Use a classe projetada abaixo
*/
public class Funcionario {

    private String nome;
    private double salario;
    private double desconto;

    public Funcionario(String nome, double salario, double desconto) {
        this.nome = nome;
        this.salario = salario;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void infos(){
        System.out.println("nome: " + this.nome);
        System.out.println("salario: " + this.salario);
        System.out.println("desconto: " + this.desconto);
    }

    public double salarioLiquido(){
        double inss = 10.38/100;
        double irrf = 7.56/100;
        salario = salario - (inss*salario);
        salario = salario - (irrf*salario);
        salario = salario-desconto;
        System.out.println("salario liquido: " + salario);
        return salario;
    }

    public double aumentarSalario(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Deseja aumentar o salário em qual porcentagem? ");
        double aumento = leia.nextDouble();
        this.salario = this.salario + ((aumento/100)*this.salario);
        return this.salario;
    }
    public void disconnect() {
       boolean Connected = false;
    }

}
