package com.example.movielsportslogindemo;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	@GetMapping("/result")
		public String goToMain(@RequestParam String uname,HttpSession session) {
		
			session.setAttribute("fname", uname);
			return "result";
		}
		@GetMapping("/movie")
		public String goToMovie(HttpSession session) {
			String n=(String)session.getAttribute("fname");
			System.out.println("Name of USer "+n);
			return "movie";
		}
		@GetMapping("/sports")
		public String goTosport() {
			return "sports";
		}
		
	}
	


