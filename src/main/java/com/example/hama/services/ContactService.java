package com.example.hama.services;

import java.util.List;
import java.util.Optional;

import com.example.hama.models.Contact;
import com.example.hama.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	//Return list of contacts
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}
	
	//SAve new contact
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	//get by id
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}

	public void delete(Integer id) {
		contactRepository.deleteById(id);
	}
	
}
