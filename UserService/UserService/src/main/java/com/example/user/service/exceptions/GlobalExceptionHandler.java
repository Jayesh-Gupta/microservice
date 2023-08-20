package com.example.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.example.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException( ResourceNotFoundException ex){
		
		String message=ex.getMessage();
		ApiResponse response =ApiResponse.builder().message(message).success(true).status(HttpStatus.BAD_REQUEST).build();
		return new ResponseEntity<ApiResponse>(response,HttpStatus.BAD_REQUEST);
			
	
		
	}

}
