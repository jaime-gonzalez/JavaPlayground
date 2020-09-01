package com.cliente.main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.cliente.cadastro.dao.ClienteDAO;
import com.cliente.cadastro.dao.DAOFactory;
import com.cliente.cadastro.modelo.Cliente;

public class Main {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		Cliente cliente = new Cliente();

		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de cliente",
				JOptionPane.QUESTION_MESSAGE);

		if (nome != null) {
			cliente.setNome(nome);

			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso");
		}
	}
}
