package exerc�cios_lista2;

public class exercicio5 {
    double[] elementos;
    int tamanho;

    public exercicio5(int capacidade) {
	this.elementos = new double[capacidade];
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


    //  -adicionar Temperatura no in�cio da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    public void adicionaInicio(double elemento) {
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


    //  -adicionar Temperatura no final da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    public void adicionaFinal(double elemento) {
	if (isFull())
	    System.out.println("Lista cheia");
	else {
	    elementos[tamanho] = elemento;
	    tamanho++;
	}    
    }


    //    -adicionar uma Temperatura em determinada posi��o da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando o motivo;
    public void adicionaPosicao(int posicao, double elemento){

	if (!(posicao >= 0 && posicao < tamanho))
	    throw new IllegalArgumentException("Posi��o inv�lida");

	if (isFull())
	    throw new IllegalArgumentException("N�o foi poss�vel adicionar. Lista cheia");

	else {

	    for (int i=this.tamanho-1; i>=posicao; i--){
		this.elementos[i+1] = this.elementos[i];
	    }

	    this.elementos[posicao] = elemento;
	    this.tamanho++;
	}
    }


    //    -remover Temperatura do in�cio da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    public double removeInicio() {

	if(isEmpty()) {
	    throw new IllegalArgumentException("Lista vazia!");
	} 

	double excluido = elementos[0];

	for(int i = 0; i <= tamanho; i++ ) {
	    this.elementos[i] = this.elementos[i+1];
	}

	tamanho--;
	return excluido;
    }


    //    -remover Temperatura do final da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    public double removeFinal() {

	if(isEmpty()) {
	    throw new IllegalArgumentException("Lista vazia");
	} 

	double excluido = elementos[tamanho-1];

	tamanho--;
	return excluido;
    }


    //    -remover Temperatura de determinada posi��o da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
    public double remove(int posicao){

	if (!(posicao >= 0 && posicao < tamanho)){
	    throw new IllegalArgumentException("Posi��o inv�lida");
	}

	if(isEmpty()) {
	    throw new IllegalArgumentException("Lista vazia");
	} 

	double excluido = elementos[posicao];

	for (int i=posicao; i<this.tamanho-1; i++){
	    this.elementos[i] = this.elementos[i+1];
	}

	this.tamanho--;
	return excluido;
    }


    //    -percorrer a lista concatenando os elementos em uma String que ser� devolvida no final.	
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
