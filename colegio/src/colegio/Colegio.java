package colegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colegio{
	private String nome;
	private List<Aluno> aluno = new ArrayList<>();
	
	public Colegio(String nome) {
		this.nome = nome;
	}
	
	public Colegio() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAluno() {
		return Collections.unmodifiableList(aluno);
	}

	public void adiciona(Aluno aluno) {// cadastra um novo aluno no colegio, mas verifica se ele existe primeiro
		boolean verifica = false;
		
		if(this.aluno.isEmpty()) this.aluno.add(aluno);//se for o primeiro aluno ele vai cadastrar sem problemas
		
		else {
			for(int i = 0; i < this.aluno.size(); i++) {//verifica se o aluno já não existe na lista
				verifica = (this.aluno.get(i).getNomeAluno().equalsIgnoreCase(aluno.getNomeAluno()))? true:false;
			}
			
			if(verifica) System.out.println("Já existe esse nome cadastrado");
			else {//se não existir vai ser cadastrado
				this.aluno.add(aluno);
				System.out.println("Cadastrado");
			}				
		}
	}
	
	public void alteraNome(int posicao, String editaNome) {//altera o nome do aluno
		boolean verifica1 = false;
			
		for(int i = 0; i < this.aluno.size(); i++) {//verifica se o aluno já não existe na lista
			verifica1 = (this.aluno.get(i).getNomeAluno().equalsIgnoreCase(editaNome))? false:true;
			
		}
			if(verifica1) {
				this.aluno.get(posicao).setNomeAluno(editaNome);
				System.out.println("Nome Alterado");
			}
			else System.out.println("o Nome " + editaNome + " Já existe, tente novamente");	
	}
	
	public void exibeAlunos() {// exibe os alunos a posição dos alunos para poder selecionar
		Collections.sort(this.aluno);
		for(int i = 0; i < this.aluno.size(); i++) {
			System.out.println(i + " - " + this.aluno.get(i));
		}
	}
	

	@Override
	public String toString() {
		return "Escola " + nome + " " + aluno;
	}
	
	
}