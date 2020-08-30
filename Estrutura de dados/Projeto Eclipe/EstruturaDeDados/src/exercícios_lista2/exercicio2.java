package exercícios_lista2;


// Implemente na classe Lista um método que remove o elemento de uma posição específica recebida por parâmetro.

public class exercicio2 {
    int tamanho = 0;
    String elementos[];
    
    public void remover(int posicao){
   	if (!(posicao >= 0 && posicao < tamanho)){
   	    throw new IllegalArgumentException("Posição inválida");
   	}
   	for (int i=posicao; i<this.tamanho-1; i++){
   	    this.elementos[i] = this.elementos[i+1];
   	}
   	this.tamanho--;
       }
}
