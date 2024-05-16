import java.util.Scanner;

/* 63. Fazer um programa para ler os valores da largura e altura de um retângulo.
  Em seguida, mostrar a tela o valor da sua área, perímetro e diagonal.
   Usar uma classe como diagrama abaixo:

   class retangulo
   + largura : double
   + altura : double
   + area() : double
   + perimetro() : double
   + diagonal() : double
*/

public class TesteRentangulo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a largura: ");
    double largura = sc.nextDouble();
    
    System.out.println("Digite a altura: ");
    double altura = sc.nextDouble();
    
    Retangulo retangulo = new Retangulo(largura,altura);
    
    System.out.println("Área: " + retangulo.area());
    System.out.println("Perímetro: " + retangulo.perimetro());
    System.out.println("Diagonal: " + retangulo.diagonal());
    
    sc.close();
  }

}