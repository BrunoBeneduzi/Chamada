package colegio;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Colegio aluno = new Colegio("Marista");
		int escolha;
		do {
		System.out.print("Digite o que deseja fazer"+ "\n" +"0 - Sair"+ "\n"+"1- Adicionar aluno"+"\n"+"2- Alterar nome"+"\n"+"3- exibir"+"\n"+
		"4- Excluir nome"+"\n"+"-> ");
		escolha = sc.nextInt();
		sc.nextLine();
		separa();
		
		
		
		
		switch(escolha) {
			case 1:
				System.out.println("Digite o Nome e a idade");
				aluno.adiciona(new Aluno(sc.nextLine(), sc.nextInt()));
			break;
			case 2:
				System.out.println("Selecione qual aluno você deseja editar o nome");
				aluno.exibeAlunos();
				
				int posicao = sc.nextInt();
				sc.nextLine();
				aluno.alteraNome(posicao, sc.nextLine());
			break;
			case 3:
				aluno.exibeAlunos();
			break;
			case 4:
				
			break;
			
			default:
				System.out.println("........Numero invalido.........");
				break;
		}
		separa();
		}while(escolha != 0);
		
		System.out.println("............Finalizado....................");
	

	
	}
		public static void separa() {
			System.out.println("**************************************");
		}
}