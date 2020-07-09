package br.com.cadastro;

import java.math.BigDecimal;

public abstract class Pessoa {// metodo abstrato

	// atributos
	private String nome;
	private String celular;
	private String curso;
   
	
	// construtor vazio
	public Pessoa()
	{
	}
	
	// construtor
	public Pessoa(String nome, String celular, String curso) {
		this.nome = nome;
		this.celular = celular;
		this.curso = curso;

	}

	
	// metodo de impressao e esta protegida
	protected String imprimirPessoa() {
		StringBuilder dados = new StringBuilder();

		dados.append("\nnome :").append(this.getNome()).append("\ncelular :").append(this.getCelular())
				.append("\ncurso :").append(this.getCurso());

		return dados.toString();
	}

	
	// metodo abstrato para ser implementado nas classes derivadas
	public abstract BigDecimal pagarValeTransporte();
	
	
	
	
	// metodos padrões
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome)
	{
		if(nome.length() >= 3)
		this.nome = nome;
		else {
			System.exit(0);
		}
	}

	public String getCelular() {
		return celular;
	}

	public String getCurso() {
		return curso;
	}

}
