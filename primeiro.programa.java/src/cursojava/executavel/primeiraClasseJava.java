package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.ElementKind;
import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;
import cursojava.classes.*;

public class primeiraClasseJava {

	/* Main é um metodo auto executavel em Java */

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Insira sua login");
		String senha = JOptionPane.showInputDialog("Insira sua login");
		
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
	
		/*Instancia lista de alunos*/
		List<Aluno> alunos = new  ArrayList<Aluno>();
		
		/*Lista que dentro tem uma chave que identifica uma sequencia de valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		/* Referncia que para X quantidade de alunos adiciona aluno*/
		
		for (int qtd = 1; qtd <= 4 ; qtd++) {
		
		/* Caixas de entrada de dados com teclado */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?"+qtd+"?");
		
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

		/*Referencia o objeto e seta a informação
		 *  recolhida na entrada para o atributo*/
		
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

		/*Adiciona disciplinas na lista de forma dinâmica*/
		
		for (int pos = 1; pos <= 1; pos++) {

			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/*Remove disciplinas na lista de forma dinâmica*/
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) { /*Opção SIM é zero */
			
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()- posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
			
			}
		}
	
		/* Adiciona o aluno a lista*/
		alunos.add(aluno1);
		
		}
		
		maps.put(StatusAluno.APROVADO, new  ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new  ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new  ArrayList<Aluno>());
		
		/*Separa os alunos em listas*/
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				maps.get(StatusAluno.REPROVADO).add(aluno); /*Reprovados*/
				}
			}
		}
		
		System.out.println("------------------------Lista dos Aprovados----------------------------");
		 for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			 System.out.println("Aluno =" + aluno.getNome()
			 +" Resultado = "+ aluno.getAlunoAprovado2() + " Com média de =" + aluno.getMediaNota());
		 }
		 
		 System.out.println("------------------------Lista dos Reprovados----------------------------");
		 for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			 System.out.println("Aluno =" + aluno.getNome()
			 +" Resultado = "+ aluno.getAlunoAprovado2() + " Com média de =" + aluno.getMediaNota());
		 }
		 
		 System.out.println("------------------------Lista dos em Recuperação----------------------------");
		 for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			 System.out.println("Aluno =" + aluno.getNome()
			 +" Resultado = "+ aluno.getAlunoAprovado2() + " Com média de =" + aluno.getMediaNota());
		 }
		}
	}
}
