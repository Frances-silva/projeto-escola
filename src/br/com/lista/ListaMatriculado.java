package br.com.lista;

import java.util.ArrayList;
import java.util.List;

//importacao dos pacotes e suas classes
import br.com.cadastro.Aluno;
import br.com.cadastro.Professor;

public class ListaMatriculado {

	// atributos privados e estáticos
	private static List<Aluno>  alunos ;
	private static List<Professor> professores = new ArrayList<>();
	
	
	
	//adicionar aluno
	public static void adicionarAluno(Aluno aluno)
	{
		alunos = new ArrayList<>();
		alunos.add(aluno);
	}
	
	
	//adicionar professor
	public static void adicionarProfessor(Professor professor)
	{
		professores.add(professor);
	}
	
	
	// imprimir a lista de alunos
	public static void MostrarDados()
	{
		
			alunos.stream().forEach(ficha -> System.out.println(ficha.imprimirDadosAluno()));
			
		
	}
	
	//imprimir a lista de professores
	public static void mostrarDadosProfessor()
	{
		professores.stream().forEach(relacao -> System.out.println(relacao.imprimirDadosProfessor()));
	}
	
	
	
	
	
	//metodos padroes
	public static List<Aluno> getAlunos() {
		return alunos;
	}
	
	public static List<Professor> getProfessores()
	{
		return professores;
	}
	
	
	
}
