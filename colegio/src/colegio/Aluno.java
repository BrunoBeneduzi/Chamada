package colegio;
// fazendo uma ultia modificação teste
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Comparable<Aluno>{
	private String nomeAluno;
	private int idade;
	
	public Aluno(String nomeAluno, int idade) {
		this.nomeAluno = nomeAluno;
		this.idade = idade;
	}

	public Aluno() {//construtor vazio
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return " Alunos = " + nomeAluno + ", idade = " + idade;
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		return this.nomeAluno.compareTo(outroAluno.nomeAluno);
	}
}