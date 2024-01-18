package cursojava.executavel;

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
		
		Aluno aluno1 = new Aluno();/*Aqui será o João*/
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
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nome da mãe " + aluno1.getNomeMae());
		System.out.println("Nome do pai " + aluno1.getNomePai());
		System.out.println("CPF " + aluno1.getNumeroCpf());
		System.out.println("RG " + aluno1.getRegistroGeral());
		System.out.println("Data da matrícula " + aluno1.getDataMatricula());
		System.out.println("Série " + aluno1.getSerieMatriculado());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		/*Uso de operadores ternários*/
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = "+ aluno1.getAlunoAprovado2());
		
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
