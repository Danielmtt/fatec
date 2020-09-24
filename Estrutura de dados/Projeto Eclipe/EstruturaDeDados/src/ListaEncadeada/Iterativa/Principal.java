package ListaEncadeada.Iterativa;

public class Principal {
    public static void main(String[] args) {
	
	Lista lista = new Lista();
	
	lista.inserirInicio("D");
	lista.inserirInicio("C");
	lista.inserirInicio("B");
	lista.inserirInicio("A");

	lista.inserirMeio("X");
	System.out.println(lista.toString());
	

	System.out.println(lista.retiraFim()+"\n"+lista.toString());
	
	System.out.println(lista.retiraFim()+"\n"+lista.toString());
	
	System.out.println(lista.retiraFim()+"\n"+lista.toString());

	System.out.println(lista.retiraFim()+"\n"+lista.toString());
	
	
    }
}







