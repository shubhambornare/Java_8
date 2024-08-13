package com.contact.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.contact.entity.Contact;
import com.contact.repo.ContactRepo;

@SpringBootTest
@ExtendWith(value = {MockitoExtension.class})
public class ContactServiceTest {
	
	@MockBean
	private ContactRepo repo;
	
	@InjectMocks
	private ContactServiceImpl service;
	
	@Test
    public void getContactByIdTest() {
		
        Contact mockContact = new Contact();
        mockContact.setCid(101);
        mockContact.setStatus("Active");

        when(repo.findById(101)).thenReturn(Optional.of(mockContact));

        Contact contact = service.getContactById(101);

        assertEquals(mockContact, contact);
    }
	

}
