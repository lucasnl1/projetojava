package cursojava.executavel;

import javax.lang.model.element.ElementKind;
import javax.swing.JOptionPane;

import primeiro.programa.java.Aluno;
import primeiro.programa.java.Disciplina;

public class primeiraClasseJava {

	/* Main é um metodo auto executavel em Java */

	public static void main(String[] args) {

		/* Caixas de entrada de dados com teclado */

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
		
		
		
		/* new Aluno() é uma instância ( Criação de objeto) */
		/* aluno1 é uma refernência para o objeto aluno */

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

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(80);

		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(70);

		aluno1.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("SI");
		disciplina3.setNota(90);

		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java");
		disciplina4.setNota(85);

		aluno1.getDisciplinas().add(disciplina4);

		/* Impressão das informações no console */

		System.out.println(aluno1); /* Descrição do objeto na memória */
		System.out.println("Média do aluno =" + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}
