package br.com.cadastro;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Professor extends Pessoa{

	// atributos
	private BigDecimal salario;
	private BigDecimal imposto; // atribuindo uma porcentagem ao imposto
	private BigDecimal salarioLiquido;

	
	
	//construtor vazio
	public Professor()
	{

	}
	
	//construtor
	public Professor(String nome, String celular, String curso, BigDecimal salario) {
		
		super(nome, celular, curso);
		this.salario = salario;
		this.imposto = this.calcularImposto();
		this.salarioLiquido = this.salario.subtract(this.imposto);

	}

	
	// metodo de impressao

	public String imprimirDadosProfessor() {

		StringBuilder dados = new StringBuilder();
		NumberFormat formatar = NumberFormat.getCurrencyInstance();

		dados.append(super.imprimirPessoa())// super , faz referencia a super classe
				.append("\nsalario :").append(formatar.format(this.salario))
				.append("\nimposto :").append(formatar.format(this.imposto))
				.append("\nsaldo liquido :").append(formatar.format(this.salarioLiquido))
				.append("\ntarifa do vale transporte :").append(formatar.format(this.pagarValeTransporte()))
				.append("\n---------------------------------------------\n");
		
       this.get
		return dados.toString();
	}

	
	@Override
	public BigDecimal pagarValeTransporte() // metodo herdado da super classe
	{
		BigDecimal tarifa = new BigDecimal(5.75);
		
		return tarifa;
	}
	
	
	// calcular imposto
	private BigDecimal calcularImposto() {
		
		return this.imposto = this.salario.multiply(new BigDecimal(0.05));// desconto de 5% no salario 5/100

	}
	

}
