package exercicios_lista1;

import java.util.Random;

/*
Carregar uma matriz [4 x 4 inteiro]. Apresentar:
	 Soma dos valores no intervalo de 1 a 100
	 Quantidade de números divisíveis por 8
	 Quantidade de números ímpares entre 30 a 50
	 Quantidade de números ímpares divisíveis por 3
	 Fatorial do maior número informado na matriz

*/

public class exercicio4 {
    public static void main(String[] args) {
	int matriz[][] = new int[4][4];
	Random r = new Random();
	
	int soma = 0, quantidadeDivisiveis8 = 0, quantidadeImparDivisivel3 = 0, quantidadeImpar30_50 = 0, maior=0 ;
	
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz.length; j++) {
		matriz[i][j] =  (int) (r.nextDouble()*200);
		
		if(matriz[i][j] < 100 && matriz[i][j]>1)
		    soma += matriz[i][j];
		
		if (matriz[i][j]%8 == 0)
		    quantidadeDivisiveis8++;
		
		if(matriz[i][j]%2 == 1 && matriz[i][j] > 30 && matriz[i][j] < 50)
		    quantidadeImpar30_50++;
		
		if(matriz[i][j]%2 == 1 && matriz[i][j]%3 == 0)
		    quantidadeImparDivisivel3++;
		
		if(matriz[i][j] > maior)
		    maior = matriz[i][j];
	    }
	}
	
	
	long fatorial=1;
	for(long i = (long)(maior) ;  i > 1 ;  i--){		
	    fatorial=fatorial*i;
	}
	
	System.out.println("Soma dos valores no intervalo de 1 a 100:  " 		+ soma
				+ "\nQuantidade de números divisíveis por 8:  " 		+ quantidadeDivisiveis8
				+ "\nQuantidade de números ímpares entre 30 a 50:  " 	+ quantidadeImpar30_50
				+ "\nQuantidade de números ímpares divisíveis por 3:  "+ quantidadeImparDivisivel3
				+ "\nFatorial do maior número informado na matriz:  "	+ fatorial);	
    }
}
