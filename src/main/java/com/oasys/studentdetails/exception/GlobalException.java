package com.oasys.studentdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException {
@ExceptionHandler(AgeNotFoundException.class)
public ResponseEntity<Object>AgeHandle(AgeNotFoundException add) {
	return  new ResponseEntity<>(add.getMessage(),HttpStatus.NOT_FOUND);
}
}
