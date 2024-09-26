package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz02Controller {
	
	@RequestMapping("/lesson01/quiz02")
	public String quiz02() {
		return "lesson01/quiz02";
	}

	
}
