/**
46. Criar uma coleção na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 no vetor–
	Após a inserção, somente após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos
 */
public class Ex46 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        for(int i=0;i<vetor.length;i++){
            vetor[i]=i+1;
        }
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }  
    }
}