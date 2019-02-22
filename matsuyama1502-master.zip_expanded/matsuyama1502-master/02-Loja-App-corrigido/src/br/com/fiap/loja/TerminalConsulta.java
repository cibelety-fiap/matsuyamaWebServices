package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.singleton.PropertySingleton;
import br.com.fiap.to.ProdutoTO;

public class TerminalConsulta {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern(PropertySingleton.getInstance().getProperty("mascara"));

		Scanner e = new Scanner(System.in);

		String nome = PropertySingleton.getInstance().getProperty("nome");
		System.out.println(nome);
		System.out.println(hoje.format(formatador));


		System.out.println("\nInforme o código do produto: ");

		int codProduto = e.nextInt();
		e.close();
		
		
		ProdutoTO produto = EstoqueBO.consultarProduto(codProduto);
		
		System.out.println(produto.getDescricao());
		
		
	}
}
