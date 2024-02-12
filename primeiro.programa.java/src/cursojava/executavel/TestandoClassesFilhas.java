package cursojava.executavel;

import java.awt.image.DirectColorModel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Lucas Nascimento");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Josue");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Jeff");
		
		System.out.println(diretor);
		System.out.println(aluno);
		System.out.println(secretario);
		
	}

}
