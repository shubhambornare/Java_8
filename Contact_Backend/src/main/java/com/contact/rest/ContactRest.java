package com.contact.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
public class ContactRest {

	@Autowired
	private ContactService service;
	
	@PostMapping("/saveContact")
	ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
		Contact saveContact = service.saveContact(contact);
		return new ResponseEntity<>(saveContact,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllContacts")
	ResponseEntity<List<Contact>> getAllContacts(){
		List<Contact> allContacts = service.getAllContacts();
		return new ResponseEntity<>(allContacts,HttpStatus.OK);
	}
	
	@GetMapping("/getContact/{id}")
	ResponseEntity<Contact> getContact(@PathVariable ("id") Integer id){
		Contact contact = service.getContactById(id);
		return new ResponseEntity<>(contact,HttpStatus.OK);
	}
	
	@PostMapping("/updateContact")
	ResponseEntity<Contact> updateContact(@RequestBody Contact contact){
		Contact updateContact = service.updateContact(contact);
		return new ResponseEntity<>(updateContact,HttpStatus.OK);
	}
	
	@PostMapping("/softDelete/{id}")
	ResponseEntity<String> softDelete(@PathVariable ("id") Integer id){
		String softDelete = service.softDelete(id);
		return new ResponseEntity<>(softDelete,HttpStatus.OK);
	}
	
	@PostMapping("/hardDelete/{id}")
	ResponseEntity<String> hardDelete(@PathVariable ("id") Integer id){
		String hardDelete = service.hardDelete(id);
		return new ResponseEntity<>(hardDelete,HttpStatus.OK);
	}
}
 