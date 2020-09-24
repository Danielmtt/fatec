package ListaEncadeada.Livros;


public class Lista {
    private Node inicio;
    private int tamanho;
    
    
    
//Verifica se o início da lista está vazio
//=================================================================
    public boolean vazia() {
	return inicio == null ? true : false;
    }
    
    
//  Adiciona elemento no início da lista  
//=================================================================
    public void addInicio(Livro elemento) {
	Node node = new Node();
	
	node.livro = elemento;
	node.proximo = inicio;
	inicio = node;
	
	tamanho++;
    }
    
// Adiciona elemento no final da lista
//=================================================================
    public void addFim(Livro elemento) {
	if(this.inicio == null) {
	    addInicio(elemento);
	} else {
	    addFim(elemento, inicio);
	}
    }
    
    private void addFim(Livro elemento, Node aux) {
	if(aux.proximo != null) {
	    addFim(elemento, aux.proximo);
	} else {
	    Node node = new Node();
	    node.livro = elemento;
	    aux.proximo = node;
	    tamanho++;
	}
    }
    
// Adiciona elemento em determinada posição da lista
//=================================================================
    public boolean addIndice(int indice, Livro elemento) {
	if( indice >= tamanho || indice < 0) return false;
	
	if(indice == 0) {
	    addInicio(elemento);
	    return true;
	}
	addIndice(indice, elemento, this.inicio);
	return true;
    }
    
    private void addIndice(int indice, Livro elemento, Node aux) {
	if (indice-1 != 0) {
	    addIndice(indice-1, elemento, aux.proximo);
	} else {
	    Node node = new Node();
	    node.livro = elemento;
	    node.proximo = aux.proximo;
	    aux.proximo = node;
	    tamanho++;
	}
    }
    
//Removendo do inicio
//=================================================================
    public Livro removerInicio() {
	if (this.inicio == null) {
	    System.out.println("lista vazia. Impossível remover"); ;
	    return null; 
	}

	Livro copia = this.inicio.livro;
	this.inicio = inicio.proximo;
	tamanho--;
	
	return copia;
    }
    
    
//Removendo elemento do fim da lista
//=================================================================
    public Livro removeFinal() {
	if (this.inicio == null) {
	    System.out.println("lista vazia. Impossível remover"); ;
	    return null;
	}
	return removeFinal(this.inicio, this.inicio.proximo);
    }
    
    private Livro removeFinal(Node node, Node aux) {
	if(aux.proximo != null) {
		return removeFinal(node.proximo, aux.proximo);
	} else {
	    Livro copia = node.proximo.livro;
	    node.proximo = null;
	    tamanho--;
	    return copia;
	}
    }
    
//Remover elemento em determina posição da lista
//=================================================================
    public void removeIndice(int index) {
	if(vazia()) {
	    System.out.println("Lista Vazia") ;
	} else {
	    
	    if (index  >= tamanho || index < 0) {
		System.out.println("Indice inválido não existe");
	    } else if (index == 0) {
		System.out.println("Elemento removido " + this.inicio.livro);
		removerInicio();
	    } else if (index == tamanho-1) {
		System.out.println("Elemento removido " + getUltimo(this.inicio));
		removeFinal();
	    } else {
		System.out.println(removeIndice(index, this.inicio));
	    }
	}
    }
	
    private Livro removeIndice(int index, Node node) {
	if (index-1 != 0 || index == -1) {
	    return removeIndice(index-1, node.proximo);
	} else {
	    
	    Livro copia = node.proximo.livro;
	    node.proximo = node.proximo.proximo;
	    tamanho--;

	    return copia;
	}
    }
    
    public Livro getUltimo(Node node) {
	if(node.proximo == null) {
	    return node.livro;
	} else {
	    return getUltimo(node.proximo);
	}
    }
    
    
}
