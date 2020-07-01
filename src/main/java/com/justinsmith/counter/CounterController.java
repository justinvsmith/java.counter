package com.justinsmith.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CounterController {
	int count = 0;
	
	@RequestMapping("/")
	public String home(HttpSession session, Model model) {

		if(session.getAttribute("counter") == null) {
		session.setAttribute("counter", 0);
	}
		
		count += 1;
		return "counter.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
	if (session.getAttribute("counter") == null) {
		count = 0;
		model.addAttribute("count", count);
		
	} else {
		model.addAttribute("count", count);
	}
//pull data out, change it, then save it again.
	//initialize count as a variable then when someone hits the page, you want to check if it's present, if not, add
	// then add one to it an resave it. 
	
	
	
	return "counted.jsp";
}
}


