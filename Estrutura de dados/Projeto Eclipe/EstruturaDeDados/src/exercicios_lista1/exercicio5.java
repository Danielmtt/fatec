package exercicios_lista1;

import java.util.Random;

/*

5. Criar e carregar uma matriz [4 x 4] inteiro, onde os valores da diagonal principal serão carregados
pela aplicação conforme o gráfico e os demais dados serão digitados pelo usuário.

|   1	|	|	|	| 			
|	|   3	|	|	| 				
|	|	|   9	|	| 
|	|	|	|  27	|					

 */
public class exercicio5 {
    public static void main(String[] args) {
	
	int matriz[][] = new int[4][4];
	Random r = new Random();
	int diagonal = 0; 
	
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz.length; j++) {
		
		if(i != j) {
		    matriz[i][j] =  (int) (r.nextDouble()*200);    
		} else {
		    matriz[i][j] = (int) Math.pow(3, i);
		    System.out.println("("+i+","+j+") = " + matriz[i][j]);
		}
		
	    }
	}
	
	
    }
}
