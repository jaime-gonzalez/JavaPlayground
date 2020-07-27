package application;

import java.util.Date;

import dao.ContactsDAO;
import model.Contacts;

public class Main {
	
	public static void main(String[] args) {
		
		ContactsDAO contactsDAO = new ContactsDAO();
		
		Contacts contacts = new Contacts();
		contacts.setDataCadastro(new Date());
		contacts.setNome("Nome");
		contacts.setEnderecoEmail("Nome123@gmail.com");
		
		contactsDAO.save(contacts);
	}

}
