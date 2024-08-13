package com.contact.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value = ContactRest.class)
public class ContactRestTest {
	
	@MockBean
	private ContactService service;

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void saveContactTest() throws Throwable {
		
		Contact contact = new Contact();
		contact.setCemail("Shubham@gmail");
		contact.setCname("Shubham");
		contact.setCnumber(9876L);
		ObjectMapper mapper = new ObjectMapper();
		String writeValueAsString = mapper.writeValueAsString(contact);
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder =
				MockMvcRequestBuilders.post("/saveContact")
									  .contentType("application/json")
									  .content(writeValueAsString);
		
		MvcResult mvcResult = mvc.perform(mockHttpServletRequestBuilder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();
		assertEquals(201, status);
	}
	
	
	@Test
	public void restContactTest() throws Exception {
		
		  List<Contact> mockContacts = new ArrayList<>();
	        mockContacts.add(new Contact());
	        mockContacts.add(new Contact());
		
		when(service.getAllContacts()).thenReturn(mockContacts);
		
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/getAllContacts");
		
		MvcResult mvcResult = mvc.perform(mockHttpServletRequestBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);	
	}	
}
