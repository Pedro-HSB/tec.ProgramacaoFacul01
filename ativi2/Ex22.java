public class Ex22 {
    // Faça um programa na Linguagem  Java  que leia 3 números inteiros e mostre o maior deles. 


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Digite o primeiro numero: ");
        num1 = leia.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        num2 = leia.nextInt();
        System.out.print("\nDigite o terceiro numero: ");
        num3 = leia.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("o maior numero e : " + num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("o maior numero e : " + num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("o maior numero e : " + num3);
        }
    }
}
