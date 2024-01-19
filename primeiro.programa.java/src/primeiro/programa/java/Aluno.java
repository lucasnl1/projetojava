package primeiro.programa.java;

import java.util.Objects;

public class Aluno {
/*Atributos do objeto Aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private Disciplina disciplina = new Disciplina();
	
	
	public Aluno () {
		/*Cria os dados na memoria - Sendo padrão do Java*/
	}
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno ( String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		setIdade(idadePadrao);
	}
	
	/*Veremos os metodos SETTERS e GETTERS  do objeto*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter valor do atributo*/

	
	/*Getters e Setters Informações do Objeto Aluno */
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	/*Método que retorna a média do aluno*/
	
		public double getMediaNota() {
		return (disciplina.getNota1()+disciplina.getNota2()
		+disciplina.getNota3()+disciplina.getNota4())/4;
	}
	
	/*Métodos que retornam se aluno está aprovado ou reprovado*/
	/* Retorno com True or False para aprovado e reprovado*/
		
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >=70) {
			return true;
		} else {
			return false;
		}
	}
	/* Retorno com texto*/
	
	public String getAlunoAprovado2 () {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno está aprovado";
		} else {
			return "Aluno está reprovado";
		}
	}
	
	/* método hashCode */
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroCpf);
	}
	
	/* método toString */
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	
	/* método equals */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(numeroCpf, other.numeroCpf);
	}
	
	
	
	
	
}
