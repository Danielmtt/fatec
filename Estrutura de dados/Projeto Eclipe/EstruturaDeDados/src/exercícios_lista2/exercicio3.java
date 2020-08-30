package exercícios_lista2;
/*

 Implemente uma Lista de caracteres em alocação estática com todas as operações
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

    //  -verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
    public boolean isEmpty() {
	return this.tamanho > 0 ? false : true; 
    }

    //  -verificar se a lista está cheia, retornando true se estiver cheia e false se não estiver;
    public boolean isFull() {
	return this.tamanho == elementos.length ? true : false; 
    }

    //  -adicionar caractere no início da lista, caso a operação não possa ser realizada, mostre
    //  mensagem avisando;
    public void adicionaInicio(char elemento) {
	if (this.tamanho != 0)
	    System.out.println("Posição já ocupada");
	else {
	    elementos[0] = elemento;
	    tamanho++;
	}    
    }

    //  -adicionar caractere no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
    public void adicionaFinal(char elemento) {
	if (this.tamanho == elementos.length)
	    System.out.println("Posição já ocupada");
	else {
	    elementos[tamanho-1] = elemento;
	    tamanho++;
	}    
    }

    //    -adicionar caractere em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo;
    public void adicionaPosicao(int posicao, char elemento){

	if (!(posicao >= 0 && posicao < tamanho))
	    System.out.println("Não foi possível adicionar");
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
    //    -remover caractere do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
    //
    //    -remover caractere do final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
    //
    //    -remover caractere de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
    //
    //    -percorrer a lista concatenando os elementos em uma String que será devolvida no final.	


}
