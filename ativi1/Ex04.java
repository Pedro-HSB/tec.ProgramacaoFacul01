public class Ex04 {

    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java  para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA

        Scanner leia = new Scanner(System.in);

        float raio,altura;

        System.out.print("Digite o raio: ");
        raio = leia.nextFloat();

        System.out.print("Digite o altura: ");
        altura = leia.nextFloat();


        System.out.println("o volume e : " + 3.14159 * (raio*raio)*altura);
    }

}