package com.example.htmldemouserdefined;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
@PostMapping("/createstudent")
public static String creatStudent(@ModelAttribute Student stud)
{
	return "result";
}

	

}
