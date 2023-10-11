package com.oasys.studentdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.exception.AgeNotFoundException;
import com.oasys.studentdetails.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService studser;

	@PostMapping(value = "/add")

	public String insertStudent(@RequestBody List<Student> s) {
		return studser.insertStudent(s);
	}

	@GetMapping(value = "/getbyid/{id}")
	public Optional<Student> getbyid(@PathVariable int id) {
		return studser.getbyid(id);
	}

	@PutMapping(value = "/putbyname")
	public List<Student> putbyname(@RequestBody Student s) {
		return studser.putbyname(s);
	}

	@DeleteMapping(value = "/delbyid/{id}")
	public String delbyid(@PathVariable int id) {
		return studser.delbyid(id);

	}

	@PostMapping(value = "exception")
	public String addstudent(@RequestBody Student s) throws AgeNotFoundException {
		return studser.addstudent(s);
	}
	@GetMapping(value = "/getbyidx/{rollnum}")
	public Student getbyrollnum(@PathVariable int rollnum) {
		return studser.getbyrollnum(rollnum);
	}
	
	

}