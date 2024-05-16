public class Ex01 {
    // Nome: Pedro Henrique Santos Bernardo
    //Objetivo:Faça um programa na Linguagem Java que receba 2 números e apresente a multiplicação dos dois números

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,fact=1;
        int number;// our number to do the necessary calculations in class Factorial

        System.out.print("Enter a number: ");
        number = input.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}