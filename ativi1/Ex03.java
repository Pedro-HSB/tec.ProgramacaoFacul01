public class Ex03 {
    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo: Faça um programa na Linguagem Java que leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

        Scanner leia = new Scanner(System.in);

        float graus;

        System.out.print("Digite os graus Fahrenheit : ");
        graus = leia.nextFloat();

        System.out.println("em graus Celsius : " + (graus - 32)*5/9);
    }
}