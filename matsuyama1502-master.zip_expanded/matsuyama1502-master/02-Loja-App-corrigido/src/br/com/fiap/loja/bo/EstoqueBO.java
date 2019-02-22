package br.com.fiap.loja.bo;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	
	public static ProdutoTO consultarProduto(int codigo) {
		
		switch (codigo) {
		case 401:
			return new ProdutoTO(codigo, "Camiseta branca", 4, 2.99);
		case 402:
			return new ProdutoTO(codigo, "Camiseta azul", 4, 2.99);
		case 403:
			return new ProdutoTO(codigo, "Camiseta rosa", 4, 2.99);
		default:
			return new ProdutoTO(-1, "Produto não encontrado", 0, 0);
		}
	}

}
