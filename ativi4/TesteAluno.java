
// 59. Fazer um programa para ler os dados de um Aluno:

// ·      RA;

// ·      Nome;

// ·      Endereço;

// ·      Curso.

// Em seguida, mostrar a tela todos os atributos. Utilize classe.
// *

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(109857289,"cleitosvaldo","DSM","rua sla das quantas");
        aluno1.exibirDados();
        aluno1.trocaCurso("Quimica");
        aluno1.trocaEndereco("rua nova");
        aluno1.exibirDados();
    }
}
