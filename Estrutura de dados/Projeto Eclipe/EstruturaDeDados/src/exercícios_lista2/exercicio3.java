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

    
    //  -adicionar caractere no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
    public void adicionaInicio(char elemento) {
	if (isFull())
	    System.out.println("Lista cheia!");
	else {
	    for (int i=this.tamanho-1; i>=0; i--){
		this.elementos[i+1] = this.elementos[i];
	    }

	    this.elementos[0] = elemento;
	    this.tamanho++;
	}

    }

    
    //  -adicionar caractere no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
    public void adicionaFinal(char elemento) {
	if (elementos[elementos.length] != 0)
	    System.out.println("Posição já ocupada");
	else {
	    elementos[tamanho-1] = elemento;
	    tamanho++;
	}    
    }

    
    //    -adicionar caractere em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo;
    public void adicionaPosicao(int posicao, char elemento){

	if (!(posicao >= 0 && posicao < tamanho))
	    throw new IllegalArgumentException("Posição inválida");
	
	if (isFull())
	    throw new IllegalArgumentException("Não foi possível adicionar. Lista cheia");

	else {

	    for (int i=this.tamanho-1; i>=posicao; i--){
		this.elementos[i+1] = this.elementos[i];
	    }

	    this.elementos[posicao] = elemento;
	    this.tamanho++;
	}
    }

    
    //    -remover caractere do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
    public char removeInicio() {

	if(isEmpty()) {
	    throw new IllegalArgumentException("Lista vazia");
	} 

	char excluido = elementos[0];

	for(int i = 0; i <= tamanho; i++ ) {
	    this.elementos[i] = this.elementos[i+1];
	}

	tamanho--;
	return excluido;
    }

    
    //    -remover caractere do final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
    public char removeFinal() {

	if(isEmpty()) {
	    throw new IllegalArgumentException("Lista vazia");
	} 

	char excluido = elementos[tamanho-1];

	this.elementos[tamanho-1] = 0;

	tamanho--;
	return excluido;

    }
    
    
    //    -remover caractere de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
    public char remove(int posicao){

	if (!(posicao >= 0 && posicao < tamanho)){
	    throw new IllegalArgumentException("Posição inválida");
	}
	
	if(isEmpty()) {
	    throw new IllegalArgumentException("Lista vazia");
	} 
	
	char excluido = elementos[posicao];
	
	for (int i=posicao; i<this.tamanho-1; i++){
	    this.elementos[i] = this.elementos[i+1];
	}
	
	this.tamanho--;
	return excluido;
    }
    
    
    //    -percorrer a lista concatenando os elementos em uma String que será devolvida no final.	
    public String toString() {
	
	StringBuilder s = new StringBuilder();
	s.append("[");

	for (int i=0; i<tamanho-1; i++){
	    s.append(elementos[i]);
	    s.append(", ");
	}

	if (tamanho>0){
	    s.append(elementos[tamanho-1]);
	}

	s.append("]");
	
	return s.toString();
    }
}


