package exerc�cios_lista2;
/*

 Implemente uma Lista de caracteres em aloca��o est�tica com todas as opera��es
indicadas a seguir: 
========================================================================== 




 */



public class exercicio3 {
    char[] elementos;
    int tamanho;

    public exercicio3(int capacidade) {
	this.elementos = new char[capacidade];
	this.tamanho = 0;
    }

    //  -verificar se a lista est� vazia, retornando true se estiver vazia e false se n�o estiver;
    public boolean isEmpty() {
	return this.tamanho > 0 ? false : true; 
    }

    //  -verificar se a lista est� cheia, retornando true se estiver cheia e false se n�o estiver;
    public boolean isFull() {
	return this.tamanho == elementos.length ? true : false; 
    }

    //  -adicionar caractere no in�cio da lista, caso a opera��o n�o possa ser realizada, mostre
    //  mensagem avisando;
    public void adicionaInicio(char elemento) {
	if (this.tamanho != 0)
	    System.out.println("Posi��o j� ocupada");
	else {
	    elementos[0] = elemento;
	    tamanho++;
	}    
    }

    //  -adicionar caractere no final da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    public void adicionaFinal(char elemento) {
	if (this.tamanho == elementos.length)
	    System.out.println("Posi��o j� ocupada");
	else {
	    elementos[tamanho-1] = elemento;
	    tamanho++;
	}    
    }

    //    -adicionar caractere em determinada posi��o da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando o motivo;
    public void adicionaPosicao(int posicao, char elemento){

	if (!(posicao >= 0 && posicao < tamanho))
	    System.out.println("N�o foi poss�vel adicionar");
	else {
	    //mover todos os elementos
	    for (int i=this.tamanho-1; i>=posicao; i--){
		this.elementos[i+1] = this.elementos[i];
	    }

	    this.elementos[posicao] = elemento;
	    this.tamanho++;
	}
    }


    //
    //    -remover caractere do in�cio da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    //
    //    -remover caractere do final da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    //
    //    -remover caractere de determinada posi��o da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    //
    //    -percorrer a lista concatenando os elementos em uma String que ser� devolvida no final.	


}
