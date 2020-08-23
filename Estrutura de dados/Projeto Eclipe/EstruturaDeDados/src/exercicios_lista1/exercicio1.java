package exercicios_lista1;

import java.util.Random;

/*
  1. Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
	 Média dos saldos positivos entre 100 à 1000
	 Média geral dos saldos
	 Soma dos saldos negativos
 */

public class exercicio1 {
    public static void main(String[] args) {
	
	int[] vetor = new int[100];
	double mediaGeral = 0, mediaPositivos = 0, mediaNegativos = 0;
	int divisorP = 0, divisorN = 0;
	
	Random rand = new Random();
	
	for (int i = 0; i<100; i++) {
	    vetor[i] = (int) ((rand.nextDouble() * 200) * rand.nextGaussian());
	    
	    if(vetor[i] > 100 && vetor[i] < 1000) { 
		mediaPositivos += vetor[i];
	    	divisorP++;
	    }
	    
	    if(vetor[i] < 0) { 
		mediaNegativos += vetor[i];
	    	divisorN++;
	    }
	    
	    mediaGeral += vetor[i];
	}
	
	mediaGeral = mediaGeral /100;
	mediaPositivos = mediaPositivos/divisorP;
	mediaNegativos= mediaNegativos/divisorN;
	
	System.out.printf( "Média dos númetos entre 100 e 1000: %.2f", mediaPositivos );
	System.out.printf("\nMédia dos númetos negativos: %.2f", mediaNegativos);
	System.out.printf("\nMédia geral: media geral: %.2f", mediaGeral);

	
	
	
	
	
    }
}
