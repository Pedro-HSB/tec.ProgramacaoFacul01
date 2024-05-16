

/*

48. Criar uma coleção “A” na linguagem Java com 10 elementos–	
Inserir os elementos de 1 a 10 na coleção–	Criar uma outra coleção B 
que conterá o elemento da coleção A multiplicado por 2–	Mostrar as duas coleçõesObs
. Não efetuar a leitura de 10 elementos
*/
public class Ex48 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        for(int i=0;i<A.length;i++){
            A[i]=i+1;
        }
        for (int i = 0; i < 10; i++) {
            B[i] = A[i] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }
        
    }
}