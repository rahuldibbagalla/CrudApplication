package com.broadhob.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadhob.Entity.Student;
import com.broadhob.Repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	//postmapping
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> saveallStudents(List<Student> student) {
		return studentRepository.saveAll(student);
	}
	
	
	//getmapping
	public List<Student> getStudents()
	{
		return studentRepository.findAll();
	}
	
	public Student findById(int id)
	{
		return studentRepository.findById(id).orElseThrow(null);
	}
	
	//putmapping

	public Student update(Student student) {
		Student updated_std=studentRepository.findById(student.getId()).orElse(null);
		updated_std.setGender(student.getGender());
		updated_std.setAge(student.getAge());
		updated_std.setName(student.getName());
		
		return studentRepository.save(updated_std);
	}
	
	
    //deletemapping
	
	public String delete(int id) {
		studentRepository.deleteById(id);
		return "Student "+id+" was deleted...";
	}
	
	public String deleteall() {
		studentRepository.deleteAll();
		return "All the Students were deleted...";
	}


}
