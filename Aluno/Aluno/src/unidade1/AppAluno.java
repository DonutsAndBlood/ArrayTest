package unidade1;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAluno {
		
	static Scanner scanner = new Scanner(System.in);
	
	static ArrayList<Aluno> lstAlunos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		int menu = 0;
		
		do{
		System.out.println("1 - Insere aluno\n"
				          +"2 - Remove aluno\n"
				          +"3 - Altera nota\n"
				          +"4 - Mostra Aluno\n"
				          +"5 - Imprime\n"
				          +"6 - Sair");
		menu = scanner.nextInt();
		scanner.nextLine();
		
		switch(menu){
			
		case 1:
			
			inserir();
			
			break;
			
		case 2:
			
			remover();
			
			break;
			
		case 3:
			
			alterar();
			
			break;
			
		case 4:
			
			mostrar();
			
			break;
			
		case 5:
			
			imprimir();
			
			break;
			
		case 6:
			
			System.out.println("Encerrando...");
			
			break;
			
		default:
			
			System.out.println("Entrada inválida");
	
			break;
			
		}
		

		
		}while(menu !=6);
		

	}	
	
	
	private static void imprimir() {
		
		String mensagem = "";
		
		 for(int i = 0; i < lstAlunos.size(); i++){
			 
			 mensagem += lstAlunos.get(i).toString()+"\n";
			 
			 
		 }
		
		 System.out.println(mensagem);
		
		 return;
		 
	}


	private static void mostrar() {
		
		System.out.println("Digite o nome a ser alterado:");
		String nome = scanner.nextLine();
		int aux = -1;	
  		
        for(int i = 0; i < lstAlunos.size(); i++){
			
			if(lstAlunos.get(i).getNome().equalsIgnoreCase(nome)){
				
				aux = i;
				break;
				
			}
		
		}
		
		    if (aux == -1){
			
			System.out.println("Aluno não consta!");
			
			return;
			
		}else{
			
			System.out.println(lstAlunos.get(aux).toString());
			
			return;
			
		}
		
		
		
		
	}


	private static void alterar() {
	
		System.out.println("Digite o nome a ser alterado:");
		String nome = scanner.nextLine();
		int aux = -1;	
  		
        for(int i = 0; i < lstAlunos.size(); i++){
			
			if(lstAlunos.get(i).getNome().equalsIgnoreCase(nome)){
				
				aux = i;
				break;
				
			}
		
		}
		
		    if (aux == -1){
			
			System.out.println("Aluno não consta!");
			
			return;
			
		}else{
			
			System.out.println("Digite a nota 1:");
			double nota1 = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Digite a nota 2:");
			double nota2 = scanner.nextDouble();
			scanner.nextLine();
			
			lstAlunos.get(aux).setNota1(nota1);
			lstAlunos.get(aux).setNota2(nota2);
			
		System.out.println("Alterado com sucesso!");	
		
		}
		
		 return;   
		
	}


	private static void remover() {
		
		System.out.println("Digite o nome a ser removido:");
		String nome = scanner.nextLine();
		int aux = -1;
		
		for(int i = 0; i < lstAlunos.size(); i++){
			
			if(lstAlunos.get(i).getNome().equalsIgnoreCase(nome)){
				
				aux = i;
				break;
				
			}
		
		}
		
		if (aux == -1){
			
			System.out.println("Aluno não consta!");
			
			return;
			
		}else{
			
			lstAlunos.remove(nome);
				
		System.out.println("Removido com sucesso");
			
			
		}
			return;
	}
		
	public static void inserir(){
		
		System.out.println("Digite o nome do aluno:");
		String nome = scanner.nextLine();
		System.out.println("Digite a matricula do aluno:");
		int matricula = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite a primeira nota:");
		double nota1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Digite a segunda nota:");
		double nota2 = scanner.nextDouble();
		scanner.nextLine();
		
		Aluno aluno = new Aluno(nome,matricula,nota1,nota2);
		
		lstAlunos.add(aluno);
		
		
	}
	
	
	
	
		
}