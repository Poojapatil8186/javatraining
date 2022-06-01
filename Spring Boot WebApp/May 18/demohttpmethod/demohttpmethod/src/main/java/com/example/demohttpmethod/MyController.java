package com.example.demohttpmethod;

import java.util.List;
import java.util.Optional;

//import org.hibernate.query.criteria.internal.ListJoinImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@Autowired
private StudentRepository stud;

////Case 1: GetMapping 	
//@GetMapping("/Student")
//public List<Student> getAllStudent(){
//return stud.findAll();
//
////Select Only one Record
//@GetMapping("/Student/{id}")
//public Student getStudentById(@PathVariable("id")Integer studId)
//{
//Optional<Student>op=stud.findById(studId);
//Student st=op.get();
//return st;

//Case 2: PostMapping. for Saving value.
//@PostMapping("/save")
//public Student createStudent(@RequestBody Student st) {
//	return stud.save(st);
//}
//@PutMapping("/updatestud/{id}")
//public boolean updateEmployee(@PathVariable(value = "id") Integer studId,
//		@RequestBody Student studDetails) throws Exception {
//	boolean f=true;
//	try {
//		Optional<Student> op = stud.findById(studId);
//		Student st = op.get();
//		st.setName(studDetails.getName());
//		final Student updatedStud = stud.save(st);
//	} catch(Exception e) {
//		f=false;
//	}
//	return f;
//}
@DeleteMapping("/deletestud/{id}")
public boolean deleteEmployee(@PathVariable(value = "id") Integer studId,
		@RequestBody Student studDetails) throws Exception {
	Optional<Student> op = stud.findById(studId);
	Student st = op.get();
	 
	stud.delete(st);
	return true;
}




}

