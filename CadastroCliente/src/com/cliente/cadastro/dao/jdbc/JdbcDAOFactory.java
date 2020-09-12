package com.cliente.cadastro.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.cliente.cadastro.dao.ClienteDAO;
import com.cliente.cadastro.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;

	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cadastro_cliente?useTimezone=true&serverTimezone=UTC", "root",
					"senha");
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco de dados", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
}
