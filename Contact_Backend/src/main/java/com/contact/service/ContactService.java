package com.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public interface ContactService {

	public Contact saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer id);
	
	public Contact updateContact(Contact contact);
	
	public String softDelete(Integer id);
	
	public String hardDelete(Integer id);
}
