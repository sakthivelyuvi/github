package com.oasys.studentdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.studentdetails.dao.StudentDao;
import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.exception.AgeNotFoundException;
@Service
public class StudentService {
	@Autowired
	StudentDao studdao;

	public String insertStudent(List<Student> s) {
		
		return studdao.insertStudent(s);
	}

	public Optional<Student> getbyid(int id) {
		
		return studdao.getbyid(id);
	}

	public List<Student> putbyname(Student s) {
		
		return studdao.putbyname(s);
	}

	public String  delbyid(int id) {
	
		return studdao.delbyid(id);
	}
	public String addstudent(Student s)throws AgeNotFoundException {
		if(s.getAge()<=18) {
		throw new AgeNotFoundException("Your age is less than 18");
		}
		else {
			return studdao.addstudent(s);
			
		}
	}

	public Student getbyrollnum(int rollnum) {
		
		return studdao.getbyrollnum(rollnum);
	}

}
