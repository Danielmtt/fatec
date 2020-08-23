package exercicios_lista1;

import java.util.Random;

/*
3. Carregar um vetor [100] inteiros positivos ou negativos. Classificar este vetor em ordem crescente e
    apresentar os valores.
*/

public class exercicio3 {
    public static void main(String[] args) {
	
	int[]vetor = new int[100];
	int aux = 0;
	
	Random rand = new Random();
	
	for(int i = 0; i < 100; i++) {
	    vetor[i] = (int)((rand.nextDouble()*2000)*rand.nextGaussian());
	}
	
	for(int i = 0; i < 100; i++) {
	    for(int j = i+1; j < 100; j++) {
		if(vetor[i] > vetor[j]) {
		    aux = vetor[i];
		    vetor[i] = vetor[j];
		    vetor[j] = aux;
		}
	    }
	}
	
	System.out.println("");
    }
}
