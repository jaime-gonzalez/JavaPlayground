package com.cliente.cadastro.dao;

import com.cliente.cadastro.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
		
}
