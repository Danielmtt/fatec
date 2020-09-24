package ListaEncadeada.Alunos;

public class Principal {
    public static void main(String[] args) {
	
	Lista lista = new Lista();
	Aluno aluno = new Aluno();
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	Aluno aluno3 = new Aluno();
	Aluno aluno4 = new Aluno();
	
	aluno.setNome("Daniel");
	aluno.setRa(123456);
	aluno.setSemestre("5");
	aluno.setTurma("Noturna");
	
	aluno1.setNome("Maria");
	aluno1.setRa(123456);
	aluno1.setSemestre("5");
	aluno1.setTurma("Noturna");
	
	aluno2.setNome("Pedro");
	aluno2.setRa(123456);
	aluno2.setSemestre("5");
	aluno2.setTurma("Noturna");
	
	aluno3.setNome("Leandro");
	aluno3.setRa(123456);
	aluno3.setSemestre("5");
	aluno3.setTurma("Noturna");

	System.out.println("Adicionando no inicio da lista'");
	System.out.println("-----------------------------------------------");
	lista.addInicio(aluno);
	lista.addInicio(aluno1);
	lista.addInicio(aluno2);
	lista.addInicio(aluno3);
	System.out.println("-----------------------------------------------");
	lista.imprime();
	System.out.println("\n\n\n\n");
	
	
	System.out.println("Adicionando no fim da lista'");
	System.out.println("-----------------------------------------------");
	lista.addFim(aluno3);
	lista.imprime();
	System.out.println("-----------------------------------------------");
	lista.imprime();
	System.out.println("\n\n\n\n");
	
	
	
	
	System.out.println("Removendo do final'");
	System.out.println("-----------------------------------------------");
	lista.removerMeio();
	System.out.println("-----------------------------------------------");
	lista.imprime();
	System.out.println("\n\n\n\n");
	
	
	
	
	
	
	System.out.println("Removendo do final'");
	System.out.println("-----------------------------------------------");
	lista.removerInicio();
	System.out.println("-----------------------------------------------");
	
	System.out.println("\n\n\n\n");
	
	
	
	
	
	System.out.println("Removendo do final'");
	System.out.println("-----------------------------------------------");
	lista.removeFinal();
	System.out.println("-----------------------------------------------");
	
	
    }
}
