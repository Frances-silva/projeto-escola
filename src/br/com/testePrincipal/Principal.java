package br.com.testePrincipal;

import java.math.BigDecimal;
import java.util.Scanner;

// importacao de pacotes e classes 
import br.com.cadastro.Aluno;
import br.com.cadastro.Professor;
import br.com.lista.ListaMatriculado;

public class Principal {

	public static void main(String[] args) {

		// chamada do metodo est�tico
		Principal.menu();

	}

	public static void menu() {

		Scanner nomes = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		Aluno aluno  = new Aluno();
		Professor professor = new Professor() ;
		String nome;
		int opcao;

		do {

			System.out.println("--------------TABELA DE CADASTRO------------");

			System.out.println("1 - cadastrar aluno");
			System.out.println("2 - cadastrar professor");
			System.out.println("3 - listar dados do aluno");
			System.out.println("4 - listar dados do professor");
			System.out.println("0 - sair");

			System.out.println("Escolha uma opcao :");
			opcao = numeros.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("-------------DADOS DO ALUNO--------------");

				System.out.println("Digite a matricula do aluno :");
				Integer matriculaAluno = numeros.nextInt();
				aluno.setMatricula(matriculaAluno);

				System.out.println("Digite o nome :");
				nome = nomes.nextLine();
				aluno.setNome(nome);

				System.out.println("Digite o numero do celular :");
				String celular = nomes.nextLine();

				System.out.println("Digite o nome do curso :");
				String curso = nomes.nextLine();

				aluno = new Aluno(matriculaAluno, nome, celular, curso);
				
				ListaMatriculado.adicionarAluno(aluno);// adiciona o objeto na lista
				System.out.println("Aluno adicionado com sucesso!!!\n");
				break;

			case 2:
				System.out.println("-------------DADOS DO PROFESSOR--------------");

				System.out.println("Digite o nome :");
				String nomeProfessor = nomes.nextLine();

				System.out.println("Digite o numero do celular :");
				String celularProfessor = nomes.nextLine();

				System.out.println("Digite o nome do curso :");
				String cursoProfessor = nomes.nextLine();

				BigDecimal salario;
				do {
				System.out.println("Digite o salario :");
				salario = numeros.nextBigDecimal();
				
				}while(salario.doubleValue() <= 499);
				
				
				professor = new Professor( nomeProfessor, celularProfessor, cursoProfessor, salario);
				ListaMatriculado.adicionarProfessor(professor);// adiciona o objeto na lista
				System.out.println("profressor adicionado com sucesso!!!\n");
				break;

			case 3:
				System.out.println("-----------------DADOS DO ALUNO-----------------");
				if (!ListaMatriculado.getAlunos().isEmpty())// verifica se a minha lista nao esta vazia
					ListaMatriculado.MostrarDados();
				else {
					System.out.println("sua lista de alunos esta vazia!");
				}
				// System.out.println(aluno.imprimirDados());
				break;

			case 4:
				System.out.println("------------------DADOS DO PROFESSOR------------");
				if (!ListaMatriculado.getProfessores().isEmpty())
					ListaMatriculado.mostrarDadosProfessor();
				else {
					System.out.println("sua lista de professores esta vazia!");
				}
				// System.out.println(professor.imprimirDados());
				break;

			case 0:
				System.out.println("Sessao encerrada...Obrigado pela visita...");
				break;

			}

		} while (opcao != 0);

		// fechar os 2 objetos de entrada padrao no java
		nomes.close();
		numeros.close();

	}

}
