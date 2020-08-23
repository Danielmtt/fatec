package exercicios_lista1;
import java.util.Random;

/*	2. Carregar um vetor [5] inteiro. Enviar cada elemento para uma função e esta irá retornar o seu fatorial
	    que será armazenado em um outro vetor. Exibir os dados dos vetores
*/
public class exercício2 {
    public static void main(String[] args) {

	int[] vetor = new int[5];
	int[] vetorF = new int[5];
	String msgVetor="",msgVetorF="";
	
	Random rand = new Random();
	
	for(int i = 0; i<5; i++) {
	    vetor[i] = (int) (rand.nextDouble() * 10);
	    
	    vetorF[i] = fatorial(vetor[i]);
	    
	    msgVetor += "  " +vetor[i]; 
	    msgVetorF += "  " + vetorF[i];
	}
	
	System.out.println("Vetor com os valores: " + msgVetor);
	
	System.out.println("Vetor calculando o fatorial dos valores do primeiro vetor: "+ msgVetorF);


    }
    
    private static int fatorial(int num) {
	int anterior = num-1;
	int fatorialDesteNumero = 0;
	
	if (num <= 1) return 1;
		else fatorialDesteNumero =  num * fatorial(anterior);
	
	return fatorialDesteNumero;
    }
}

