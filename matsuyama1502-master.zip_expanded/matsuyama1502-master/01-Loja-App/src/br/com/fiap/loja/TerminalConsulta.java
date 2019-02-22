package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TerminalConsulta {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner e = new Scanner(System.in);

		System.out.println("--- LOJA ABC ---");

		System.out.println(hoje.format(formatador));

		// System.out.println("C�digo 401 � Camiseta branca");
		// System.out.println("C�digo 402 � Camiseta azul");
		// System.out.println("C�digo 403 � Camiseta rosa");
		// System.out.println("Outro C�digo � Produto n�o encontrado\n");

		System.out.println("\nInforme o c�digo do produto: ");

		int codProduto = e.nextInt();

		switch (codProduto) {
		case 401:
			System.out.println("Camiseta branca");
			break;
		case 402:
			System.out.println("Camiseta azul");
			break;
		case 403:
			System.out.println("Camiseta rosa");
			break;
		default:
			System.out.println("Produto n�o encontrado");
			break;
		}
		e.close();
	}
}
