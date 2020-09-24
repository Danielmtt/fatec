package ListaEncadeada.Recursiva;

public class Lista {
    Node inicio;
    int tamanho;
    
    
    public boolean vazia() {
	return inicio == null ? true : false;
    }
    
    public void addInicio(double elemento) {
	Node node = new Node();
	
	node.temperatura = elemento;
	node.proximo = inicio;
	inicio = node;
	
	tamanho++;
    }
    
    public void addFim(double elemento) {
	if(this.inicio == null) {
	    addInicio(elemento);
	} else {
	    addFim(elemento, inicio);
	}
    }
    
    private void addFim(double elemento, Node aux) {
	if(aux.proximo != null) {
	    addFim(elemento, aux.proximo);
	} else {
	    Node node = new Node();
	    node.temperatura = elemento;
	    aux.proximo = node;
	    tamanho++;
	}
    }
    
    public boolean addIndice(int indice, double elemento) {
	if( indice >= tamanho || indice < 0) return false;
	
	if(indice == 0) {
	    addInicio(elemento);
	    return true;
	}
	addIndice(indice, elemento, this.inicio);
	return true;
    }
    
    private void addIndice(int indice, double elemento, Node aux) {
	if (indice-1 != 0) {
	    addIndice(indice-1, elemento, aux.proximo);
	} else {
	    Node node = new Node();
	    node.temperatura = elemento;
	    node.proximo = aux.proximo;
	    aux.proximo = node;
	    tamanho++;
	}
    }
    

    public String removerInicio() {
	if (this.inicio == null) {
	    return "lista vazia. Impossível remover";
	}
	String info = "Item removido " + this.inicio.temperatura ;
	this.inicio = inicio.proximo;
	tamanho--;
	
	return info ;
    }
    
   

    public String removeFinal() {
	if (this.inicio == null) {
	    return "lista vazia. Impossível remover";
	}
	return removeFinal(this.inicio, this.inicio.proximo);
    }
    
    private String removeFinal(Node node, Node aux) {
	if(aux.proximo != null) {
		return removeFinal(node.proximo, aux.proximo);
	} else {
	    String info = "Item removido " + node.proximo.temperatura;
	    node.proximo = null;
	    tamanho--;
	    return info;
	}
    }
    
    
    
    // Remove em determinada posição
    public void removeIndice(int index) {
	
	if(vazia()) {
	    System.out.println("Lista Vazia") ;
	} else {
	    
	    if (index  >= tamanho || index < 0) {
		System.out.println("Indice inválido não existe");
	    } else if (index == 0) {
		System.out.println("Elemento removido " + this.inicio.temperatura);
		removerInicio();
	    } else if (index == tamanho-1) {
		System.out.println("Elemento removido " + getUltimo(this.inicio));
		removeFinal();
	    } else {
		System.out.println(removeIndice(index, this.inicio));
	    }
	}
    }
	
    private String removeIndice(int index, Node node) {
	if (index-1 != 0 || index == -1) {
	    return removeIndice(index-1, node.proximo);
	} else {
	    
	    String info = "Elemento retirado " + node.proximo.temperatura;
	    node.proximo = node.proximo.proximo;
	    tamanho--;

	    return info;
	}
    }
    
    public double getUltimo(Node node) {
	if(node.proximo == null) {
	    return node.temperatura;
	} else {
	    return getUltimo(node.proximo);
	}
    }
    
    /*Imprime em order invertida: ultimo fica na esquerda*/
    public void imprimeInvertido(Node node) {
	    if(node.proximo != null) {
		imprimeInvertido(node.proximo);
		System.out.print(" => " + node.temperatura);
	    } else {
		System.out.print(" => " + node.temperatura);
	    }
    }
    
    public void imprime(){
	if(inicio == null) {
	    System.out.println("Lista vazia");
	} else {
	    imprime(this.inicio);
	    System.out.println();
	}
    }
    
    private void imprime(Node node) {
	if (node.proximo != null) {
	    System.out.print(node.temperatura +" => ");
	    imprime(node.proximo);
	} else {
	    System.out.print(node.temperatura );
	}
    }

}
    
    
    
