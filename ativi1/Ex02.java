
public class Ex02 {
    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java que leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius

        Scanner leia = new Scanner(System.in);

        float graus;

        System.out.print("Digite os graus Celsius: ");
        graus = leia.nextFloat();

        System.out.println("em graus Fahrenheit: " + (9 * graus + 160)/5);
    }
}
