
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double largura = leia.nextDouble();
        double altura = leia.nextDouble();
        Retangulo calcRetangulo = new Retangulo(largura,altura);

        calcRetangulo.area(largura,altura);
        calcRetangulo.perimetro(largura,altura);
        calcRetangulo.diagonal(largura,altura);

        String nome = leia.nextLine();
        double salario = leia.nextDouble();
        double desconto = leia.nextDouble();

        Funcionario funcionario1 = new Funcionario(nome,salario,desconto);
       funcionario1.infos();
        funcionario1.salarioLiquido();
       funcionario1.aumentarSalario();
        funcionario1.infos();

    }
}
