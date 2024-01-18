package cursojava.executavel;

import javax.lang.model.element.ElementKind;
import javax.swing.JOptionPane;

import primeiro.programa.java.Aluno;

public class primeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	
	public static void main(String[] args) {
		
		/*Caixas de entrada de dados com teclado*/
	
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String Nascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String rg = JOptionPane.showInputDialog("Qual o rg aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
		String Mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String Pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String serie = JOptionPane.showInputDialog("Qual a série do aluno?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 ?");
		
		/*new Aluno() é uma instância ( Criação de objeto)*/
		/*aluno1 é uma refernência para o objeto aluno*/
	
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(Nascimento);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(Mae);
		aluno1.setNomePai(Pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
			
		/*Impressão das informações no console*/
	
		System.out.println(aluno1); /*Descrição do objeto na memória*/
		System.out.println("Média do aluno =" + aluno1.getMediaNota());
		System.out.println("Resultado = "+ aluno1.getAlunoAprovado2());
		
		
		/* equals e hashcode ( diferenciar e comparar objetos)*/

		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Lucas");
		aluno2.setNumeroCpf("1234");
				
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");
		}
		
	}
}
