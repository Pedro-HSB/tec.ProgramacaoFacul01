public class Ex16 {
    // Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente. 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();
        if (a < b && a < c){
            if (b < c){
                System.out.println(a + " " + b + " " + c);
            }
            else{
                System.out.println(a + " " + c + " " + b);
            }
        }
        else if (b < a && b < c){
            if (a < c){
                System.out.println(b + " " + a + " " + c);
            }
            else{
                System.out.println(b + " " + c + " " + a);
            }
        }        
    }
}