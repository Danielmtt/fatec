package ListaEncadeada.Iterativa;

public class Lista {
    private No inicio;
    private int tamanho;

    public void inserirInicio(String elemento) {
	No no = new No();
	no.info = elemento;
	no.proximo = inicio;
	inicio = no;
	tamanho++;
    }
    
    public String retirarInicio() {
	if (inicio == null)
	    return null;
	
	else {
	    String info = inicio.info;
	    inicio = inicio.proximo;
	    tamanho--;
	    
	    return info;
	}
    }
    
    public void inserirFim(String elemento) {
	No no = new No();
	no.info = elemento;
	
	if(inicio == null) {
	    no.proximo =  null;
	    inicio = no;
	} else {
	    No local = inicio;
	    
	    while(local.proximo != null) {
		local = local.proximo;
	    }
	   local.proximo = no;
	   no.proximo = null;
	}
	
	tamanho++;
	
    }
    
    public String retiraFim() {
	
	if (inicio == null) return null;

	No local = inicio;
        
	while (local.proximo != null) {
            No aux = local;
    	    aux = local;
    	    local = local.proximo;
    	
    	    if(local.proximo == null) {
    		aux.proximo = null;
    		tamanho--;
    		return local.info;
    	    }
        }
        
        inicio = null;
        tamanho--;
        return local.info;
    }
    
    
    
    
    public void inserirIndice(int indice, String info) {
	if (indice <= 0 ) {
	    inserirInicio(info);
	} else if (indice >= tamanho){
	    inserirFim(info);
	} else {
	    No local = inicio;
	    
	    for(int i = 0; i < indice-1; i++) {
		local = local.proximo;
	    }
	    
	    No no = new No();
	    no.info = info;
	    no.proximo = local.proximo;
	    local.proximo = no;
	    tamanho++;
	}
    }
    
    public void  inserirMeio(String info) {
	int meio = (int) tamanho / 2;
	inserirIndice(meio, info);
    }
    
    public String removerIndice(int indice) {
	
	if (indice < 0 || indice >= tamanho || inicio == null) {
	    return null;
	} else if(indice == 0) {
	    return retirarInicio();
	} else if (indice == tamanho-1){
	    return retiraFim();
	} else {
	    
	    No local = inicio;
	    
	    for (int i = 0; i < indice; i++) {
		local = local.proximo;
	    }
	    
	    String info = local.proximo.info;
	    
	    local.proximo = local.proximo.proximo;
	    tamanho--;
	    
	    return info;
	}
    }
        
        
	
	
    
    public String toString() {
	String str = "(" + tamanho + ")  ";
	
	No local = inicio;
	
	while(local != null) {
	    str += local.info + "  ";
	    local = local.proximo;
	}
	
	return str;
    }
}

