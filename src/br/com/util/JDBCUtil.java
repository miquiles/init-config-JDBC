package br.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

// 	pattern singleton java JDBC

	public static Connection getConexao() throws SQLException {

		Connection conexao = null;
		try {
			Class.forName("org.postgresql.Driver");

			conexao = DriverManager.getConnection( // Com JDBC precisamos setar no banco de dados o comando SET
													// @@global.time_zone = '+3:00';
					"jdbc:postgresql://jdbc:postgresql://localhost:5432/db-JDBC?useTimezone=true&ampserverTimezone=UTC​​&relaxAutoCommit=true",
					"admin", "12345");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		return conexao;
	}

}
