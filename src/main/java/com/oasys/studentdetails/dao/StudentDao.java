package com.oasys.studentdetails.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.repository.StudentRepository;
@Repository
public class StudentDao {
	@Autowired
StudentRepository studrepo;

	public String insertStudent(List<Student> s) {
		studrepo.saveAll(s);
		return "success";
	}
public Optional<Student> getbyid(int id) {
		
		return studrepo.findById(id);
	}
public List<Student> putbyname(Student s) {
	studrepo.save(s);
	return studrepo.findAll();
}
public String delbyid(int id) {
	
	studrepo.deleteById(id);
	return "SuccesssFullydelete";

}
public String addstudent(Student s) {
	studrepo.save(s);
	return "adding";
}
public Student getbyrollnum(int rollnum) {
	
	return studrepo.getbyrollnum(rollnum);
}
}