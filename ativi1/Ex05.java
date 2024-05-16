
public class Ex05 {
    public static void main(String[] args) {
        // Nome: Pedro Henrique Santos Bernardo
        //Objetivo:Faça um programa na Linguagem Java que leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias

        Scanner leia = new Scanner(System.in);

        int ano,mes,dia,result =0;

        System.out.println("Calculadora de tempos");

        System.out.print("Digite um ano");
        ano = leia.nextInt();

        System.out.print("Digite um mes em numeros");
        mes = leia.nextInt();

        System.out.print("Digite um dia");
        dia = leia.nextInt();

        for (int i = 0;i!=mes;i++){
            if(i/2==0){
                result+=30;
            }
            if (i==2){
                result+=28;
            }
            else{
                result+=31;
            }
        }
        result += ano*365;

        result += dia;

        System.out.println("seu tempo de vida em dias é : " + result);
    }

}

