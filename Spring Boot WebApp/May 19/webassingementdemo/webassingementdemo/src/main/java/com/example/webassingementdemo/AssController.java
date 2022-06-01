package com.example.webassingementdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssController {
@Autowired

private EmpRepostiory emp;

//@GetMapping("/employee")
//
//public List<Emp> getAllEmp() {
//return emp.findAll();
//}
//
//@GetMapping("/student/{id}")
//public ResponseEntity<Emp> getEmpById(@PathVariable(value = "id") Integer empId) throws Exception {
//Optional<Emp> op = emp.findById(empId);
//Emp st = op.get();
//return ResponseEntity.ok().body(st);
//}
	
//@GetMapping("/student/{id}")
//public Student getStudentById(@PathVariable("id") Integer studId) {
//Optional<Student> op = stud.findById(studId);
//Student st = op.get();
//return st;
//}

//@PostMapping("/save")
//public Emp createEmp(@RequestBody Emp ep) {
//return emp.save(ep);
//}
	
//@PutMapping("/updateemp/{id}")
//public boolean updateEmployee(@PathVariable(value = "id") Integer empId,
//@RequestBody Emp empDetails) throws Exception 
//{
//boolean f=true;
//try {
//Optional<Emp> op = emp.findById(empId);
//Emp ep = op.get();
//ep.setName(empDetails.getName());
//final Emp updatedStud = emp.save(ep);
//} catch(Exception e) {
//f=false;
//}
//return f;
//}
@DeleteMapping("/deleteemp/{id}")
public boolean deleteEmployee(@PathVariable(value = "id") Integer empId,
@RequestBody Emp empDetails) throws Exception {
Optional<Emp> op =emp.findById(empId);
Emp ep = op.get();
emp.delete(ep);
return true;
}
}


