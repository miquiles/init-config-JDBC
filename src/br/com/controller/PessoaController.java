package br.com.controller;

import br.com.dao.PessoaDao;
import br.com.entidades.Pessoa;

public class PessoaController {

	Pessoa pessoa = new Pessoa();
	PessoaDao dao = new PessoaDao();

	public void salvar(Pessoa pessoa) {
		pessoa.setCPF(pessoa.getCPF());
		pessoa.setEmail(pessoa.getEmail());
		pessoa.setSenha(pessoa.getSenha());

		dao.inserir(pessoa);

		System.out.println(pessoa.getNome() + "Salvo com sucesso!");

	}
}
