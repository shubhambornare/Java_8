package com.contact.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ContactExceptionHandler {

	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<ContactExpInfo> nullException(CustomException exp){		
		ContactExpInfo cust = new ContactExpInfo();
		cust.setErrorCode("EXP001");
		cust.setErrorMsg(exp.getMessage());
		cust.setErrorDate(LocalDateTime.now());
		return new ResponseEntity<>(cust,HttpStatus.BAD_REQUEST);		
	}	
}
