
public class Ex19 {

    // Faça um programa na Linguagem  Java  que leia quatros valores referentes a quatro notas
    //  escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor
    //   da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem
    //    informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição. 
    public static void main(String[] args) {
    
        Scanner leia = new Scanner(System.in);
        float nota1,nota2,nota3,nota4,media;
        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = leia.nextFloat();
        System.out.println("Digite a quarta nota: ");
        nota4 = leia.nextFloat();
        media = (nota1+nota2+nota3+nota4)/4;
        if(media >= 7){
            System.out.println("O aluno foi aprovado com média: "+media);
        }else{
            System.out.println("O aluno foi reprovado com média: "+media);
        }
    }
}
