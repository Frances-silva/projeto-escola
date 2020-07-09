package br.com.cadastro;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Aluno extends Pessoa{

	
	// atributos
	private Integer matricula;
	
    //construtor vazio
	public Aluno()
	{
		
	}
	
	// construtor
	public Aluno(Integer matricula,String nome, String celular, String curso ) {
		super(nome, celular, curso );
		this.matricula = matricula;
	}

	
	
	// metodo de impressao
	public String imprimirDadosAluno() {

		StringBuilder dadosAluno = new StringBuilder();
		NumberFormat formatar  = NumberFormat.getCurrencyInstance();
		
		dadosAluno.append("\nnumero da matricula :").append(this.getMatricula())
		.append(super.imprimirPessoa())
		.append("\ntarifa vale transporte :").append(formatar.format(this.pagarValeTransporte()));
		
		
		return dadosAluno.toString();
	}

	
	@Override
	public BigDecimal pagarValeTransporte()// metodo herdado da super classe 
	{
		BigDecimal tarifa = new BigDecimal(3.75);
		
		return tarifa;
	}
	
	// métodos padrões
	public Integer getMatricula()
	{
		return this.matricula ;
	}

	public void setMatricula(Integer matricula)
	{
		this.matricula = matricula ;
	}
	
	
	
}
