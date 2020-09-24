package ListaEncadeada.Recursiva;

public class Principal {
    public static void main(String[] args) {
	
	Lista lista = new Lista();
	
	
	
	System.out.println("Adicionando elementos no inicio da lista");
	lista.imprime();
	lista.addInicio(1);
	lista.addInicio(44);
	lista.imprime();
	
	
	
	System.out.println("\n\n\nAdicionando no fim da lista");
	lista.imprime();
	lista.addFim(2);
	lista.addFim(3);
	lista.imprime();
	
	
	
	
	System.out.print("\n\n\nAdicionando no indice 0:  ");
	lista.imprime();
	System.out.println("Sucesso: " + lista.addIndice(0, 10));
	lista.imprime();
	
	
	
	
	System.out.println("\n\n\nAdicionando em indice inexistente:  ");
	lista.imprime();
	System.out.println("Sucesso: " +lista.addIndice(5, 15));
	lista.imprime();
	
	
	
	
	System.out.println("\n\n\nAdicionando no utimo indice:  ");
	lista.imprime();
	System.out.println("Sucesso: " +lista.addIndice(4, 15));	
	lista.imprime();
	
	
	
	System.out.println("\n\n\nRemovendo do inicio");
	lista.imprime();
	lista.removerInicio();
	lista.imprime();
	
	
	
	System.out.println("\n\n\nRemovendo do Final");
	lista.imprime();
	lista.removeFinal();
	lista.imprime();
	
	
	
	System.out.println();
	
	
	
	
	
	
	
    }
}
