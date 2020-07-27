package dao;

import java.sql.Connection;
import java.sql.Date;

import com.mysql.jdbc.PreparedStatement;

import connectionFactory.ConnectionFactory;
import model.Contacts;

public class ContactsDAO {
	
	public void save (Contacts contacts) {
		
		String sql  = "INSERT INTO contacts(dataCadastro, nome, enderecoEmail) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.CreateConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setDate(1, new Date(contacts.getDataCadastro().getTime()));
			pstm.setString(2, contacts.getNome());
			pstm.setString(3, contacts.getEnderecoEmail());
			
			pstm.execute();
			
			System.out.println("Contato Salvo com Sucesso!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
