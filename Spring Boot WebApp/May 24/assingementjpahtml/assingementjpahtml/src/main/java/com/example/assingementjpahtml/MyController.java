package com.example.assingementjpahtml;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@Autowired
	StudentRepository studrepo;
	@PostMapping("/createstudent")
	public  String creatStudent(@ModelAttribute Student stud)
	{
		studrepo.save(stud);
		return "index";
	}
	@GetMapping("/showall")
	public String show(Model model)
	{
		List<Student>ob=studrepo.findAll();
		model.addAttribute("stud",ob);
		return "result";
		
	}
	
	}


