package br.com.principal;

import br.com.dao.PessoaDao;
import br.com.entidades.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setCPF("1123");
		p1.setEmail("@teste");
		p1.setNome("teste");
		p1.setSenha("123");
		
		PessoaDao dao = new PessoaDao();
		
		dao.inserir(p1);
		
	}
}
