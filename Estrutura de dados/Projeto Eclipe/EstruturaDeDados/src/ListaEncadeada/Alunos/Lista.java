package ListaEncadeada.Alunos;

@SuppressWarnings("all")
public class Lista {
    
    private Node inicio;
    private int tamanho;
    
//Adiciona no inicio    
//=================================================================
    public void addInicio(Aluno aluno) {
	Node node = new Node();
	
	node.aluno = aluno;
	node.proximo = inicio;
	inicio = node;
	
	tamanho++;
    }
    
//Adiciona no final    
//=================================================================
    public void addFim(Aluno aluno) {
	if(this.inicio == null) {
	    addInicio(aluno);
	} else {
	    addFim(aluno, inicio);
	}
    }
    private void addFim(Aluno aluno, Node aux) {
	if(aux.proximo != null) {
	    addFim(aluno, aux.proximo);
	} else {
	    Node node = new Node();
	    node.aluno = aluno;
	    aux.proximo = node;
	    tamanho++;
	}
    }
    
//Insere no meio
//=================================================================
    public void inserirMeio(Aluno aluno) {
	if(this.inicio == null) {
	    addInicio(aluno);
	} else if (this.inicio.proximo == null) {
	    addFim(aluno);
	} else {
	    inserirMeio(aluno, this.tamanho%2==0? tamanho:tamanho-1, this.inicio);
	}
    }

    // Nessa função recursiva o tamanho é descrescido em 2  a cada chamada. 
    // fazendo com que o tamanho chegue a zero no dobro da velocidade, resultando ao meio da lista 
    // quando o tamanho chega ao 2(um elemento antes do meio). 
    private void  inserirMeio(Aluno aluno, int tamanho, Node node) {
	if(tamanho != 2) {
	    inserirMeio(aluno, tamanho -2, node.proximo);
	} else {
	    Node novoNode = new Node();
	    
	    novoNode.aluno = aluno;
	    novoNode.proximo = node.proximo;
	    node.proximo = novoNode;
	    tamanho++;
	}
    }

    
// 	Remove Inicio 
//=================================================================
    public void removerInicio() {
	if (this.inicio == null) {
	    System.out.println("lista vazia. Impossível remover");
	}
	this.inicio = inicio.proximo;
	tamanho--;
    }
    
// Remover no meio, segue a mesma lógica do metodo inserir no meio.
//=================================================================
    public void removerMeio() {
	if(inicio == null) {
	   System.out.println("Impossível remover. Lista vazia.");
	} else if (inicio.proximo == null){
	    removerInicio();
	} else {
	    removerMeio(this.tamanho, this.inicio);
	}
    }
    
    // recursividade direta
    public void removerMeio(int tamanho,  Node node) {
	if (tamanho != 2) {
	    removerMeio(tamanho-2, node.proximo);
	} else {
	    node.proximo = node.proximo.proximo;
	    tamanho--;
	}
    }
    
//  Remove Final
//=================================================================
    public void removeFinal() {
	if (this.inicio == null) {
	     System.out.println("Impossível remover. Lista vazia!");;
	}
	removeFinal(this.inicio, this.inicio.proximo);
    }
    // recursividade direta
    private void removeFinal(Node node, Node aux) {
	if(aux.proximo != null) {
		removeFinal(node.proximo, aux.proximo);
	} else {
	    node.proximo = null;
	    tamanho--;
	}
    }

//imprime valores
//=================================================================
    public void imprime() {
	imprime(this.inicio);
    }
    // Função recursiva vai recebendo sempre o proximo nó e verificando há um proximo só. Caso o proximo nó seja null a recursiva para.    
    //=================================================================
    public void imprime(Node node) {
	if(node.proximo != null) {
	    System.out.println(
		    node.aluno.getRa()     		+ "\n" +
		    node.aluno.getNome() 		+ "\n" +
		    node.aluno.getTurma() 		+ "\n" +
		    node.aluno.getSemestre() 	+ "\n"
		    );
	    
	    System.out.println("vv\n");
	    
	    imprime(node.proximo);
	} else {
	    System.out.println(
		    node.aluno.getRa()     		+ "\n" +
		    node.aluno.getNome() 		+ "\n" +
		    node.aluno.getTurma() 		+ "\n" +
		    node.aluno.getSemestre() 	+ "\n\n"
		    );
	}
    }
}
