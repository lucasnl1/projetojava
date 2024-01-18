package cursojava.executavel;

import primeiro.programa.java.Aluno;

public class primeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	
	public static void main(String[] args) {
		
		/*new Aluno() é uma instância ( Criação de objeto)*/
		/*aluno1 é uma refernência para o objeto aluno*/
		
		Aluno aluno1 = new Aluno();/*Aqui será o João*/
		aluno1.setNome("João");
		aluno1.setIdade(14);
		aluno1.setDataNascimento("05/02/1994");
		aluno1.setNomeEscola("Josemaria de jesus");
		aluno1.setRegistroGeral("8723642347");
		aluno1.setNumeroCpf("060.556.850-55");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("jose");
		aluno1.setDataMatricula("0/12/2024");
		aluno1.setSerieMatriculado("5");
		aluno1.setNota1(90);
		aluno1.setNota2(85);
		aluno1.setNota3(95);
		aluno1.setNota4(90.6);
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		System.out.println("===========================================================================");
/*===========================================================================*/
		
		Aluno aluno2 = new Aluno();/*Aqui será o João*/
		aluno2.setNome("Pietro");
		aluno2.setIdade(20);
		aluno2.setDataNascimento("10/02/2000");

		
		System.out.println("Aluno 2 Nome é = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade é = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento é = " + aluno2.getDataNascimento());

	}
}
