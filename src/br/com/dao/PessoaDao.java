package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entidades.Pessoa;
import br.com.util.JDBCUtil;

public class PessoaDao {

	public void inserir(Pessoa pessoa) {

		String sql = "insert into PESSOA (cpf, nome, email,senha) values (?,?,?,?)";

		Connection conexao;
		try {
			conexao = JDBCUtil.getConexao();

			PreparedStatement insert = conexao.prepareStatement(sql);

			insert.setString(1, pessoa.getCPF());
			insert.setString(2, pessoa.getNome());
			insert.setString(3, pessoa.getEmail());
			insert.setString(4, pessoa.getSenha());

			insert.execute();
			conexao.commit();
			// insert.close();

			System.out.println(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
