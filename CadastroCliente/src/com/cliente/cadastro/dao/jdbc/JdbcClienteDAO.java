package com.cliente.cadastro.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cliente.cadastro.dao.ClienteDAO;
import com.cliente.cadastro.dao.DAOException;
import com.cliente.cadastro.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	public JdbcClienteDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) {
		try {
			String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());

			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}
	}
}
