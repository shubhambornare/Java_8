package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepo repo;

	@Override
	public Contact saveContact(Contact contact) {
		contact.setStatus("Active");
		repo.save(contact);
		return contact;	
	}
		
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> byStatus = repo.findByStatus("Active");
		return byStatus;
	}

	@Override
	public Contact getContactById(Integer id) {
		Optional<Contact> byId = repo.findById(id);
		if(byId.isPresent()) {
			Contact contact = byId.get();
			if(contact.getStatus().equals("Active")) {
				return contact;
			}
		}
		return null;
	}
	
	@Override
	public Contact updateContact(Contact contact) {
		if(repo.existsById(contact.getCid())) {
			contact.setStatus("Active");
			Contact save = repo.save(contact);
				return save;
		}
		return null;	
	}
	
	@Override
	public String softDelete(Integer id) {
		if (repo.existsById(id)) {
			Optional<Contact> byId = repo.findById(id);
			Contact contact = byId.get();
			contact.setStatus("Deleted");
			repo.save(contact);
			return "Contact Deleted Successfully";
		}
		return "No Contact Found";
	}

	@Override
	public String hardDelete(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Contact Deleted Successfully";
		}
		return "No Contact Found";		
	}	
}