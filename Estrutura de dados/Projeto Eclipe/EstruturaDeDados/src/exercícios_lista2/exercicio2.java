package exerc�cios_lista2;


// Implemente na classe Lista um m�todo que remove o elemento de uma posi��o espec�fica recebida por par�metro.

public class exercicio2 {
    int tamanho = 0;
    String elementos[];
    
    public void remover(int posicao){
   	if (!(posicao >= 0 && posicao < tamanho)){
   	    throw new IllegalArgumentException("Posi��o inv�lida");
   	}
   	for (int i=posicao; i<this.tamanho-1; i++){
   	    this.elementos[i] = this.elementos[i+1];
   	}
   	this.tamanho--;
       }
}
